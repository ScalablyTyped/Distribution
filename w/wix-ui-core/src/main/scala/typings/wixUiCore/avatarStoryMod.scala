package typings.wixUiCore

import typings.react.mod.global.JSX.Element
import typings.wixUiCore.anon.Component
import typings.wixUiCore.anon.Datahook
import typings.wixUiCore.anon.ImgProps
import typings.wixUiCore.anon.TypeofAvatarComponent
import typings.wixUiCore.avatarAvatarMod.AvatarComponent
import typings.wixUiCore.distStoriesUtilsMod.Category
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object avatarStoryMod {
  
  object default {
    
    @JSImport("wix-ui-core/dist/src/components/avatar/avatar.story", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/src/components/avatar/avatar.story", "default.category")
    @js.native
    def category: Category = js.native
    @scala.inline
    def category_=(x: Category): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("category")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("wix-ui-core/dist/src/components/avatar/avatar.story", "default.component")
    @js.native
    class component () extends AvatarComponent
    @JSImport("wix-ui-core/dist/src/components/avatar/avatar.story", "default.component")
    @js.native
    def component: TypeofAvatarComponent = js.native
    
    @JSImport("wix-ui-core/dist/src/components/avatar/avatar.story", "default.componentPath")
    @js.native
    def componentPath: String = js.native
    @scala.inline
    def componentPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("componentPath")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/src/components/avatar/avatar.story", "default.componentProps")
    @js.native
    def componentProps: Datahook = js.native
    @scala.inline
    def componentProps_=(x: Datahook): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("componentProps")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def componentWrapper(hasComponent: Component): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("componentWrapper")(hasComponent.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @scala.inline
    def component_=(x: TypeofAvatarComponent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("component")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/src/components/avatar/avatar.story", "default.exampleProps")
    @js.native
    def exampleProps: ImgProps = js.native
    @scala.inline
    def exampleProps_=(x: ImgProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exampleProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/src/components/avatar/avatar.story", "default.storyName")
    @js.native
    def storyName: String = js.native
    @scala.inline
    def storyName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("storyName")(x.asInstanceOf[js.Any])
  }
}
