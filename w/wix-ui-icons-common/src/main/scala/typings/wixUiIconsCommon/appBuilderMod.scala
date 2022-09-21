package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsAppBuilderMod.AppBuilderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appBuilderMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/AppBuilder", JSImport.Default)
  @js.native
  val default: FC[AppBuilderProps] = js.native
  
  type _To = FC[AppBuilderProps]
  
  /* This means you don't have to write `default`, but can instead just say `appBuilderMod.foo` */
  override def _to: FC[AppBuilderProps] = default
}
