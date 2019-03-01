package typings
package vueDashResourceLib.vuejsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceActions extends js.Object {
  var delete: vueDashResourceLib.Anon_Method
  var get: vueDashResourceLib.Anon_Method
  var query: vueDashResourceLib.Anon_Method
  var remove: vueDashResourceLib.Anon_Method
  var save: vueDashResourceLib.Anon_Method
  var update: vueDashResourceLib.Anon_Method
}

object ResourceActions {
  @scala.inline
  def apply(
    delete: vueDashResourceLib.Anon_Method,
    get: vueDashResourceLib.Anon_Method,
    query: vueDashResourceLib.Anon_Method,
    remove: vueDashResourceLib.Anon_Method,
    save: vueDashResourceLib.Anon_Method,
    update: vueDashResourceLib.Anon_Method
  ): ResourceActions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("query")(query)
    __obj.updateDynamic("remove")(remove)
    __obj.updateDynamic("save")(save)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[ResourceActions]
  }
}

