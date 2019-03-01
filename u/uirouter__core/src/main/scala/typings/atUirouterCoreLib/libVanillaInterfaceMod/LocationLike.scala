package typings
package atUirouterCoreLib.libVanillaInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationLike extends js.Object {
  var hash: java.lang.String
  var pathname: java.lang.String
  var search: java.lang.String
}

object LocationLike {
  @scala.inline
  def apply(hash: java.lang.String, pathname: java.lang.String, search: java.lang.String): LocationLike = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("pathname")(pathname)
    __obj.updateDynamic("search")(search)
    __obj.asInstanceOf[LocationLike]
  }
}

