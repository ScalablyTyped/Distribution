package typings.yargs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object levenshteinMod {
  
  @JSImport("yargs/build/lib/levenshtein", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def levenshtein(a: String, b: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("levenshtein")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
}
