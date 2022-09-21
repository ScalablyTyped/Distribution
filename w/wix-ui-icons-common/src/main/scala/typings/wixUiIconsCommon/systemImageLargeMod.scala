package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.imageLargeMod.ImageLargeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object systemImageLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/on-stage/system/ImageLarge", JSImport.Default)
  @js.native
  val default: FC[ImageLargeProps] = js.native
  
  type _To = FC[ImageLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `systemImageLargeMod.foo` */
  override def _to: FC[ImageLargeProps] = default
}
