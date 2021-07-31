package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alignLeftMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/AlignLeft", JSImport.Default)
  @js.native
  val default: SFC[AlignLeftProps] = js.native
  
  trait AlignLeftProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object AlignLeftProps {
    
    @scala.inline
    def apply(): AlignLeftProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlignLeftProps]
    }
    
    @scala.inline
    implicit class AlignLeftPropsMutableBuilder[Self <: AlignLeftProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[AlignLeftProps]
  
  /* This means you don't have to write `default`, but can instead just say `alignLeftMod.foo` */
  override def _to: SFC[AlignLeftProps] = default
}
