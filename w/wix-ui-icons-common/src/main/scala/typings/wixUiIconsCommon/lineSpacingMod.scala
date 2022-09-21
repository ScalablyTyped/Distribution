package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsLineSpacingMod.LineSpacingProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineSpacingMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/LineSpacing", JSImport.Default)
  @js.native
  val default: FC[LineSpacingProps] = js.native
  
  type _To = FC[LineSpacingProps]
  
  /* This means you don't have to write `default`, but can instead just say `lineSpacingMod.foo` */
  override def _to: FC[LineSpacingProps] = default
}
