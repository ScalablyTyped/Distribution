package typings
package tediousLib.tediousMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TediousType extends js.Object {
  var name: java.lang.String
  var `type`: java.lang.String
}

object TediousType {
  @scala.inline
  def apply(name: java.lang.String, `type`: java.lang.String): TediousType = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TediousType]
  }
}

