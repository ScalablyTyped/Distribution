package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsExtrnalLinkMod.ExtrnalLinkProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extrnalLinkMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/ExtrnalLink", JSImport.Default)
  @js.native
  val default: FC[ExtrnalLinkProps] = js.native
  
  type _To = FC[ExtrnalLinkProps]
  
  /* This means you don't have to write `default`, but can instead just say `extrnalLinkMod.foo` */
  override def _to: FC[ExtrnalLinkProps] = default
}
