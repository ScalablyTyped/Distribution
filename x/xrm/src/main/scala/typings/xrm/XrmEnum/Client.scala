package typings.xrm.XrmEnum

import typings.xrm.xrmStrings.UnifiedServiceDesk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Constant Enum: Client Types for {@link ClientContext.getClient clientContext.getClient()}.
  * @see {@link Xrm.Client}
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmStrings.Web
  - typings.xrm.xrmStrings.Outlook
  - typings.xrm.xrmStrings.Mobile
  - typings.xrm.xrmStrings.UnifiedServiceDesk
*/
trait Client extends js.Object
object Client {
  
  @scala.inline
  def Mobile: typings.xrm.xrmStrings.Mobile = "Mobile".asInstanceOf[typings.xrm.xrmStrings.Mobile]
  
  @scala.inline
  def Outlook: typings.xrm.xrmStrings.Outlook = "Outlook".asInstanceOf[typings.xrm.xrmStrings.Outlook]
  
  @scala.inline
  def USD: UnifiedServiceDesk = "UnifiedServiceDesk".asInstanceOf[UnifiedServiceDesk]
  
  @scala.inline
  def UnifiedServiceDesk: typings.xrm.xrmStrings.UnifiedServiceDesk = "UnifiedServiceDesk".asInstanceOf[typings.xrm.xrmStrings.UnifiedServiceDesk]
  
  @scala.inline
  def Web: typings.xrm.xrmStrings.Web = "Web".asInstanceOf[typings.xrm.xrmStrings.Web]
}
