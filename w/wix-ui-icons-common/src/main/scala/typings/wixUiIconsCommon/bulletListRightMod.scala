package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsBulletListRightMod.BulletListRightProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bulletListRightMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/BulletListRight", JSImport.Default)
  @js.native
  val default: FC[BulletListRightProps] = js.native
  
  type _To = FC[BulletListRightProps]
  
  /* This means you don't have to write `default`, but can instead just say `bulletListRightMod.foo` */
  override def _to: FC[BulletListRightProps] = default
}
