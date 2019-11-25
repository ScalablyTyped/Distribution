package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Abusive extends js.Object {
  var abusive: Double
  var general: Double
  var spam: Double
}

object Anon_Abusive {
  @scala.inline
  def apply(abusive: Double, general: Double, spam: Double): Anon_Abusive = {
    val __obj = js.Dynamic.literal(abusive = abusive.asInstanceOf[js.Any], general = general.asInstanceOf[js.Any], spam = spam.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Abusive]
  }
}

