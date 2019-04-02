package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  /**
    * The name of the custom field. This may be up to 30 characters.
    */
  var name: java.lang.String
  /**
    * The value of the custom field. This may be up to 30 characters.
    */
  var value: java.lang.String
}

object Anon_Name {
  @scala.inline
  def apply(name: java.lang.String, value: java.lang.String): Anon_Name = {
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[Anon_Name]
  }
}

