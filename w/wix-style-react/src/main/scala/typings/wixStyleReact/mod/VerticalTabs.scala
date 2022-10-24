package typings.wixStyleReact.mod

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.FC
import typings.wixStyleReact.distTypesVerticalTabsMod.TabsGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-style-react", "VerticalTabs")
@js.native
open class VerticalTabs ()
  extends typings.wixStyleReact.distTypesVerticalTabsMod.default
/* static members */
object VerticalTabs {
  
  @JSImport("wix-style-react", "VerticalTabs")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react", "VerticalTabs.Footer")
  @js.native
  def Footer: FC[js.Object] = js.native
  inline def Footer_=(x: FC[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footer")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "VerticalTabs.TabItem")
  @js.native
  def TabItem: Instantiable0[typings.wixStyleReact.distTypesVerticalTabsItemMod.default] = js.native
  inline def TabItem_=(x: Instantiable0[typings.wixStyleReact.distTypesVerticalTabsItemMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TabItem")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-style-react", "VerticalTabs.TabsGroup")
  @js.native
  def TabsGroup: FC[typings.wixStyleReact.distTypesVerticalTabsMod.TabsGroup] = js.native
  inline def TabsGroup_=(x: FC[TabsGroup]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TabsGroup")(x.asInstanceOf[js.Any])
}
