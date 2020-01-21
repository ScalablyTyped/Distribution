package typings.windowsMutex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("windows-mutex", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Mutex protected () extends js.Object {
    def this(name: String) = this()
    def isActive(): Boolean = js.native
    def release(): Unit = js.native
  }
  
  def isActive(name: String): Boolean = js.native
}

