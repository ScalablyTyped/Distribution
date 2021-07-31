package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/TimeSmall", JSImport.Default)
  @js.native
  val default: SFC[TimeSmallProps] = js.native
  
  trait TimeSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object TimeSmallProps {
    
    @scala.inline
    def apply(): TimeSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeSmallProps]
    }
    
    @scala.inline
    implicit class TimeSmallPropsMutableBuilder[Self <: TimeSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[TimeSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `timeSmallMod.foo` */
  override def _to: SFC[TimeSmallProps] = default
}
