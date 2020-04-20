package typings.yeomanGenerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmail extends js.Object {
  /**
    * Retrieves user's email from Git in the global scope or the project scope
    * (it'll take what Git will use in the current context)
    * @return configured git email or undefined
    */
  def email(): String
  /**
    * Retrieves user's name from Git in the global scope or the project scope
    * (it'll take what Git will use in the current context)
    * @return configured git name or undefined
    */
  def name(): String
}

object AnonEmail {
  @scala.inline
  def apply(email: () => String, name: () => String): AnonEmail = {
    val __obj = js.Dynamic.literal(email = js.Any.fromFunction0(email), name = js.Any.fromFunction0(name))
    __obj.asInstanceOf[AnonEmail]
  }
}

