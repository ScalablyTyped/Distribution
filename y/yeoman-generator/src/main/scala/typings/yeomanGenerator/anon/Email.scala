package typings.yeomanGenerator.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Email extends js.Object {
  /**
    * Retrieves user's email from Git in the global scope or the project scope
    * (it'll take what Git will use in the current context)
    * @return configured git email or undefined
    */
  def email(): String = js.native
  /**
    * Retrieves user's name from Git in the global scope or the project scope
    * (it'll take what Git will use in the current context)
    * @return configured git name or undefined
    */
  def name(): String = js.native
}

object Email {
  @scala.inline
  def apply(email: () => String, name: () => String): Email = {
    val __obj = js.Dynamic.literal(email = js.Any.fromFunction0(email), name = js.Any.fromFunction0(name))
    __obj.asInstanceOf[Email]
  }
  @scala.inline
  implicit class EmailOps[Self <: Email] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEmail(value: () => String): Self = this.set("email", js.Any.fromFunction0(value))
    @scala.inline
    def setName(value: () => String): Self = this.set("name", js.Any.fromFunction0(value))
  }
  
}

