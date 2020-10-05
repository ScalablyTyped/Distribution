package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/extras/core/Interpolations", JSImport.Namespace)
@js.native
object interpolationsMod extends js.Object {
  @js.native
  object Interpolations extends js.Object {
    def CatmullRom(t: Double, p0: Double, p1: Double, p2: Double, p3: Double): Double = js.native
    def CubicBezier(t: Double, p0: Double, p1: Double, p2: Double, p3: Double): Double = js.native
    def QuadraticBezier(t: Double, p0: Double, p1: Double, p2: Double): Double = js.native
  }
  
}

