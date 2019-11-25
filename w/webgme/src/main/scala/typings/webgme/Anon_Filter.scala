package typings.webgme

import typings.webgme.GmeCommon.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Filter extends js.Object {
  var filter: js.Array[Path]
}

object Anon_Filter {
  @scala.inline
  def apply(filter: js.Array[Path]): Anon_Filter = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Filter]
  }
}

