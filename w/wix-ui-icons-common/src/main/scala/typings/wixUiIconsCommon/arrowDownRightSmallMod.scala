package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrowDownRightSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ArrowDownRightSmall", JSImport.Default)
  @js.native
  val default: SFC[ArrowDownRightSmallProps] = js.native
  
  trait ArrowDownRightSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object ArrowDownRightSmallProps {
    
    @scala.inline
    def apply(): ArrowDownRightSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrowDownRightSmallProps]
    }
    
    @scala.inline
    implicit class ArrowDownRightSmallPropsMutableBuilder[Self <: ArrowDownRightSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ArrowDownRightSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `arrowDownRightSmallMod.foo` */
  override def _to: SFC[ArrowDownRightSmallProps] = default
}
