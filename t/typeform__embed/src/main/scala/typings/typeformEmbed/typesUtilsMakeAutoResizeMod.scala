package typings.typeformEmbed

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsMakeAutoResizeMod {
  
  @JSImport("@typeform/embed/types/utils/make-auto-resize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeAutoResize(wrapperElm: HTMLElement): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeAutoResize")(wrapperElm.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  inline def makeAutoResize(wrapperElm: HTMLElement, onAllDevices: Boolean): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeAutoResize")(wrapperElm.asInstanceOf[js.Any], onAllDevices.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
}
