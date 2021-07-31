package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAlignCenterSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/TextAlignCenterSmall", JSImport.Default)
  @js.native
  val default: SFC[TextAlignCenterSmallProps] = js.native
  
  trait TextAlignCenterSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object TextAlignCenterSmallProps {
    
    @scala.inline
    def apply(): TextAlignCenterSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAlignCenterSmallProps]
    }
    
    @scala.inline
    implicit class TextAlignCenterSmallPropsMutableBuilder[Self <: TextAlignCenterSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[TextAlignCenterSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `textAlignCenterSmallMod.foo` */
  override def _to: SFC[TextAlignCenterSmallProps] = default
}
