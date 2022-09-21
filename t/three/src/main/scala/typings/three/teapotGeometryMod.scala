package typings.three

import typings.three.threeMod.BufferGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object teapotGeometryMod {
  
  @JSImport("three/examples/jsm/geometries/TeapotGeometry", "TeapotGeometry")
  @js.native
  open class TeapotGeometry protected () extends BufferGeometry {
    def this(
      size: js.UndefOr[Double],
      segments: js.UndefOr[Double],
      bottom: js.UndefOr[Boolean],
      lid: js.UndefOr[Boolean],
      body: js.UndefOr[Boolean],
      fitLid: js.UndefOr[Boolean],
      blinn: js.UndefOr[Double]
    ) = this()
  }
}
