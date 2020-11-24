package typings.twilioSync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("twilio-sync/lib/paginator", JSImport.Namespace)
@js.native
object paginatorMod extends js.Object {
  
  @js.native
  class Paginator[Item] protected () extends js.Object {
    def this(items: js.Any, source: js.Any, prevToken: String, nextToken: String) = this()
    
    def hasNextPage: Boolean = js.native
    
    def hasPrevPage: Boolean = js.native
    
    val items: js.Array[Item] = js.native
    
    /**
      * Request next page.
      * Does not modify existing object.
      * @return {Promise<Paginator>}
      */
    def nextPage(): js.Promise[_] = js.native
    
    var nextToken: js.Any = js.native
    
    /**
      * Request previous page.
      * Does not modify existing object.
      * @return {Promise<Paginator>}
      */
    def prevPage(): js.Promise[_] = js.native
    
    var prevToken: js.Any = js.native
    
    var source: js.Any = js.native
  }
}
