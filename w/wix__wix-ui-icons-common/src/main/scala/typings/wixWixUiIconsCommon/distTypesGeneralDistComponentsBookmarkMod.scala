package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsBookmarkMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Bookmark", JSImport.Default)
  @js.native
  val default: FC[BookmarkProps] = js.native
  
  trait BookmarkProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object BookmarkProps {
    
    inline def apply(): BookmarkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BookmarkProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BookmarkProps] (val x: Self) extends AnyVal {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[BookmarkProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsBookmarkMod.foo` */
  override def _to: FC[BookmarkProps] = default
}
