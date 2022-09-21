package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsHorizontalLineMod.HorizontalLineProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object horizontalLineMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/HorizontalLine", JSImport.Default)
  @js.native
  val default: FC[HorizontalLineProps] = js.native
  
  type _To = FC[HorizontalLineProps]
  
  /* This means you don't have to write `default`, but can instead just say `horizontalLineMod.foo` */
  override def _to: FC[HorizontalLineProps] = default
}
