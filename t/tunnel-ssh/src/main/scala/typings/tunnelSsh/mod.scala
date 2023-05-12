package typings.tunnelSsh

import typings.node.netMod.ListenOptions
import typings.node.netMod.Server
import typings.ssh2.mod.Client
import typings.ssh2.mod.ConnectConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tunnel-ssh", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTunnel(
    tunnelOptions: TunnelOptions,
    serverOptions: ListenOptions,
    sshOptions: ConnectConfig,
    forwardOptions: ForwardOptions
  ): js.Promise[js.Tuple2[Server, Client]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createTunnel")(tunnelOptions.asInstanceOf[js.Any], serverOptions.asInstanceOf[js.Any], sshOptions.asInstanceOf[js.Any], forwardOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[Server, Client]]]
  
  trait ForwardOptions extends StObject {
    
    var dstAddr: String
    
    var dstPort: Double
    
    var srcAddr: String
    
    var srcPort: Double
  }
  object ForwardOptions {
    
    inline def apply(dstAddr: String, dstPort: Double, srcAddr: String, srcPort: Double): ForwardOptions = {
      val __obj = js.Dynamic.literal(dstAddr = dstAddr.asInstanceOf[js.Any], dstPort = dstPort.asInstanceOf[js.Any], srcAddr = srcAddr.asInstanceOf[js.Any], srcPort = srcPort.asInstanceOf[js.Any])
      __obj.asInstanceOf[ForwardOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ForwardOptions] (val x: Self) extends AnyVal {
      
      inline def setDstAddr(value: String): Self = StObject.set(x, "dstAddr", value.asInstanceOf[js.Any])
      
      inline def setDstPort(value: Double): Self = StObject.set(x, "dstPort", value.asInstanceOf[js.Any])
      
      inline def setSrcAddr(value: String): Self = StObject.set(x, "srcAddr", value.asInstanceOf[js.Any])
      
      inline def setSrcPort(value: Double): Self = StObject.set(x, "srcPort", value.asInstanceOf[js.Any])
    }
  }
  
  trait TunnelOptions extends StObject {
    
    var autoClose: js.UndefOr[Boolean] = js.undefined
  }
  object TunnelOptions {
    
    inline def apply(): TunnelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TunnelOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TunnelOptions] (val x: Self) extends AnyVal {
      
      inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
    }
  }
}
