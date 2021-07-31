package typings.wixUiCore.srcMod

import typings.wixUiCore.anon.ExpandSize
import typings.wixUiCore.horizontalMenuItemHorizontalMenuItemMod.HorizontalMenuItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-ui-core/dist/src", "HorizontalMenuItem")
@js.native
class HorizontalMenuItem protected ()
  extends typings.wixUiCore.horizontalMenuItemMod.HorizontalMenuItem {
  def this(props: HorizontalMenuItemProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: HorizontalMenuItemProps, context: js.Any) = this()
}
/* static members */
object HorizontalMenuItem {
  
  @JSImport("wix-ui-core/dist/src", "HorizontalMenuItem")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-ui-core/dist/src", "HorizontalMenuItem.defaultProps")
  @js.native
  def defaultProps: ExpandSize = js.native
  @scala.inline
  def defaultProps_=(x: ExpandSize): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-ui-core/dist/src", "HorizontalMenuItem.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
