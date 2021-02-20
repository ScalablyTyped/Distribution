package typings.typescriptTuple.anon

import typings.typescriptTuple.utilsMod.Prepend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmptyLeft[Right /* <: js.Array[_] */, Left /* <: js.Array[_] */] extends StObject {
  
  var emptyLeft: Right = js.native
  
  var infiniteLeft: ERROR = js.native
  
  var multiLeft: js.Any = js.native
  
  var singleLeft: Prepend[Right, _] = js.native
}
object EmptyLeft {
  
  @scala.inline
  def apply[Right /* <: js.Array[_] */, Left /* <: js.Array[_] */](emptyLeft: Right, infiniteLeft: ERROR, multiLeft: js.Any, singleLeft: Prepend[Right, _]): EmptyLeft[Right, Left] = {
    val __obj = js.Dynamic.literal(emptyLeft = emptyLeft.asInstanceOf[js.Any], infiniteLeft = infiniteLeft.asInstanceOf[js.Any], multiLeft = multiLeft.asInstanceOf[js.Any], singleLeft = singleLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyLeft[Right, Left]]
  }
  
  @scala.inline
  implicit class EmptyLeftMutableBuilder[Self <: EmptyLeft[_, _], Right /* <: js.Array[_] */, Left /* <: js.Array[_] */] (val x: Self with (EmptyLeft[Right, Left])) extends AnyVal {
    
    @scala.inline
    def setEmptyLeft(value: Right): Self = StObject.set(x, "emptyLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfiniteLeft(value: ERROR): Self = StObject.set(x, "infiniteLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiLeft(value: js.Any): Self = StObject.set(x, "multiLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleLeft(value: Prepend[Right, _]): Self = StObject.set(x, "singleLeft", value.asInstanceOf[js.Any])
  }
}
