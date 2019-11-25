package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Automated extends js.Object {
  var automated: Double
  var manual: Double
  var none: Double
  var scheduled: Double
}

object Anon_Automated {
  @scala.inline
  def apply(automated: Double, manual: Double, none: Double, scheduled: Double): Anon_Automated = {
    val __obj = js.Dynamic.literal(automated = automated.asInstanceOf[js.Any], manual = manual.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], scheduled = scheduled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Automated]
  }
}

