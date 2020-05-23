package typings.web3CoreSubscriptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object web3CoreSubscriptionsStrings {
  @js.native
  sealed trait changed extends js.Object
  
  @js.native
  sealed trait connected extends js.Object
  
  @js.native
  sealed trait data extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @scala.inline
  def changed: changed = "changed".asInstanceOf[changed]
  @scala.inline
  def connected: connected = "connected".asInstanceOf[connected]
  @scala.inline
  def data: data = "data".asInstanceOf[data]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
}

