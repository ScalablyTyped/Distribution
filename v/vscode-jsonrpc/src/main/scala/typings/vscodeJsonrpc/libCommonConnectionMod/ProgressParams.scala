package typings.vscodeJsonrpc.libCommonConnectionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressParams[T] extends StObject {
  
  /**
    * The progress token provided by the client or server.
    */
  var token: ProgressToken
  
  /**
    * The progress data.
    */
  var value: T
}
object ProgressParams {
  
  inline def apply[T](token: ProgressToken, value: T): ProgressParams[T] = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressParams[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProgressParams[?], T] (val x: Self & ProgressParams[T]) extends AnyVal {
    
    inline def setToken(value: ProgressToken): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
