package typings.tanemSvgInjector

import typings.tanemSvgInjector.typesMod.Errback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadSvgCachedMod {
  
  @JSImport("@tanem/svg-injector/dist/load-svg-cached", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(url: String, httpRequestWithCredentials: Boolean, callback: Errback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any], httpRequestWithCredentials.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
