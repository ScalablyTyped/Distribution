package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsReplaceBoldMod.ReplaceBoldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object replaceBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/ReplaceBold", JSImport.Default)
  @js.native
  val default: FC[ReplaceBoldProps] = js.native
  
  type _To = FC[ReplaceBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `replaceBoldMod.foo` */
  override def _to: FC[ReplaceBoldProps] = default
}
