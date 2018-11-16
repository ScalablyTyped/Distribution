package typings
package ydnDashDbLib.ydnNs.dbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Op extends js.Object

@JSGlobal("ydn.db.Op")
@js.native
object Op extends js.Object {
  @js.native
  sealed trait `<`
    extends ydnDashDbLib.ydnNs.dbNs.Op
  
  @js.native
  sealed trait `<=`
    extends ydnDashDbLib.ydnNs.dbNs.Op
  
  @js.native
  sealed trait `=`
    extends ydnDashDbLib.ydnNs.dbNs.Op
  
  @js.native
  sealed trait `>`
    extends ydnDashDbLib.ydnNs.dbNs.Op
  
  @js.native
  sealed trait `>=`
    extends ydnDashDbLib.ydnNs.dbNs.Op
  
  @js.native
  sealed trait `^`
    extends ydnDashDbLib.ydnNs.dbNs.Op
  
  val `<`: `<` with java.lang.String = js.native
  val `<=`: `<=` with java.lang.String = js.native
  val `=`: `=` with java.lang.String = js.native
  val `>`: `>` with java.lang.String = js.native
  val `>=`: `>=` with java.lang.String = js.native
  val `^`: `^` with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ydnDashDbLib.ydnNs.dbNs.Op with java.lang.String] = js.native
}

