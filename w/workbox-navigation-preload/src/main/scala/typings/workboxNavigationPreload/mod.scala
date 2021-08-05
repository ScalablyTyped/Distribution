package typings.workboxNavigationPreload

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("workbox-navigation-preload", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def disable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[Unit]
  
  inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
  inline def enable(headerValue: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")(headerValue.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[Boolean]
}
