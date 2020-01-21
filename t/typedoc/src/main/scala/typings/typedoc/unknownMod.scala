package typings.typedoc

import typings.typedoc.componentsMod.TypeTypeConverter
import typings.typescript.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/unknown", JSImport.Namespace)
@js.native
object unknownMod extends js.Object {
  @js.native
  class UnknownConverter () extends TypeTypeConverter[Type]
  
}

