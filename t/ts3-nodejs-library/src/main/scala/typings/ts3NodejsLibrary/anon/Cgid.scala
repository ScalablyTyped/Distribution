package typings.ts3NodejsLibrary.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cgid extends StObject {
  
  var cgid: String
}
object Cgid {
  
  inline def apply(cgid: String): Cgid = {
    val __obj = js.Dynamic.literal(cgid = cgid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cgid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cgid] (val x: Self) extends AnyVal {
    
    inline def setCgid(value: String): Self = StObject.set(x, "cgid", value.asInstanceOf[js.Any])
  }
}
