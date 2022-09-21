package typings.three.threeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GeometryUtils {
  
  @JSImport("three/src/Three", "GeometryUtils")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @deprecated Use {@link Geometry#center geometry.center()} instead.
    */
  inline def center(geometry: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("center")(geometry.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * @deprecated Use {@link Geometry#merge geometry.merge( geometry2, matrix, materialIndexOffset )} instead.
    */
  inline def merge(geometry1: Any, geometry2: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(geometry1.asInstanceOf[js.Any], geometry2.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def merge(geometry1: Any, geometry2: Any, materialIndexOffset: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(geometry1.asInstanceOf[js.Any], geometry2.asInstanceOf[js.Any], materialIndexOffset.asInstanceOf[js.Any])).asInstanceOf[Any]
}
