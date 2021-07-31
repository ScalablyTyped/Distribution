package typings.wixUiCore

import typings.unidriverCore.mod.UniDriver
import typings.wixUiCore.tagUniDotDriverMod.TagUniDriver
import typings.wixUiTestUtils.baseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagsListUniDotDriverMod {
  
  @JSImport("wix-ui-core/src/components/tags-list/TagsList.uni.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def makeTagsListUniDriver(base: UniDriver[js.Any]): TagsListUniDriver = ^.asInstanceOf[js.Dynamic].applyDynamic("makeTagsListUniDriver")(base.asInstanceOf[js.Any]).asInstanceOf[TagsListUniDriver]
  
  @js.native
  trait TagsListUniDriver
    extends StObject
       with BaseUniDriver {
    
    def clickOnTagByIndex(): js.Promise[Unit] = js.native
    def clickOnTagByIndex(index: Double): js.Promise[Unit] = js.native
    
    def getTagByIndex(): TagUniDriver = js.native
    def getTagByIndex(index: Double): TagUniDriver = js.native
    
    def getTagCount(): js.Promise[Double] = js.native
    
    def getTags(): js.Any = js.native
  }
}
