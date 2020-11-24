package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "CallHierarchyOutgoingCall")
@js.native
class CallHierarchyOutgoingCall protected () extends js.Object {
  /**
    * Create a new call object.
    *
    * @param item The item being called
    * @param fromRanges The ranges at which the calls appear.
    */
  def this(item: CallHierarchyItem, fromRanges: js.Array[Range]) = this()
  
  /**
    * The range at which this item is called. This is the range relative to the caller, e.g the item
    * passed to [`provideCallHierarchyOutgoingCalls`](#CallHierarchyProvider.provideCallHierarchyOutgoingCalls)
    * and not [`this.to`](#CallHierarchyOutgoingCall.to).
    */
  var fromRanges: js.Array[Range] = js.native
  
  /**
    * The item that is called.
    */
  var to: CallHierarchyItem = js.native
}
