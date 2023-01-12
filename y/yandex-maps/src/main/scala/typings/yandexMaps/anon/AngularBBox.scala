package typings.yandexMaps.anon

import typings.yandexMaps.mod.ICoordSystem
import typings.yandexMaps.mod.IPanoramaTileLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AngularBBox extends StObject {
  
  var angularBBox: js.Array[Double]
  
  var coordSystem: js.UndefOr[ICoordSystem] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var position: js.Array[Double]
  
  var tileSize: js.Array[Double]
  
  var tilesLevels: js.Array[IPanoramaTileLevel]
}
object AngularBBox {
  
  inline def apply(
    angularBBox: js.Array[Double],
    position: js.Array[Double],
    tileSize: js.Array[Double],
    tilesLevels: js.Array[IPanoramaTileLevel]
  ): AngularBBox = {
    val __obj = js.Dynamic.literal(angularBBox = angularBBox.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], tileSize = tileSize.asInstanceOf[js.Any], tilesLevels = tilesLevels.asInstanceOf[js.Any])
    __obj.asInstanceOf[AngularBBox]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AngularBBox] (val x: Self) extends AnyVal {
    
    inline def setAngularBBox(value: js.Array[Double]): Self = StObject.set(x, "angularBBox", value.asInstanceOf[js.Any])
    
    inline def setAngularBBoxVarargs(value: Double*): Self = StObject.set(x, "angularBBox", js.Array(value*))
    
    inline def setCoordSystem(value: ICoordSystem): Self = StObject.set(x, "coordSystem", value.asInstanceOf[js.Any])
    
    inline def setCoordSystemUndefined: Self = StObject.set(x, "coordSystem", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPosition(value: js.Array[Double]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionVarargs(value: Double*): Self = StObject.set(x, "position", js.Array(value*))
    
    inline def setTileSize(value: js.Array[Double]): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
    
    inline def setTileSizeVarargs(value: Double*): Self = StObject.set(x, "tileSize", js.Array(value*))
    
    inline def setTilesLevels(value: js.Array[IPanoramaTileLevel]): Self = StObject.set(x, "tilesLevels", value.asInstanceOf[js.Any])
    
    inline def setTilesLevelsVarargs(value: IPanoramaTileLevel*): Self = StObject.set(x, "tilesLevels", js.Array(value*))
  }
}
