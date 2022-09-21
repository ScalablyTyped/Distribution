package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsBackToTopMod.BackToTopProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backToTopMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/BackToTop", JSImport.Default)
  @js.native
  val default: FC[BackToTopProps] = js.native
  
  type _To = FC[BackToTopProps]
  
  /* This means you don't have to write `default`, but can instead just say `backToTopMod.foo` */
  override def _to: FC[BackToTopProps] = default
}
