package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.distComponentsBackgroundMod.BackgroundProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backgroundMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/Background", JSImport.Default)
  @js.native
  val default: FC[BackgroundProps] = js.native
  
  type _To = FC[BackgroundProps]
  
  /* This means you don't have to write `default`, but can instead just say `backgroundMod.foo` */
  override def _to: FC[BackgroundProps] = default
}
