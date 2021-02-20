package typings.yargsInteractive

import org.scalablytyped.runtime.StringDictionary
import typings.yargsInteractive.anon.Default
import typings.yargsInteractive.yargsInteractiveStrings.`if-empty`
import typings.yargsInteractive.yargsInteractiveStrings.`if-no-arg`
import typings.yargsInteractive.yargsInteractiveStrings.always
import typings.yargsInteractive.yargsInteractiveStrings.checkbox
import typings.yargsInteractive.yargsInteractiveStrings.confirm
import typings.yargsInteractive.yargsInteractiveStrings.editor
import typings.yargsInteractive.yargsInteractiveStrings.expand
import typings.yargsInteractive.yargsInteractiveStrings.input
import typings.yargsInteractive.yargsInteractiveStrings.list
import typings.yargsInteractive.yargsInteractiveStrings.never
import typings.yargsInteractive.yargsInteractiveStrings.number
import typings.yargsInteractive.yargsInteractiveStrings.password
import typings.yargsInteractive.yargsInteractiveStrings.rawlist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("yargs-interactive", JSImport.Namespace)
  @js.native
  def apply(): Interactive = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Argv * / any */ @js.native
  trait Interactive extends StObject {
    
    def interactive(options: Option): Interactive = js.native
    
    def `then`(callback: js.Function1[/* result */ js.Any, _]): Interactive = js.native
    
    def usage(usage: String): Interactive = js.native
  }
  object Interactive {
    
    @scala.inline
    def apply(
      interactive: Option => Interactive,
      `then`: js.Function1[/* result */ js.Any, _] => Interactive,
      usage: String => Interactive
    ): Interactive = {
      val __obj = js.Dynamic.literal(interactive = js.Any.fromFunction1(interactive), usage = js.Any.fromFunction1(usage))
      __obj.updateDynamic("then")(js.Any.fromFunction1(`then`))
      __obj.asInstanceOf[Interactive]
    }
    
    @scala.inline
    implicit class InteractiveMutableBuilder[Self <: Interactive] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInteractive(value: Option => Interactive): Self = StObject.set(x, "interactive", js.Any.fromFunction1(value))
      
      @scala.inline
      def setThen(value: js.Function1[/* result */ js.Any, _] => Interactive): Self = StObject.set(x, "then", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUsage(value: String => Interactive): Self = StObject.set(x, "usage", js.Any.fromFunction1(value))
    }
  }
  
  type Option = StringDictionary[OptionData | Default]
  
  @js.native
  trait OptionData extends StObject {
    
    var default: js.UndefOr[String | Double | Boolean | js.Array[_]] = js.native
    
    var choices: js.UndefOr[js.Array[String]] = js.native
    
    var describe: String = js.native
    
    var prompt: js.UndefOr[always | never | `if-no-arg` | `if-empty`] = js.native
    
    var `type`: input | number | confirm | list | rawlist | expand | checkbox | password | editor = js.native
  }
  object OptionData {
    
    @scala.inline
    def apply(
      describe: String,
      `type`: input | number | confirm | list | rawlist | expand | checkbox | password | editor
    ): OptionData = {
      val __obj = js.Dynamic.literal(describe = describe.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionData]
    }
    
    @scala.inline
    implicit class OptionDataMutableBuilder[Self <: OptionData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChoices(value: js.Array[String]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChoicesUndefined: Self = StObject.set(x, "choices", js.undefined)
      
      @scala.inline
      def setChoicesVarargs(value: String*): Self = StObject.set(x, "choices", js.Array(value :_*))
      
      @scala.inline
      def setDefault(value: String | Double | Boolean | js.Array[_]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setDefaultVarargs(value: js.Any*): Self = StObject.set(x, "default", js.Array(value :_*))
      
      @scala.inline
      def setDescribe(value: String): Self = StObject.set(x, "describe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrompt(value: always | never | `if-no-arg` | `if-empty`): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      @scala.inline
      def setType(value: input | number | confirm | list | rawlist | expand | checkbox | password | editor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
