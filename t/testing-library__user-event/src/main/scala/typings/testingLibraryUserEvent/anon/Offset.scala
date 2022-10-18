package typings.testingLibraryUserEvent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Offset extends StObject {
  
  var node: typings.testingLibraryUserEvent.distTypesDocumentPrepareDocumentMod.global.Node
  
  var offset: Double
}
object Offset {
  
  inline def apply(
    node: typings.testingLibraryUserEvent.distTypesDocumentPrepareDocumentMod.global.Node,
    offset: Double
  ): Offset = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
  
  extension [Self <: Offset](x: Self) {
    
    inline def setNode(value: typings.testingLibraryUserEvent.distTypesDocumentPrepareDocumentMod.global.Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
