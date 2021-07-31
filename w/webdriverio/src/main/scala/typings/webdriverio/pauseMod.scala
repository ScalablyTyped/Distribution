package typings.webdriverio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pauseMod {
  
  @JSImport("webdriverio/build/commands/browser/pause", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[js.Any]]
  @scala.inline
  def default(milliseconds: Double): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
}
