package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsUrlLinkSmallMod.UrlLinkSmallProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlLinkSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/UrlLinkSmall", JSImport.Default)
  @js.native
  val default: FC[UrlLinkSmallProps] = js.native
  
  type _To = FC[UrlLinkSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `urlLinkSmallMod.foo` */
  override def _to: FC[UrlLinkSmallProps] = default
}
