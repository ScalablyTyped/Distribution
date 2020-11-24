package typings.vscodeJsonrpc.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Trace extends js.Object
@JSImport("vscode-jsonrpc", "Trace")
@js.native
object Trace extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Trace with Double] = js.native
  
  def fromString(value: String): Trace = js.native
  
  def toString(value: Trace): TraceValues = js.native
  
  @js.native
  sealed trait Messages extends Trace
  /* 1 */ @js.native
  object Messages extends TopLevel[Messages with Double]
  
  @js.native
  sealed trait Off extends Trace
  /* 0 */ @js.native
  object Off extends TopLevel[Off with Double]
  
  @js.native
  sealed trait Verbose extends Trace
  /* 2 */ @js.native
  object Verbose extends TopLevel[Verbose with Double]
}
