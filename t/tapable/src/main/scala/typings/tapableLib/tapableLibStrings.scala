package typings
package tapableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object tapableLibStrings {
  @js.native
  sealed trait async
    extends tapableLib.tapableMod.TapType
  
  @js.native
  sealed trait promise
    extends tapableLib.tapableMod.TapType
  
  @js.native
  sealed trait sync
    extends tapableLib.tapableMod.TapType
  
  @scala.inline
  def async: async = "async".asInstanceOf[async]
  @scala.inline
  def promise: promise = "promise".asInstanceOf[promise]
  @scala.inline
  def sync: sync = "sync".asInstanceOf[sync]
}

