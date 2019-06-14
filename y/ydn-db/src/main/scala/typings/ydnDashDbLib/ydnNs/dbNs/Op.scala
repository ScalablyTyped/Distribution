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
  sealed trait ^
    extends ydnDashDbLib.ydnNs.dbNs.Op
  
  /* 1 */ val `<`: `<` with scala.Double = js.native
  /* 4 */ val `<=`: `<=` with scala.Double = js.native
  /* 2 */ val `=`: `=` with scala.Double = js.native
  /* 0 */ val `>`: `>` with scala.Double = js.native
  /* 3 */ val `>=`: `>=` with scala.Double = js.native
  /* 5 */ val ^ : ^  with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ydnDashDbLib.ydnNs.dbNs.Op with scala.Double] = js.native
}

