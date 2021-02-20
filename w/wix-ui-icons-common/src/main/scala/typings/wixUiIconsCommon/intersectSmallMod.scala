package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object intersectSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/IntersectSmall", JSImport.Default)
  @js.native
  val default: SFC[IntersectSmallProps] = js.native
  
  @js.native
  trait IntersectSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object IntersectSmallProps {
    
    @scala.inline
    def apply(): IntersectSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IntersectSmallProps]
    }
    
    @scala.inline
    implicit class IntersectSmallPropsMutableBuilder[Self <: IntersectSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[IntersectSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `intersectSmallMod.foo` */
  override def _to: SFC[IntersectSmallProps] = default
}
