package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsShapeBoldMod.ShapeBoldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shapeBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/ShapeBold", JSImport.Default)
  @js.native
  val default: FC[ShapeBoldProps] = js.native
  
  type _To = FC[ShapeBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `shapeBoldMod.foo` */
  override def _to: FC[ShapeBoldProps] = default
}
