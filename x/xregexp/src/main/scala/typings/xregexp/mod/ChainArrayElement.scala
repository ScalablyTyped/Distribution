package typings.xregexp.mod

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is an element in the `XRegExpMatchChainArray` that also specifies a specific back reference.
  */
trait ChainArrayElement extends StObject {
  
  /**
    * The specific backreference.
    */
  var backref: Double | String
  
  /**
    * The `RegExp` to use.
    */
  var regexp: RegExp
}
object ChainArrayElement {
  
  inline def apply(backref: Double | String, regexp: RegExp): ChainArrayElement = {
    val __obj = js.Dynamic.literal(backref = backref.asInstanceOf[js.Any], regexp = regexp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChainArrayElement]
  }
  
  extension [Self <: ChainArrayElement](x: Self) {
    
    inline def setBackref(value: Double | String): Self = StObject.set(x, "backref", value.asInstanceOf[js.Any])
    
    inline def setRegexp(value: RegExp): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
  }
}
