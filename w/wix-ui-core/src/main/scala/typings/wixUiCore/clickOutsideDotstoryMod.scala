package typings.wixUiCore

import org.scalablytyped.runtime.Instantiable1
import typings.wixUiCore.anon.Children
import typings.wixUiCore.anon.OnClick
import typings.wixUiCore.srcComponentsClickOutsideMod.ClickOutside
import typings.wixUiCore.storiesUtilsMod.Category
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clickOutsideDotstoryMod {
  
  object default {
    
    @JSImport("wix-ui-core/dist/standalone/src/components/click-outside/ClickOutside.story", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/standalone/src/components/click-outside/ClickOutside.story", "default.category")
    @js.native
    def category: Category = js.native
    @scala.inline
    def category_=(x: Category): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("category")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("wix-ui-core/dist/standalone/src/components/click-outside/ClickOutside.story", "default.component")
    @js.native
    class component protected () extends ClickOutside {
      def this(props: js.Any) = this()
    }
    @JSImport("wix-ui-core/dist/standalone/src/components/click-outside/ClickOutside.story", "default.component")
    @js.native
    def component: Instantiable1[/* props */ js.Any, ClickOutside] = js.native
    
    @JSImport("wix-ui-core/dist/standalone/src/components/click-outside/ClickOutside.story", "default.componentPath")
    @js.native
    def componentPath: String = js.native
    @scala.inline
    def componentPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("componentPath")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/src/components/click-outside/ClickOutside.story", "default.componentProps")
    @js.native
    def componentProps: Children = js.native
    @scala.inline
    def componentProps_=(x: Children): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("componentProps")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def component_=(x: Instantiable1[/* props */ js.Any, ClickOutside]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("component")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/src/components/click-outside/ClickOutside.story", "default.exampleProps")
    @js.native
    def exampleProps: OnClick = js.native
    @scala.inline
    def exampleProps_=(x: OnClick): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exampleProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/src/components/click-outside/ClickOutside.story", "default.storyName")
    @js.native
    def storyName: String = js.native
    @scala.inline
    def storyName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("storyName")(x.asInstanceOf[js.Any])
  }
}
