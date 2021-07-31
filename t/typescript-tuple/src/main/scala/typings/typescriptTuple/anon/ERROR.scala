package typings.typescriptTuple.anon

import typings.typescriptTuple.typescriptTupleStrings.InfiniteLeft
import typings.typescriptTuple.typescriptTupleStrings.`Left is not finite`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ERROR extends StObject {
  
  var CODENAME: InfiniteLeft & typings.typescriptTuple.typescriptTupleStrings.Infinite
  
  var ERROR: `Left is not finite`
}
object ERROR {
  
  @scala.inline
  def apply(CODENAME: InfiniteLeft & typings.typescriptTuple.typescriptTupleStrings.Infinite): ERROR = {
    val __obj = js.Dynamic.literal(CODENAME = CODENAME.asInstanceOf[js.Any], ERROR = "Left is not finite")
    __obj.asInstanceOf[ERROR]
  }
  
  @scala.inline
  implicit class ERRORMutableBuilder[Self <: ERROR] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCODENAME(value: InfiniteLeft & typings.typescriptTuple.typescriptTupleStrings.Infinite): Self = StObject.set(x, "CODENAME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setERROR(value: `Left is not finite`): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
  }
}
