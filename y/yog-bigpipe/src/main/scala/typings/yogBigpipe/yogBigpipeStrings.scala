package typings.yogBigpipe

import typings.yogBigpipe.mod.Pagelet.mode
import typings.yogBigpipe.mod.Pagelet.status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object yogBigpipeStrings {
  
  @js.native
  sealed trait async extends mode
  @scala.inline
  def async: async = "async".asInstanceOf[async]
  
  @js.native
  sealed trait failed extends status
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  
  @js.native
  sealed trait fulfilled extends status
  @scala.inline
  def fulfilled: fulfilled = "fulfilled".asInstanceOf[fulfilled]
  
  @js.native
  sealed trait pending extends status
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait pipeline extends mode
  @scala.inline
  def pipeline: pipeline = "pipeline".asInstanceOf[pipeline]
  
  @js.native
  sealed trait quickling extends mode
  @scala.inline
  def quickling: quickling = "quickling".asInstanceOf[quickling]
  
  @js.native
  sealed trait rendering extends status
  @scala.inline
  def rendering: rendering = "rendering".asInstanceOf[rendering]
}
