package typings
package stripeLib.stripeMod.StripeNs.applicationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IApplication
  extends stripeLib.stripeMod.StripeNs.IResourceObject {
  /**
    * String representing the application’s name.
    */
  var name: java.lang.String
  /**
    * String representing the object’s type. Objects of the same type share the same value.
    */
  @JSName("object")
  var object_IApplication: stripeLib.stripeLibStrings.application
}

object IApplication {
  @scala.inline
  def apply(id: java.lang.String, name: java.lang.String, `object`: stripeLib.stripeLibStrings.application): IApplication = {
    val __obj = js.Dynamic.literal(id = id, name = name)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[IApplication]
  }
}

