package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object categoryMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Category", JSImport.Default)
  @js.native
  val default: SFC[CategoryProps] = js.native
  
  trait CategoryProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object CategoryProps {
    
    @scala.inline
    def apply(): CategoryProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CategoryProps]
    }
    
    @scala.inline
    implicit class CategoryPropsMutableBuilder[Self <: CategoryProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[CategoryProps]
  
  /* This means you don't have to write `default`, but can instead just say `categoryMod.foo` */
  override def _to: SFC[CategoryProps] = default
}
