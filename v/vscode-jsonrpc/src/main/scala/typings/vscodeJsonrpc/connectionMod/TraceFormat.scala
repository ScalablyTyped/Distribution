package typings.vscodeJsonrpc.connectionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TraceFormat extends StObject
@JSImport("vscode-jsonrpc/lib/common/connection", "TraceFormat")
@js.native
object TraceFormat extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TraceFormat & String] = js.native
  
  @js.native
  sealed trait JSON
    extends StObject
       with TraceFormat
  /* "json" */ val JSON: typings.vscodeJsonrpc.connectionMod.TraceFormat.JSON & String = js.native
  
  @js.native
  sealed trait Text
    extends StObject
       with TraceFormat
  /* "text" */ val Text: typings.vscodeJsonrpc.connectionMod.TraceFormat.Text & String = js.native
  
  def fromString(value: String): TraceFormat = js.native
}
