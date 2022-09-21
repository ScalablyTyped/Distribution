package typings.testingLibraryUserEvent.anon

import typings.testingLibraryUserEvent.cssPointerEventsMod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Document extends StObject {
  
  var document: typings.std.Document
  
  var node: js.UndefOr[typings.testingLibraryUserEvent.prepareDocumentMod.global.Node] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var target: Element
}
object Document {
  
  inline def apply(document: typings.std.Document, target: Element): Document = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
  
  extension [Self <: Document](x: Self) {
    
    inline def setDocument(value: typings.std.Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setNode(value: typings.testingLibraryUserEvent.prepareDocumentMod.global.Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
