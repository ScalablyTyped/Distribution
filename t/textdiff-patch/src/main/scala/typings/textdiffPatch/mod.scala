package typings.textdiffPatch

import typings.textdiffPatch.textdiffPatchInts.`-1`
import typings.textdiffPatch.textdiffPatchInts.`0`
import typings.textdiffPatch.textdiffPatchInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(v1: String, patch: js.Array[Change]): String = (^.asInstanceOf[js.Dynamic].apply(v1.asInstanceOf[js.Any], patch.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("textdiff-patch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Change = js.Tuple2[`1` | `0` | `-1`, Double | String]
}
