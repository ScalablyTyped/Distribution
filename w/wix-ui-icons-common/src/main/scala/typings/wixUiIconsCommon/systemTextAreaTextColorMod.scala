package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.textAreaTextColorMod.TextAreaTextColorProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemTextAreaTextColorMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/system/TextAreaTextColor", JSImport.Default)
  @js.native
  val default: FC[TextAreaTextColorProps] = js.native
  
  type _To = FC[TextAreaTextColorProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemTextAreaTextColorMod.foo` */
  override def _to: FC[TextAreaTextColorProps] = default
}
