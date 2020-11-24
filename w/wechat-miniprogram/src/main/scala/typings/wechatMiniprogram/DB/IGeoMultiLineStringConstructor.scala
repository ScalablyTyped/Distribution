package typings.wechatMiniprogram.DB

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGeoMultiLineStringConstructor
  extends Instantiable1[
      (/* lineStrings */ js.Array[GeoLineString]) | (/* lineStrings */ IGeoJSONMultiLineString), 
      GeoMultiLineString
    ] {
  
  def apply(lineStrings: js.Array[GeoLineString]): GeoMultiLineString = js.native
  def apply(lineStrings: IGeoJSONMultiLineString): GeoMultiLineString = js.native
}
