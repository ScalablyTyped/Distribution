package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object revertResetMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/RevertReset", JSImport.Default)
  @js.native
  val default: SFC[RevertResetProps] = js.native
  
  trait RevertResetProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object RevertResetProps {
    
    @scala.inline
    def apply(): RevertResetProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RevertResetProps]
    }
    
    @scala.inline
    implicit class RevertResetPropsMutableBuilder[Self <: RevertResetProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[RevertResetProps]
  
  /* This means you don't have to write `default`, but can instead just say `revertResetMod.foo` */
  override def _to: SFC[RevertResetProps] = default
}
