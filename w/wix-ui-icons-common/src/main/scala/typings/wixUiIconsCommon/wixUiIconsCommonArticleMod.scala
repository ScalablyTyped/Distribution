package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.wixUiIconsCommon.articleMod.ArticleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiIconsCommonArticleMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/Article", JSImport.Default)
  @js.native
  val default: SFC[ArticleProps] = js.native
  
  type _To = SFC[ArticleProps]
  
  /* This means you don't have to write `default`, but can instead just say `wixUiIconsCommonArticleMod.foo` */
  override def _to: SFC[ArticleProps] = default
}
