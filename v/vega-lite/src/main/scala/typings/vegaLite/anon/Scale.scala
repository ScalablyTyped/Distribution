package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scale extends StObject {
  
  var scale: typings.vegaTypings.encodeMod.Field
  
  var value: String | Double | Boolean
}
object Scale {
  
  @scala.inline
  def apply(scale: typings.vegaTypings.encodeMod.Field, value: String | Double | Boolean): Scale = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  
  @scala.inline
  implicit class ScaleMutableBuilder[Self <: Scale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScale(value: typings.vegaTypings.encodeMod.Field): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String | Double | Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
