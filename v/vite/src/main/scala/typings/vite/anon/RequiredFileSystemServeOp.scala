package typings.vite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<vite.vite.FileSystemServeOptions> */
trait RequiredFileSystemServeOp extends StObject {
  
  var allow: js.Array[String]
  
  var deny: js.Array[String]
  
  var strict: Boolean
}
object RequiredFileSystemServeOp {
  
  inline def apply(allow: js.Array[String], deny: js.Array[String], strict: Boolean): RequiredFileSystemServeOp = {
    val __obj = js.Dynamic.literal(allow = allow.asInstanceOf[js.Any], deny = deny.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredFileSystemServeOp]
  }
  
  extension [Self <: RequiredFileSystemServeOp](x: Self) {
    
    inline def setAllow(value: js.Array[String]): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
    
    inline def setAllowVarargs(value: String*): Self = StObject.set(x, "allow", js.Array(value*))
    
    inline def setDeny(value: js.Array[String]): Self = StObject.set(x, "deny", value.asInstanceOf[js.Any])
    
    inline def setDenyVarargs(value: String*): Self = StObject.set(x, "deny", js.Array(value*))
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
  }
}
