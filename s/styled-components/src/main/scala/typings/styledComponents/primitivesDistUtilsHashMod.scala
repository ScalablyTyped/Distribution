package typings.styledComponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object primitivesDistUtilsHashMod {
  
  @JSImport("styled-components/primitives/dist/utils/hash", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("styled-components/primitives/dist/utils/hash", "SEED")
  @js.native
  val SEED: /* 5381 */ Double = js.native
  
  inline def hash(x: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hash")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def phash(h: Double, x: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("phash")(h.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Double]
}
