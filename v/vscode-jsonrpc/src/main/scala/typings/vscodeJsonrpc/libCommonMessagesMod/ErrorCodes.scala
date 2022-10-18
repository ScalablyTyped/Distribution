package typings.vscodeJsonrpc.libCommonMessagesMod

import typings.vscodeJsonrpc.vscodeJsonrpcInts.`-32000`
import typings.vscodeJsonrpc.vscodeJsonrpcInts.`-32001`
import typings.vscodeJsonrpc.vscodeJsonrpcInts.`-32002`
import typings.vscodeJsonrpc.vscodeJsonrpcInts.`-32096`
import typings.vscodeJsonrpc.vscodeJsonrpcInts.`-32097`
import typings.vscodeJsonrpc.vscodeJsonrpcInts.`-32098`
import typings.vscodeJsonrpc.vscodeJsonrpcInts.`-32099`
import typings.vscodeJsonrpc.vscodeJsonrpcInts.`-32600`
import typings.vscodeJsonrpc.vscodeJsonrpcInts.`-32601`
import typings.vscodeJsonrpc.vscodeJsonrpcInts.`-32602`
import typings.vscodeJsonrpc.vscodeJsonrpcInts.`-32603`
import typings.vscodeJsonrpc.vscodeJsonrpcInts.`-32700`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ErrorCodes {
  
  /**
    * The connection is inactive and a use of it failed.
    */
  @JSImport("vscode-jsonrpc/lib/common/messages", "ErrorCodes.ConnectionInactive")
  @js.native
  val ConnectionInactive: `-32096` = js.native
  
  @JSImport("vscode-jsonrpc/lib/common/messages", "ErrorCodes.InternalError")
  @js.native
  val InternalError: `-32603` = js.native
  
  @JSImport("vscode-jsonrpc/lib/common/messages", "ErrorCodes.InvalidParams")
  @js.native
  val InvalidParams: `-32602` = js.native
  
  @JSImport("vscode-jsonrpc/lib/common/messages", "ErrorCodes.InvalidRequest")
  @js.native
  val InvalidRequest: `-32600` = js.native
  
  /**
    * An error occurred when reading a message from the transport layer.
    */
  @JSImport("vscode-jsonrpc/lib/common/messages", "ErrorCodes.MessageReadError")
  @js.native
  val MessageReadError: `-32098` = js.native
  
  /**
    * An error occurred when write a message to the transport layer.
    */
  @JSImport("vscode-jsonrpc/lib/common/messages", "ErrorCodes.MessageWriteError")
  @js.native
  val MessageWriteError: `-32099` = js.native
  
  @JSImport("vscode-jsonrpc/lib/common/messages", "ErrorCodes.MethodNotFound")
  @js.native
  val MethodNotFound: `-32601` = js.native
  
  @JSImport("vscode-jsonrpc/lib/common/messages", "ErrorCodes.ParseError")
  @js.native
  val ParseError: `-32700` = js.native
  
  /**
    * The connection got disposed or lost and all pending responses got
    * rejected.
    */
  @JSImport("vscode-jsonrpc/lib/common/messages", "ErrorCodes.PendingResponseRejected")
  @js.native
  val PendingResponseRejected: `-32097` = js.native
  
  /**
    * Error code indicating that a server received a notification or
    * request before the server has received the `initialize` request.
    */
  @JSImport("vscode-jsonrpc/lib/common/messages", "ErrorCodes.ServerNotInitialized")
  @js.native
  val ServerNotInitialized: `-32002` = js.native
  
  @JSImport("vscode-jsonrpc/lib/common/messages", "ErrorCodes.UnknownErrorCode")
  @js.native
  val UnknownErrorCode: `-32001` = js.native
  
  /**
    * This is the end range of JSON RPC reserved error codes.
    * It doesn't denote a real error code.
    *
    * @since 3.16.0
    */
  @JSImport("vscode-jsonrpc/lib/common/messages", "ErrorCodes.jsonrpcReservedErrorRangeEnd")
  @js.native
  val jsonrpcReservedErrorRangeEnd: `-32000` = js.native
  
  /**
    * This is the start range of JSON RPC reserved error codes.
    * It doesn't denote a real error code. No application error codes should
    * be defined between the start and end range. For backwards
    * compatibility the `ServerNotInitialized` and the `UnknownErrorCode`
    * are left in the range.
    *
    * @since 3.16.0
    */
  @JSImport("vscode-jsonrpc/lib/common/messages", "ErrorCodes.jsonrpcReservedErrorRangeStart")
  @js.native
  val jsonrpcReservedErrorRangeStart: `-32099` = js.native
  
  /** @deprecated use  jsonrpcReservedErrorRangeEnd */
  @JSImport("vscode-jsonrpc/lib/common/messages", "ErrorCodes.serverErrorEnd")
  @js.native
  val serverErrorEnd: `-32000` = js.native
  
  /** @deprecated use  jsonrpcReservedErrorRangeStart */
  @JSImport("vscode-jsonrpc/lib/common/messages", "ErrorCodes.serverErrorStart")
  @js.native
  val serverErrorStart: `-32099` = js.native
}
