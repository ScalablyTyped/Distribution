package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object siteDuplicateMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/SiteDuplicate", JSImport.Default)
  @js.native
  val default: SFC[SiteDuplicateProps] = js.native
  
  trait SiteDuplicateProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object SiteDuplicateProps {
    
    @scala.inline
    def apply(): SiteDuplicateProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SiteDuplicateProps]
    }
    
    @scala.inline
    implicit class SiteDuplicatePropsMutableBuilder[Self <: SiteDuplicateProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[SiteDuplicateProps]
  
  /* This means you don't have to write `default`, but can instead just say `siteDuplicateMod.foo` */
  override def _to: SFC[SiteDuplicateProps] = default
}
