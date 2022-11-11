package typings.traceEventLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsNowMod {
  
  @JSImport("trace-event-lib/dist/utils/now", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
}
