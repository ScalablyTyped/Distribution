package typings.typedoc

import typings.typedoc.componentsMod.TypeTypeConverter
import typings.typescript.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/intrinsic", JSImport.Namespace)
@js.native
object intrinsicMod extends js.Object {
  @js.native
  class IntrinsicConverter () extends TypeTypeConverter[Type]
  
}

