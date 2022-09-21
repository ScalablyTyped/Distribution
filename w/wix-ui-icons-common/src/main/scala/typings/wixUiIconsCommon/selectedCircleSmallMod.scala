package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsSelectedCircleSmallMod.SelectedCircleSmallProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectedCircleSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/SelectedCircleSmall", JSImport.Default)
  @js.native
  val default: FC[SelectedCircleSmallProps] = js.native
  
  type _To = FC[SelectedCircleSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `selectedCircleSmallMod.foo` */
  override def _to: FC[SelectedCircleSmallProps] = default
}
