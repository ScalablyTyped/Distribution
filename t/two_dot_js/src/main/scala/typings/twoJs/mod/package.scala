package typings.twoJs.mod

import typings.std.Float32ArrayConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* static member */
inline def Array: Float32ArrayConstructor | (/* import warning: importer.ImportType#apply Failed type conversion: typeof Float32Array */ js.Any) = ^.asInstanceOf[js.Dynamic].selectDynamic("Array").asInstanceOf[Float32ArrayConstructor | (/* import warning: importer.ImportType#apply Failed type conversion: typeof Float32Array */ js.Any)]
inline def Array_=(
  x: Float32ArrayConstructor | (/* import warning: importer.ImportType#apply Failed type conversion: typeof Float32Array */ js.Any)
): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Array")(x.asInstanceOf[js.Any])

inline def Instances: js.Array[Two] = ^.asInstanceOf[js.Dynamic].selectDynamic("Instances").asInstanceOf[js.Array[Two]]

inline def Properties: js.Array[Any] = ^.asInstanceOf[js.Dynamic].selectDynamic("Properties").asInstanceOf[js.Array[Any]]

inline def Resolution: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("Resolution").asInstanceOf[Double]

inline def noConflict(): Two = ^.asInstanceOf[js.Dynamic].applyDynamic("noConflict")().asInstanceOf[Two]

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typings.twoJs.mod.LinearGradient
  - typings.twoJs.mod.RadialGradient
*/
type Color = _Color | String

type _Object = Object
