package typings
package tapableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object tapableLibStrings {
  @js.native
  sealed trait async extends js.Object
  
  @js.native
  sealed trait promise extends js.Object
  
  @js.native
  sealed trait sync extends js.Object
  
  def async: async = "async".asInstanceOf[async]
  def promise: promise = "promise".asInstanceOf[promise]
  def sync: sync = "sync".asInstanceOf[sync]
}

