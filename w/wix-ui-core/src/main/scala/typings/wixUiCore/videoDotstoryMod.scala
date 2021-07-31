package typings.wixUiCore

import typings.wixUiCore.anon.ConfigSrc
import typings.wixUiCore.anon.Controls
import typings.wixUiCore.anon.TypeofVideoInstantiable
import typings.wixUiCore.componentsVideoMod.Video
import typings.wixUiCore.componentsVideoVideoMod.IVideoProps
import typings.wixUiCore.storiesUtilsMod.Category
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object videoDotstoryMod {
  
  object default {
    
    @JSImport("wix-ui-core/dist/standalone/src/components/video/Video.story", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/standalone/src/components/video/Video.story", "default.category")
    @js.native
    def category: Category = js.native
    @scala.inline
    def category_=(x: Category): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("category")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("wix-ui-core/dist/standalone/src/components/video/Video.story", "default.component")
    @js.native
    class component protected () extends Video {
      def this(props: IVideoProps) = this()
    }
    @JSImport("wix-ui-core/dist/standalone/src/components/video/Video.story", "default.component")
    @js.native
    def component: TypeofVideoInstantiable = js.native
    
    @JSImport("wix-ui-core/dist/standalone/src/components/video/Video.story", "default.componentPath")
    @js.native
    def componentPath: String = js.native
    @scala.inline
    def componentPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("componentPath")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/src/components/video/Video.story", "default.componentProps")
    @js.native
    def componentProps: Controls = js.native
    @scala.inline
    def componentProps_=(x: Controls): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("componentProps")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def component_=(x: TypeofVideoInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("component")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/src/components/video/Video.story", "default.exampleProps")
    @js.native
    def exampleProps: ConfigSrc = js.native
    @scala.inline
    def exampleProps_=(x: ConfigSrc): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exampleProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/src/components/video/Video.story", "default.storyName")
    @js.native
    def storyName: String = js.native
    @scala.inline
    def storyName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("storyName")(x.asInstanceOf[js.Any])
  }
}
