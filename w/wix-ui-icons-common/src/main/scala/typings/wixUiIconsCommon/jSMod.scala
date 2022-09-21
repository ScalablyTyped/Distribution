package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsJSMod.JSProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jSMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/JS", JSImport.Default)
  @js.native
  val default: FC[JSProps] = js.native
  
  type _To = FC[JSProps]
  
  /* This means you don't have to write `default`, but can instead just say `jSMod.foo` */
  override def _to: FC[JSProps] = default
}
