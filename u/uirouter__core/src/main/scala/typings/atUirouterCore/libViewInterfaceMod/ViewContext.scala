package typings.atUirouterCore.libViewInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewContext extends js.Object {
  var name: String
  var parent: ViewContext
}

object ViewContext {
  @scala.inline
  def apply(name: String, parent: ViewContext): ViewContext = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ViewContext]
  }
}

