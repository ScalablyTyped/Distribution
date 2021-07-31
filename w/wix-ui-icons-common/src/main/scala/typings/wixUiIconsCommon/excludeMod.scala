package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object excludeMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Exclude", JSImport.Default)
  @js.native
  val default: SFC[ExcludeProps] = js.native
  
  trait ExcludeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object ExcludeProps {
    
    @scala.inline
    def apply(): ExcludeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExcludeProps]
    }
    
    @scala.inline
    implicit class ExcludePropsMutableBuilder[Self <: ExcludeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[ExcludeProps]
  
  /* This means you don't have to write `default`, but can instead just say `excludeMod.foo` */
  override def _to: SFC[ExcludeProps] = default
}
