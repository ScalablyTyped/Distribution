package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moveLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/MoveLarge", JSImport.Default)
  @js.native
  val default: SFC[MoveLargeProps] = js.native
  
  trait MoveLargeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object MoveLargeProps {
    
    @scala.inline
    def apply(): MoveLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MoveLargeProps]
    }
    
    @scala.inline
    implicit class MoveLargePropsMutableBuilder[Self <: MoveLargeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[MoveLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `moveLargeMod.foo` */
  override def _to: SFC[MoveLargeProps] = default
}
