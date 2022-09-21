package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsPhoneBoldMod.PhoneBoldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object phoneBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/PhoneBold", JSImport.Default)
  @js.native
  val default: FC[PhoneBoldProps] = js.native
  
  type _To = FC[PhoneBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `phoneBoldMod.foo` */
  override def _to: FC[PhoneBoldProps] = default
}
