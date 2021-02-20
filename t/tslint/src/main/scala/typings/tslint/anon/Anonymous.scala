package typings.tslint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Anonymous extends StObject {
  
  var anonymous: String = js.native
  
  var asyncArrow: String = js.native
  
  var constructor: String = js.native
  
  var method: String = js.native
  
  var named: String = js.native
}
object Anonymous {
  
  @scala.inline
  def apply(anonymous: String, asyncArrow: String, constructor: String, method: String, named: String): Anonymous = {
    val __obj = js.Dynamic.literal(anonymous = anonymous.asInstanceOf[js.Any], asyncArrow = asyncArrow.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], named = named.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anonymous]
  }
  
  @scala.inline
  implicit class AnonymousMutableBuilder[Self <: Anonymous] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnonymous(value: String): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncArrow(value: String): Self = StObject.set(x, "asyncArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstructor(value: String): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamed(value: String): Self = StObject.set(x, "named", value.asInstanceOf[js.Any])
  }
}
