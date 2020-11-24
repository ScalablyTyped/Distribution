package typings.typedoc

import typings.typedoc.componentsMod.ConverterNodeComponent
import typings.typescript.mod.SignatureDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/nodes/accessor", JSImport.Namespace)
@js.native
object accessorMod extends js.Object {
  
  @js.native
  class AccessorConverter () extends ConverterNodeComponent[SignatureDeclaration]
}
