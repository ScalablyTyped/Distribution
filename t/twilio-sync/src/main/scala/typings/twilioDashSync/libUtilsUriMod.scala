package typings.twilioDashSync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-sync/lib/utils/uri", JSImport.Namespace)
@js.native
object libUtilsUriMod extends js.Object {
  @js.native
  class UriBuilder protected () extends js.Object {
    def this(base: String) = this()
    var args: js.Array[String] = js.native
    var base: String = js.native
    var paths: js.Array[String] = js.native
    def build(): String = js.native
    def pathSegment(name: String): UriBuilder = js.native
    def queryParam(name: String, value: js.Any): UriBuilder = js.native
  }
  
}

