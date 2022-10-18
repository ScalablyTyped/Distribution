package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.distSrcGeneralDistComponentsEmailMod.EmailProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emailMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Email", JSImport.Default)
  @js.native
  val default: FC[EmailProps] = js.native
  
  type _To = FC[EmailProps]
  
  /* This means you don't have to write `default`, but can instead just say `emailMod.foo` */
  override def _to: FC[EmailProps] = default
}
