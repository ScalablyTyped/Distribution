package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.uploadMod.UploadProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonUploadMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Upload", JSImport.Default)
  @js.native
  val default: SFC[UploadProps] = js.native
  
  type _To = SFC[UploadProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonUploadMod.foo` */
  override def _to: SFC[UploadProps] = default
}
