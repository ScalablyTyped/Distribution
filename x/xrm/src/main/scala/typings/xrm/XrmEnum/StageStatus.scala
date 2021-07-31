package typings.xrm.XrmEnum

import typings.xrm.xrmStrings.active
import typings.xrm.xrmStrings.inactive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Constant Enum: Status for {@link ProcessFlow.Stage.getStatus Stage.getStatus()}.
  * @see {@link ProcessFlow.StageStatus}
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmStrings.active
  - typings.xrm.xrmStrings.inactive
*/
trait StageStatus extends StObject
object StageStatus {
  
  @scala.inline
  def Active: active = "active".asInstanceOf[active]
  
  @scala.inline
  def Inactive: inactive = "inactive".asInstanceOf[inactive]
}
