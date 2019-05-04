package typings
package vegaDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FromName extends js.Object {
  var from: Anon_Data
  var name: java.lang.String
  var role: java.lang.String
  var sort: vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgComparator
  var `type`: java.lang.String
}

object Anon_FromName {
  @scala.inline
  def apply(
    from: Anon_Data,
    name: java.lang.String,
    role: java.lang.String,
    sort: vegaDashLiteLib.buildSrcVegaDotSchemaMod.VgComparator,
    `type`: java.lang.String
  ): Anon_FromName = {
    val __obj = js.Dynamic.literal(from = from, name = name, role = role, sort = sort)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_FromName]
  }
}

