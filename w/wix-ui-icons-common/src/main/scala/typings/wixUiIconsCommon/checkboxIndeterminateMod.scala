package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkboxIndeterminateMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/CheckboxIndeterminate", JSImport.Default)
  @js.native
  val default: SFC[CheckboxIndeterminateProps] = js.native
  
  trait CheckboxIndeterminateProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object CheckboxIndeterminateProps {
    
    @scala.inline
    def apply(): CheckboxIndeterminateProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckboxIndeterminateProps]
    }
    
    @scala.inline
    implicit class CheckboxIndeterminatePropsMutableBuilder[Self <: CheckboxIndeterminateProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[CheckboxIndeterminateProps]
  
  /* This means you don't have to write `default`, but can instead just say `checkboxIndeterminateMod.foo` */
  override def _to: SFC[CheckboxIndeterminateProps] = default
}
