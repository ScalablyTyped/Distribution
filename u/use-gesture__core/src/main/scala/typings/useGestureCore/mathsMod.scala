package typings.useGestureCore

import typings.useGestureCore.utilsMod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mathsMod {
  
  @JSImport("@use-gesture/core/dist/declarations/src/utils/maths", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object V {
    
    @JSImport("@use-gesture/core/dist/declarations/src/utils/maths", "V")
    @js.native
    val ^ : js.Any = js.native
    
    inline def add(v1: Vector2, v2: Vector2): Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Vector2]
    
    inline def addTo(v1: Vector2, v2: Vector2): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addTo")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def sub(v1: Vector2, v2: Vector2): Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("sub")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Vector2]
    
    inline def subTo(v1: Vector2, v2: Vector2): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("subTo")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def toVector[T](): js.Tuple2[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toVector")().asInstanceOf[js.Tuple2[T, T]]
    inline def toVector[T](v: T): js.Tuple2[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toVector")(v.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[T, T]]
    inline def toVector[T](v: T, fallback: T): js.Tuple2[T, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toVector")(v.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[T, T]]
    inline def toVector[T](v: T, fallback: js.Tuple2[T, T]): js.Tuple2[T, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toVector")(v.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[T, T]]
    inline def toVector[T](v: js.Tuple2[T, T]): js.Tuple2[T, T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toVector")(v.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[T, T]]
    inline def toVector[T](v: js.Tuple2[T, T], fallback: T): js.Tuple2[T, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toVector")(v.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[T, T]]
    inline def toVector[T](v: js.Tuple2[T, T], fallback: js.Tuple2[T, T]): js.Tuple2[T, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toVector")(v.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[T, T]]
    inline def toVector[T](v: Unit, fallback: T): js.Tuple2[T, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toVector")(v.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[T, T]]
    inline def toVector[T](v: Unit, fallback: js.Tuple2[T, T]): js.Tuple2[T, T] = (^.asInstanceOf[js.Dynamic].applyDynamic("toVector")(v.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[T, T]]
  }
  
  inline def clamp(v: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(v.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def computeRubberband(bounds: js.Tuple2[Vector2, Vector2], hasVxVy: Vector2, hasRxRy: Vector2): Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeRubberband")(bounds.asInstanceOf[js.Any], hasVxVy.asInstanceOf[js.Any], hasRxRy.asInstanceOf[js.Any])).asInstanceOf[Vector2]
  
  inline def rubberbandIfOutOfBounds(position: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rubberbandIfOutOfBounds")(position.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def rubberbandIfOutOfBounds(position: Double, min: Double, max: Double, constant: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rubberbandIfOutOfBounds")(position.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], constant.asInstanceOf[js.Any])).asInstanceOf[Double]
}
