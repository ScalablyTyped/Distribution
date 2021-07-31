package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refreshSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/RefreshSmall", JSImport.Default)
  @js.native
  val default: SFC[RefreshSmallProps] = js.native
  
  trait RefreshSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object RefreshSmallProps {
    
    @scala.inline
    def apply(): RefreshSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RefreshSmallProps]
    }
    
    @scala.inline
    implicit class RefreshSmallPropsMutableBuilder[Self <: RefreshSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[RefreshSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `refreshSmallMod.foo` */
  override def _to: SFC[RefreshSmallProps] = default
}
