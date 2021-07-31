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
  
  @scala.inline
  def apply(): DialogNodeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogNodeOutput]
  }
  
  @scala.inline
  implicit class DialogNodeOutputMutableBuilder[Self <: DialogNodeOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeneric(value: js.Array[DialogNodeOutputGeneric]): Self = StObject.set(x, "generic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenericUndefined: Self = StObject.set(x, "generic", js.undefined)
    
    @scala.inline
    def setGenericVarargs(value: DialogNodeOutputGeneric*): Self = StObject.set(x, "generic", js.Array(value :_*))
    
    @scala.inline
    def setModifiers(value: DialogNodeOutputModifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
  }
}
