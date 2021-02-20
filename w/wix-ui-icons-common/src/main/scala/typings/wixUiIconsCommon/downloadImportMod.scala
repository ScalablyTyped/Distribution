package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.SFC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object downloadImportMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DownloadImport", JSImport.Default)
  @js.native
  val default: SFC[DownloadImportProps] = js.native
  
  @js.native
  trait DownloadImportProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object DownloadImportProps {
    
    @scala.inline
    def apply(): DownloadImportProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DownloadImportProps]
    }
    
    @scala.inline
    implicit class DownloadImportPropsMutableBuilder[Self <: DownloadImportProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = SFC[DownloadImportProps]
  
  /* This means you don't have to write `default`, but can instead just say `downloadImportMod.foo` */
  override def _to: SFC[DownloadImportProps] = default
}
