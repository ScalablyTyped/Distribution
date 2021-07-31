package typings.webdriverio

import typings.webdriverio.anon.XOffset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moveToMod {
  
  @JSImport("webdriverio/build/commands/element/moveTo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[js.Any]]
  @scala.inline
  def default(hasXOffsetYOffset: XOffset): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasXOffsetYOffset.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
}
