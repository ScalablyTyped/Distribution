package typings
package webpackbarLib.webpackbarMod.WebpackBarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile extends js.Object {
  var name: java.lang.String
  var requests: js.Array[_]
  def getStats(): webpackbarLib.Anon_Ext
}

object Profile {
  @scala.inline
  def apply(getStats: js.Function0[webpackbarLib.Anon_Ext], name: java.lang.String, requests: js.Array[_]): Profile = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getStats")(getStats)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("requests")(requests)
    __obj.asInstanceOf[Profile]
  }
}

