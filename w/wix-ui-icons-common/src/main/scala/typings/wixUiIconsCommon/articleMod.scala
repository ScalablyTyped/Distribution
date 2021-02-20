package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object articleMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Article", JSImport.Default)
  @js.native
  val default: SFC[ArticleProps] = js.native
  
  @js.native
  trait ArticleProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ArticleProps {
    
    @scala.inline
    def apply(): ArticleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArticleProps]
    }
    
    @scala.inline
    implicit class ArticlePropsMutableBuilder[Self <: ArticleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ArticleProps]
  
  /* This means you don't have to write `default`, but can instead just say `articleMod.foo` */
  override def _to: SFC[ArticleProps] = default
}
