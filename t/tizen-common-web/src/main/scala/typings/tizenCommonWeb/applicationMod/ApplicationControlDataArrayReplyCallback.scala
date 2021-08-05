package typings.tizenCommonWeb.applicationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationControlDataArrayReplyCallback extends StObject {
  
  /**
    * Called when the callee application calls `RequestedApplicationControl.replyFailure()`.
    *
    */
  var onfailure: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Called when the callee application calls `RequestedApplicationControl.replyResult()`.
    *
    *
    * @param data An array of `ApplicationControlData` objects.
    */
  var onsuccess: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Array[ApplicationControlData]], Unit]] = js.undefined
}
object ApplicationControlDataArrayReplyCallback {
  
  inline def apply(): ApplicationControlDataArrayReplyCallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationControlDataArrayReplyCallback]
  }
  
  extension [Self <: ApplicationControlDataArrayReplyCallback](x: Self) {
    
    inline def setOnfailure(value: () => Unit): Self = StObject.set(x, "onfailure", js.Any.fromFunction0(value))
    
    inline def setOnfailureUndefined: Self = StObject.set(x, "onfailure", js.undefined)
    
    inline def setOnsuccess(value: /* data */ js.UndefOr[js.Array[ApplicationControlData]] => Unit): Self = StObject.set(x, "onsuccess", js.Any.fromFunction1(value))
    
    inline def setOnsuccessUndefined: Self = StObject.set(x, "onsuccess", js.undefined)
  }
}
