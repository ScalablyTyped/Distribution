package typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod

import org.scalablytyped.runtime.TopLevel
import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.Trace.Messages
import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.Trace.Off
import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.Trace.Verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Trace extends js.Object

@JSImport("vscode-jsonrpc", "Trace")
@js.native
object Trace extends js.Object {
  @js.native
  sealed trait Messages extends Trace
  
  @js.native
  sealed trait Off extends Trace
  
  @js.native
  sealed trait Verbose extends Trace
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Trace with Double] = js.native
  def fromString(value: String): Trace = js.native
  def toString(value: Trace): TraceValues = js.native
  /* 1 */ @js.native
  object Messages extends TopLevel[Messages with Double]
  
  /* 0 */ @js.native
  object Off extends TopLevel[Off with Double]
  
  /* 2 */ @js.native
  object Verbose extends TopLevel[Verbose with Double]
  
}

