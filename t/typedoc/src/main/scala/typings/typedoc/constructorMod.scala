package typings.typedoc

import typings.typedoc.componentsMod.ConverterNodeComponent
import typings.typescript.mod.ConstructorDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/nodes/constructor", JSImport.Namespace)
@js.native
object constructorMod extends js.Object {
  
  @js.native
  class ConstructorConverter () extends ConverterNodeComponent[ConstructorDeclaration] {
    
    var addParameterProperty: js.Any = js.native
  }
}
