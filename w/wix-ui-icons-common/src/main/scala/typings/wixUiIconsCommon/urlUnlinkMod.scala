package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsUrlUnlinkMod.UrlUnlinkProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlUnlinkMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/UrlUnlink", JSImport.Default)
  @js.native
  val default: FC[UrlUnlinkProps] = js.native
  
  type _To = FC[UrlUnlinkProps]
  
  /* This means you don't have to write `default`, but can instead just say `urlUnlinkMod.foo` */
  override def _to: FC[UrlUnlinkProps] = default
}
