package typings.wixStyleReact

import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComposerSidebarComposerSidebarDotuniDotdriverMod {
  
  @js.native
  trait ComposerSidebarUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickOnItem(itemId: String): js.Promise[Unit] = js.native
    def clickOnItem(itemId: Double): js.Promise[Unit] = js.native
    
    def getItemLabel(itemId: String): js.Promise[String] = js.native
    def getItemLabel(itemId: Double): js.Promise[String] = js.native
    
    def getItemSectionTitle(itemId: String): js.Promise[String | Null] = js.native
    def getItemSectionTitle(itemId: Double): js.Promise[String | Null] = js.native
    
    def getLabelPlacement(): js.Promise[String] = js.native
    
    def getSelectedItemId(): js.Promise[Double | String] = js.native
    
    def isItemDisabled(itemId: String): js.Promise[Boolean] = js.native
    def isItemDisabled(itemId: Double): js.Promise[Boolean] = js.native
  }
}
