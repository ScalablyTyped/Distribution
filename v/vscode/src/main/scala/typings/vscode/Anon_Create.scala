package typings.vscode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Create extends js.Object {
  var create: Boolean
  var overwrite: Boolean
}

object Anon_Create {
  @scala.inline
  def apply(create: Boolean, overwrite: Boolean): Anon_Create = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any], overwrite = overwrite.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Create]
  }
}

