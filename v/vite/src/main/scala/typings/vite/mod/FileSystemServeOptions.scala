package typings.vite.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemServeOptions extends StObject {
  
  /**
    * Restrict accessing files outside the allowed directories.
    *
    * Accepts absolute path or a path relative to project root.
    * Will try to search up for workspace root by default.
    */
  var allow: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Restrict accessing files that matches the patterns.
    *
    * This will have higher priority than `allow`.
    * picomatch patterns are supported.
    *
    * @default ['.env', '.env.*', '*.crt', '*.pem']
    */
  var deny: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Strictly restrict file accessing outside of allowing paths.
    *
    * Set to `false` to disable the warning
    *
    * @default true
    */
  var strict: js.UndefOr[Boolean] = js.undefined
}
object FileSystemServeOptions {
  
  inline def apply(): FileSystemServeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystemServeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileSystemServeOptions] (val x: Self) extends AnyVal {
    
    inline def setAllow(value: js.Array[String]): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
    
    inline def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
    
    inline def setAllowVarargs(value: String*): Self = StObject.set(x, "allow", js.Array(value*))
    
    inline def setDeny(value: js.Array[String]): Self = StObject.set(x, "deny", value.asInstanceOf[js.Any])
    
    inline def setDenyUndefined: Self = StObject.set(x, "deny", js.undefined)
    
    inline def setDenyVarargs(value: String*): Self = StObject.set(x, "deny", js.Array(value*))
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
