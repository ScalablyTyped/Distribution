package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.attachementMod.AttachementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonAttachementMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Attachement", JSImport.Default)
  @js.native
  val default: FC[AttachementProps] = js.native
  
  type _To = FC[AttachementProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonAttachementMod.foo` */
  override def _to: FC[AttachementProps] = default
}
