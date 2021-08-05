package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The output of the dialog node. For more information about how to specify dialog node output, see the [documentation](https://cloud.ibm.com/docs/services/assistant/dialog-overview.html#dialog-overview-responses). */
trait DialogNodeOutput
  extends StObject
     with /** DialogNodeOutput accepts additional properties. */
/* propName */ StringDictionary[js.Any] {
  
  /** An array of objects describing the output defined for the dialog node. */
  var generic: js.UndefOr[js.Array[DialogNodeOutputGeneric]] = js.undefined
  
  /** Options that modify how specified output is handled. */
  var modifiers: js.UndefOr[DialogNodeOutputModifiers] = js.undefined
}
object DialogNodeOutput {
  
  inline def apply(): DialogNodeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogNodeOutput]
  }
  
  extension [Self <: DialogNodeOutput](x: Self) {
    
    inline def setGeneric(value: js.Array[DialogNodeOutputGeneric]): Self = StObject.set(x, "generic", value.asInstanceOf[js.Any])
    
    inline def setGenericUndefined: Self = StObject.set(x, "generic", js.undefined)
    
    inline def setGenericVarargs(value: DialogNodeOutputGeneric*): Self = StObject.set(x, "generic", js.Array(value :_*))
    
    inline def setModifiers(value: DialogNodeOutputModifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
  }
}
