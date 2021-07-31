package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adminAccessMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/AdminAccess", JSImport.Default)
  @js.native
  val default: SFC[AdminAccessProps] = js.native
  
  trait AdminAccessProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object AdminAccessProps {
    
    @scala.inline
    def apply(): AdminAccessProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdminAccessProps]
    }
    
    @scala.inline
    implicit class AdminAccessPropsMutableBuilder[Self <: AdminAccessProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[AdminAccessProps]
  
  /* This means you don't have to write `default`, but can instead just say `adminAccessMod.foo` */
  override def _to: SFC[AdminAccessProps] = default
}
