package typings.yadda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object yaddaStrings {
  @js.native
  sealed trait __ON_DEFINE__ extends js.Object
  
  @js.native
  sealed trait __ON_EXECUTE__ extends js.Object
  
  @js.native
  sealed trait __ON_SCENARIO__ extends js.Object
  
  @js.native
  sealed trait __ON_STEP__ extends js.Object
  
  @js.native
  sealed trait promise extends js.Object
  
  @js.native
  sealed trait sync extends js.Object
  
  @scala.inline
  def __ON_DEFINE__ : __ON_DEFINE__ = "__ON_DEFINE__".asInstanceOf[__ON_DEFINE__]
  @scala.inline
  def __ON_EXECUTE__ : __ON_EXECUTE__ = "__ON_EXECUTE__".asInstanceOf[__ON_EXECUTE__]
  @scala.inline
  def __ON_SCENARIO__ : __ON_SCENARIO__ = "__ON_SCENARIO__".asInstanceOf[__ON_SCENARIO__]
  @scala.inline
  def __ON_STEP__ : __ON_STEP__ = "__ON_STEP__".asInstanceOf[__ON_STEP__]
  @scala.inline
  def promise: promise = "promise".asInstanceOf[promise]
  @scala.inline
  def sync: sync = "sync".asInstanceOf[sync]
}

