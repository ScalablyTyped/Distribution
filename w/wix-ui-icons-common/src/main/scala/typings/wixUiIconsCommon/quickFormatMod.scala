package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsQuickFormatMod.QuickFormatProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object quickFormatMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/QuickFormat", JSImport.Default)
  @js.native
  val default: FC[QuickFormatProps] = js.native
  
  type _To = FC[QuickFormatProps]
  
  /* This means you don't have to write `default`, but can instead just say `quickFormatMod.foo` */
  override def _to: FC[QuickFormatProps] = default
}
