package typings.sweetalert

import typings.std.HTMLElement
import typings.sweetalert.typingsModulesOptionsMod.SwalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsModulesInitModalMod {
  
  @JSImport("sweetalert/typings/modules/init/modal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Unit]
  
  inline def initModalContent(opts: SwalOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initModalContent")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def injectElIntoModal(markup: String): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("injectElIntoModal")(markup.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
}
