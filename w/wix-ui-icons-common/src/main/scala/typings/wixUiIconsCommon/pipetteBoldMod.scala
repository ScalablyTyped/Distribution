package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsPipetteBoldMod.PipetteBoldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pipetteBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/PipetteBold", JSImport.Default)
  @js.native
  val default: FC[PipetteBoldProps] = js.native
  
  type _To = FC[PipetteBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `pipetteBoldMod.foo` */
  override def _to: FC[PipetteBoldProps] = default
}
