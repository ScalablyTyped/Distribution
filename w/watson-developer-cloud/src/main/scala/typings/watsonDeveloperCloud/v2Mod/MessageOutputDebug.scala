package typings.watsonDeveloperCloud.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Additional detailed information about a message response and how it was generated. */
trait MessageOutputDebug extends StObject {
  
  /** Assistant sets this to true when this message response concludes or interrupts a dialog. */
  var branch_exited: js.UndefOr[Boolean] = js.undefined
  
  /** When `branch_exited` is set to `true` by the Assistant, the `branch_exited_reason` specifies whether the dialog completed by itself or got interrupted. */
  var branch_exited_reason: js.UndefOr[String] = js.undefined
  
  /** An array of up to 50 messages logged with the request. */
  var log_messages: js.UndefOr[js.Array[DialogLogMessage]] = js.undefined
  
  /** An array of objects containing detailed diagnostic information about the nodes that were triggered during processing of the input message. */
  var nodes_visited: js.UndefOr[js.Array[DialogNodesVisited]] = js.undefined
}
object MessageOutputDebug {
  
  inline def apply(): MessageOutputDebug = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageOutputDebug]
  }
  
  extension [Self <: MessageOutputDebug](x: Self) {
    
    inline def setBranch_exited(value: Boolean): Self = StObject.set(x, "branch_exited", value.asInstanceOf[js.Any])
    
    inline def setBranch_exitedUndefined: Self = StObject.set(x, "branch_exited", js.undefined)
    
    inline def setBranch_exited_reason(value: String): Self = StObject.set(x, "branch_exited_reason", value.asInstanceOf[js.Any])
    
    inline def setBranch_exited_reasonUndefined: Self = StObject.set(x, "branch_exited_reason", js.undefined)
    
    inline def setLog_messages(value: js.Array[DialogLogMessage]): Self = StObject.set(x, "log_messages", value.asInstanceOf[js.Any])
    
    inline def setLog_messagesUndefined: Self = StObject.set(x, "log_messages", js.undefined)
    
    inline def setLog_messagesVarargs(value: DialogLogMessage*): Self = StObject.set(x, "log_messages", js.Array(value :_*))
    
    inline def setNodes_visited(value: js.Array[DialogNodesVisited]): Self = StObject.set(x, "nodes_visited", value.asInstanceOf[js.Any])
    
    inline def setNodes_visitedUndefined: Self = StObject.set(x, "nodes_visited", js.undefined)
    
    inline def setNodes_visitedVarargs(value: DialogNodesVisited*): Self = StObject.set(x, "nodes_visited", js.Array(value :_*))
  }
}
