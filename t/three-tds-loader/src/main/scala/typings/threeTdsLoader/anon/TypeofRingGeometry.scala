package typings.threeTdsLoader.anon

import org.scalablytyped.runtime.Instantiable6
import typings.three.mod.RingGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofRingGeometry
  extends StObject
     with Instantiable6[
      /* innerRadius */ js.UndefOr[Double], 
      /* outerRadius */ js.UndefOr[Double], 
      /* thetaSegments */ js.UndefOr[Double], 
      /* phiSegments */ js.UndefOr[Double], 
      /* thetaStart */ js.UndefOr[Double], 
      /* thetaLength */ js.UndefOr[Double], 
      RingGeometry
    ] {
  
  /** @internal */
  def fromJSON(data: js.Object): typings.three.srcGeometriesRingGeometryMod.RingGeometry = js.native
}
