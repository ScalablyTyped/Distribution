package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.videoLargeMod.VideoLargeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemVideoLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/system/VideoLarge", JSImport.Default)
  @js.native
  val default: FC[VideoLargeProps] = js.native
  
  type _To = FC[VideoLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemVideoLargeMod.foo` */
  override def _to: FC[VideoLargeProps] = default
}
