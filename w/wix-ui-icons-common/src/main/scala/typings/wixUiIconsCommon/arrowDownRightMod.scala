package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrowDownRightMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ArrowDownRight", JSImport.Default)
  @js.native
  val default: SFC[ArrowDownRightProps] = js.native
  
  trait ArrowDownRightProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object ArrowDownRightProps {
    
    @scala.inline
    def apply(): ArrowDownRightProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrowDownRightProps]
    }
    
    @scala.inline
    implicit class ArrowDownRightPropsMutableBuilder[Self <: ArrowDownRightProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ArrowDownRightProps]
  
  /* This means you don't have to write `default`, but can instead just say `arrowDownRightMod.foo` */
  override def _to: SFC[ArrowDownRightProps] = default
}
