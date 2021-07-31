package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object replaceSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ReplaceSmall", JSImport.Default)
  @js.native
  val default: SFC[ReplaceSmallProps] = js.native
  
  trait ReplaceSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object ReplaceSmallProps {
    
    @scala.inline
    def apply(): ReplaceSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReplaceSmallProps]
    }
    
    @scala.inline
    implicit class ReplaceSmallPropsMutableBuilder[Self <: ReplaceSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ReplaceSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `replaceSmallMod.foo` */
  override def _to: SFC[ReplaceSmallProps] = default
}
