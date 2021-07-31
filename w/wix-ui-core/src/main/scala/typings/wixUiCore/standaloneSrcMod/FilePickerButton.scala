package typings.wixUiCore.standaloneSrcMod

import typings.wixUiCore.anon.Disabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-ui-core/dist/standalone/src", "FilePickerButton")
@js.native
class FilePickerButton protected ()
  extends typings.wixUiCore.componentsFilePickerButtonMod.FilePickerButton {
  def this(props: js.Any) = this()
}
/* static members */
object FilePickerButton {
  
  @JSImport("wix-ui-core/dist/standalone/src", "FilePickerButton")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-ui-core/dist/standalone/src", "FilePickerButton.defaultProps")
  @js.native
  def defaultProps: Disabled = js.native
  @scala.inline
  def defaultProps_=(x: Disabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-ui-core/dist/standalone/src", "FilePickerButton.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
