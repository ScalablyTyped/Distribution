package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object starLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/system/dist/components/StarLarge", JSImport.Default)
  @js.native
  val default: SFC[StarLargeProps] = js.native
  
  trait StarLargeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object StarLargeProps {
    
    @scala.inline
    def apply(): StarLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StarLargeProps]
    }
    
    @scala.inline
    implicit class StarLargePropsMutableBuilder[Self <: StarLargeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[StarLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `starLargeMod.foo` */
  override def _to: SFC[StarLargeProps] = default
}
