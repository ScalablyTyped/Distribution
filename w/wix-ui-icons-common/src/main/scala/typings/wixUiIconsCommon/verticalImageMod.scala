package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsVerticalImageMod.VerticalImageProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object verticalImageMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/VerticalImage", JSImport.Default)
  @js.native
  val default: FC[VerticalImageProps] = js.native
  
  type _To = FC[VerticalImageProps]
  
  /* This means you don't have to write `default`, but can instead just say `verticalImageMod.foo` */
  override def _to: FC[VerticalImageProps] = default
}
