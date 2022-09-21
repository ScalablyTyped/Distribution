package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsPageSpecialMod.PageSpecialProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pageSpecialMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/PageSpecial", JSImport.Default)
  @js.native
  val default: FC[PageSpecialProps] = js.native
  
  type _To = FC[PageSpecialProps]
  
  /* This means you don't have to write `default`, but can instead just say `pageSpecialMod.foo` */
  override def _to: FC[PageSpecialProps] = default
}
