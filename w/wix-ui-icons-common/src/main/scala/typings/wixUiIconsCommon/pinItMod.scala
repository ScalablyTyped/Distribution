package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsPinItMod.PinItProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pinItMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/PinIt", JSImport.Default)
  @js.native
  val default: FC[PinItProps] = js.native
  
  type _To = FC[PinItProps]
  
  /* This means you don't have to write `default`, but can instead just say `pinItMod.foo` */
  override def _to: FC[PinItProps] = default
}
