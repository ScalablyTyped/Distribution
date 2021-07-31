package typings.twilioSync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginatorMod {
  
  @JSImport("twilio-sync/lib/paginator", "Paginator")
  @js.native
  class Paginator[Item] protected () extends StObject {
    def this(items: js.Any, source: js.Any, prevToken: String, nextToken: String) = this()
    
    def hasNextPage: Boolean = js.native
    
    def hasPrevPage: Boolean = js.native
    
    val items: js.Array[Item] = js.native
    
    /**
      * Request next page.
      * Does not modify existing object.
      * @return {Promise<Paginator>}
      */
    def nextPage(): js.Promise[js.Any] = js.native
    
    var nextToken: js.Any = js.native
    
    /**
      * Request previous page.
      * Does not modify existing object.
      * @return {Promise<Paginator>}
      */
    def prevPage(): js.Promise[js.Any] = js.native
    
    var prevToken: js.Any = js.native
    
    var source: js.Any = js.native
  }
}
