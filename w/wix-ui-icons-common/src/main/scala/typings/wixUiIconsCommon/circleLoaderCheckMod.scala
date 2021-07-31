package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circleLoaderCheckMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/CircleLoaderCheck", JSImport.Default)
  @js.native
  val default: SFC[CircleLoaderCheckProps] = js.native
  
  trait CircleLoaderCheckProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object CircleLoaderCheckProps {
    
    @scala.inline
    def apply(): CircleLoaderCheckProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CircleLoaderCheckProps]
    }
    
    @scala.inline
    implicit class CircleLoaderCheckPropsMutableBuilder[Self <: CircleLoaderCheckProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[CircleLoaderCheckProps]
  
  /* This means you don't have to write `default`, but can instead just say `circleLoaderCheckMod.foo` */
  override def _to: SFC[CircleLoaderCheckProps] = default
}
