package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsVimeoMod.VimeoProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vimeoMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Vimeo", JSImport.Default)
  @js.native
  val default: FC[VimeoProps] = js.native
  
  type _To = FC[VimeoProps]
  
  /* This means you don't have to write `default`, but can instead just say `vimeoMod.foo` */
  override def _to: FC[VimeoProps] = default
}
