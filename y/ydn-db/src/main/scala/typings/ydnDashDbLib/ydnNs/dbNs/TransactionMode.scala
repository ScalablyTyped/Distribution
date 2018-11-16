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
  
  val readonly: readonly with java.lang.String = js.native
  val readwrite: readwrite with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ydnDashDbLib.ydnNs.dbNs.TransactionMode with java.lang.String] = js.native
}

