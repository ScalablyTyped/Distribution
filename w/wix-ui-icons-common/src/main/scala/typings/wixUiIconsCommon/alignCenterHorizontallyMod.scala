package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object alignCenterHorizontallyMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/AlignCenterHorizontally", JSImport.Default)
  @js.native
  val default: SFC[AlignCenterHorizontallyProps] = js.native
  
  @js.native
  trait AlignCenterHorizontallyProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object AlignCenterHorizontallyProps {
    
    @scala.inline
    def apply(): AlignCenterHorizontallyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlignCenterHorizontallyProps]
    }
    
    @scala.inline
    implicit class AlignCenterHorizontallyPropsMutableBuilder[Self <: AlignCenterHorizontallyProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[AlignCenterHorizontallyProps]
  
  /* This means you don't have to write `default`, but can instead just say `alignCenterHorizontallyMod.foo` */
  override def _to: SFC[AlignCenterHorizontallyProps] = default
}
