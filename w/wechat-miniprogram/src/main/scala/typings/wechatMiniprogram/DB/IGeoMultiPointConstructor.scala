package typings.wechatMiniprogram.DB

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGeoMultiPointConstructor
  extends Instantiable1[
      (/* points */ js.Array[GeoPoint]) | (/* points */ IGeoJSONMultiPoint), 
      GeoMultiPoint
    ] {
  
  def apply(points: js.Array[GeoPoint]): GeoMultiPoint = js.native
  def apply(points: IGeoJSONMultiPoint): GeoMultiPoint = js.native
}
