package typings.atUirouterCore.libVanillaInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationLike extends js.Object {
  var hash: String
  var pathname: String
  var search: String
}

object LocationLike {
  @scala.inline
  def apply(hash: String, pathname: String, search: String): LocationLike = {
    val __obj = js.Dynamic.literal(hash = hash, pathname = pathname, search = search)
  
    __obj.asInstanceOf[LocationLike]
  }
}

