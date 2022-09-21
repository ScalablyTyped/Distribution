package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsJswMod.JSWProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jswMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/JSW", JSImport.Default)
  @js.native
  val default: FC[JSWProps] = js.native
  
  type _To = FC[JSWProps]
  
  /* This means you don't have to write `default`, but can instead just say `jswMod.foo` */
  override def _to: FC[JSWProps] = default
}
