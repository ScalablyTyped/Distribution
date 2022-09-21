package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsBoxMod.BoxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boxMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Box", JSImport.Default)
  @js.native
  val default: FC[BoxProps] = js.native
  
  type _To = FC[BoxProps]
  
  /* This means you don't have to write `default`, but can instead just say `boxMod.foo` */
  override def _to: FC[BoxProps] = default
}
