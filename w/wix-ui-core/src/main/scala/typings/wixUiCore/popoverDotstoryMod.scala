package typings.wixUiCore

import typings.wixUiCore.anon.AppendTo
import typings.wixUiCore.anon.OnClickOutside
import typings.wixUiCore.anon.TypeofPopoverInstantiable
import typings.wixUiCore.componentsPopoverPopoverMod.Popover
import typings.wixUiCore.storiesUtilsMod.Category
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverDotstoryMod {
  
  object default {
    
    @JSImport("wix-ui-core/dist/standalone/src/components/popover/docs/Popover.story", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/standalone/src/components/popover/docs/Popover.story", "default.category")
    @js.native
    def category: Category = js.native
    inline def category_=(x: Category): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("category")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("wix-ui-core/dist/standalone/src/components/popover/docs/Popover.story", "default.component")
    @js.native
    class component protected () extends Popover {
      def this(props: js.Any) = this()
    }
    @JSImport("wix-ui-core/dist/standalone/src/components/popover/docs/Popover.story", "default.component")
    @js.native
    def component: TypeofPopoverInstantiable = js.native
    
    @JSImport("wix-ui-core/dist/standalone/src/components/popover/docs/Popover.story", "default.componentPath")
    @js.native
    def componentPath: String = js.native
    inline def componentPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("componentPath")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/src/components/popover/docs/Popover.story", "default.componentProps")
    @js.native
    def componentProps: AppendTo = js.native
    inline def componentProps_=(x: AppendTo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("componentProps")(x.asInstanceOf[js.Any])
    
    inline def component_=(x: TypeofPopoverInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("component")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/src/components/popover/docs/Popover.story", "default.exampleProps")
    @js.native
    def exampleProps: OnClickOutside = js.native
    inline def exampleProps_=(x: OnClickOutside): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exampleProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/src/components/popover/docs/Popover.story", "default.sections")
    @js.native
    def sections: js.Array[js.Any] = js.native
    inline def sections_=(x: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sections")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/src/components/popover/docs/Popover.story", "default.storyName")
    @js.native
    def storyName: String = js.native
    inline def storyName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("storyName")(x.asInstanceOf[js.Any])
  }
}
