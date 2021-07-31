package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.textAreaUnderlineMod.TextAreaUnderlineProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemTextAreaUnderlineMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/system/TextAreaUnderline", JSImport.Default)
  @js.native
  val default: SFC[TextAreaUnderlineProps] = js.native
  
  type _To = SFC[TextAreaUnderlineProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemTextAreaUnderlineMod.foo` */
  override def _to: SFC[TextAreaUnderlineProps] = default
}
