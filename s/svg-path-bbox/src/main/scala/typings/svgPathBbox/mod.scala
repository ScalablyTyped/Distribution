package typings.svgPathBbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("svg-path-bbox", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(d: String): BBox = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(d.asInstanceOf[js.Any]).asInstanceOf[BBox]
  
  type BBox = js.Tuple4[/* minX */ Double, /* minY */ Double, /* maxX */ Double, /* maxY */ Double]
}
