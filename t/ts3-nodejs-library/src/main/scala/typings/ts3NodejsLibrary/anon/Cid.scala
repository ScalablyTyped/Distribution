package typings.ts3NodejsLibrary.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cid extends StObject {
  
  var cid: String
}
object Cid {
  
  inline def apply(cid: String): Cid = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cid]
  }
  
  extension [Self <: Cid](x: Self) {
    
    inline def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
  }
}
