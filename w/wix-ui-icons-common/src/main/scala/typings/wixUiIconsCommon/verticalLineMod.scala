package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsVerticalLineMod.VerticalLineProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object verticalLineMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/VerticalLine", JSImport.Default)
  @js.native
  val default: FC[VerticalLineProps] = js.native
  
  type _To = FC[VerticalLineProps]
  
  /* This means you don't have to write `default`, but can instead just say `verticalLineMod.foo` */
  override def _to: FC[VerticalLineProps] = default
}
