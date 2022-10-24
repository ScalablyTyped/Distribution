package typings.wixStyleReact.mod

import typings.react.mod.ReactElement
import typings.wixStyleReact.distTypesCardFolderTabsTabMod.CardFolderTabProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-style-react", "CardFolderTabs")
@js.native
open class CardFolderTabs ()
  extends typings.wixStyleReact.distTypesCardFolderTabsMod.default
/* static members */
object CardFolderTabs {
  
  @JSImport("wix-style-react", "CardFolderTabs")
  @js.native
  val ^ : js.Any = js.native
  
  inline def Tab(): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Tab")().asInstanceOf[ReactElement]
  inline def Tab(props: CardFolderTabProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Tab")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
}
