package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsAnimatedSlideMod.AnimatedSlideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animatedSlideMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/AnimatedSlide", JSImport.Default)
  @js.native
  val default: FC[AnimatedSlideProps] = js.native
  
  type _To = FC[AnimatedSlideProps]
  
  /* This means you don't have to write `default`, but can instead just say `animatedSlideMod.foo` */
  override def _to: FC[AnimatedSlideProps] = default
}
