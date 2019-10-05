package typings.ydnDashDb.ydn.db

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Policy extends js.Object

@JSGlobal("ydn.db.Policy")
@js.native
object Policy extends js.Object {
  @js.native
  sealed trait all extends Policy
  
  @js.native
  sealed trait atomic extends Policy
  
  @js.native
  sealed trait multi extends Policy
  
  @js.native
  sealed trait repeat extends Policy
  
  @js.native
  sealed trait single extends Policy
  
  /* 0 */ val all: typings.ydnDashDb.ydn.db.Policy.all with Double = js.native
  /* 1 */ val atomic: typings.ydnDashDb.ydn.db.Policy.atomic with Double = js.native
  /* 2 */ val multi: typings.ydnDashDb.ydn.db.Policy.multi with Double = js.native
  /* 3 */ val repeat: typings.ydnDashDb.ydn.db.Policy.repeat with Double = js.native
  /* 4 */ val single: typings.ydnDashDb.ydn.db.Policy.single with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Policy with Double] = js.native
}

