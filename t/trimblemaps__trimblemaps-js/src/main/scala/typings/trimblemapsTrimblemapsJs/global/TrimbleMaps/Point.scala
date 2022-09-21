package typings.trimblemapsTrimblemapsJs.global.TrimbleMaps

import typings.trimblemapsTrimblemapsJs.mod.PointLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TrimbleMaps.Point")
@js.native
open class Point protected ()
  extends typings.trimblemapsTrimblemapsJs.mod.Point {
  def this(x: Double, y: Double) = this()
}
/* static members */
object Point {
  
  @JSGlobal("TrimbleMaps.Point")
  @js.native
  val ^ : js.Any = js.native
  
  inline def convert(a: PointLike): typings.trimblemapsTrimblemapsJs.mod.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(a.asInstanceOf[js.Any]).asInstanceOf[typings.trimblemapsTrimblemapsJs.mod.Point]
}
