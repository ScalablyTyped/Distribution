package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.distComponentsCropMod.CropProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cropMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/Crop", JSImport.Default)
  @js.native
  val default: FC[CropProps] = js.native
  
  type _To = FC[CropProps]
  
  /* This means you don't have to write `default`, but can instead just say `cropMod.foo` */
  override def _to: FC[CropProps] = default
}
