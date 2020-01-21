package typings.typedoc

import typings.typedoc.componentsMod.TypeNodeConverter
import typings.typescript.mod.BindingPattern
import typings.typescript.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types/binding-object", JSImport.Namespace)
@js.native
object bindingObjectMod extends js.Object {
  @js.native
  class BindingObjectConverter () extends TypeNodeConverter[Type, BindingPattern]
  
}

