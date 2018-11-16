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
  
  val all: all with java.lang.String = js.native
  val atomic: atomic with java.lang.String = js.native
  val multi: multi with java.lang.String = js.native
  val repeat: repeat with java.lang.String = js.native
  val single: single with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ydnDashDbLib.ydnNs.dbNs.Policy with java.lang.String] = js.native
}

