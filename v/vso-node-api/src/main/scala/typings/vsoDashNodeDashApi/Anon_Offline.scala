package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Offline extends js.Object {
  var offline: Double
  var online: Double
}

object Anon_Offline {
  @scala.inline
  def apply(offline: Double, online: Double): Anon_Offline = {
    val __obj = js.Dynamic.literal(offline = offline, online = online)
  
    __obj.asInstanceOf[Anon_Offline]
  }
}

