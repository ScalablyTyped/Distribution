package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** LogCollection. */
trait LogCollection extends StObject {
  
  /** An array of objects describing log events. */
  var logs: js.Array[Log]
  
  /** The pagination data for the returned objects. */
  var pagination: LogPagination
}
object LogCollection {
  
  @scala.inline
  def apply(logs: js.Array[Log], pagination: LogPagination): LogCollection = {
    val __obj = js.Dynamic.literal(logs = logs.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogCollection]
  }
  
  @scala.inline
  implicit class LogCollectionMutableBuilder[Self <: LogCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogs(value: js.Array[Log]): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogsVarargs(value: Log*): Self = StObject.set(x, "logs", js.Array(value :_*))
    
    @scala.inline
    def setPagination(value: LogPagination): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
  }
}
