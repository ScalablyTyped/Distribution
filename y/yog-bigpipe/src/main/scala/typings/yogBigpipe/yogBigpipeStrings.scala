package typings.yogBigpipe

import typings.yogBigpipe.mod.Pagelet.mode
import typings.yogBigpipe.mod.Pagelet.status
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object yogBigpipeStrings {
  
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
}
