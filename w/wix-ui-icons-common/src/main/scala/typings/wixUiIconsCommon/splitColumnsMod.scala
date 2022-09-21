package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsSplitColumnsMod.SplitColumnsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object splitColumnsMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/SplitColumns", JSImport.Default)
  @js.native
  val default: FC[SplitColumnsProps] = js.native
  
  type _To = FC[SplitColumnsProps]
  
  /* This means you don't have to write `default`, but can instead just say `splitColumnsMod.foo` */
  override def _to: FC[SplitColumnsProps] = default
}
