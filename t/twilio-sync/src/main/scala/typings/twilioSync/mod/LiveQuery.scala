package typings.twilioSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a long-running query against Flex data wherein the returned result set
  * subsequently receives pushed updates whenever new (or updated) records would match the
  * given expression. Updated results are presented row-by-row until this query is explicitly
  * closed.
  *
  * Use the {@link SyncClient.liveQuery} method to create a live query.
  */
@js.native
trait LiveQuery extends Closeable {
  
  /**
    * @return A snapshot of items matching the current query expression.
    */
  def getItems(): ItemsSnapshot = js.native
  
  def lastEventId: Double = js.native
  
  /* private */ val liveQueryImpl: Any = js.native
  
  /**
    * The immutable identifier of this query object, assigned by the system.
    */
  def sid: String = js.native
  
  def `type`: String = js.native
}
