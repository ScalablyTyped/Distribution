package typings.three

import typings.three.srcCoreBufferGeometryMod.BufferGeometry
import typings.three.srcCoreGeometryMod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/geometries/TorusKnotGeometry", JSImport.Namespace)
@js.native
object srcGeometriesTorusKnotGeometryMod extends js.Object {
  @js.native
  class TorusKnotBufferGeometry protected () extends BufferGeometry {
    def this(
      radius: js.UndefOr[Double],
      tube: js.UndefOr[Double],
      tubularSegments: js.UndefOr[Double],
      radialSegments: js.UndefOr[Double],
      p: js.UndefOr[Double],
      q: js.UndefOr[Double]
    ) = this()
    var parameters: Anon_HeightScale = js.native
  }
  
  @js.native
  class TorusKnotGeometry protected () extends Geometry {
    def this(
      radius: js.UndefOr[Double],
      tube: js.UndefOr[Double],
      tubularSegments: js.UndefOr[Double],
      radialSegments: js.UndefOr[Double],
      p: js.UndefOr[Double],
      q: js.UndefOr[Double]
    ) = this()
    var parameters: Anon_HeightScale = js.native
  }
  
}

