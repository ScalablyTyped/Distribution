package typings.wechatMiniprogram.DB

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeoLineStringConstructor
  extends Instantiable1[
      (/* points */ js.Array[GeoPoint]) | (/* points */ IGeoJSONLineString), 
      GeoLineString
    ] {
  def apply(points: js.Array[GeoPoint]): GeoLineString = js.native
  def apply(points: IGeoJSONLineString): GeoLineString = js.native
}

