package typings.wordpressCoreData.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entity extends js.Object {
  var baseURL: String
  var key: js.UndefOr[String] = js.undefined
  var kind: String
  var name: String
  var plural: js.UndefOr[String] = js.undefined
}

object Entity {
  @scala.inline
  def apply(baseURL: String, kind: String, name: String, key: String = null, plural: String = null): Entity = {
    val __obj = js.Dynamic.literal(baseURL = baseURL.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (plural != null) __obj.updateDynamic("plural")(plural.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entity]
  }
}

