package typings
package atUirouterCoreLib.libViewInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewContext extends js.Object {
  var name: java.lang.String
  var parent: ViewContext
}

object ViewContext {
  @scala.inline
  def apply(name: java.lang.String, parent: ViewContext): ViewContext = {
    val __obj = js.Dynamic.literal(name = name, parent = parent)
  
    __obj.asInstanceOf[ViewContext]
  }
}

