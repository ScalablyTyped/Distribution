package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.wixUiIconsCommon.componentsArticleBoldMod.ArticleBoldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object articleBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/classic-editor/ArticleBold", JSImport.Default)
  @js.native
  val default: FC[ArticleBoldProps] = js.native
  
  type _To = FC[ArticleBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `articleBoldMod.foo` */
  override def _to: FC[ArticleBoldProps] = default
}
