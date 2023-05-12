package typings.three

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExtrasEarcutMod {
  
  object Earcut {
    
    @JSImport("three/src/extras/Earcut", "Earcut")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Triangulates the given shape definition by returning an array of triangles
      * @remarks
      * A triangle is defined by three consecutive integers representing vertex indices.
      */
    inline def triangulate(data: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("triangulate")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
    inline def triangulate(data: js.Array[Double], holeIndices: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("triangulate")(data.asInstanceOf[js.Any], holeIndices.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def triangulate(data: js.Array[Double], holeIndices: js.Array[Double], dim: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("triangulate")(data.asInstanceOf[js.Any], holeIndices.asInstanceOf[js.Any], dim.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def triangulate(data: js.Array[Double], holeIndices: Unit, dim: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("triangulate")(data.asInstanceOf[js.Any], holeIndices.asInstanceOf[js.Any], dim.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  }
}
