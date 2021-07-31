package typings.wixUiCore.wixUiCoreSrcMod

import typings.wixUiCore.anon.GridFC
import typings.wixUiCore.anon.TypeofHorizontalMenuItemInstantiableDefaultProps
import typings.wixUiCore.srcComponentsHorizontalMenuHorizontalMenuMod.HorizontalMenuProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-ui-core/src", "HorizontalMenu")
@js.native
class HorizontalMenu protected ()
  extends typings.wixUiCore.srcComponentsHorizontalMenuMod.HorizontalMenu {
  def this(props: HorizontalMenuProps) = this()
}
/* static members */
object HorizontalMenu {
  
  @JSImport("wix-ui-core/src", "HorizontalMenu")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-ui-core/src", "HorizontalMenu.Item")
  @js.native
  def Item: TypeofHorizontalMenuItemInstantiableDefaultProps = js.native
  @scala.inline
  def Item_=(x: TypeofHorizontalMenuItemInstantiableDefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-ui-core/src", "HorizontalMenu.Layout")
  @js.native
  def Layout: GridFC = js.native
  @scala.inline
  def Layout_=(x: GridFC): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Layout")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-ui-core/src", "HorizontalMenu.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
