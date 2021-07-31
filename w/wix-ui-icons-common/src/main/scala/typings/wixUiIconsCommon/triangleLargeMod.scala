package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triangleLargeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/TriangleLarge", JSImport.Default)
  @js.native
  val default: SFC[TriangleLargeProps] = js.native
  
  trait TriangleLargeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object TriangleLargeProps {
    
    @scala.inline
    def apply(): TriangleLargeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TriangleLargeProps]
    }
    
    @scala.inline
    implicit class TriangleLargePropsMutableBuilder[Self <: TriangleLargeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[TriangleLargeProps]
  
  /* This means you don't have to write `default`, but can instead just say `triangleLargeMod.foo` */
  override def _to: SFC[TriangleLargeProps] = default
}
