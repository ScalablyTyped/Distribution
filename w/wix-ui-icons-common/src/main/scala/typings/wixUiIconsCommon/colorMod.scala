package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsColorMod.ColorProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/Color", JSImport.Default)
  @js.native
  val default: FC[ColorProps] = js.native
  
  type _To = FC[ColorProps]
  
  /* This means you don't have to write `default`, but can instead just say `colorMod.foo` */
  override def _to: FC[ColorProps] = default
}
