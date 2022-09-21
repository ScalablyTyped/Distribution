package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsBusinessAppsMod.BusinessAppsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object businessAppsMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/system/BusinessApps", JSImport.Default)
  @js.native
  val default: FC[BusinessAppsProps] = js.native
  
  type _To = FC[BusinessAppsProps]
  
  /* This means you don't have to write `default`, but can instead just say `businessAppsMod.foo` */
  override def _to: FC[BusinessAppsProps] = default
}
