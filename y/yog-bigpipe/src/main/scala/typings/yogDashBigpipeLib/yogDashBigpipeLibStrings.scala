package typings
package yogDashBigpipeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object yogDashBigpipeLibStrings {
  @js.native
  sealed trait async
    extends yogDashBigpipeLib.yogDashBigpipeMod.PageletNs.mode
  
  @js.native
  sealed trait failed
    extends yogDashBigpipeLib.yogDashBigpipeMod.PageletNs.status
  
  @js.native
  sealed trait fulfilled
    extends yogDashBigpipeLib.yogDashBigpipeMod.PageletNs.status
  
  @js.native
  sealed trait pending
    extends yogDashBigpipeLib.yogDashBigpipeMod.PageletNs.status
  
  @js.native
  sealed trait pipeline
    extends yogDashBigpipeLib.yogDashBigpipeMod.PageletNs.mode
  
  @js.native
  sealed trait quickling
    extends yogDashBigpipeLib.yogDashBigpipeMod.PageletNs.mode
  
  @js.native
  sealed trait rendering
    extends yogDashBigpipeLib.yogDashBigpipeMod.PageletNs.status
  
  @scala.inline
  def async: async = "async".asInstanceOf[async]
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  @scala.inline
  def fulfilled: fulfilled = "fulfilled".asInstanceOf[fulfilled]
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  @scala.inline
  def pipeline: pipeline = "pipeline".asInstanceOf[pipeline]
  @scala.inline
  def quickling: quickling = "quickling".asInstanceOf[quickling]
  @scala.inline
  def rendering: rendering = "rendering".asInstanceOf[rendering]
}

