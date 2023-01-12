package typings.telnetClient

import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.eventsMod.EventEmitter
import typings.node.netMod.Socket
import typings.node.netMod.SocketConnectOpts
import typings.telnetClient.libUtilsMod.Callback
import typings.telnetClient.libUtilsMod.Stream
import typings.telnetClient.telnetClientBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("telnet-client", "Telnet")
  @js.native
  open class Telnet () extends EventEmitter {
    
    def connect(opts: Any): js.Promise[Unit] = js.native
    
    /* private */ var dataResolver: Any = js.native
    
    /* private */ var decode: Any = js.native
    
    def destroy(): js.Promise[Unit] = js.native
    
    def end(): js.Promise[Unit] = js.native
    
    /* private */ var endEmitted: Any = js.native
    
    def exec(cmd: String): js.Promise[String] = js.native
    def exec(cmd: String, opts: Unit, callback: Callback[String]): js.Promise[String] = js.native
    def exec(cmd: String, opts: Callback[String]): js.Promise[String] = js.native
    def exec(cmd: String, opts: Callback[String], callback: Callback[String]): js.Promise[String] = js.native
    def exec(cmd: String, opts: ExecOptions): js.Promise[String] = js.native
    def exec(cmd: String, opts: ExecOptions, callback: Callback[String]): js.Promise[String] = js.native
    
    def getSocket(): Socket | Null = js.native
    
    /* private */ var inputBuffer: Any = js.native
    
    /* private */ var login: Any = js.native
    
    /* private */ var loginPromptReceived: Any = js.native
    
    def negotiate(chunk: Buffer): Buffer = js.native
    
    def nextData(): js.Promise[String | Null] = js.native
    
    /* private */ var opts: Any = js.native
    
    def parseData(chunk: Buffer): Buffer = js.native
    def parseData(chunk: Buffer, isReady: js.Array[Boolean]): Buffer = js.native
    
    /* private */ var pendingData: Any = js.native
    
    /* private */ var pushNextData: Any = js.native
    
    /* private */ var response: Any = js.native
    
    def send(data: String): js.Promise[String] = js.native
    def send(data: String, opts: Unit, callback: Callback[String]): js.Promise[String] = js.native
    def send(data: String, opts: Callback[String]): js.Promise[String] = js.native
    def send(data: String, opts: Callback[String], callback: Callback[String]): js.Promise[String] = js.native
    def send(data: String, opts: SendOptions): js.Promise[String] = js.native
    def send(data: String, opts: SendOptions, callback: Callback[String]): js.Promise[String] = js.native
    def send(data: Buffer): js.Promise[String] = js.native
    def send(data: Buffer, opts: Unit, callback: Callback[String]): js.Promise[String] = js.native
    def send(data: Buffer, opts: Callback[String]): js.Promise[String] = js.native
    def send(data: Buffer, opts: Callback[String], callback: Callback[String]): js.Promise[String] = js.native
    def send(data: Buffer, opts: SendOptions): js.Promise[String] = js.native
    def send(data: Buffer, opts: SendOptions, callback: Callback[String]): js.Promise[String] = js.native
    
    def shell(): js.Promise[Stream] = js.native
    def shell(callback: Callback[Stream]): js.Promise[Stream] = js.native
    
    /* private */ var socket: Any = js.native
    
    /* private */ var state: Any = js.native
    
    def write(data: String): js.Promise[String] = js.native
    def write(data: String, opts: Unit, callback: Callback[String]): js.Promise[String] = js.native
    def write(data: String, opts: SendOptions): js.Promise[String] = js.native
    def write(data: String, opts: SendOptions, callback: Callback[String]): js.Promise[String] = js.native
    def write(data: Buffer): js.Promise[String] = js.native
    def write(data: Buffer, opts: Unit, callback: Callback[String]): js.Promise[String] = js.native
    def write(data: Buffer, opts: SendOptions): js.Promise[String] = js.native
    def write(data: Buffer, opts: SendOptions, callback: Callback[String]): js.Promise[String] = js.native
  }
  /* static members */
  object Telnet {
    
    @JSImport("telnet-client", "Telnet")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("telnet-client", "Telnet.checkSocket")
    @js.native
    def checkSocket: Any = js.native
    inline def checkSocket_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("checkSocket")(x.asInstanceOf[js.Any])
  }
  
  trait ConnectOptions
    extends StObject
       with SendOptions {
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var echoLines: js.UndefOr[Double] = js.undefined
    
    var encoding: js.UndefOr[BufferEncoding] = js.undefined
    
    var escapeHandler: js.UndefOr[EscapeHandler] = js.undefined
    
    var execTimeout: js.UndefOr[Double] = js.undefined
    
    var extSock: js.UndefOr[Any] = js.undefined
    
    var failedLoginMatch: js.UndefOr[String | js.RegExp] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    /** @deprecated */
    var initialCTRLC: js.UndefOr[Boolean] = js.undefined
    
    var initialCtrlC: js.UndefOr[Boolean] = js.undefined
    
    var initialLFCR: js.UndefOr[Boolean] = js.undefined
    
    var irs: js.UndefOr[String] = js.undefined
    
    var localAddress: js.UndefOr[String] = js.undefined
    
    var loginPrompt: js.UndefOr[String | js.RegExp] = js.undefined
    
    var maxEndWait: js.UndefOr[Double] = js.undefined
    
    var negotiationMandatory: js.UndefOr[Boolean] = js.undefined
    
    var pageSeparator: js.UndefOr[String | js.RegExp] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var passwordPrompt: js.UndefOr[String | js.RegExp] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var sock: js.UndefOr[Socket] = js.undefined
    
    var socketConnectOptions: js.UndefOr[SocketConnectOpts] = js.undefined
    
    var stripShellPrompt: js.UndefOr[Boolean] = js.undefined
    
    var terminalHeight: js.UndefOr[Double] = js.undefined
    
    var terminalWidth: js.UndefOr[Double] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object ConnectOptions {
    
    inline def apply(): ConnectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectOptions] (val x: Self) extends AnyVal {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setEchoLines(value: Double): Self = StObject.set(x, "echoLines", value.asInstanceOf[js.Any])
      
      inline def setEchoLinesUndefined: Self = StObject.set(x, "echoLines", js.undefined)
      
      inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setEscapeHandler(value: /* escapeSequence */ String => String | Null): Self = StObject.set(x, "escapeHandler", js.Any.fromFunction1(value))
      
      inline def setEscapeHandlerUndefined: Self = StObject.set(x, "escapeHandler", js.undefined)
      
      inline def setExecTimeout(value: Double): Self = StObject.set(x, "execTimeout", value.asInstanceOf[js.Any])
      
      inline def setExecTimeoutUndefined: Self = StObject.set(x, "execTimeout", js.undefined)
      
      inline def setExtSock(value: Any): Self = StObject.set(x, "extSock", value.asInstanceOf[js.Any])
      
      inline def setExtSockUndefined: Self = StObject.set(x, "extSock", js.undefined)
      
      inline def setFailedLoginMatch(value: String | js.RegExp): Self = StObject.set(x, "failedLoginMatch", value.asInstanceOf[js.Any])
      
      inline def setFailedLoginMatchUndefined: Self = StObject.set(x, "failedLoginMatch", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setInitialCTRLC(value: Boolean): Self = StObject.set(x, "initialCTRLC", value.asInstanceOf[js.Any])
      
      inline def setInitialCTRLCUndefined: Self = StObject.set(x, "initialCTRLC", js.undefined)
      
      inline def setInitialLFCR(value: Boolean): Self = StObject.set(x, "initialLFCR", value.asInstanceOf[js.Any])
      
      inline def setInitialLFCRUndefined: Self = StObject.set(x, "initialLFCR", js.undefined)
      
      inline def setIrs(value: String): Self = StObject.set(x, "irs", value.asInstanceOf[js.Any])
      
      inline def setIrsUndefined: Self = StObject.set(x, "irs", js.undefined)
      
      inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      inline def setLoginPrompt(value: String | js.RegExp): Self = StObject.set(x, "loginPrompt", value.asInstanceOf[js.Any])
      
      inline def setLoginPromptUndefined: Self = StObject.set(x, "loginPrompt", js.undefined)
      
      inline def setMaxEndWait(value: Double): Self = StObject.set(x, "maxEndWait", value.asInstanceOf[js.Any])
      
      inline def setMaxEndWaitUndefined: Self = StObject.set(x, "maxEndWait", js.undefined)
      
      inline def setNegotiationMandatory(value: Boolean): Self = StObject.set(x, "negotiationMandatory", value.asInstanceOf[js.Any])
      
      inline def setNegotiationMandatoryUndefined: Self = StObject.set(x, "negotiationMandatory", js.undefined)
      
      inline def setPageSeparator(value: String | js.RegExp): Self = StObject.set(x, "pageSeparator", value.asInstanceOf[js.Any])
      
      inline def setPageSeparatorUndefined: Self = StObject.set(x, "pageSeparator", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordPrompt(value: String | js.RegExp): Self = StObject.set(x, "passwordPrompt", value.asInstanceOf[js.Any])
      
      inline def setPasswordPromptUndefined: Self = StObject.set(x, "passwordPrompt", js.undefined)
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setSock(value: Socket): Self = StObject.set(x, "sock", value.asInstanceOf[js.Any])
      
      inline def setSockUndefined: Self = StObject.set(x, "sock", js.undefined)
      
      inline def setSocketConnectOptions(value: SocketConnectOpts): Self = StObject.set(x, "socketConnectOptions", value.asInstanceOf[js.Any])
      
      inline def setSocketConnectOptionsUndefined: Self = StObject.set(x, "socketConnectOptions", js.undefined)
      
      inline def setStripShellPrompt(value: Boolean): Self = StObject.set(x, "stripShellPrompt", value.asInstanceOf[js.Any])
      
      inline def setStripShellPromptUndefined: Self = StObject.set(x, "stripShellPrompt", js.undefined)
      
      inline def setTerminalHeight(value: Double): Self = StObject.set(x, "terminalHeight", value.asInstanceOf[js.Any])
      
      inline def setTerminalHeightUndefined: Self = StObject.set(x, "terminalHeight", js.undefined)
      
      inline def setTerminalWidth(value: Double): Self = StObject.set(x, "terminalWidth", value.asInstanceOf[js.Any])
      
      inline def setTerminalWidthUndefined: Self = StObject.set(x, "terminalWidth", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  type EscapeHandler = js.Function1[/* escapeSequence */ String, String | Null]
  
  trait ExecOptions extends StObject {
    
    var echoLines: js.UndefOr[Double] = js.undefined
    
    var execTimeout: js.UndefOr[Double] = js.undefined
    
    var failedLoginMatch: js.UndefOr[String] = js.undefined
    
    var irs: js.UndefOr[String] = js.undefined
    
    var loginPrompt: js.UndefOr[String] = js.undefined
    
    var maxBufferLength: js.UndefOr[Double] = js.undefined
    
    var newlineReplace: js.UndefOr[String] = js.undefined
    
    var ors: js.UndefOr[String] = js.undefined
    
    var shellPrompt: js.UndefOr[String] = js.undefined
    
    var stripControls: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object ExecOptions {
    
    inline def apply(): ExecOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExecOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExecOptions] (val x: Self) extends AnyVal {
      
      inline def setEchoLines(value: Double): Self = StObject.set(x, "echoLines", value.asInstanceOf[js.Any])
      
      inline def setEchoLinesUndefined: Self = StObject.set(x, "echoLines", js.undefined)
      
      inline def setExecTimeout(value: Double): Self = StObject.set(x, "execTimeout", value.asInstanceOf[js.Any])
      
      inline def setExecTimeoutUndefined: Self = StObject.set(x, "execTimeout", js.undefined)
      
      inline def setFailedLoginMatch(value: String): Self = StObject.set(x, "failedLoginMatch", value.asInstanceOf[js.Any])
      
      inline def setFailedLoginMatchUndefined: Self = StObject.set(x, "failedLoginMatch", js.undefined)
      
      inline def setIrs(value: String): Self = StObject.set(x, "irs", value.asInstanceOf[js.Any])
      
      inline def setIrsUndefined: Self = StObject.set(x, "irs", js.undefined)
      
      inline def setLoginPrompt(value: String): Self = StObject.set(x, "loginPrompt", value.asInstanceOf[js.Any])
      
      inline def setLoginPromptUndefined: Self = StObject.set(x, "loginPrompt", js.undefined)
      
      inline def setMaxBufferLength(value: Double): Self = StObject.set(x, "maxBufferLength", value.asInstanceOf[js.Any])
      
      inline def setMaxBufferLengthUndefined: Self = StObject.set(x, "maxBufferLength", js.undefined)
      
      inline def setNewlineReplace(value: String): Self = StObject.set(x, "newlineReplace", value.asInstanceOf[js.Any])
      
      inline def setNewlineReplaceUndefined: Self = StObject.set(x, "newlineReplace", js.undefined)
      
      inline def setOrs(value: String): Self = StObject.set(x, "ors", value.asInstanceOf[js.Any])
      
      inline def setOrsUndefined: Self = StObject.set(x, "ors", js.undefined)
      
      inline def setShellPrompt(value: String): Self = StObject.set(x, "shellPrompt", value.asInstanceOf[js.Any])
      
      inline def setShellPromptUndefined: Self = StObject.set(x, "shellPrompt", js.undefined)
      
      inline def setStripControls(value: Boolean): Self = StObject.set(x, "stripControls", value.asInstanceOf[js.Any])
      
      inline def setStripControlsUndefined: Self = StObject.set(x, "stripControls", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait SendOptions extends StObject {
    
    var maxBufferLength: js.UndefOr[Double] = js.undefined
    
    var newlineReplace: js.UndefOr[String] = js.undefined
    
    var ors: js.UndefOr[String] = js.undefined
    
    var sendTimeout: js.UndefOr[Double] = js.undefined
    
    var shellPrompt: js.UndefOr[String | js.RegExp] = js.undefined
    
    var stripControls: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var waitFor: js.UndefOr[String | js.RegExp | `false`] = js.undefined
    
    /** @deprecated */
    var waitfor: js.UndefOr[String | js.RegExp | `false`] = js.undefined
  }
  object SendOptions {
    
    inline def apply(): SendOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SendOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SendOptions] (val x: Self) extends AnyVal {
      
      inline def setMaxBufferLength(value: Double): Self = StObject.set(x, "maxBufferLength", value.asInstanceOf[js.Any])
      
      inline def setMaxBufferLengthUndefined: Self = StObject.set(x, "maxBufferLength", js.undefined)
      
      inline def setNewlineReplace(value: String): Self = StObject.set(x, "newlineReplace", value.asInstanceOf[js.Any])
      
      inline def setNewlineReplaceUndefined: Self = StObject.set(x, "newlineReplace", js.undefined)
      
      inline def setOrs(value: String): Self = StObject.set(x, "ors", value.asInstanceOf[js.Any])
      
      inline def setOrsUndefined: Self = StObject.set(x, "ors", js.undefined)
      
      inline def setSendTimeout(value: Double): Self = StObject.set(x, "sendTimeout", value.asInstanceOf[js.Any])
      
      inline def setSendTimeoutUndefined: Self = StObject.set(x, "sendTimeout", js.undefined)
      
      inline def setShellPrompt(value: String | js.RegExp): Self = StObject.set(x, "shellPrompt", value.asInstanceOf[js.Any])
      
      inline def setShellPromptUndefined: Self = StObject.set(x, "shellPrompt", js.undefined)
      
      inline def setStripControls(value: Boolean): Self = StObject.set(x, "stripControls", value.asInstanceOf[js.Any])
      
      inline def setStripControlsUndefined: Self = StObject.set(x, "stripControls", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setWaitFor(value: String | js.RegExp | `false`): Self = StObject.set(x, "waitFor", value.asInstanceOf[js.Any])
      
      inline def setWaitForUndefined: Self = StObject.set(x, "waitFor", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - typings.telnetClient.telnetClientStrings.end
    - typings.telnetClient.telnetClientStrings.failedlogin
    - typings.telnetClient.telnetClientStrings.getprompt
    - typings.telnetClient.telnetClientStrings.login
    - typings.telnetClient.telnetClientStrings.ready
    - typings.telnetClient.telnetClientStrings.response
    - typings.telnetClient.telnetClientStrings.standby
    - typings.telnetClient.telnetClientStrings.start
  */
  type TelnetState = _TelnetState | Null
  
  trait _TelnetState extends StObject
}
