package typings.vscodeJsonrpc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TraceFormat extends StObject
@JSImport("vscode-jsonrpc", "TraceFormat")
@js.native
object TraceFormat extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TraceFormat with String] = js.native
  
  @js.native
  sealed trait JSON extends TraceFormat
  /* "json" */ val JSON: typings.vscodeJsonrpc.mod.TraceFormat.JSON with String = js.native
  
  @js.native
  sealed trait Text extends TraceFormat
  /* "text" */ val Text: typings.vscodeJsonrpc.mod.TraceFormat.Text with String = js.native
  
  def fromString(value: String): TraceFormat = js.native
}
