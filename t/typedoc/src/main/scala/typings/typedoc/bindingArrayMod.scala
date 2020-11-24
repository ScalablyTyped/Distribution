package typings.typedoc

import typings.typedoc.componentsMod.TypeNodeConverter
import typings.typescript.mod.BindingPattern
import typings.typescript.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/types/binding-array", JSImport.Namespace)
@js.native
object bindingArrayMod extends js.Object {
  
  @js.native
  class BindingArrayConverter () extends TypeNodeConverter[Type, BindingPattern]
}
