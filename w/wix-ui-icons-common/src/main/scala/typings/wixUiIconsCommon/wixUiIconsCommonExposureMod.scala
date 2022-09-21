package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.exposureMod.ExposureProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonExposureMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Exposure", JSImport.Default)
  @js.native
  val default: FC[ExposureProps] = js.native
  
  type _To = FC[ExposureProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonExposureMod.foo` */
  override def _to: FC[ExposureProps] = default
}
