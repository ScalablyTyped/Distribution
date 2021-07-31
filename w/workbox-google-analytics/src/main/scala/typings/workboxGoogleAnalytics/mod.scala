package typings.workboxGoogleAnalytics

import typings.workboxGoogleAnalytics.initializeMod.InitializeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("workbox-google-analytics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def initialize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")().asInstanceOf[Unit]
  @scala.inline
  def initialize(options: InitializeOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
