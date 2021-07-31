package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OK extends StObject {
  
  var OK: String
  
  var ZERO_RESULTS: String
}
object OK {
  
  @scala.inline
  def apply(OK: String, ZERO_RESULTS: String): OK = {
    val __obj = js.Dynamic.literal(OK = OK.asInstanceOf[js.Any], ZERO_RESULTS = ZERO_RESULTS.asInstanceOf[js.Any])
    __obj.asInstanceOf[OK]
  }
  
  @scala.inline
  implicit class OKMutableBuilder[Self <: OK] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOK(value: String): Self = StObject.set(x, "OK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZERO_RESULTS(value: String): Self = StObject.set(x, "ZERO_RESULTS", value.asInstanceOf[js.Any])
  }
}
