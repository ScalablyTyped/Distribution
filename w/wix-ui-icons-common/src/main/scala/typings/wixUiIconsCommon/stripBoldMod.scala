package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsStripBoldMod.StripBoldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stripBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/StripBold", JSImport.Default)
  @js.native
  val default: FC[StripBoldProps] = js.native
  
  type _To = FC[StripBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `stripBoldMod.foo` */
  override def _to: FC[StripBoldProps] = default
}
