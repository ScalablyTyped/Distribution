package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Check", JSImport.Default)
  @js.native
  val default: SFC[CheckProps] = js.native
  
  trait CheckProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object CheckProps {
    
    @scala.inline
    def apply(): CheckProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckProps]
    }
    
    @scala.inline
    implicit class CheckPropsMutableBuilder[Self <: CheckProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[CheckProps]
  
  /* This means you don't have to write `default`, but can instead just say `checkMod.foo` */
  override def _to: SFC[CheckProps] = default
}
