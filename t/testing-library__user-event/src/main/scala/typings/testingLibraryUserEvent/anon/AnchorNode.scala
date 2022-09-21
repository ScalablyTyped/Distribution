package typings.testingLibraryUserEvent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnchorNode extends StObject {
  
  var anchorNode: js.UndefOr[typings.testingLibraryUserEvent.prepareDocumentMod.global.Node] = js.undefined
  
  /** DOM offset */
  var anchorOffset: js.UndefOr[Double] = js.undefined
  
  var focusNode: typings.testingLibraryUserEvent.prepareDocumentMod.global.Node
  
  var focusOffset: Double
}
object AnchorNode {
  
  inline def apply(focusNode: typings.testingLibraryUserEvent.prepareDocumentMod.global.Node, focusOffset: Double): AnchorNode = {
    val __obj = js.Dynamic.literal(focusNode = focusNode.asInstanceOf[js.Any], focusOffset = focusOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnchorNode]
  }
  
  extension [Self <: AnchorNode](x: Self) {
    
    inline def setAnchorNode(value: typings.testingLibraryUserEvent.prepareDocumentMod.global.Node): Self = StObject.set(x, "anchorNode", value.asInstanceOf[js.Any])
    
    inline def setAnchorNodeUndefined: Self = StObject.set(x, "anchorNode", js.undefined)
    
    inline def setAnchorOffset(value: Double): Self = StObject.set(x, "anchorOffset", value.asInstanceOf[js.Any])
    
    inline def setAnchorOffsetUndefined: Self = StObject.set(x, "anchorOffset", js.undefined)
    
    inline def setFocusNode(value: typings.testingLibraryUserEvent.prepareDocumentMod.global.Node): Self = StObject.set(x, "focusNode", value.asInstanceOf[js.Any])
    
    inline def setFocusOffset(value: Double): Self = StObject.set(x, "focusOffset", value.asInstanceOf[js.Any])
  }
}
