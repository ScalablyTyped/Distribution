package typings.uniqueRandom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unique-random", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(minimum: Double, maximum: Double): js.Function0[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(minimum.asInstanceOf[js.Any], maximum.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Double]]
}
