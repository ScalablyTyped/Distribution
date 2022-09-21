package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsRouterMod.RouterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routerMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/Router", JSImport.Default)
  @js.native
  val default: FC[RouterProps] = js.native
  
  type _To = FC[RouterProps]
  
  /* This means you don't have to write `default`, but can instead just say `routerMod.foo` */
  override def _to: FC[RouterProps] = default
}
