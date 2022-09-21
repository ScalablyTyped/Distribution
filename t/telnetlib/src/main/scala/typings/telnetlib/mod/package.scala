package typings.telnetlib.mod

import typings.node.netMod.NetConnectOpts
import typings.node.netMod.Server
import typings.node.netMod.ServerOpts
import typings.node.netMod.Socket
import typings.telnetlib.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def createConnection(options: NetConnectOpts & Options_[TelnetOption]): TelnetSocket = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(options.asInstanceOf[js.Any]).asInstanceOf[TelnetSocket]
inline def createConnection(options: NetConnectOpts & Options_[TelnetOption], connectionListener: js.Function0[Unit]): TelnetSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(options.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[TelnetSocket]
inline def createConnection(options: String): TelnetSocket = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(options.asInstanceOf[js.Any]).asInstanceOf[TelnetSocket]
inline def createConnection(options: String, connectionListener: js.Function0[Unit]): TelnetSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(options.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[TelnetSocket]
inline def createConnection(port: Double): TelnetSocket = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(port.asInstanceOf[js.Any]).asInstanceOf[TelnetSocket]
inline def createConnection(port: Double, host: String): TelnetSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[TelnetSocket]
inline def createConnection(port: Double, host: String, connectionListener: js.Function0[Unit]): TelnetSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[TelnetSocket]
inline def createConnection(port: Double, host: Unit, connectionListener: js.Function0[Unit]): TelnetSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[TelnetSocket]

inline def createServer(): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[Server]
inline def createServer(connectionListener: js.Function1[/* socket */ Socket, Unit]): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(connectionListener.asInstanceOf[js.Any]).asInstanceOf[Server]
inline def createServer(options: ServerOpts & Options_[TelnetOption]): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[Server]
inline def createServer(
  options: ServerOpts & Options_[TelnetOption],
  connectionListener: js.Function1[/* socket */ Socket & TelnetSocket, Unit]
): Server = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[Server]
inline def createServer(options: Unit, connectionListener: js.Function1[/* socket */ Socket & TelnetSocket, Unit]): Server = (^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[Server]

inline def defineOption(name: String, code: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineOption")(name.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def defineOption(name: String, code: Double, handler: TelnetOption): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineOption")(name.asInstanceOf[js.Any], code.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def getOption[T /* <: TelnetOption */](code: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("getOption")(code.asInstanceOf[js.Any]).asInstanceOf[T]
