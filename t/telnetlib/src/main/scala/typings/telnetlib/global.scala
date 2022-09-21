package typings.telnetlib

import typings.node.netMod.NetConnectOpts
import typings.node.netMod.Server
import typings.node.netMod.ServerOpts
import typings.node.netMod.Socket
import typings.telnetlib.mod.Commands
import typings.telnetlib.mod.OptionState
import typings.telnetlib.mod.Options_
import typings.telnetlib.mod.Q
import typings.telnetlib.mod.Reason
import typings.telnetlib.mod.State
import typings.telnetlib.mod.Where
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object telnetlib {
    
    @JSGlobal("telnetlib")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("telnetlib.Commands")
    @js.native
    object Commands extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.telnetlib.mod.Commands & Double] = js.native
      
      /* 245 */ val AO: typings.telnetlib.mod.Commands.AO & Double = js.native
      
      /* 246 */ val AYT: typings.telnetlib.mod.Commands.AYT & Double = js.native
      
      /* 243 */ val BRK: typings.telnetlib.mod.Commands.BRK & Double = js.native
      
      /* 242 */ val DM: typings.telnetlib.mod.Commands.DM & Double = js.native
      
      /* 253 */ val DO: typings.telnetlib.mod.Commands.DO & Double = js.native
      
      /* 254 */ val DONT: typings.telnetlib.mod.Commands.DONT & Double = js.native
      
      /* 247 */ val EC: typings.telnetlib.mod.Commands.EC & Double = js.native
      
      /* 248 */ val EL: typings.telnetlib.mod.Commands.EL & Double = js.native
      
      /* 239 */ val EOR: typings.telnetlib.mod.Commands.EOR & Double = js.native
      
      /* 249 */ val GA: typings.telnetlib.mod.Commands.GA & Double = js.native
      
      /* 255 */ val IAC: typings.telnetlib.mod.Commands.IAC & Double = js.native
      
      /* 244 */ val IP: typings.telnetlib.mod.Commands.IP & Double = js.native
      
      /* 241 */ val NOP: typings.telnetlib.mod.Commands.NOP & Double = js.native
      
      /* 250 */ val SB: typings.telnetlib.mod.Commands.SB & Double = js.native
      
      /* 240 */ val SE: typings.telnetlib.mod.Commands.SE & Double = js.native
      
      /* 251 */ val WILL: typings.telnetlib.mod.Commands.WILL & Double = js.native
      
      /* 252 */ val WONT: typings.telnetlib.mod.Commands.WONT & Double = js.native
    }
    
    @JSGlobal("telnetlib.ECHO")
    @js.native
    open class ECHO protected ()
      extends typings.telnetlib.mod.ECHO {
      def this(socet: Socket, code: Double) = this()
    }
    
    @JSGlobal("telnetlib.GMCP")
    @js.native
    open class GMCP protected ()
      extends typings.telnetlib.mod.GMCP {
      def this(socket: Socket) = this()
    }
    
    @JSGlobal("telnetlib.MCCP")
    @js.native
    open class MCCP protected ()
      extends typings.telnetlib.mod.MCCP {
      def this(socet: Socket, code: Double) = this()
    }
    
    @JSGlobal("telnetlib.NAWS")
    @js.native
    open class NAWS protected ()
      extends typings.telnetlib.mod.NAWS {
      def this(socket: Socket) = this()
    }
    
    @JSGlobal("telnetlib.OptionState")
    @js.native
    object OptionState extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.telnetlib.mod.OptionState & String] = js.native
      
      /* "NO" */ val NO: typings.telnetlib.mod.OptionState.NO & String = js.native
      
      /* "WANTNO" */ val WANTNO: typings.telnetlib.mod.OptionState.WANTNO & String = js.native
      
      /* "WANTYES" */ val WANTYES: typings.telnetlib.mod.OptionState.WANTYES & String = js.native
      
      /* "YES" */ val YES: typings.telnetlib.mod.OptionState.YES & String = js.native
    }
    
    @JSGlobal("telnetlib.Q")
    @js.native
    object Q extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.telnetlib.mod.Q & String] = js.native
      
      /* "EMPTY" */ val EMPTY: typings.telnetlib.mod.Q.EMPTY & String = js.native
      
      /* "OPPOSITE" */ val OPPOSITE: typings.telnetlib.mod.Q.OPPOSITE & String = js.native
    }
    
    @JSGlobal("telnetlib.Reason")
    @js.native
    object Reason extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.telnetlib.mod.Reason & String] = js.native
      
      /* "CHUNK" */ val CHUNK: typings.telnetlib.mod.Reason.CHUNK & String = js.native
      
      /* "DATA" */ val DATA: typings.telnetlib.mod.Reason.DATA & String = js.native
      
      /* "EOR" */ val EOR: typings.telnetlib.mod.Reason.EOR & String = js.native
      
      /* "GA" */ val GA: typings.telnetlib.mod.Reason.GA & String = js.native
    }
    
    @JSGlobal("telnetlib.SGA")
    @js.native
    open class SGA protected ()
      extends typings.telnetlib.mod.SGA {
      def this(socket: Socket) = this()
    }
    
    @JSGlobal("telnetlib.State")
    @js.native
    object State extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.telnetlib.mod.State & String] = js.native
      
      /* "DATA" */ val DATA: typings.telnetlib.mod.State.DATA & String = js.native
      
      /* "DO" */ val DO: typings.telnetlib.mod.State.DO & String = js.native
      
      /* "DONT" */ val DONT: typings.telnetlib.mod.State.DONT & String = js.native
      
      /* "IAC" */ val IAC: typings.telnetlib.mod.State.IAC & String = js.native
      
      /* "SB" */ val SB: typings.telnetlib.mod.State.SB & String = js.native
      
      /* "SBIAC" */ val SBIAC: typings.telnetlib.mod.State.SBIAC & String = js.native
      
      /* "WILL" */ val WILL: typings.telnetlib.mod.State.WILL & String = js.native
      
      /* "WONT" */ val WONT: typings.telnetlib.mod.State.WONT & String = js.native
    }
    
    @JSGlobal("telnetlib.TRANSMIT_BINARY")
    @js.native
    open class TRANSMIT_BINARY protected ()
      extends typings.telnetlib.mod.TRANSMIT_BINARY {
      def this(socet: Socket, code: Double) = this()
    }
    
    @JSGlobal("telnetlib.TelnetOption")
    @js.native
    open class TelnetOption protected ()
      extends typings.telnetlib.mod.TelnetOption {
      def this(socet: Socket, code: Double) = this()
    }
    
    @JSGlobal("telnetlib.TelnetSocket")
    @js.native
    open class TelnetSocket protected ()
      extends typings.telnetlib.mod.TelnetSocket {
      def this(socket: Socket, options: Options_[typings.telnetlib.mod.TelnetOption]) = this()
    }
    
    @JSGlobal("telnetlib.Where")
    @js.native
    object Where extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.telnetlib.mod.Where & String] = js.native
      
      /* "LOCAL" */ val LOCAL: typings.telnetlib.mod.Where.LOCAL & String = js.native
      
      /* "REMOTE" */ val REMOTE: typings.telnetlib.mod.Where.REMOTE & String = js.native
    }
    
    object constants {
      
      @JSGlobal("telnetlib.constants")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("telnetlib.constants.commands")
      @js.native
      def commands: Commands = js.native
      inline def commands_=(x: Commands): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("commands")(x.asInstanceOf[js.Any])
      
      @JSGlobal("telnetlib.constants.optionState")
      @js.native
      def optionState: OptionState = js.native
      inline def optionState_=(x: OptionState): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optionState")(x.asInstanceOf[js.Any])
      
      @JSGlobal("telnetlib.constants.q")
      @js.native
      def q: Q = js.native
      inline def q_=(x: Q): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("q")(x.asInstanceOf[js.Any])
      
      @JSGlobal("telnetlib.constants.reason")
      @js.native
      def reason: Reason = js.native
      inline def reason_=(x: Reason): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reason")(x.asInstanceOf[js.Any])
      
      @JSGlobal("telnetlib.constants.state")
      @js.native
      def state: State = js.native
      inline def state_=(x: State): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("state")(x.asInstanceOf[js.Any])
      
      @JSGlobal("telnetlib.constants.where")
      @js.native
      def where: Where = js.native
      inline def where_=(x: Where): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("where")(x.asInstanceOf[js.Any])
    }
    
    inline def createConnection(options: NetConnectOpts & Options_[typings.telnetlib.mod.TelnetOption]): typings.telnetlib.mod.TelnetSocket = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(options.asInstanceOf[js.Any]).asInstanceOf[typings.telnetlib.mod.TelnetSocket]
    inline def createConnection(
      options: NetConnectOpts & Options_[typings.telnetlib.mod.TelnetOption],
      connectionListener: js.Function0[Unit]
    ): typings.telnetlib.mod.TelnetSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(options.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[typings.telnetlib.mod.TelnetSocket]
    inline def createConnection(options: String): typings.telnetlib.mod.TelnetSocket = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(options.asInstanceOf[js.Any]).asInstanceOf[typings.telnetlib.mod.TelnetSocket]
    inline def createConnection(options: String, connectionListener: js.Function0[Unit]): typings.telnetlib.mod.TelnetSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(options.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[typings.telnetlib.mod.TelnetSocket]
    inline def createConnection(port: Double): typings.telnetlib.mod.TelnetSocket = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(port.asInstanceOf[js.Any]).asInstanceOf[typings.telnetlib.mod.TelnetSocket]
    inline def createConnection(port: Double, host: String): typings.telnetlib.mod.TelnetSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[typings.telnetlib.mod.TelnetSocket]
    inline def createConnection(port: Double, host: String, connectionListener: js.Function0[Unit]): typings.telnetlib.mod.TelnetSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[typings.telnetlib.mod.TelnetSocket]
    inline def createConnection(port: Double, host: Unit, connectionListener: js.Function0[Unit]): typings.telnetlib.mod.TelnetSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[typings.telnetlib.mod.TelnetSocket]
    
    inline def createServer(): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[Server]
    inline def createServer(connectionListener: js.Function1[/* socket */ Socket, Unit]): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(connectionListener.asInstanceOf[js.Any]).asInstanceOf[Server]
    inline def createServer(options: ServerOpts & Options_[typings.telnetlib.mod.TelnetOption]): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[Server]
    inline def createServer(
      options: ServerOpts & Options_[typings.telnetlib.mod.TelnetOption],
      connectionListener: js.Function1[/* socket */ Socket & typings.telnetlib.mod.TelnetSocket, Unit]
    ): Server = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[Server]
    inline def createServer(
      options: Unit,
      connectionListener: js.Function1[/* socket */ Socket & typings.telnetlib.mod.TelnetSocket, Unit]
    ): Server = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[Server]
    
    inline def defineOption(name: String, code: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineOption")(name.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def defineOption(name: String, code: Double, handler: typings.telnetlib.mod.TelnetOption): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineOption")(name.asInstanceOf[js.Any], code.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def getOption[T /* <: typings.telnetlib.mod.TelnetOption */](code: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("getOption")(code.asInstanceOf[js.Any]).asInstanceOf[T]
    
    object options {
      
      @JSGlobal("telnetlib.options")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("telnetlib.options.ECHO")
      @js.native
      def ECHO: typings.telnetlib.mod.ECHO = js.native
      inline def ECHO_=(x: typings.telnetlib.mod.ECHO): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ECHO")(x.asInstanceOf[js.Any])
      
      @JSGlobal("telnetlib.options.GMCP")
      @js.native
      def GMCP: typings.telnetlib.mod.GMCP = js.native
      inline def GMCP_=(x: typings.telnetlib.mod.GMCP): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GMCP")(x.asInstanceOf[js.Any])
      
      @JSGlobal("telnetlib.options.MCCP")
      @js.native
      def MCCP: typings.telnetlib.mod.MCCP = js.native
      inline def MCCP_=(x: typings.telnetlib.mod.MCCP): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MCCP")(x.asInstanceOf[js.Any])
      
      @JSGlobal("telnetlib.options.NAWS")
      @js.native
      def NAWS: typings.telnetlib.mod.NAWS = js.native
      inline def NAWS_=(x: typings.telnetlib.mod.NAWS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAWS")(x.asInstanceOf[js.Any])
      
      @JSGlobal("telnetlib.options.SGA")
      @js.native
      def SGA: typings.telnetlib.mod.SGA = js.native
      inline def SGA_=(x: typings.telnetlib.mod.SGA): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SGA")(x.asInstanceOf[js.Any])
      
      @JSGlobal("telnetlib.options.TRANSMIT_BINARY")
      @js.native
      def TRANSMIT_BINARY: typings.telnetlib.mod.TRANSMIT_BINARY = js.native
      inline def TRANSMIT_BINARY_=(x: typings.telnetlib.mod.TRANSMIT_BINARY): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRANSMIT_BINARY")(x.asInstanceOf[js.Any])
    }
  }
}
