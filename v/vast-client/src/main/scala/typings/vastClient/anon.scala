package typings.vastClient

import typings.std.XMLDocument
import typings.vastClient.mod.VastAdExtension
import typings.vastClient.mod.VastSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(err: js.Error): Unit = js.native
    def apply(err: Null, xml: XMLDocument): Unit = js.native
  }
  
  /* Inlined std.Pick<vast-client.vast-client.VastError, 'ERRORCODE'> */
  trait PickVastErrorERRORCODE extends StObject {
    
    var ERRORCODE: String | Double
  }
  object PickVastErrorERRORCODE {
    
    inline def apply(ERRORCODE: String | Double): PickVastErrorERRORCODE = {
      val __obj = js.Dynamic.literal(ERRORCODE = ERRORCODE.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickVastErrorERRORCODE]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickVastErrorERRORCODE] (val x: Self) extends AnyVal {
      
      inline def setERRORCODE(value: String | Double): Self = StObject.set(x, "ERRORCODE", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<vast-client.vast-client.VastError, std.Exclude<keyof vast-client.vast-client.VastError, 'ERRORCODE'>> */
  trait PickVastErrorExcludekeyof extends StObject {
    
    var ERRORMESSAGE: js.UndefOr[String] = js.undefined
    
    var extensions: js.UndefOr[js.Array[VastAdExtension]] = js.undefined
    
    var system: js.UndefOr[VastSystem | String | Null] = js.undefined
  }
  object PickVastErrorExcludekeyof {
    
    inline def apply(): PickVastErrorExcludekeyof = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickVastErrorExcludekeyof]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickVastErrorExcludekeyof] (val x: Self) extends AnyVal {
      
      inline def setERRORMESSAGE(value: String): Self = StObject.set(x, "ERRORMESSAGE", value.asInstanceOf[js.Any])
      
      inline def setERRORMESSAGEUndefined: Self = StObject.set(x, "ERRORMESSAGE", js.undefined)
      
      inline def setExtensions(value: js.Array[VastAdExtension]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: VastAdExtension*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setSystem(value: VastSystem | String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
      
      inline def setSystemNull: Self = StObject.set(x, "system", null)
      
      inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    }
  }
  
  trait Timeout extends StObject {
    
    var timeout: Double
    
    var withCredentials: Boolean
  }
  object Timeout {
    
    inline def apply(timeout: Double, withCredentials: Boolean): Timeout = {
      val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any], withCredentials = withCredentials.asInstanceOf[js.Any])
      __obj.asInstanceOf[Timeout]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Timeout] (val x: Self) extends AnyVal {
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    }
  }
}
