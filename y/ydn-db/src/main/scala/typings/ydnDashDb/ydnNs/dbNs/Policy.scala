package typings.ydnDashDb.ydnNs.dbNs

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
  
  /* 0 */ val all: typings.ydnDashDb.ydnNs.dbNs.Policy.all with Double = js.native
  /* 1 */ val atomic: typings.ydnDashDb.ydnNs.dbNs.Policy.atomic with Double = js.native
  /* 2 */ val multi: typings.ydnDashDb.ydnNs.dbNs.Policy.multi with Double = js.native
  /* 3 */ val repeat: typings.ydnDashDb.ydnNs.dbNs.Policy.repeat with Double = js.native
  /* 4 */ val single: typings.ydnDashDb.ydnNs.dbNs.Policy.single with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Policy with Double] = js.native
}

