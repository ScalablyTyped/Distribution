package typings.webgme.GmeCommonNs

import typings.webgme.webgmeStrings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefBoolObject extends DefObject {
  var `type`: boolean
}

object DefBoolObject {
  @scala.inline
  def apply(`type`: boolean): DefBoolObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DefBoolObject]
  }
}

