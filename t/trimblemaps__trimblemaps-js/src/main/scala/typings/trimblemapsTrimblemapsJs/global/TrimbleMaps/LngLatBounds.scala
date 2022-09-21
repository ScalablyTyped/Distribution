package typings.trimblemapsTrimblemapsJs.global.TrimbleMaps

import typings.trimblemapsTrimblemapsJs.mod.LngLatBoundsLike
import typings.trimblemapsTrimblemapsJs.mod.LngLatLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TrimbleMaps.LngLatBounds")
@js.native
open class LngLatBounds ()
  extends typings.trimblemapsTrimblemapsJs.mod.LngLatBounds {
  def this(boundsLike: js.Tuple2[LngLatLike, LngLatLike]) = this()
  def this(boundsLike: js.Tuple4[Double, Double, Double, Double]) = this()
  def this(sw: LngLatLike, ne: LngLatLike) = this()
}
/* static members */
object LngLatBounds {
  
  @JSGlobal("TrimbleMaps.LngLatBounds")
  @js.native
  val ^ : js.Any = js.native
  
  /** Convert an array to a LngLatBounds object, or return an existing LngLatBounds object unchanged. */
  inline def convert(input: LngLatBoundsLike): typings.trimblemapsTrimblemapsJs.mod.LngLatBounds = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(input.asInstanceOf[js.Any]).asInstanceOf[typings.trimblemapsTrimblemapsJs.mod.LngLatBounds]
}
