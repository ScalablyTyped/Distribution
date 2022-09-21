package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsMobileBoldMod.MobileBoldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mobileBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/MobileBold", JSImport.Default)
  @js.native
  val default: FC[MobileBoldProps] = js.native
  
  type _To = FC[MobileBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `mobileBoldMod.foo` */
  override def _to: FC[MobileBoldProps] = default
}
