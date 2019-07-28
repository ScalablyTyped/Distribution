package typings.swfobject

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ie extends js.Object {
      // number or boolean
  var ie: Boolean
  var mac: Boolean
  var pv: js.Array[Double]
  var w3: Boolean
  var win: Boolean
  var wk: js.Any
}

object Anon_Ie {
  @scala.inline
  def apply(ie: Boolean, mac: Boolean, pv: js.Array[Double], w3: Boolean, win: Boolean, wk: js.Any): Anon_Ie = {
    val __obj = js.Dynamic.literal(ie = ie, mac = mac, pv = pv, w3 = w3, win = win, wk = wk)
  
    __obj.asInstanceOf[Anon_Ie]
  }
}

