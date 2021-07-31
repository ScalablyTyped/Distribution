package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.moveMod.MoveProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemMoveMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/system/Move", JSImport.Default)
  @js.native
  val default: SFC[MoveProps] = js.native
  
  type _To = SFC[MoveProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemMoveMod.foo` */
  override def _to: SFC[MoveProps] = default
}
