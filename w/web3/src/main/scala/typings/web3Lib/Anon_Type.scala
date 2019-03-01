package typings
package web3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Type
  extends web3Lib.utilsMod._Mixed {
  var `type`: java.lang.String
  var value: java.lang.String
}

object Anon_Type {
  @scala.inline
  def apply(`type`: java.lang.String, value: java.lang.String): Anon_Type = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Type]
  }
}

