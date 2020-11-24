package typings.typedoc

import typings.typedoc.componentsMod.ConverterNodeComponent
import typings.typescript.mod.InterfaceDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/nodes/interface", JSImport.Namespace)
@js.native
object interfaceMod extends js.Object {
  
  @js.native
  class InterfaceConverter () extends ConverterNodeComponent[InterfaceDeclaration]
}
