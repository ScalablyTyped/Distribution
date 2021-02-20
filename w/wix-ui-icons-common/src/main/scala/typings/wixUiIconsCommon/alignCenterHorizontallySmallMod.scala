package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alignCenterHorizontallySmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/AlignCenterHorizontallySmall", JSImport.Default)
  @js.native
  val default: SFC[AlignCenterHorizontallySmallProps] = js.native
  
  @js.native
  trait AlignCenterHorizontallySmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object AlignCenterHorizontallySmallProps {
    
    @scala.inline
    def apply(): AlignCenterHorizontallySmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlignCenterHorizontallySmallProps]
    }
    
    @scala.inline
    implicit class AlignCenterHorizontallySmallPropsMutableBuilder[Self <: AlignCenterHorizontallySmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[AlignCenterHorizontallySmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `alignCenterHorizontallySmallMod.foo` */
  override def _to: SFC[AlignCenterHorizontallySmallProps] = default
}
