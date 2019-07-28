package typings.ydnDashDb.ydnNs.dbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TransactionMode extends js.Object

@JSGlobal("ydn.db.TransactionMode")
@js.native
object TransactionMode extends js.Object {
  @js.native
  sealed trait readonly extends TransactionMode
  
  @js.native
  sealed trait readwrite extends TransactionMode
  
  /* 0 */ val readonly: typings.ydnDashDb.ydnNs.dbNs.TransactionMode.readonly with Double = js.native
  /* 1 */ val readwrite: typings.ydnDashDb.ydnNs.dbNs.TransactionMode.readwrite with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TransactionMode with Double] = js.native
}

