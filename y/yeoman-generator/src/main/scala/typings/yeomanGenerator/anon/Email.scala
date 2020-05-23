package typings.yeomanGenerator.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Email extends js.Object {
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

object Email {
  @scala.inline
  def apply(email: () => String, name: () => String): Email = {
    val __obj = js.Dynamic.literal(email = js.Any.fromFunction0(email), name = js.Any.fromFunction0(name))
    __obj.asInstanceOf[Email]
  }
}

