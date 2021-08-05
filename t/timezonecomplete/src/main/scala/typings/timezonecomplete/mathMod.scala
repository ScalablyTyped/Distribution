package typings.timezonecomplete

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mathMod {
  
  @JSImport("timezonecomplete/dist/lib/math", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def filterFloat(value: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("filterFloat")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isInt(n: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInt")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def positiveModulo(value: Double, modulo: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("positiveModulo")(value.asInstanceOf[js.Any], modulo.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def roundSym(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("roundSym")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
}
