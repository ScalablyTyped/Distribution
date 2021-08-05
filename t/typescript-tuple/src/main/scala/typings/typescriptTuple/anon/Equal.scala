package typings.typescriptTuple.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Equal[WhenEqual, Left /* <: js.Array[js.Any] */, Right /* <: js.Array[js.Any] */] extends StObject {
  
  var equal: WhenEqual
  
  var shorterLeft: js.Tuple2[Left, Right]
  
  var shorterRight: js.Tuple2[Right, Left]
}
object Equal {
  
  inline def apply[WhenEqual, Left /* <: js.Array[js.Any] */, Right /* <: js.Array[js.Any] */](equal: WhenEqual, shorterLeft: js.Tuple2[Left, Right], shorterRight: js.Tuple2[Right, Left]): Equal[WhenEqual, Left, Right] = {
    val __obj = js.Dynamic.literal(equal = equal.asInstanceOf[js.Any], shorterLeft = shorterLeft.asInstanceOf[js.Any], shorterRight = shorterRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Equal[WhenEqual, Left, Right]]
  }
  
  extension [Self <: Equal[?, ?, ?], WhenEqual, Left /* <: js.Array[js.Any] */, Right /* <: js.Array[js.Any] */](x: Self & (Equal[WhenEqual, Left, Right])) {
    
    inline def setEqual(value: WhenEqual): Self = StObject.set(x, "equal", value.asInstanceOf[js.Any])
    
    inline def setShorterLeft(value: js.Tuple2[Left, Right]): Self = StObject.set(x, "shorterLeft", value.asInstanceOf[js.Any])
    
    inline def setShorterRight(value: js.Tuple2[Right, Left]): Self = StObject.set(x, "shorterRight", value.asInstanceOf[js.Any])
  }
}
