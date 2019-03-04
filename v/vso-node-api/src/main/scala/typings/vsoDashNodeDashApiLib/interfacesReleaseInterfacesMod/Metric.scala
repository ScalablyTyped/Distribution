package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metric extends js.Object {
  var name: java.lang.String
  var value: scala.Double
}

object Metric {
  @scala.inline
  def apply(name: java.lang.String, value: scala.Double): Metric = {
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[Metric]
  }
}

