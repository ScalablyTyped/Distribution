package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.identifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentifierTransform
  extends StObject
     with _Transforms {
  
  var as: String | SignalRef
  
  var `type`: identifier
}
object IdentifierTransform {
  
  @scala.inline
  def apply(as: String | SignalRef): IdentifierTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("identifier")
    __obj.asInstanceOf[IdentifierTransform]
  }
  
  @scala.inline
  implicit class IdentifierTransformMutableBuilder[Self <: IdentifierTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAs(value: String | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: identifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
