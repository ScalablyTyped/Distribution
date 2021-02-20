package typings.twoJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /* static member */
  @scala.inline
  def Array: typings.std.Float32ArrayConstructor | (/* import warning: importer.ImportType#apply Failed type conversion: typeof Float32Array */ js.Any) = typings.twoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Array").asInstanceOf[typings.std.Float32ArrayConstructor | (/* import warning: importer.ImportType#apply Failed type conversion: typeof Float32Array */ js.Any)]
  @scala.inline
  def Array_=(
    x: typings.std.Float32ArrayConstructor | (/* import warning: importer.ImportType#apply Failed type conversion: typeof Float32Array */ js.Any)
  ): scala.Unit = typings.twoJs.mod.^.asInstanceOf[js.Dynamic].updateDynamic("Array")(x.asInstanceOf[js.Any])
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.twoJs.mod.LinearGradient
    - typings.twoJs.mod.RadialGradient
  */
  type Color = typings.twoJs.mod._Color | java.lang.String
  
  @scala.inline
  def Instances: js.Array[typings.twoJs.mod.Two] = typings.twoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Instances").asInstanceOf[js.Array[typings.twoJs.mod.Two]]
  
  @scala.inline
  def Properties: js.Array[js.Any] = typings.twoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Properties").asInstanceOf[js.Array[js.Any]]
  
  @scala.inline
  def Resolution: scala.Double = typings.twoJs.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Resolution").asInstanceOf[scala.Double]
  
  type _Object = typings.twoJs.mod.Object
  
  @scala.inline
  def noConflict(): typings.twoJs.mod.Two = typings.twoJs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("noConflict")().asInstanceOf[typings.twoJs.mod.Two]
}
