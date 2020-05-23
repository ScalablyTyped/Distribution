package typings.ydnDb.ydn.db

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
  
}

