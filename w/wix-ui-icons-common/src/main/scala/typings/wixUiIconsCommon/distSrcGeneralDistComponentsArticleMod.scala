package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsArticleMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Article", JSImport.Default)
  @js.native
  val default: FC[ArticleProps] = js.native
  
  trait ArticleProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ArticleProps {
    
    inline def apply(): ArticleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArticleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArticleProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ArticleProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsArticleMod.foo` */
  override def _to: FC[ArticleProps] = default
}
