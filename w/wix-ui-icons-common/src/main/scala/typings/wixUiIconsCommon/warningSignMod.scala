package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsWarningSignMod.WarningSignProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object warningSignMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/WarningSign", JSImport.Default)
  @js.native
  val default: FC[WarningSignProps] = js.native
  
  type _To = FC[WarningSignProps]
  
  /* This means you don't have to write `default`, but can instead just say `warningSignMod.foo` */
  override def _to: FC[WarningSignProps] = default
}
