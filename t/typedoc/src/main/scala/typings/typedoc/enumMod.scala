package typings.typedoc

import typings.typedoc.componentsMod.ConverterNodeComponent
import typings.typescript.mod.EnumDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/nodes/enum", JSImport.Namespace)
@js.native
object enumMod extends js.Object {
  
  @js.native
  class EnumConverter () extends ConverterNodeComponent[EnumDeclaration] {
    
    var convertMember: js.Any = js.native
  }
}
