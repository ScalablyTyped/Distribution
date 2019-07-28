package typings.yogDashBigpipe

import typings.yogDashBigpipe.yogDashBigpipeMod.PageletNs.mode
import typings.yogDashBigpipe.yogDashBigpipeMod.PageletNs.status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object yogDashBigpipeStrings {
  @js.native
  sealed trait async extends mode
  
  @js.native
  sealed trait failed extends status
  
  @js.native
  sealed trait fulfilled extends status
  
  @js.native
  sealed trait pending extends status
  
  @js.native
  sealed trait pipeline extends mode
  
  @js.native
  sealed trait quickling extends mode
  
  @js.native
  sealed trait rendering extends status
  
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

