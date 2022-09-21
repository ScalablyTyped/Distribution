package typings.vueRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _PathParserOptions extends StObject {
  
  /**
    * Should the RegExp match until the end by appending a `$` to it.
    *
    * @defaultValue `true`
    */
  var end: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Makes the RegExp case-sensitive.
    *
    * @defaultValue `false`
    */
  var sensitive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Should the RegExp match from the beginning by prepending a `^` to it.
    * @internal
    *
    * @defaultValue `true`
    */
  var start: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to disallow a trailing slash or not.
    *
    * @defaultValue `false`
    */
  var strict: js.UndefOr[Boolean] = js.undefined
}
object _PathParserOptions {
  
  inline def apply(): _PathParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_PathParserOptions]
  }
  
  extension [Self <: _PathParserOptions](x: Self) {
    
    inline def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setSensitive(value: Boolean): Self = StObject.set(x, "sensitive", value.asInstanceOf[js.Any])
    
    inline def setSensitiveUndefined: Self = StObject.set(x, "sensitive", js.undefined)
    
    inline def setStart(value: Boolean): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
