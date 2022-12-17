package typings.undici.anon

import typings.node.AbortSignal
import typings.node.NodeJS.ErrnoException
import typings.node.dnsMod.LookupOneOptions
import typings.node.netMod.LookupFunction
import typings.node.netMod.OnReadOpts
import typings.undici.typesConnectorMod.BuildOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined node.net.TcpNetConnectOpts & {  maxCachedSessions :number | null | undefined,   socketPath :string | null | undefined,   timeout :number | null | undefined,   port :number | undefined} */
trait TcpNetConnectOptsmaxCache
  extends StObject
     with BuildOptions {
  
  var allowHalfOpen: js.UndefOr[Boolean] = js.undefined
  
  var family: js.UndefOr[Double] = js.undefined
  
  var fd: js.UndefOr[Double] = js.undefined
  
  var hints: js.UndefOr[Double] = js.undefined
  
  var host: js.UndefOr[String] = js.undefined
  
  var keepAlive: js.UndefOr[Boolean] = js.undefined
  
  var keepAliveInitialDelay: js.UndefOr[Double] = js.undefined
  
  var localAddress: js.UndefOr[String] = js.undefined
  
  var localPort: js.UndefOr[Double] = js.undefined
  
  var lookup: js.UndefOr[LookupFunction] = js.undefined
  
  var maxCachedSessions: js.UndefOr[Double | Null] = js.undefined
  
  var noDelay: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If specified, incoming data is stored in a single buffer and passed to the supplied callback when data arrives on the socket.
    * Note: this will cause the streaming functionality to not provide any data, however events like 'error', 'end', and 'close' will
    * still be emitted as normal and methods like pause() and resume() will also behave as expected.
    */
  var onread: js.UndefOr[OnReadOpts] = js.undefined
  
  var port: Double
  
  var readable: js.UndefOr[Boolean] = js.undefined
  
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  var socketPath: js.UndefOr[String | Null] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var writable: js.UndefOr[Boolean] = js.undefined
}
object TcpNetConnectOptsmaxCache {
  
  inline def apply(port: Double): TcpNetConnectOptsmaxCache = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[TcpNetConnectOptsmaxCache]
  }
  
  extension [Self <: TcpNetConnectOptsmaxCache](x: Self) {
    
    inline def setAllowHalfOpen(value: Boolean): Self = StObject.set(x, "allowHalfOpen", value.asInstanceOf[js.Any])
    
    inline def setAllowHalfOpenUndefined: Self = StObject.set(x, "allowHalfOpen", js.undefined)
    
    inline def setFamily(value: Double): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
    
    inline def setFd(value: Double): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
    
    inline def setFdUndefined: Self = StObject.set(x, "fd", js.undefined)
    
    inline def setHints(value: Double): Self = StObject.set(x, "hints", value.asInstanceOf[js.Any])
    
    inline def setHintsUndefined: Self = StObject.set(x, "hints", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
    
    inline def setKeepAliveInitialDelay(value: Double): Self = StObject.set(x, "keepAliveInitialDelay", value.asInstanceOf[js.Any])
    
    inline def setKeepAliveInitialDelayUndefined: Self = StObject.set(x, "keepAliveInitialDelay", js.undefined)
    
    inline def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
    
    inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
    
    inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
    
    inline def setLocalPort(value: Double): Self = StObject.set(x, "localPort", value.asInstanceOf[js.Any])
    
    inline def setLocalPortUndefined: Self = StObject.set(x, "localPort", js.undefined)
    
    inline def setLookup(
      value: (/* hostname */ String, /* options */ LookupOneOptions, /* callback */ js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]) => Unit
    ): Self = StObject.set(x, "lookup", js.Any.fromFunction3(value))
    
    inline def setLookupUndefined: Self = StObject.set(x, "lookup", js.undefined)
    
    inline def setMaxCachedSessions(value: Double): Self = StObject.set(x, "maxCachedSessions", value.asInstanceOf[js.Any])
    
    inline def setMaxCachedSessionsNull: Self = StObject.set(x, "maxCachedSessions", null)
    
    inline def setMaxCachedSessionsUndefined: Self = StObject.set(x, "maxCachedSessions", js.undefined)
    
    inline def setNoDelay(value: Boolean): Self = StObject.set(x, "noDelay", value.asInstanceOf[js.Any])
    
    inline def setNoDelayUndefined: Self = StObject.set(x, "noDelay", js.undefined)
    
    inline def setOnread(value: OnReadOpts): Self = StObject.set(x, "onread", value.asInstanceOf[js.Any])
    
    inline def setOnreadUndefined: Self = StObject.set(x, "onread", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setReadable(value: Boolean): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
    
    inline def setReadableUndefined: Self = StObject.set(x, "readable", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
    
    inline def setSocketPathNull: Self = StObject.set(x, "socketPath", null)
    
    inline def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setWritable(value: Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
    
    inline def setWritableUndefined: Self = StObject.set(x, "writable", js.undefined)
  }
}
