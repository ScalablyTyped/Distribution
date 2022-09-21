package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsMovetoBackMod.MovetoBackProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object movetoBackMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/MovetoBack", JSImport.Default)
  @js.native
  val default: FC[MovetoBackProps] = js.native
  
  type _To = FC[MovetoBackProps]
  
  /* This means you don't have to write `default`, but can instead just say `movetoBackMod.foo` */
  override def _to: FC[MovetoBackProps] = default
}
