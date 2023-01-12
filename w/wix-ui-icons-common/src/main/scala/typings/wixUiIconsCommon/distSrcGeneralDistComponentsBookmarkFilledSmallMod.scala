package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsBookmarkFilledSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/BookmarkFilledSmall", JSImport.Default)
  @js.native
  val default: FC[BookmarkFilledSmallProps] = js.native
  
  trait BookmarkFilledSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object BookmarkFilledSmallProps {
    
    inline def apply(): BookmarkFilledSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BookmarkFilledSmallProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BookmarkFilledSmallProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[BookmarkFilledSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsBookmarkFilledSmallMod.foo` */
  override def _to: FC[BookmarkFilledSmallProps] = default
}
