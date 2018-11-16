package typings
package wepyLib.eventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait event extends js.Object {
  var active: scala.Boolean
  @JSName("$destroy")
  def $destroy(): scala.Unit
  @JSName("$transfor")
  def $transfor(wxevent: js.Array[_]): scala.Unit
}

