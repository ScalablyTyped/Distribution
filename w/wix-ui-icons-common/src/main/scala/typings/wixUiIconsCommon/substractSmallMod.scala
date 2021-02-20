package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object substractSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SubstractSmall", JSImport.Default)
  @js.native
  val default: SFC[SubstractSmallProps] = js.native
  
  @js.native
  trait SubstractSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object SubstractSmallProps {
    
    @scala.inline
    def apply(): SubstractSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubstractSmallProps]
    }
    
    @scala.inline
    implicit class SubstractSmallPropsMutableBuilder[Self <: SubstractSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[SubstractSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `substractSmallMod.foo` */
  override def _to: SFC[SubstractSmallProps] = default
}
