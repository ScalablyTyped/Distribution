package typings.wechatMiniprogram.DB

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeoPolygonConstructor
  extends Instantiable1[
      (/* lineStrings */ js.Array[GeoLineString]) | (/* lineStrings */ IGeoJSONPolygon), 
      GeoPolygon
    ] {
  def apply(lineStrings: js.Array[GeoLineString]): GeoPolygon = js.native
  def apply(lineStrings: IGeoJSONPolygon): GeoPolygon = js.native
}

