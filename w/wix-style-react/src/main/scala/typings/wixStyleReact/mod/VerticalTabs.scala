package typings.wixStyleReact.mod

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.SFC
import typings.wixStyleReact.verticalTabsMod.TabsGroup
import typings.wixStyleReact.verticalTabsMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-style-react", "VerticalTabs")
@js.native
class VerticalTabs () extends default
/* static members */
object VerticalTabs {
  
  @JSImport("wix-style-react", "VerticalTabs")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react", "VerticalTabs.Footer")
  @js.native
  def Footer: SFC[js.Object] = js.native
  @scala.inline
  def Footer_=(x: SFC[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footer")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "VerticalTabs.TabItem")
  @js.native
  def TabItem: Instantiable0[typings.wixStyleReact.verticalTabsItemMod.default] = js.native
  @scala.inline
  def TabItem_=(x: Instantiable0[typings.wixStyleReact.verticalTabsItemMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TabItem")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "VerticalTabs.TabsGroup")
  @js.native
  def TabsGroup: SFC[typings.wixStyleReact.verticalTabsMod.TabsGroup] = js.native
  @scala.inline
  def TabsGroup_=(x: SFC[TabsGroup]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TabsGroup")(x.asInstanceOf[js.Any])
}
