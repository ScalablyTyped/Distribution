package typings.xregexp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An element in a `MatchChainArray` that specifies a regex and a backreference to pass forward.
  */
trait ChainArrayElement extends StObject {
  
  /**
    * The named or numbered backreference to pass forward.
    */
  var backref: Double | String
  
  /**
    * The regex to use.
    */
  var regex: js.RegExp
}
object ChainArrayElement {
  
  inline def apply(backref: Double | String, regex: js.RegExp): ChainArrayElement = {
    val __obj = js.Dynamic.literal(backref = backref.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChainArrayElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChainArrayElement] (val x: Self) extends AnyVal {
    
    inline def setBackref(value: Double | String): Self = StObject.set(x, "backref", value.asInstanceOf[js.Any])
    
    inline def setRegex(value: js.RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
  }
}
