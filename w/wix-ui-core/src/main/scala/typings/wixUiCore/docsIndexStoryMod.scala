package typings.wixUiCore

import typings.react.mod.FunctionComponent
import typings.wixUiCore.anon.ChildrenElement
import typings.wixUiCore.distStoriesUtilsMod.Category
import typings.wixUiCore.tagsListHelpersMod.DisplayNames
import typings.wixUiCore.tagsListTagsListMod.TagsListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object docsIndexStoryMod {
  
  object default {
    
    @JSImport("wix-ui-core/dist/src/components/tags-list/docs/index.story", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/src/components/tags-list/docs/index.story", "default.category")
    @js.native
    def category: Category = js.native
    @scala.inline
    def category_=(x: Category): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("category")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/src/components/tags-list/docs/index.story", "default.component")
    @js.native
    def component: FunctionComponent[TagsListProps] = js.native
    
    @JSImport("wix-ui-core/dist/src/components/tags-list/docs/index.story", "default.componentPath")
    @js.native
    def componentPath: String = js.native
    @scala.inline
    def componentPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("componentPath")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/src/components/tags-list/docs/index.story", "default.componentProps")
    @js.native
    def componentProps: ChildrenElement = js.native
    @scala.inline
    def componentProps_=(x: ChildrenElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("componentProps")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def component_=(x: FunctionComponent[TagsListProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("component")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/src/components/tags-list/docs/index.story", "default.sections")
    @js.native
    def sections: js.Array[js.Any] = js.native
    @scala.inline
    def sections_=(x: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sections")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/src/components/tags-list/docs/index.story", "default.storyName")
    @js.native
    def storyName: DisplayNames = js.native
    @scala.inline
    def storyName_=(x: DisplayNames): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("storyName")(x.asInstanceOf[js.Any])
  }
}
