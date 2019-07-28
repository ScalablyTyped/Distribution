package typings.tress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object tressStrings {
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
  
  @scala.inline
  def active: active = "active".asInstanceOf[active]
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  @scala.inline
  def finished: finished = "finished".asInstanceOf[finished]
  @scala.inline
  def missing: missing = "missing".asInstanceOf[missing]
  @scala.inline
  def waiting: waiting = "waiting".asInstanceOf[waiting]
}

