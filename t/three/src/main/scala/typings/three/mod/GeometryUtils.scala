package typings.three.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GeometryUtils {
  
  @JSImport("three", "GeometryUtils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def center(geometry: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("center")(geometry.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def merge(geometry1: js.Any, geometry2: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(geometry1.asInstanceOf[js.Any], geometry2.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def merge(geometry1: js.Any, geometry2: js.Any, materialIndexOffset: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(geometry1.asInstanceOf[js.Any], geometry2.asInstanceOf[js.Any], materialIndexOffset.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
