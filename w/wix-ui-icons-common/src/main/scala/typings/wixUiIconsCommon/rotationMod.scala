package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.distComponentsRotationMod.RotationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rotationMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/Rotation", JSImport.Default)
  @js.native
  val default: FC[RotationProps] = js.native
  
  type _To = FC[RotationProps]
  
  /* This means you don't have to write `default`, but can instead just say `rotationMod.foo` */
  override def _to: FC[RotationProps] = default
}
