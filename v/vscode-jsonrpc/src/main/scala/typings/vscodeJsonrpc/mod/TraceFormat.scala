package typings.vscodeJsonrpc.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TraceFormat extends js.Object

@JSImport("vscode-jsonrpc", "TraceFormat")
@js.native
object TraceFormat extends js.Object {
  @js.native
  sealed trait JSON extends TraceFormat
  
  @js.native
  sealed trait Text extends TraceFormat
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TraceFormat with String] = js.native
  def fromString(value: String): TraceFormat = js.native
  /* "json" */ @js.native
  object JSON extends TopLevel[JSON with String]
  
  /* "text" */ @js.native
  object Text extends TopLevel[Text with String]
  
}

