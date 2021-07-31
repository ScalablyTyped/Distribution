package typings.uifabricUtilities

import typings.std.HTMLElement
import typings.std.Window
import typings.uifabricUtilities.irectangleMod.IRectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getRectMod {
  
  @JSImport("@uifabric/utilities/lib/dom/getRect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getRect(): js.UndefOr[IRectangle] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRect")().asInstanceOf[js.UndefOr[IRectangle]]
  @scala.inline
  def getRect(element: HTMLElement): js.UndefOr[IRectangle] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRect")(element.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[IRectangle]]
  @scala.inline
  def getRect(element: Window): js.UndefOr[IRectangle] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRect")(element.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[IRectangle]]
}
