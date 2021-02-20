package typings.typescriptTuple.anon

import typings.typescriptTuple.typescriptTupleStrings.InfiniteTuple
import typings.typescriptTuple.typescriptTupleStrings.`Cannot reverse an infinite tuple`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CODENAME extends StObject {
  
  var CODENAME: InfiniteTuple = js.native
  
  var ERROR: `Cannot reverse an infinite tuple` = js.native
}
object CODENAME {
  
  @scala.inline
  def apply(CODENAME: InfiniteTuple, ERROR: `Cannot reverse an infinite tuple`): CODENAME = {
    val __obj = js.Dynamic.literal(CODENAME = CODENAME.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any])
    __obj.asInstanceOf[CODENAME]
  }
  
  @scala.inline
  implicit class CODENAMEMutableBuilder[Self <: CODENAME] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCODENAME(value: InfiniteTuple): Self = StObject.set(x, "CODENAME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setERROR(value: `Cannot reverse an infinite tuple`): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
  }
}
