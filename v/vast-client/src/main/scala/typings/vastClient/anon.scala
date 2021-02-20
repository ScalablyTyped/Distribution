package typings.vastClient

import typings.std.Error
import typings.std.XMLDocument
import typings.vastClient.mod.VastAdExtension
import typings.vastClient.mod.VastSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(err: Null, xml: XMLDocument): Unit = js.native
    def apply(err: Error): Unit = js.native
  }
  
  /* Inlined std.Pick<vast-client.vast-client.VastError, 'ERRORCODE'> */
  @js.native
  trait PickVastErrorERRORCODE extends StObject {
    
    var ERRORCODE: String | Double = js.native
  }
  object PickVastErrorERRORCODE {
    
    @scala.inline
    def apply(ERRORCODE: String | Double): PickVastErrorERRORCODE = {
      val __obj = js.Dynamic.literal(ERRORCODE = ERRORCODE.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickVastErrorERRORCODE]
    }
    
    @scala.inline
    implicit class PickVastErrorERRORCODEMutableBuilder[Self <: PickVastErrorERRORCODE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setERRORCODE(value: String | Double): Self = StObject.set(x, "ERRORCODE", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<vast-client.vast-client.VastError, std.Exclude<keyof vast-client.vast-client.VastError, 'ERRORCODE'>> */
  @js.native
  trait PickVastErrorExcludekeyof extends StObject {
    
    var ERRORMESSAGE: js.UndefOr[String] = js.native
    
    var extensions: js.UndefOr[js.Array[VastAdExtension]] = js.native
    
    var system: js.UndefOr[VastSystem | String | Null] = js.native
  }
  object PickVastErrorExcludekeyof {
    
    @scala.inline
    def apply(): PickVastErrorExcludekeyof = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickVastErrorExcludekeyof]
    }
    
    @scala.inline
    implicit class PickVastErrorExcludekeyofMutableBuilder[Self <: PickVastErrorExcludekeyof] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setERRORMESSAGE(value: String): Self = StObject.set(x, "ERRORMESSAGE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setERRORMESSAGEUndefined: Self = StObject.set(x, "ERRORMESSAGE", js.undefined)
      
      @scala.inline
      def setExtensions(value: js.Array[VastAdExtension]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      @scala.inline
      def setExtensionsVarargs(value: VastAdExtension*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      @scala.inline
      def setSystem(value: VastSystem | String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSystemNull: Self = StObject.set(x, "system", null)
      
      @scala.inline
      def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    }
  }
  
  @js.native
  trait Timeout extends StObject {
    
    var timeout: Double = js.native
    
    var withCredentials: Boolean = js.native
  }
  object Timeout {
    
    @scala.inline
    def apply(timeout: Double, withCredentials: Boolean): Timeout = {
      val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any], withCredentials = withCredentials.asInstanceOf[js.Any])
      __obj.asInstanceOf[Timeout]
    }
    
    @scala.inline
    implicit class TimeoutMutableBuilder[Self <: Timeout] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    }
  }
}
