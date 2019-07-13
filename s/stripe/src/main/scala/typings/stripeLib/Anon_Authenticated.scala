package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Authenticated extends js.Object {
  /**
    * Whether or not authentication was performed. 3D Secure will succeed without authentication when the
    * card is not enrolled.
    */
  var authenticated: scala.Boolean
  /**
    * Whether or not 3D Secure succeeded.
    */
  var succeeded: scala.Boolean
  /**
    * The version of 3D Secure that was used for this payment.
    */
  var version: java.lang.String
}

object Anon_Authenticated {
  @scala.inline
  def apply(authenticated: scala.Boolean, succeeded: scala.Boolean, version: java.lang.String): Anon_Authenticated = {
    val __obj = js.Dynamic.literal(authenticated = authenticated, succeeded = succeeded, version = version)
  
    __obj.asInstanceOf[Anon_Authenticated]
  }
}

