package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Folder extends js.Object {
  var folder: scala.Double
  var invalid: scala.Double
  var ref: scala.Double
}

object Folder {
  @scala.inline
  def apply(folder: scala.Double, invalid: scala.Double, ref: scala.Double): Folder = {
    val __obj = js.Dynamic.literal(folder = folder.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Folder]
  }
}

