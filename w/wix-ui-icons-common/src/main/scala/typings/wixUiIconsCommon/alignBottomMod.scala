package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsAlignBottomMod.AlignBottomProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alignBottomMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/AlignBottom", JSImport.Default)
  @js.native
  val default: FC[AlignBottomProps] = js.native
  
  type _To = FC[AlignBottomProps]
  
  /* This means you don't have to write `default`, but can instead just say `alignBottomMod.foo` */
  override def _to: FC[AlignBottomProps] = default
}
