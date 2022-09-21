package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsRouterSmallMod.RouterSmallProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routerSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/RouterSmall", JSImport.Default)
  @js.native
  val default: FC[RouterSmallProps] = js.native
  
  type _To = FC[RouterSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `routerSmallMod.foo` */
  override def _to: FC[RouterSmallProps] = default
}
