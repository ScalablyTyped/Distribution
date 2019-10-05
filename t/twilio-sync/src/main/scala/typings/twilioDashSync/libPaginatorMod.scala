package typings.twilioDashSync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-sync/lib/paginator", JSImport.Namespace)
@js.native
object libPaginatorMod extends js.Object {
  @js.native
  class Paginator[Item] protected () extends js.Object {
    def this(items: js.Any, source: js.Any, prevToken: String, nextToken: String) = this()
    val hasNextPage: Boolean = js.native
    val hasPrevPage: Boolean = js.native
    val items: js.Array[Item] = js.native
    var nextToken: js.Any = js.native
    var prevToken: js.Any = js.native
    var source: js.Any = js.native
    /**
      * Request next page.
      * Does not modify existing object.
      * @return {Promise<Paginator>}
      */
    def nextPage(): js.Promise[_] = js.native
    /**
      * Request previous page.
      * Does not modify existing object.
      * @return {Promise<Paginator>}
      */
    def prevPage(): js.Promise[_] = js.native
  }
  
}

