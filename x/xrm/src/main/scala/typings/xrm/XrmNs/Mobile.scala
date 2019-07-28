package typings.xrm.XrmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for methods to create and manage records in the mobile clients (for phones tablets).
  */
trait Mobile extends js.Object {
  /**
    * Provides methods to create and manage records in the mobile clients while working in the offline mode.
    * @see {@link https://msdn.microsoft.com/en-us/library/mt787123.aspx External Link: Xrm.Mobile.offline (client-side reference)}
    * @deprecated Use {@link Xrm.WebApi.offline} instead.  Xrm.WebApi.offline is implemented differently than Xrm.Mobile.offline
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/get-started/whats-new/customer-engagement/important-changes-coming#some-client-apis-are-deprecated External Link: Deprecated Client APIs}
    */
  var offline: MobileOffline
}

object Mobile {
  @scala.inline
  def apply(offline: MobileOffline): Mobile = {
    val __obj = js.Dynamic.literal(offline = offline)
  
    __obj.asInstanceOf[Mobile]
  }
}

