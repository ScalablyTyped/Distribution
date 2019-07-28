package typings.wikidataDashSdk.wikidataDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SitelinkData extends js.Object {
  var lang: String
  var project: String
}

object SitelinkData {
  @scala.inline
  def apply(lang: String, project: String): SitelinkData = {
    val __obj = js.Dynamic.literal(lang = lang, project = project)
  
    __obj.asInstanceOf[SitelinkData]
  }
}

