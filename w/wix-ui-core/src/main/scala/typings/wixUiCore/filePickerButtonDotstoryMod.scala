package typings.wixUiCore

import typings.wixUiCore.anon.Accept
import typings.wixUiCore.anon.OnChange
import typings.wixUiCore.anon.TypeofFilePickerButtonInstantiable
import typings.wixUiCore.componentsFilePickerButtonMod.FilePickerButton
import typings.wixUiCore.storiesUtilsMod.Category
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filePickerButtonDotstoryMod {
  
  object default {
    
    @JSImport("wix-ui-core/dist/standalone/src/components/file-picker-button/docs/FilePickerButton.story", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/standalone/src/components/file-picker-button/docs/FilePickerButton.story", "default.category")
    @js.native
    def category: Category = js.native
    inline def category_=(x: Category): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("category")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("wix-ui-core/dist/standalone/src/components/file-picker-button/docs/FilePickerButton.story", "default.component")
    @js.native
    class component protected () extends FilePickerButton {
      def this(props: js.Any) = this()
    }
    @JSImport("wix-ui-core/dist/standalone/src/components/file-picker-button/docs/FilePickerButton.story", "default.component")
    @js.native
    def component: TypeofFilePickerButtonInstantiable = js.native
    
    @JSImport("wix-ui-core/dist/standalone/src/components/file-picker-button/docs/FilePickerButton.story", "default.componentPath")
    @js.native
    def componentPath: String = js.native
    inline def componentPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("componentPath")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/src/components/file-picker-button/docs/FilePickerButton.story", "default.componentProps")
    @js.native
    def componentProps: Accept = js.native
    inline def componentProps_=(x: Accept): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("componentProps")(x.asInstanceOf[js.Any])
    
    inline def component_=(x: TypeofFilePickerButtonInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("component")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/src/components/file-picker-button/docs/FilePickerButton.story", "default.exampleProps")
    @js.native
    def exampleProps: OnChange = js.native
    inline def exampleProps_=(x: OnChange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exampleProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/standalone/src/components/file-picker-button/docs/FilePickerButton.story", "default.storyName")
    @js.native
    def storyName: String = js.native
    inline def storyName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("storyName")(x.asInstanceOf[js.Any])
  }
}
