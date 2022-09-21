package typings.uint8arrays

import typings.uint8arrays.uint8arraysNumbers.`-1`
import typings.uint8arrays.uint8arraysNumbers.`0`
import typings.uint8arrays.uint8arraysNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compareMod {
  
  @JSImport("uint8arrays/types/src/compare", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compare(a: js.typedarray.Uint8Array, b: js.typedarray.Uint8Array): `0` | `1` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[`0` | `1` | `-1`]
}
