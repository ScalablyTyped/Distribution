package typings.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOnStageGeneralDistComponentsDocumentFillSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/general/dist/components/DocumentFillSmall", JSImport.Default)
  @js.native
  val default: FC[DocumentFillSmallProps] = js.native
  
  trait DocumentFillSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DocumentFillSmallProps {
    
    inline def apply(): DocumentFillSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentFillSmallProps]
    }
    
    extension [Self <: DocumentFillSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DocumentFillSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesOnStageGeneralDistComponentsDocumentFillSmallMod.foo` */
  override def _to: FC[DocumentFillSmallProps] = default
}
