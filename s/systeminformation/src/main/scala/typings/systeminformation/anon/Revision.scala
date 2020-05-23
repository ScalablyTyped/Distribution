package typings.systeminformation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Revision extends js.Object {
  var revision: Double
  var table: js.Array[Flags]
}

object Revision {
  @scala.inline
  def apply(revision: Double, table: js.Array[Flags]): Revision = {
    val __obj = js.Dynamic.literal(revision = revision.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[Revision]
  }
}

