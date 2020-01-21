package typings.twilsock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilsock/lib/offlinestorage", JSImport.Namespace)
@js.native
object offlinestorageMod extends js.Object {
  @js.native
  class OfflineProductStorage protected () extends js.Object {
    def this(id: String) = this()
    val id: String = js.native
  }
  
  /* static members */
  @js.native
  object OfflineProductStorage extends js.Object {
    def create(productPayload: js.Any): OfflineProductStorage = js.native
  }
  
}

