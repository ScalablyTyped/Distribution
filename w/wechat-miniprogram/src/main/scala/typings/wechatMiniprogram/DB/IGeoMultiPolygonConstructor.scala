package typings.wechatMiniprogram.DB

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGeoMultiPolygonConstructor
  extends StObject
     with Instantiable1[
      (/* polygons */ js.Array[GeoPolygon]) | (/* polygons */ IGeoJSONMultiPolygon), 
      GeoMultiPolygon
    ] {
  
  def apply(polygons: js.Array[GeoPolygon]): GeoMultiPolygon = js.native
  def apply(polygons: IGeoJSONMultiPolygon): GeoMultiPolygon = js.native
}
