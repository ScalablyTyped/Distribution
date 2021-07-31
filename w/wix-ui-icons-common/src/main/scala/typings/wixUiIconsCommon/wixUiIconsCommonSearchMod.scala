package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.searchMod.SearchProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonSearchMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Search", JSImport.Default)
  @js.native
  val default: SFC[SearchProps] = js.native
  
  type _To = SFC[SearchProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonSearchMod.foo` */
  override def _to: SFC[SearchProps] = default
}
