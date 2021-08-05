package typings.wixUiCore

import typings.wixUiCore.anon.Disabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsFilePickerButtonMod {
  
  @JSImport("wix-ui-core/src/components/file-picker-button", "FilePickerButton")
  @js.native
  class FilePickerButton protected ()
    extends typings.wixUiCore.srcComponentsFilePickerButtonFilePickerButtonMod.FilePickerButton {
    def this(props: js.Any) = this()
  }
  /* static members */
  object FilePickerButton {
    
    @JSImport("wix-ui-core/src/components/file-picker-button", "FilePickerButton")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/src/components/file-picker-button", "FilePickerButton.defaultProps")
    @js.native
    def defaultProps: Disabled = js.native
    inline def defaultProps_=(x: Disabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/src/components/file-picker-button", "FilePickerButton.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
