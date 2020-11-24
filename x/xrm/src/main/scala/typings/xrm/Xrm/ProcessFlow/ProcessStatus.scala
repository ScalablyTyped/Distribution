package typings.xrm.Xrm.ProcessFlow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Status for {@link ProcessFlow.Process.getStatus Process.getStatus()}.
  * @see {@link XrmEnum.ProcessStatus}
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmStrings.active
  - typings.xrm.xrmStrings.aborted
  - typings.xrm.xrmStrings.finished
*/
trait ProcessStatus extends js.Object
object ProcessStatus {
  
  @scala.inline
  def aborted: typings.xrm.xrmStrings.aborted = "aborted".asInstanceOf[typings.xrm.xrmStrings.aborted]
  
  @scala.inline
  def active: typings.xrm.xrmStrings.active = "active".asInstanceOf[typings.xrm.xrmStrings.active]
  
  @scala.inline
  def finished: typings.xrm.xrmStrings.finished = "finished".asInstanceOf[typings.xrm.xrmStrings.finished]
}
