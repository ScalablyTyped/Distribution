package typings.testingLibraryUserEvent.anon

import typings.testingLibraryUserEvent.distTypesUtilsPointerCssPointerEventsMod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickCount extends StObject {
  
  var clickCount: Double
  
  var document: typings.std.Document
  
  var node: js.UndefOr[typings.testingLibraryUserEvent.distTypesDocumentPrepareDocumentMod.global.Node] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var target: Element
}
object ClickCount {
  
  inline def apply(clickCount: Double, document: typings.std.Document, target: Element): ClickCount = {
    val __obj = js.Dynamic.literal(clickCount = clickCount.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickCount]
  }
  
  extension [Self <: ClickCount](x: Self) {
    
    inline def setClickCount(value: Double): Self = StObject.set(x, "clickCount", value.asInstanceOf[js.Any])
    
    inline def setDocument(value: typings.std.Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setNode(value: typings.testingLibraryUserEvent.distTypesDocumentPrepareDocumentMod.global.Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
