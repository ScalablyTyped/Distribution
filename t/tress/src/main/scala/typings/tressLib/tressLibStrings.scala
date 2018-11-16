package typings
package tressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object tressLibStrings {
  @js.native
  sealed trait active extends js.Object
  
  @js.native
  sealed trait failed extends js.Object
  
  @js.native
  sealed trait finished extends js.Object
  
  @js.native
  sealed trait missing extends js.Object
  
  @js.native
  sealed trait waiting extends js.Object
  
  def active: active = "active".asInstanceOf[active]
  def failed: failed = "failed".asInstanceOf[failed]
  def finished: finished = "finished".asInstanceOf[finished]
  def missing: missing = "missing".asInstanceOf[missing]
  def waiting: waiting = "waiting".asInstanceOf[waiting]
}

