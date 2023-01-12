package typings.ts3NodejsLibrary.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sgid extends StObject {
  
  var sgid: String
}
object Sgid {
  
  inline def apply(sgid: String): Sgid = {
    val __obj = js.Dynamic.literal(sgid = sgid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sgid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sgid] (val x: Self) extends AnyVal {
    
    inline def setSgid(value: String): Self = StObject.set(x, "sgid", value.asInstanceOf[js.Any])
  }
}
