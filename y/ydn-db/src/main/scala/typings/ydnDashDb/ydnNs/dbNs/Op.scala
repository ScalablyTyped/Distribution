package typings.ydnDashDb.ydnNs.dbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Op extends js.Object

@JSGlobal("ydn.db.Op")
@js.native
object Op extends js.Object {
  @js.native
  sealed trait `<` extends Op
  
  @js.native
  sealed trait `<=` extends Op
  
  @js.native
  sealed trait `=` extends Op
  
  @js.native
  sealed trait `>` extends Op
  
  @js.native
  sealed trait `>=` extends Op
  
  @js.native
  sealed trait ^ extends Op
  
  /* 1 */ val `<`: typings.ydnDashDb.ydnNs.dbNs.Op.`<` with Double = js.native
  /* 4 */ val `<=`: typings.ydnDashDb.ydnNs.dbNs.Op.`<=` with Double = js.native
  /* 2 */ val `=`: typings.ydnDashDb.ydnNs.dbNs.Op.`=` with Double = js.native
  /* 0 */ val `>`: typings.ydnDashDb.ydnNs.dbNs.Op.`>` with Double = js.native
  /* 3 */ val `>=`: typings.ydnDashDb.ydnNs.dbNs.Op.`>=` with Double = js.native
  /* 5 */ val ^ : typings.ydnDashDb.ydnNs.dbNs.Op.^  with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Op with Double] = js.native
}

