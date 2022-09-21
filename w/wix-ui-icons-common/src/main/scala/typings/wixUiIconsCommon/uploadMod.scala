package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsUploadMod.UploadProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uploadMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Upload", JSImport.Default)
  @js.native
  val default: FC[UploadProps] = js.native
  
  type _To = FC[UploadProps]
  
  /* This means you don't have to write `default`, but can instead just say `uploadMod.foo` */
  override def _to: FC[UploadProps] = default
}
