package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object penNibAddSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/PenNibAddSmall", JSImport.Default)
  @js.native
  val default: SFC[PenNibAddSmallProps] = js.native
  
  trait PenNibAddSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object PenNibAddSmallProps {
    
    @scala.inline
    def apply(): PenNibAddSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PenNibAddSmallProps]
    }
    
    @scala.inline
    implicit class PenNibAddSmallPropsMutableBuilder[Self <: PenNibAddSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[PenNibAddSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `penNibAddSmallMod.foo` */
  override def _to: SFC[PenNibAddSmallProps] = default
}
