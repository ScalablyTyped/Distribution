package typings.ts3NodejsLibrary.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cfid extends StObject {
  
  var cfid: Double
  
  var clid: Double
  
  var ctid: Double
  
  var reasonid: Double
  
  var reasonmsg: String
}
object Cfid {
  
  inline def apply(cfid: Double, clid: Double, ctid: Double, reasonid: Double, reasonmsg: String): Cfid = {
    val __obj = js.Dynamic.literal(cfid = cfid.asInstanceOf[js.Any], clid = clid.asInstanceOf[js.Any], ctid = ctid.asInstanceOf[js.Any], reasonid = reasonid.asInstanceOf[js.Any], reasonmsg = reasonmsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cfid]
  }
  
  extension [Self <: Cfid](x: Self) {
    
    inline def setCfid(value: Double): Self = StObject.set(x, "cfid", value.asInstanceOf[js.Any])
    
    inline def setClid(value: Double): Self = StObject.set(x, "clid", value.asInstanceOf[js.Any])
    
    inline def setCtid(value: Double): Self = StObject.set(x, "ctid", value.asInstanceOf[js.Any])
    
    inline def setReasonid(value: Double): Self = StObject.set(x, "reasonid", value.asInstanceOf[js.Any])
    
    inline def setReasonmsg(value: String): Self = StObject.set(x, "reasonmsg", value.asInstanceOf[js.Any])
  }
}
