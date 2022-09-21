package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsCustomMod.CustomProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object customMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Custom", JSImport.Default)
  @js.native
  val default: FC[CustomProps] = js.native
  
  type _To = FC[CustomProps]
  
  /* This means you don't have to write `default`, but can instead just say `customMod.foo` */
  override def _to: FC[CustomProps] = default
}
