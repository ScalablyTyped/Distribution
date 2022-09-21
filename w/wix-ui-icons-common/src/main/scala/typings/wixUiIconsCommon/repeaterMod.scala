package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsRepeaterMod.RepeaterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object repeaterMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Repeater", JSImport.Default)
  @js.native
  val default: FC[RepeaterProps] = js.native
  
  type _To = FC[RepeaterProps]
  
  /* This means you don't have to write `default`, but can instead just say `repeaterMod.foo` */
  override def _to: FC[RepeaterProps] = default
}
