package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moreSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/MoreSmall", JSImport.Default)
  @js.native
  val default: SFC[MoreSmallProps] = js.native
  
  trait MoreSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object MoreSmallProps {
    
    @scala.inline
    def apply(): MoreSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MoreSmallProps]
    }
    
    @scala.inline
    implicit class MoreSmallPropsMutableBuilder[Self <: MoreSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[MoreSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `moreSmallMod.foo` */
  override def _to: SFC[MoreSmallProps] = default
}
