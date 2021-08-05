package typings.vegaTypings.scaleMod

import typings.vegaTypings.vegaTypingsStrings.point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointScale
  extends StObject
     with BaseBandScale
     with Scale {
  
  @JSName("type")
  var type_PointScale: point
}
object PointScale {
  
  inline def apply(name: String): PointScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("point")
    __obj.asInstanceOf[PointScale]
  }
  
  extension [Self <: PointScale](x: Self) {
    
    inline def setType(value: point): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
