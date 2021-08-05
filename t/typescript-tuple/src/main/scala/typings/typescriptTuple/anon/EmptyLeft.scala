package typings.typescriptTuple.anon

import typings.typescriptTuple.utilsMod.Prepend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmptyLeft[Right /* <: js.Array[js.Any] */, Left /* <: js.Array[js.Any] */] extends StObject {
  
  var emptyLeft: Right
  
  var infiniteLeft: ERROR
  
  var multiLeft: js.Any
  
  var singleLeft: Prepend[Right, js.Any]
}
object EmptyLeft {
  
  inline def apply[Right /* <: js.Array[js.Any] */, Left /* <: js.Array[js.Any] */](emptyLeft: Right, infiniteLeft: ERROR, multiLeft: js.Any, singleLeft: Prepend[Right, js.Any]): EmptyLeft[Right, Left] = {
    val __obj = js.Dynamic.literal(emptyLeft = emptyLeft.asInstanceOf[js.Any], infiniteLeft = infiniteLeft.asInstanceOf[js.Any], multiLeft = multiLeft.asInstanceOf[js.Any], singleLeft = singleLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyLeft[Right, Left]]
  }
  
  extension [Self <: EmptyLeft[?, ?], Right /* <: js.Array[js.Any] */, Left /* <: js.Array[js.Any] */](x: Self & (EmptyLeft[Right, Left])) {
    
    inline def setEmptyLeft(value: Right): Self = StObject.set(x, "emptyLeft", value.asInstanceOf[js.Any])
    
    inline def setInfiniteLeft(value: ERROR): Self = StObject.set(x, "infiniteLeft", value.asInstanceOf[js.Any])
    
    inline def setMultiLeft(value: js.Any): Self = StObject.set(x, "multiLeft", value.asInstanceOf[js.Any])
    
    inline def setSingleLeft(value: Prepend[Right, js.Any]): Self = StObject.set(x, "singleLeft", value.asInstanceOf[js.Any])
  }
}
