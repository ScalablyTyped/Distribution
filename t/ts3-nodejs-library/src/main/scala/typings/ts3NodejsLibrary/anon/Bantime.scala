package typings.ts3NodejsLibrary.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bantime extends StObject {
  
  var bantime: js.UndefOr[Double] = js.undefined
  
  var cfid: String
  
  var clid: String
  
  var ctid: String
  
  var invokerid: js.UndefOr[String] = js.undefined
  
  var invokername: js.UndefOr[String] = js.undefined
  
  var invokeruid: js.UndefOr[String] = js.undefined
  
  var reasonid: String
  
  var reasonmsg: String
}
object Bantime {
  
  inline def apply(cfid: String, clid: String, ctid: String, reasonid: String, reasonmsg: String): Bantime = {
    val __obj = js.Dynamic.literal(cfid = cfid.asInstanceOf[js.Any], clid = clid.asInstanceOf[js.Any], ctid = ctid.asInstanceOf[js.Any], reasonid = reasonid.asInstanceOf[js.Any], reasonmsg = reasonmsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bantime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bantime] (val x: Self) extends AnyVal {
    
    inline def setBantime(value: Double): Self = StObject.set(x, "bantime", value.asInstanceOf[js.Any])
    
    inline def setBantimeUndefined: Self = StObject.set(x, "bantime", js.undefined)
    
    inline def setCfid(value: String): Self = StObject.set(x, "cfid", value.asInstanceOf[js.Any])
    
    inline def setClid(value: String): Self = StObject.set(x, "clid", value.asInstanceOf[js.Any])
    
    inline def setCtid(value: String): Self = StObject.set(x, "ctid", value.asInstanceOf[js.Any])
    
    inline def setInvokerid(value: String): Self = StObject.set(x, "invokerid", value.asInstanceOf[js.Any])
    
    inline def setInvokeridUndefined: Self = StObject.set(x, "invokerid", js.undefined)
    
    inline def setInvokername(value: String): Self = StObject.set(x, "invokername", value.asInstanceOf[js.Any])
    
    inline def setInvokernameUndefined: Self = StObject.set(x, "invokername", js.undefined)
    
    inline def setInvokeruid(value: String): Self = StObject.set(x, "invokeruid", value.asInstanceOf[js.Any])
    
    inline def setInvokeruidUndefined: Self = StObject.set(x, "invokeruid", js.undefined)
    
    inline def setReasonid(value: String): Self = StObject.set(x, "reasonid", value.asInstanceOf[js.Any])
    
    inline def setReasonmsg(value: String): Self = StObject.set(x, "reasonmsg", value.asInstanceOf[js.Any])
  }
}
