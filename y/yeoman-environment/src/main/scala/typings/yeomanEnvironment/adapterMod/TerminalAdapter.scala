package typings.yeomanEnvironment.adapterMod

import typings.diff.mod.Change
import typings.inquirer.mod.PromptModule
import typings.std.Console
import typings.yeomanEnvironment.anon.LoggerDefaultCategories
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * `TerminalAdapter` is the default implementation of `Adapter`, an abstraction
  * layer that defines the I/O interactions.
  *
  * It provides a CLI interaction
  */
@js.native
trait TerminalAdapter extends js.Object {
  
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
  var log: LoggerDefaultCategories = js.native
  
  /**
    * Prompts the user for one or more questions.
    *
    * @param questions The questions to prompt.
    */
  def prompt[T](questions: Questions[T]): js.Promise[T] = js.native
  /**
    * Prompts the user for one or more questions.
    *
    * @param questions The questions to prompt.
    * @param cb The callback for handling the result.
    */
  def prompt[TAnswers, TResult](questions: Questions[TAnswers], cb: js.Function1[/* res */ TAnswers, TResult]): js.Promise[TResult] = js.native
  
  /**
    * An inquirer prompt module.
    */
  var promptModule: PromptModule = js.native
}
