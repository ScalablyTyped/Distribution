package typings
package threeLib.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "SphereGeometry")
@js.native
class SphereGeometry protected ()
  extends threeLib.threeDashCoreMod.SphereGeometry {
  /**
    * The geometry is created by sweeping and calculating vertexes around the Y axis (horizontal sweep) and the Z axis (vertical sweep). Thus, incomplete spheres (akin to 'sphere slices') can be created through the use of different values of phiStart, phiLength, thetaStart and thetaLength, in order to define the points in which we start (or end) calculating those vertices.
    *
    * @param radius — sphere radius. Default is 50.
    * @param widthSegments — number of horizontal segments. Minimum value is 3, and the default is 8.
    * @param heightSegments — number of vertical segments. Minimum value is 2, and the default is 6.
    * @param phiStart — specify horizontal starting angle. Default is 0.
    * @param phiLength — specify horizontal sweep angle size. Default is Math.PI * 2.
    * @param thetaStart — specify vertical starting angle. Default is 0.
    * @param thetaLength — specify vertical sweep angle size. Default is Math.PI.
    */
  def this(radius: js.UndefOr[scala.Double], widthSegments: js.UndefOr[scala.Double], heightSegments: js.UndefOr[scala.Double], phiStart: js.UndefOr[scala.Double], phiLength: js.UndefOr[scala.Double], thetaStart: js.UndefOr[scala.Double], thetaLength: js.UndefOr[scala.Double]) = this()
}

