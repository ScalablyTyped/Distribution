package typings.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interpolationsMod {
  
  object Interpolations {
    
    @JSImport("three/src/extras/core/Interpolations", "Interpolations.CatmullRom")
    @js.native
    def CatmullRom(t: Double, p0: Double, p1: Double, p2: Double, p3: Double): Double = js.native
    
    @JSImport("three/src/extras/core/Interpolations", "Interpolations.CubicBezier")
    @js.native
    def CubicBezier(t: Double, p0: Double, p1: Double, p2: Double, p3: Double): Double = js.native
    
    @JSImport("three/src/extras/core/Interpolations", "Interpolations.QuadraticBezier")
    @js.native
    def QuadraticBezier(t: Double, p0: Double, p1: Double, p2: Double): Double = js.native
  }
}
