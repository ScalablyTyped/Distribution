package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsIncreaseFontMod.IncreaseFontProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object increaseFontMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/IncreaseFont", JSImport.Default)
  @js.native
  val default: FC[IncreaseFontProps] = js.native
  
  type _To = FC[IncreaseFontProps]
  
  /* This means you don't have to write `default`, but can instead just say `increaseFontMod.foo` */
  override def _to: FC[IncreaseFontProps] = default
}
