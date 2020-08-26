package typings.wechatMiniprogram.DB

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeoPointConstructor
  extends Instantiable1[/* geojson */ IGeoJSONPoint, GeoPoint]
     with Instantiable2[/* longitude */ Double, /* latitide */ Double, GeoPoint] {
  def apply(geojson: IGeoJSONPoint): GeoPoint = js.native
  def apply(longitude: Double, latitide: Double): GeoPoint = js.native
}

