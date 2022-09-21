package typings.xlsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Comment extends StObject {
  
  /** If true, mark the comment as a part of a thread */
  var T: js.UndefOr[Boolean] = js.undefined
  
  /** Author of the comment block */
  var a: js.UndefOr[String] = js.undefined
  
  /** Plaintext of the comment */
  var t: String
}
object Comment {
  
  inline def apply(t: String): Comment = {
    val __obj = js.Dynamic.literal(t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
  
  extension [Self <: Comment](x: Self) {
    
    inline def setA(value: String): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setAUndefined: Self = StObject.set(x, "a", js.undefined)
    
    inline def setT(value: String): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    inline def setTUndefined: Self = StObject.set(x, "T", js.undefined)
  }
}
