package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object revertSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/RevertSmall", JSImport.Default)
  @js.native
  val default: SFC[RevertSmallProps] = js.native
  
  trait RevertSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object RevertSmallProps {
    
    @scala.inline
    def apply(): RevertSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RevertSmallProps]
    }
    
    @scala.inline
    implicit class RevertSmallPropsMutableBuilder[Self <: RevertSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[RevertSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `revertSmallMod.foo` */
  override def _to: SFC[RevertSmallProps] = default
}
