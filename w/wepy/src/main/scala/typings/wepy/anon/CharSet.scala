package typings.wepy.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CharSet extends StObject {
  
  var charSet: String = js.native
  
  var path: String = js.native
  
  var result: String = js.native
  
  var scanType: String = js.native
}
object CharSet {
  
  @scala.inline
  def apply(charSet: String, path: String, result: String, scanType: String): CharSet = {
    val __obj = js.Dynamic.literal(charSet = charSet.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], scanType = scanType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharSet]
  }
  
  @scala.inline
  implicit class CharSetMutableBuilder[Self <: CharSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharSet(value: String): Self = StObject.set(x, "charSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScanType(value: String): Self = StObject.set(x, "scanType", value.asInstanceOf[js.Any])
  }
}
