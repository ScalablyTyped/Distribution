package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.textAreaLinkMod.TextAreaLinkProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemTextAreaLinkMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/system/TextAreaLink", JSImport.Default)
  @js.native
  val default: SFC[TextAreaLinkProps] = js.native
  
  type _To = SFC[TextAreaLinkProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemTextAreaLinkMod.foo` */
  override def _to: SFC[TextAreaLinkProps] = default
}
