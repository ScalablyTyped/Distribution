package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object downloadMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/Download", JSImport.Default)
  @js.native
  val default: SFC[DownloadProps] = js.native
  
  trait DownloadProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object DownloadProps {
    
    @scala.inline
    def apply(): DownloadProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DownloadProps]
    }
    
    @scala.inline
    implicit class DownloadPropsMutableBuilder[Self <: DownloadProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[DownloadProps]
  
  /* This means you don't have to write `default`, but can instead just say `downloadMod.foo` */
  override def _to: SFC[DownloadProps] = default
}
