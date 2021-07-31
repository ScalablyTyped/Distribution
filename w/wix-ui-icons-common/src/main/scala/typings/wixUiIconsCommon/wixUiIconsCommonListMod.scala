package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.listMod.ListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonListMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/List", JSImport.Default)
  @js.native
  val default: SFC[ListProps] = js.native
  
  type _To = SFC[ListProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonListMod.foo` */
  override def _to: SFC[ListProps] = default
}
