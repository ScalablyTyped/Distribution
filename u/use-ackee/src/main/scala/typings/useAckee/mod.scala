package typings.useAckee

import typings.ackeeTracker.mod.TrackingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(pathname: String, server: ServerDetails): Unit = (^.asInstanceOf[js.Dynamic].apply(pathname.asInstanceOf[js.Any], server.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(pathname: String, server: ServerDetails, opts: TrackingOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(pathname.asInstanceOf[js.Any], server.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(pathname: Null, server: ServerDetails): Unit = (^.asInstanceOf[js.Dynamic].apply(pathname.asInstanceOf[js.Any], server.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(pathname: Null, server: ServerDetails, opts: TrackingOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(pathname.asInstanceOf[js.Any], server.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("use-ackee", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useAckee(pathname: String, server: ServerDetails): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useAckee")(pathname.asInstanceOf[js.Any], server.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useAckee(pathname: String, server: ServerDetails, opts: TrackingOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useAckee")(pathname.asInstanceOf[js.Any], server.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useAckee(pathname: Null, server: ServerDetails): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useAckee")(pathname.asInstanceOf[js.Any], server.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useAckee(pathname: Null, server: ServerDetails, opts: TrackingOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useAckee")(pathname.asInstanceOf[js.Any], server.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait ServerDetails extends StObject {
    
    var domainId: String
    
    var server: String
  }
  object ServerDetails {
    
    inline def apply(domainId: String, server: String): ServerDetails = {
      val __obj = js.Dynamic.literal(domainId = domainId.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServerDetails] (val x: Self) extends AnyVal {
      
      inline def setDomainId(value: String): Self = StObject.set(x, "domainId", value.asInstanceOf[js.Any])
      
      inline def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    }
  }
}
