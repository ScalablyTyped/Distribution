package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Search", JSImport.Default)
  @js.native
  val default: SFC[SearchProps] = js.native
  
  @js.native
  trait SearchProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object SearchProps {
    
    @scala.inline
    def apply(): SearchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchProps]
    }
    
    @scala.inline
    implicit class SearchPropsMutableBuilder[Self <: SearchProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[SearchProps]
  
  /* This means you don't have to write `default`, but can instead just say `searchMod.foo` */
  override def _to: SFC[SearchProps] = default
}
