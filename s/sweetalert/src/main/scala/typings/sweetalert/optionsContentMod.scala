package typings.sweetalert

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsContentMod {
  
  @JSImport("sweetalert/typings/modules/options/content", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getContentOpts(contentParam: String): ContentOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getContentOpts")(contentParam.asInstanceOf[js.Any]).asInstanceOf[ContentOptions]
  inline def getContentOpts(contentParam: js.Object): ContentOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getContentOpts")(contentParam.asInstanceOf[js.Any]).asInstanceOf[ContentOptions]
  
  trait ContentOptions extends StObject {
    
    var attributes: js.UndefOr[js.Object] = js.undefined
    
    var element: String | Node
  }
  object ContentOptions {
    
    inline def apply(element: String | Node): ContentOptions = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentOptions]
    }
    
    extension [Self <: ContentOptions](x: Self) {
      
      inline def setAttributes(value: js.Object): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setElement(value: String | Node): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    }
  }
}
