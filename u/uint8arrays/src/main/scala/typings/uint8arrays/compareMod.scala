package typings.uint8arrays

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object compareMod {
  
  @JSImport("uint8arrays/compare", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compare(a: js.typedarray.Uint8Array, b: js.typedarray.Uint8Array): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
}
