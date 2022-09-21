package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsEmailBoldMod.EmailBoldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emailBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/EmailBold", JSImport.Default)
  @js.native
  val default: FC[EmailBoldProps] = js.native
  
  type _To = FC[EmailBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `emailBoldMod.foo` */
  override def _to: FC[EmailBoldProps] = default
}
