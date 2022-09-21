package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsZoomInMod.ZoomInProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zoomInMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/ZoomIn", JSImport.Default)
  @js.native
  val default: FC[ZoomInProps] = js.native
  
  type _To = FC[ZoomInProps]
  
  /* This means you don't have to write `default`, but can instead just say `zoomInMod.foo` */
  override def _to: FC[ZoomInProps] = default
}
