package typings.turistTime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("@turist/time/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(n: Double, `type`: TimeUnit): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(n.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  type TimeUnit = js.Symbol
}
