package typings.xrm.XrmEnum

import typings.xrm.xrmStrings.aborted
import typings.xrm.xrmStrings.active
import typings.xrm.xrmStrings.finished
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Constant Enum: Status for {@link ProcessFlow.Process.getStatus Process.getStatus()}.
  * @see {@link ProcessFlow.ProcessStatus}
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmStrings.active
  - typings.xrm.xrmStrings.aborted
  - typings.xrm.xrmStrings.finished
*/
trait ProcessStatus extends StObject
object ProcessStatus {
  
  @scala.inline
  def Aborted: aborted = "aborted".asInstanceOf[aborted]
  
  @scala.inline
  def Active: active = "active".asInstanceOf[active]
  
  @scala.inline
  def Finished: finished = "finished".asInstanceOf[finished]
}
