package typings
package weixinDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ShareTickets extends js.Object {
  /** 每一项是一个 shareTicket ，对应一个转发对象 */
  var shareTickets: js.Array[java.lang.String]
}

object Anon_ShareTickets {
  @scala.inline
  def apply(shareTickets: js.Array[java.lang.String]): Anon_ShareTickets = {
    val __obj = js.Dynamic.literal(shareTickets = shareTickets)
  
    __obj.asInstanceOf[Anon_ShareTickets]
  }
}

