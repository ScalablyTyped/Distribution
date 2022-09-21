package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsStripMod.StripProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stripMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Strip", JSImport.Default)
  @js.native
  val default: FC[StripProps] = js.native
  
  type _To = FC[StripProps]
  
  /* This means you don't have to write `default`, but can instead just say `stripMod.foo` */
  override def _to: FC[StripProps] = default
}
