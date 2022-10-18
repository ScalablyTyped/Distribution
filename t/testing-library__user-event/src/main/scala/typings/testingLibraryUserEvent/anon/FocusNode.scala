package typings.testingLibraryUserEvent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusNode extends StObject {
  
  var focusNode: typings.testingLibraryUserEvent.distTypesDocumentPrepareDocumentMod.global.Node
  
  /** DOM Offset */
  var focusOffset: Double
}
object FocusNode {
  
  inline def apply(
    focusNode: typings.testingLibraryUserEvent.distTypesDocumentPrepareDocumentMod.global.Node,
    focusOffset: Double
  ): FocusNode = {
    val __obj = js.Dynamic.literal(focusNode = focusNode.asInstanceOf[js.Any], focusOffset = focusOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusNode]
  }
  
  extension [Self <: FocusNode](x: Self) {
    
    inline def setFocusNode(value: typings.testingLibraryUserEvent.distTypesDocumentPrepareDocumentMod.global.Node): Self = StObject.set(x, "focusNode", value.asInstanceOf[js.Any])
    
    inline def setFocusOffset(value: Double): Self = StObject.set(x, "focusOffset", value.asInstanceOf[js.Any])
  }
}
