package typings.vueDevtoolsApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmTimeMod {
  
  @JSImport("@vue/devtools-api/lib/esm/time", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isPerformanceSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPerformanceSupported")().asInstanceOf[Boolean]
  
  inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
}
