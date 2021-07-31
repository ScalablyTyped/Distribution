package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.textAreaBulletListMod.TextAreaBulletListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemTextAreaBulletListMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/system/TextAreaBulletList", JSImport.Default)
  @js.native
  val default: SFC[TextAreaBulletListProps] = js.native
  
  type _To = SFC[TextAreaBulletListProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemTextAreaBulletListMod.foo` */
  override def _to: SFC[TextAreaBulletListProps] = default
}
