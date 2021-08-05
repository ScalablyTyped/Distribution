package typings.wordpressA11y

import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addContainerMod {
  
  @JSImport("@wordpress/a11y/build-types/add-container", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): HTMLDivElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[HTMLDivElement]
  inline def default(ariaLive: String): HTMLDivElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ariaLive.asInstanceOf[js.Any]).asInstanceOf[HTMLDivElement]
}
