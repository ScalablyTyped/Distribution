package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object excludeSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/ExcludeSmall", JSImport.Default)
  @js.native
  val default: SFC[ExcludeSmallProps] = js.native
  
  @js.native
  trait ExcludeSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object ExcludeSmallProps {
    
    @scala.inline
    def apply(): ExcludeSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExcludeSmallProps]
    }
    
    @scala.inline
    implicit class ExcludeSmallPropsMutableBuilder[Self <: ExcludeSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ExcludeSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `excludeSmallMod.foo` */
  override def _to: SFC[ExcludeSmallProps] = default
}
