package typings.textdiffCreate

import typings.textdiffCreate.textdiffCreateInts.`-1`
import typings.textdiffCreate.textdiffCreateInts.`0`
import typings.textdiffCreate.textdiffCreateInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(v1: String, v2: String): js.Array[Change] = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Change]]
  
  @JSImport("textdiff-create", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Change = js.Tuple2[`1` | `0` | `-1`, Double | String]
}
