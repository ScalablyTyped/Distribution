package typings.three

import typings.three.cylinderGeometryMod.CylinderBufferGeometry
import typings.three.cylinderGeometryMod.CylinderGeometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/geometries/ConeGeometry", JSImport.Namespace)
@js.native
object coneGeometryMod extends js.Object {
  @js.native
  class ConeBufferGeometry protected () extends CylinderBufferGeometry {
    def this(
      radius: js.UndefOr[Double],
      height: js.UndefOr[Double],
      radialSegment: js.UndefOr[Double],
      heightSegment: js.UndefOr[Double],
      openEnded: js.UndefOr[Boolean],
      thetaStart: js.UndefOr[Double],
      thetaLength: js.UndefOr[Double]
    ) = this()
  }
  
  @js.native
  class ConeGeometry protected () extends CylinderGeometry {
    def this(
      radius: js.UndefOr[Double],
      height: js.UndefOr[Double],
      radialSegment: js.UndefOr[Double],
      heightSegment: js.UndefOr[Double],
      openEnded: js.UndefOr[Boolean],
      thetaStart: js.UndefOr[Double],
      thetaLength: js.UndefOr[Double]
    ) = this()
  }
  
}

