package typings.testingLibraryUserEvent

import typings.testingLibraryUserEvent.anon.Offset
import typings.testingLibraryUserEvent.distTypesDocumentPrepareDocumentMod.global.Node
import typings.testingLibraryUserEvent.testingLibraryUserEventInts.`-1`
import typings.testingLibraryUserEvent.testingLibraryUserEventInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsFocusCursorMod {
  
  @JSImport("@testing-library/user-event/dist/types/utils/focus/cursor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNextCursorPosition(node: Node, offset: Double, direction: `-1` | `1`): js.UndefOr[Offset] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNextCursorPosition")(node.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Offset]]
  inline def getNextCursorPosition(node: Node, offset: Double, direction: `-1` | `1`, inputType: String): js.UndefOr[Offset] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNextCursorPosition")(node.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], inputType.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Offset]]
  
  object global {
    
    trait Text extends StObject {
      
      var nodeValue: String
    }
    object Text {
      
      inline def apply(nodeValue: String): Text = {
        val __obj = js.Dynamic.literal(nodeValue = nodeValue.asInstanceOf[js.Any])
        __obj.asInstanceOf[Text]
      }
      
      extension [Self <: Text](x: Self) {
        
        inline def setNodeValue(value: String): Self = StObject.set(x, "nodeValue", value.asInstanceOf[js.Any])
      }
    }
  }
}
