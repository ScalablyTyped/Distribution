package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsUnderlineMod.UnderlineProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object underlineMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Underline", JSImport.Default)
  @js.native
  val default: FC[UnderlineProps] = js.native
  
  type _To = FC[UnderlineProps]
  
  /* This means you don't have to write `default`, but can instead just say `underlineMod.foo` */
  override def _to: FC[UnderlineProps] = default
}
