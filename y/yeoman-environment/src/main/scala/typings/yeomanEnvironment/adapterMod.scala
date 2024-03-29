package typings.yeomanEnvironment

import typings.diff.mod.Change
import typings.inquirer.mod.Answers
import typings.inquirer.mod.PromptModule
import typings.inquirer.mod.QuestionCollection
import typings.std.Console
import typings.yeomanEnvironment.logMod.DefaultCategories
import typings.yeomanEnvironment.logMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterMod {
  
  /**
    * `TerminalAdapter` is the default implementation of `Adapter`, an abstraction
    * layer that defines the I/O interactions.
    *
    * It provides a CLI interaction
    */
  @JSImport("yeoman-environment/lib/adapter", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with TerminalAdapter {
    /**
      * Initializes a new instance of the `TerminalAdapter` class.
      *
      * @param options The options for creating the adapter.
      */
    def this(options: AdapterOptions) = this()
  }
  
  /**
    * Provides options for creating an adapter.
    */
  trait AdapterOptions extends StObject {
    
    /**
      * A console-object for logging messages.
      */
    var console: js.UndefOr[Console] = js.undefined
  }
  object AdapterOptions {
    
    inline def apply(): AdapterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdapterOptions]
    }
    
    extension [Self <: AdapterOptions](x: Self) {
      
      inline def setConsole(value: Console): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
      
      inline def setConsoleUndefined: Self = StObject.set(x, "console", js.undefined)
    }
  }
  
  /**
    * Represents a set of questions.
    */
  type Questions[T /* <: Answers */] = QuestionCollection[T]
  
  /**
    * `TerminalAdapter` is the default implementation of `Adapter`, an abstraction
    * layer that defines the I/O interactions.
    *
    * It provides a CLI interaction
    */
  @js.native
  trait TerminalAdapter extends StObject {
    
    /**
      * A console-object for logging messages.
      */
    var console: Console = js.native
    
    /**
      * Shows a color-based diff of two strings.
      *
      * @param actual The actual text.
      * @param expected The expected text.
      * @param changes The changes returned by `diff`.
      * @returns The formatted message.
      */
    def diff(actual: String, expected: String, changes: js.Array[Change]): String = js.native
    
    /**
      * A component for logging messages.
      */
    var log: Logger[DefaultCategories] = js.native
    
    /**
      * Prompts the user for one or more questions.
      *
      * @param questions The questions to prompt.
      */
    def prompt[T /* <: Answers */](questions: Questions[T]): js.Promise[T] = js.native
    def prompt[TAnswers /* <: Answers */, TResult](questions: Questions[TAnswers], answers: TAnswers): js.Promise[TResult] = js.native
    def prompt[TAnswers /* <: Answers */, TResult](questions: Questions[TAnswers], answers: TAnswers, cb: js.Function1[/* res */ TAnswers, TResult]): js.Promise[TResult] = js.native
    def prompt[TAnswers /* <: Answers */, TResult](questions: Questions[TAnswers], answers: Unit, cb: js.Function1[/* res */ TAnswers, TResult]): js.Promise[TResult] = js.native
    
    /**
      * An inquirer prompt module.
      */
    var promptModule: PromptModule = js.native
    
    /**
      * Prompts the user for one or more questions.
      *
      * @param questions The questions to prompt.
      * @param cb Deprecated: The callback for handling the result.
      */
    @JSName("prompt")
    def prompt_TAnswers_AnswersTResult[TAnswers /* <: Answers */, TResult](questions: Questions[TAnswers]): js.Promise[TResult] = js.native
  }
}
