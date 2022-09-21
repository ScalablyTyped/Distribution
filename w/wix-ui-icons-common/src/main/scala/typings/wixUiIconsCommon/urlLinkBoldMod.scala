package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsUrlLinkBoldMod.UrlLinkBoldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlLinkBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/UrlLinkBold", JSImport.Default)
  @js.native
  val default: FC[UrlLinkBoldProps] = js.native
  
  type _To = FC[UrlLinkBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `urlLinkBoldMod.foo` */
  override def _to: FC[UrlLinkBoldProps] = default
}
