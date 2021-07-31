package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backwardSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/BackwardSmall", JSImport.Default)
  @js.native
  val default: SFC[BackwardSmallProps] = js.native
  
  trait BackwardSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object BackwardSmallProps {
    
    @scala.inline
    def apply(): BackwardSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackwardSmallProps]
    }
    
    @scala.inline
    implicit class BackwardSmallPropsMutableBuilder[Self <: BackwardSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[BackwardSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `backwardSmallMod.foo` */
  override def _to: SFC[BackwardSmallProps] = default
}
