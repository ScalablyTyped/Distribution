package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusStopMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/StatusStop", JSImport.Default)
  @js.native
  val default: SFC[StatusStopProps] = js.native
  
  trait StatusStopProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object StatusStopProps {
    
    @scala.inline
    def apply(): StatusStopProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatusStopProps]
    }
    
    @scala.inline
    implicit class StatusStopPropsMutableBuilder[Self <: StatusStopProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[StatusStopProps]
  
  /* This means you don't have to write `default`, but can instead just say `statusStopMod.foo` */
  override def _to: SFC[StatusStopProps] = default
}
