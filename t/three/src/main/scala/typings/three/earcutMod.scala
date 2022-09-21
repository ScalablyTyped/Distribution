package typings.three

import typings.three.threeMod.Triangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object earcutMod {
  
  object Earcut {
    
    @JSImport("three/src/extras/Earcut", "Earcut")
    @js.native
    val ^ : js.Any = js.native
    
    inline def triangulate(data: js.Array[Double], holeIndices: js.Array[Double], dim: Double): js.Array[Triangle] = (^.asInstanceOf[js.Dynamic].applyDynamic("triangulate")(data.asInstanceOf[js.Any], holeIndices.asInstanceOf[js.Any], dim.asInstanceOf[js.Any])).asInstanceOf[js.Array[Triangle]]
  }
}
