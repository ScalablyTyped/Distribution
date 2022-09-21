package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsRepeaterBoldMod.RepeaterBoldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object repeaterBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/RepeaterBold", JSImport.Default)
  @js.native
  val default: FC[RepeaterBoldProps] = js.native
  
  type _To = FC[RepeaterBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `repeaterBoldMod.foo` */
  override def _to: FC[RepeaterBoldProps] = default
}
