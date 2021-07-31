package typings.vegaTypings.anon

import typings.vegaTypings.encodeMod.ScaledValueRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scale
  extends StObject
     with ScaledValueRef[js.Any] {
  
  var scale: typings.vegaTypings.encodeMod.Field
  
  var value: Boolean | Double | String | Null
}
object Scale {
  
  @scala.inline
  def apply(scale: typings.vegaTypings.encodeMod.Field): Scale = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any], value = null)
    __obj.asInstanceOf[Scale]
  }
  
  @scala.inline
  implicit class ScaleMutableBuilder[Self <: Scale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScale(value: typings.vegaTypings.encodeMod.Field): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Boolean | Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
  }
}
