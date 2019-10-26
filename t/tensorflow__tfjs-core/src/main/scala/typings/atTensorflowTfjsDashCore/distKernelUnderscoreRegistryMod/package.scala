package typings.atTensorflowTfjsDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distKernelUnderscoreRegistryMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.atTensorflowTfjsDashCore.Anon_Attrs

  type Attribute = Double | (js.Array[Boolean | Double | String]) | Boolean | String
  type DataId = js.Object
  type KernelDisposeFunc = KernelSetupFunc
  type KernelFunc = js.Function1[/* params */ Anon_Attrs, TensorInfo | js.Array[TensorInfo]]
  type KernelSetupFunc = js.Function1[/* backend */ js.Object, Unit]
  type NamedAttrMap = StringDictionary[Attribute]
  type NamedTensorInfoMap = StringDictionary[TensorInfo]
}
