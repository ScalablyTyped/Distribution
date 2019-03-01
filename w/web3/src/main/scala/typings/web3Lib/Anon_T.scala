package typings
package web3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_T
  extends web3Lib.utilsMod._Mixed {
  var t: java.lang.String
  var v: java.lang.String
}

object Anon_T {
  @scala.inline
  def apply(t: java.lang.String, v: java.lang.String): Anon_T = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("t")(t)
    __obj.updateDynamic("v")(v)
    __obj.asInstanceOf[Anon_T]
  }
}

