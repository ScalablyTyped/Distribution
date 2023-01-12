package typings.venn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Setid extends StObject {
    
    var setid: String
  }
  object Setid {
    
    inline def apply(setid: String): Setid = {
      val __obj = js.Dynamic.literal(setid = setid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Setid]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Setid] (val x: Self) extends AnyVal {
      
      inline def setSetid(value: String): Self = StObject.set(x, "setid", value.asInstanceOf[js.Any])
    }
  }
}
