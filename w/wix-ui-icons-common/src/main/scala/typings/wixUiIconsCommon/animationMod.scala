package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.distComponentsAnimationMod.AnimationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/Animation", JSImport.Default)
  @js.native
  val default: FC[AnimationProps] = js.native
  
  type _To = FC[AnimationProps]
  
  /* This means you don't have to write `default`, but can instead just say `animationMod.foo` */
  override def _to: FC[AnimationProps] = default
}
