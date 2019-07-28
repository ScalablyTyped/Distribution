package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metric extends js.Object {
  var name: String
  var value: Double
}

object Metric {
  @scala.inline
  def apply(name: String, value: Double): Metric = {
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[Metric]
  }
}

