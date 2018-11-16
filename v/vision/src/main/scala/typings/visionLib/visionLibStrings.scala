package typings
package visionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object visionLibStrings {
  @js.native
  sealed trait async extends js.Object
  
  @js.native
  sealed trait sync extends js.Object
  
  def async: async = "async".asInstanceOf[async]
  def sync: sync = "sync".asInstanceOf[sync]
}

