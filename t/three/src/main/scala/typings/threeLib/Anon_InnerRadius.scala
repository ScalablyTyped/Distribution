package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InnerRadius extends js.Object {
  var innerRadius: scala.Double
  var outerRadius: scala.Double
  var phiSegments: scala.Double
  var thetaLength: scala.Double
  var thetaSegments: scala.Double
  var thetaStart: scala.Double
}

object Anon_InnerRadius {
  @scala.inline
  def apply(
    innerRadius: scala.Double,
    outerRadius: scala.Double,
    phiSegments: scala.Double,
    thetaLength: scala.Double,
    thetaSegments: scala.Double,
    thetaStart: scala.Double
  ): Anon_InnerRadius = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("innerRadius")(innerRadius)
    __obj.updateDynamic("outerRadius")(outerRadius)
    __obj.updateDynamic("phiSegments")(phiSegments)
    __obj.updateDynamic("thetaLength")(thetaLength)
    __obj.updateDynamic("thetaSegments")(thetaSegments)
    __obj.updateDynamic("thetaStart")(thetaStart)
    __obj.asInstanceOf[Anon_InnerRadius]
  }
}

