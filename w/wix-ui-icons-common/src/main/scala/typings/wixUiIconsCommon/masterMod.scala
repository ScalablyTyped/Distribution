package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsMasterMod.MasterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object masterMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Master", JSImport.Default)
  @js.native
  val default: FC[MasterProps] = js.native
  
  type _To = FC[MasterProps]
  
  /* This means you don't have to write `default`, but can instead just say `masterMod.foo` */
  override def _to: FC[MasterProps] = default
}
