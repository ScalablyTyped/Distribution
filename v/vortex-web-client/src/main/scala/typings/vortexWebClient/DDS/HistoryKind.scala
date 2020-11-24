package typings.vortexWebClient.DDS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HistoryKind extends js.Object
@JSGlobal("DDS.HistoryKind")
@js.native
object HistoryKind extends js.Object {
  
  @js.native
  sealed trait KeepAll extends HistoryKind
  
  @js.native
  sealed trait KeepLast extends HistoryKind
}
