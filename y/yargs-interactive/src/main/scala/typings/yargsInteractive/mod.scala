package typings.yargsInteractive

import org.scalablytyped.runtime.StringDictionary
import typings.yargs.mod.Argv
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Interactive = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Interactive]
  
  @JSImport("yargs-interactive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Interactive
    extends StObject
       with Argv[js.Object] {
    
    def interactive(options: Option): Interactive = js.native
    
    def `then`(callback: js.Function1[/* result */ Any, Any]): Interactive = js.native
  }
  
  type Option = StringDictionary[OptionData | Default]
  
  trait OptionData extends StObject {
    
    var default: js.UndefOr[String | Double | Boolean | js.Array[Any]] = js.undefined
    
    var choices: js.UndefOr[js.Array[String]] = js.undefined
    
    var describe: String
    
    var prompt: js.UndefOr[always | never | `if-no-arg` | `if-empty`] = js.undefined
    
    var `type`: input | number | confirm | list | rawlist | expand | checkbox | password | editor
  }
  object OptionData {
    
    inline def apply(
      describe: String,
      `type`: input | number | confirm | list | rawlist | expand | checkbox | password | editor
    ): OptionData = {
      val __obj = js.Dynamic.literal(describe = describe.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionData]
    }
    
    extension [Self <: OptionData](x: Self) {
      
      inline def setChoices(value: js.Array[String]): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
      
      inline def setChoicesUndefined: Self = StObject.set(x, "choices", js.undefined)
      
      inline def setChoicesVarargs(value: String*): Self = StObject.set(x, "choices", js.Array(value*))
      
      inline def setDefault(value: String | Double | Boolean | js.Array[Any]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDefaultVarargs(value: Any*): Self = StObject.set(x, "default", js.Array(value*))
      
      inline def setDescribe(value: String): Self = StObject.set(x, "describe", value.asInstanceOf[js.Any])
      
      inline def setPrompt(value: always | never | `if-no-arg` | `if-empty`): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      inline def setType(value: input | number | confirm | list | rawlist | expand | checkbox | password | editor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
