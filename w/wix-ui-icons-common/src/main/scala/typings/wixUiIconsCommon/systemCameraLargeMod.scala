package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.cameraLargeMod.CameraLargeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemCameraLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/system/CameraLarge", JSImport.Default)
  @js.native
  val default: FC[CameraLargeProps] = js.native
  
  type _To = FC[CameraLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemCameraLargeMod.foo` */
  override def _to: FC[CameraLargeProps] = default
}
