package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsStrikethroughMod.StrikethroughProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object strikethroughMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Strikethrough", JSImport.Default)
  @js.native
  val default: FC[StrikethroughProps] = js.native
  
  type _To = FC[StrikethroughProps]
  
  /* This means you don't have to write `default`, but can instead just say `strikethroughMod.foo` */
  override def _to: FC[StrikethroughProps] = default
}
