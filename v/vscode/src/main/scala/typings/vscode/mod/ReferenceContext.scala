package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceContext extends js.Object {
  /**
  		 * Include the declaration of the current symbol.
  		 */
  var includeDeclaration: Boolean
}

object ReferenceContext {
  @scala.inline
  def apply(includeDeclaration: Boolean): ReferenceContext = {
    val __obj = js.Dynamic.literal(includeDeclaration = includeDeclaration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceContext]
  }
}

