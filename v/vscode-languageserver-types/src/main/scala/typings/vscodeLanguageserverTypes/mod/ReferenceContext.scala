package typings.vscodeLanguageserverTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReferenceContext extends js.Object {
  /**
    * Include the declaration of the current symbol.
    */
  var includeDeclaration: Boolean = js.native
}

object ReferenceContext {
  @scala.inline
  def apply(includeDeclaration: Boolean): ReferenceContext = {
    val __obj = js.Dynamic.literal(includeDeclaration = includeDeclaration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceContext]
  }
  @scala.inline
  implicit class ReferenceContextOps[Self <: ReferenceContext] (val x: Self) extends AnyVal {
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
    def setIncludeDeclaration(value: Boolean): Self = this.set("includeDeclaration", value.asInstanceOf[js.Any])
  }
  
}

