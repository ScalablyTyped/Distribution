package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object faceFemaleSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/FaceFemaleSmall", JSImport.Default)
  @js.native
  val default: SFC[FaceFemaleSmallProps] = js.native
  
  @js.native
  trait FaceFemaleSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object FaceFemaleSmallProps {
    
    @scala.inline
    def apply(): FaceFemaleSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FaceFemaleSmallProps]
    }
    
    @scala.inline
    implicit class FaceFemaleSmallPropsMutableBuilder[Self <: FaceFemaleSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[FaceFemaleSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `faceFemaleSmallMod.foo` */
  override def _to: SFC[FaceFemaleSmallProps] = default
}
