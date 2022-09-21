package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsShowMod.ShowProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object showMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Show", JSImport.Default)
  @js.native
  val default: FC[ShowProps] = js.native
  
  type _To = FC[ShowProps]
  
  /* This means you don't have to write `default`, but can instead just say `showMod.foo` */
  override def _to: FC[ShowProps] = default
}
