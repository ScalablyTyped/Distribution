package typings
package ydnDashDbLib.ydnNs.dbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Policy extends js.Object

@JSGlobal("ydn.db.Policy")
@js.native
object Policy extends js.Object {
  @js.native
  sealed trait all
    extends ydnDashDbLib.ydnNs.dbNs.Policy
  
  @js.native
  sealed trait atomic
    extends ydnDashDbLib.ydnNs.dbNs.Policy
  
  @js.native
  sealed trait multi
    extends ydnDashDbLib.ydnNs.dbNs.Policy
  
  @js.native
  sealed trait repeat
    extends ydnDashDbLib.ydnNs.dbNs.Policy
  
  @js.native
  sealed trait single
    extends ydnDashDbLib.ydnNs.dbNs.Policy
  
  /* 0 */ val all: all with scala.Double = js.native
  /* 1 */ val atomic: atomic with scala.Double = js.native
  /* 2 */ val multi: multi with scala.Double = js.native
  /* 3 */ val repeat: repeat with scala.Double = js.native
  /* 4 */ val single: single with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ydnDashDbLib.ydnNs.dbNs.Policy with scala.Double] = js.native
}

