package typings.testingLibraryUserEvent.anon

import typings.testingLibraryUserEvent.cssPointerEventsMod.global.Element
import typings.testingLibraryUserEvent.pointerMod._PointerActionInput
import typings.testingLibraryUserEvent.typesMod.PointerCoords
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  keys :string} & @testing-library/user-event.@testing-library/user-event/dist/types/pointer.PointerActionPosition */
trait keysstringPointerActionPo
  extends StObject
     with _PointerActionInput {
  
  var coords: js.UndefOr[PointerCoords] = js.undefined
  
  var keys: String
  
  var node: js.UndefOr[typings.testingLibraryUserEvent.prepareDocumentMod.global.Node] = js.undefined
  
  /**
    * If `node` is set, this is the DOM offset.
    * Otherwise this is the `textContent`/`value` offset on the `target`.
    */
  var offset: js.UndefOr[Double] = js.undefined
  
  var target: js.UndefOr[Element] = js.undefined
}
object keysstringPointerActionPo {
  
  inline def apply(keys: String): keysstringPointerActionPo = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[keysstringPointerActionPo]
  }
  
  extension [Self <: keysstringPointerActionPo](x: Self) {
    
    inline def setCoords(value: PointerCoords): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
    
    inline def setCoordsUndefined: Self = StObject.set(x, "coords", js.undefined)
    
    inline def setKeys(value: String): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setNode(value: typings.testingLibraryUserEvent.prepareDocumentMod.global.Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
