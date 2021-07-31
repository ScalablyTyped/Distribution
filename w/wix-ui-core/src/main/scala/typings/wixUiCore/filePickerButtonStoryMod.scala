package typings.wixUiCore

import typings.wixUiCore.anon.Accept
import typings.wixUiCore.anon.OnChange
import typings.wixUiCore.anon.TypeofFilePickerButton
import typings.wixUiCore.distStoriesUtilsMod.Category
import typings.wixUiCore.filePickerButtonMod.FilePickerButton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filePickerButtonStoryMod {
  
  object default {
    
    @JSImport("wix-ui-core/dist/src/components/file-picker-button/docs/FilePickerButton.story", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/src/components/file-picker-button/docs/FilePickerButton.story", "default.category")
    @js.native
    def category: Category = js.native
    @scala.inline
    def category_=(x: Category): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("category")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("wix-ui-core/dist/src/components/file-picker-button/docs/FilePickerButton.story", "default.component")
    @js.native
    class component protected () extends FilePickerButton {
      def this(props: js.Any) = this()
    }
    @JSImport("wix-ui-core/dist/src/components/file-picker-button/docs/FilePickerButton.story", "default.component")
    @js.native
    def component: TypeofFilePickerButton = js.native
    
    @JSImport("wix-ui-core/dist/src/components/file-picker-button/docs/FilePickerButton.story", "default.componentPath")
    @js.native
    def componentPath: String = js.native
    @scala.inline
    def componentPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("componentPath")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/src/components/file-picker-button/docs/FilePickerButton.story", "default.componentProps")
    @js.native
    def componentProps: Accept = js.native
    @scala.inline
    def componentProps_=(x: Accept): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("componentProps")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def component_=(x: TypeofFilePickerButton): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("component")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/src/components/file-picker-button/docs/FilePickerButton.story", "default.exampleProps")
    @js.native
    def exampleProps: OnChange = js.native
    @scala.inline
    def exampleProps_=(x: OnChange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exampleProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/src/components/file-picker-button/docs/FilePickerButton.story", "default.storyName")
    @js.native
    def storyName: String = js.native
    @scala.inline
    def storyName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("storyName")(x.asInstanceOf[js.Any])
  }
}
