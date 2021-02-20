package typings.typescriptTuple.anon

import typings.typescriptTuple.typescriptTupleStrings.InfiniteTupleSet
import typings.typescriptTuple.typescriptTupleStrings.`TupleSet is not finite`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CODENAMEERROR extends StObject {
  
  var CODENAME: InfiniteTupleSet with typings.typescriptTuple.typescriptTupleStrings.Infinite = js.native
  
  var ERROR: `TupleSet is not finite` = js.native
}
object CODENAMEERROR {
  
  @scala.inline
  def apply(
    CODENAME: InfiniteTupleSet with typings.typescriptTuple.typescriptTupleStrings.Infinite,
    ERROR: `TupleSet is not finite`
  ): CODENAMEERROR = {
    val __obj = js.Dynamic.literal(CODENAME = CODENAME.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any])
    __obj.asInstanceOf[CODENAMEERROR]
  }
  
  @scala.inline
  implicit class CODENAMEERRORMutableBuilder[Self <: CODENAMEERROR] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCODENAME(value: InfiniteTupleSet with typings.typescriptTuple.typescriptTupleStrings.Infinite): Self = StObject.set(x, "CODENAME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setERROR(value: `TupleSet is not finite`): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
  }
}
