package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsAlignLeftMod.AlignLeftProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alignLeftMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/AlignLeft", JSImport.Default)
  @js.native
  val default: FC[AlignLeftProps] = js.native
  
  type _To = FC[AlignLeftProps]
  
  /* This means you don't have to write `default`, but can instead just say `alignLeftMod.foo` */
  override def _to: FC[AlignLeftProps] = default
}
