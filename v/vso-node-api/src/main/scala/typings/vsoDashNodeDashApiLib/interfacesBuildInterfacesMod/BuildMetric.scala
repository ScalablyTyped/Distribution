package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildMetric extends js.Object {
  /**
    * The date for the scope.
    */
  var date: stdLib.Date
  /**
    * The value.
    */
  var intValue: scala.Double
  /**
    * The name of the metric.
    */
  var name: java.lang.String
  /**
    * The scope.
    */
  var scope: java.lang.String
}

object BuildMetric {
  @scala.inline
  def apply(date: stdLib.Date, intValue: scala.Double, name: java.lang.String, scope: java.lang.String): BuildMetric = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("date")(date)
    __obj.updateDynamic("intValue")(intValue)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[BuildMetric]
  }
}

