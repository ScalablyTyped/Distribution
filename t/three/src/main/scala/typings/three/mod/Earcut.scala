package typings.three.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Earcut {
  
  @JSImport("three", "Earcut")
  @js.native
  val ^ : js.Any = js.native
  
  inline def triangulate(data: js.Array[Double], holeIndices: js.Array[Double], dim: Double): js.Array[typings.three.threeMod.Triangle] = (^.asInstanceOf[js.Dynamic].applyDynamic("triangulate")(data.asInstanceOf[js.Any], holeIndices.asInstanceOf[js.Any], dim.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.three.threeMod.Triangle]]
}
