package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bookmarkMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Bookmark", JSImport.Default)
  @js.native
  val default: SFC[BookmarkProps] = js.native
  
  @js.native
  trait BookmarkProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object BookmarkProps {
    
    @scala.inline
    def apply(): BookmarkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BookmarkProps]
    }
    
    @scala.inline
    implicit class BookmarkPropsMutableBuilder[Self <: BookmarkProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[BookmarkProps]
  
  /* This means you don't have to write `default`, but can instead just say `bookmarkMod.foo` */
  override def _to: SFC[BookmarkProps] = default
}
