package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object homeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Home", JSImport.Default)
  @js.native
  val default: SFC[HomeProps] = js.native
  
  trait HomeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object HomeProps {
    
    @scala.inline
    def apply(): HomeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HomeProps]
    }
    
    @scala.inline
    implicit class HomePropsMutableBuilder[Self <: HomeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[HomeProps]
  
  /* This means you don't have to write `default`, but can instead just say `homeMod.foo` */
  override def _to: SFC[HomeProps] = default
}
