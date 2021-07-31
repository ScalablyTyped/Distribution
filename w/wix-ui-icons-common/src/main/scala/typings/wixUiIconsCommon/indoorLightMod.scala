package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indoorLightMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/IndoorLight", JSImport.Default)
  @js.native
  val default: SFC[IndoorLightProps] = js.native
  
  trait IndoorLightProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object IndoorLightProps {
    
    @scala.inline
    def apply(): IndoorLightProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IndoorLightProps]
    }
    
    @scala.inline
    implicit class IndoorLightPropsMutableBuilder[Self <: IndoorLightProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[IndoorLightProps]
  
  /* This means you don't have to write `default`, but can instead just say `indoorLightMod.foo` */
  override def _to: SFC[IndoorLightProps] = default
}
