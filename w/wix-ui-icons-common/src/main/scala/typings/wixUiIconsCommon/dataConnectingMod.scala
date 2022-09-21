package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsDataConnectingMod.DataConnectingProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataConnectingMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/DataConnecting", JSImport.Default)
  @js.native
  val default: FC[DataConnectingProps] = js.native
  
  type _To = FC[DataConnectingProps]
  
  /* This means you don't have to write `default`, but can instead just say `dataConnectingMod.foo` */
  override def _to: FC[DataConnectingProps] = default
}
