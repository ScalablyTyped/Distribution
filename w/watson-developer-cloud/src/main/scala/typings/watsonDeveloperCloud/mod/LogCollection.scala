package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** LogCollection. */
@js.native
trait LogCollection extends js.Object {
  
  /** An array of objects describing log events. */
  var logs: js.Array[Log] = js.native
  
  /** The pagination data for the returned objects. */
  var pagination: LogPagination = js.native
}
object LogCollection {
  
  @scala.inline
  def apply(logs: js.Array[Log], pagination: LogPagination): LogCollection = {
    val __obj = js.Dynamic.literal(logs = logs.asInstanceOf[js.Any], pagination = pagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogCollection]
  }
  
  @scala.inline
  implicit class LogCollectionOps[Self <: LogCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLogsVarargs(value: Log*): Self = this.set("logs", js.Array(value :_*))
    
    @scala.inline
    def setLogs(value: js.Array[Log]): Self = this.set("logs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagination(value: LogPagination): Self = this.set("pagination", value.asInstanceOf[js.Any])
  }
}
