package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsAnimationsScrollMod.AnimationsScrollProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationsScrollMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/AnimationsScroll", JSImport.Default)
  @js.native
  val default: FC[AnimationsScrollProps] = js.native
  
  type _To = FC[AnimationsScrollProps]
  
  /* This means you don't have to write `default`, but can instead just say `animationsScrollMod.foo` */
  override def _to: FC[AnimationsScrollProps] = default
}
