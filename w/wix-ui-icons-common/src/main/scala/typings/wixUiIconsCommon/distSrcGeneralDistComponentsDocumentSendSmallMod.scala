package typings.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGeneralDistComponentsDocumentSendSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/DocumentSendSmall", JSImport.Default)
  @js.native
  val default: FC[DocumentSendSmallProps] = js.native
  
  trait DocumentSendSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DocumentSendSmallProps {
    
    inline def apply(): DocumentSendSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentSendSmallProps]
    }
    
    extension [Self <: DocumentSendSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DocumentSendSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distSrcGeneralDistComponentsDocumentSendSmallMod.foo` */
  override def _to: FC[DocumentSendSmallProps] = default
}
