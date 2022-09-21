package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsMaskMod.MaskProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object maskMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/Mask", JSImport.Default)
  @js.native
  val default: FC[MaskProps] = js.native
  
  type _To = FC[MaskProps]
  
  /* This means you don't have to write `default`, but can instead just say `maskMod.foo` */
  override def _to: FC[MaskProps] = default
}
