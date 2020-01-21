package typings.typedoc

import typings.typedoc.componentsMod.TypeTypeConverter
import typings.typescript.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/enum", JSImport.Namespace)
@js.native
object typesEnumMod extends js.Object {
  @js.native
  class EnumConverter () extends TypeTypeConverter[Type]
  
}

