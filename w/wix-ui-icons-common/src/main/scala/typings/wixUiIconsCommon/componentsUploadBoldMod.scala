package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsUploadBoldMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/classic-editor/general/dist/components/UploadBold", JSImport.Default)
  @js.native
  val default: FC[UploadBoldProps] = js.native
  
  trait UploadBoldProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object UploadBoldProps {
    
    inline def apply(): UploadBoldProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadBoldProps]
    }
    
    extension [Self <: UploadBoldProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[UploadBoldProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsUploadBoldMod.foo` */
  override def _to: FC[UploadBoldProps] = default
}
