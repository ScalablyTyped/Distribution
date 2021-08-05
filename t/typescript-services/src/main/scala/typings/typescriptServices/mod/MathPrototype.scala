package typings.typescriptServices.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "MathPrototype")
@js.native
class MathPrototype ()
  extends StObject
     with typings.typescriptServices.TypeScript.MathPrototype
object MathPrototype {
  
  @JSImport("typescript-services", "MathPrototype")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def max(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def min(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
}
