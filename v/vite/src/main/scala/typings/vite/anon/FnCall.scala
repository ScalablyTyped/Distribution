package typings.vite.anon

import org.scalablytyped.runtime.Instantiable1
import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.RequestListener
import typings.node.httpMod.ServerResponse
import typings.node.netMod.DropArgument
import typings.node.nodeColonnetMod.Socket
import typings.node.nodeColonstreamMod.Duplex
import typings.std.InstanceType
import typings.vite.viteStrings.checkContinue
import typings.vite.viteStrings.checkExpectation
import typings.vite.viteStrings.clientError
import typings.vite.viteStrings.close
import typings.vite.viteStrings.connect
import typings.vite.viteStrings.connection
import typings.vite.viteStrings.drop
import typings.vite.viteStrings.error
import typings.vite.viteStrings.listening
import typings.vite.viteStrings.request
import typings.vite.viteStrings.upgrade
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCall extends StObject {
  
  def apply(eventName: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def apply(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
  def apply(
    event: checkContinue,
    listener: RequestListener[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ]
  ): this.type = js.native
  def apply(
    event: checkExpectation,
    listener: RequestListener[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ]
  ): this.type = js.native
  def apply(event: clientError, listener: js.Function2[/* err */ js.Error, /* socket */ Duplex, Unit]): this.type = js.native
  def apply(event: close, listener: js.Function0[Unit]): this.type = js.native
  def apply(
    event: connection,
    listener: js.Function1[(/* socket */ typings.node.netMod.Socket) | (/* socket */ Socket), Unit]
  ): this.type = js.native
  def apply(
    event: connect,
    listener: js.Function3[
      /* req */ InstanceType[Instantiable1[/* socket */ Socket, IncomingMessage]], 
      /* socket */ Duplex, 
      /* head */ Buffer, 
      Unit
    ]
  ): this.type = js.native
  def apply(event: drop, listener: js.Function1[/* data */ js.UndefOr[DropArgument], Unit]): this.type = js.native
  def apply(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  def apply(event: listening, listener: js.Function0[Unit]): this.type = js.native
  def apply(
    event: request,
    listener: RequestListener[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ]
  ): this.type = js.native
  def apply(
    event: upgrade,
    listener: js.Function3[
      /* req */ InstanceType[Instantiable1[/* socket */ Socket, IncomingMessage]], 
      /* socket */ Duplex, 
      /* head */ Buffer, 
      Unit
    ]
  ): this.type = js.native
}
