package typings.vegaTypings.transformMod

import typings.vegaTypings.vegaTypingsStrings.extent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtentTransform extends _Transforms {
  
  var field: FieldRef = js.native
  
  var signal: js.UndefOr[String] = js.native
  
  var `type`: extent = js.native
}
object ExtentTransform {
  
  @scala.inline
  def apply(field: FieldRef, `type`: extent): ExtentTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtentTransform]
  }
  
  @scala.inline
  implicit class ExtentTransformMutableBuilder[Self <: ExtentTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: FieldRef): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignal(value: String): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    @scala.inline
    def setType(value: extent): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
