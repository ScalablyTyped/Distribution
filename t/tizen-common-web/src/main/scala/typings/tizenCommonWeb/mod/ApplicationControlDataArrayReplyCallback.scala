package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationControlDataArrayReplyCallback extends StObject {
  
  /**
    * Called when the callee application calls _RequestedApplicationControl.replyFailure()_.
    */
  def onfailure(): Unit = js.native
  
  /**
    * Called when the callee application calls _RequestedApplicationControl.replyResult()_.
    *
    * @param data An array of _ApplicationControlData_ objects.
    */
  def onsuccess(): Unit = js.native
  def onsuccess(data: js.Array[ApplicationControlData]): Unit = js.native
}
