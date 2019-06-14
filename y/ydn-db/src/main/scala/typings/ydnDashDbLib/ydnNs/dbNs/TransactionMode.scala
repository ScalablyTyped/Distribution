package typings
package ydnDashDbLib.ydnNs.dbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TransactionMode extends js.Object

@JSGlobal("ydn.db.TransactionMode")
@js.native
object TransactionMode extends js.Object {
  @js.native
  sealed trait readonly
    extends ydnDashDbLib.ydnNs.dbNs.TransactionMode
  
  @js.native
  sealed trait readwrite
    extends ydnDashDbLib.ydnNs.dbNs.TransactionMode
  
  /* 0 */ val readonly: readonly with scala.Double = js.native
  /* 1 */ val readwrite: readwrite with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ydnDashDbLib.ydnNs.dbNs.TransactionMode with scala.Double] = js.native
}

