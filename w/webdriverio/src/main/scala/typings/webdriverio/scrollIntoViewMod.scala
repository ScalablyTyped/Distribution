package typings.webdriverio

import typings.std.ScrollIntoViewOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollIntoViewMod {
  
  @JSImport("webdriverio/build/commands/element/scrollIntoView", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[Unit]]
  inline def default(scrollIntoViewOptions: Boolean): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scrollIntoViewOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def default(scrollIntoViewOptions: ScrollIntoViewOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scrollIntoViewOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
