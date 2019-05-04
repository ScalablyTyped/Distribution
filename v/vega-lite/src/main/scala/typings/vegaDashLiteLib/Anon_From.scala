package typings
package vegaDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_From extends js.Object {
  var from: Anon_Data
  var name: java.lang.String
  var role: java.lang.String
  var sort: vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgComparator
  var title: Anon_Encode | Anon_OffsetOrient
  var `type`: java.lang.String
}

object Anon_From {
  @scala.inline
  def apply(
    from: Anon_Data,
    name: java.lang.String,
    role: java.lang.String,
    sort: vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgComparator,
    title: Anon_Encode | Anon_OffsetOrient,
    `type`: java.lang.String
  ): Anon_From = {
    val __obj = js.Dynamic.literal(from = from, name = name, role = role, sort = sort, title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_From]
  }
}

