package typings.waterline

import typings.waterline.waterlineStrings.json
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Json extends js.Object {
  var `type`: json
}

object Anon_Json {
  @scala.inline
  def apply(`type`: json): Anon_Json = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Json]
  }
}

