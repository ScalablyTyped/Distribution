package typings.typedoc

import typings.typedoc.componentsMod.TypeNodeConverter
import typings.typedoc.contextMod.Context
import typings.typedoc.modelsTypesMod.Type
import typings.typescript.mod.TypeReference
import typings.typescript.mod.TypeReferenceNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/converter/types/reference", JSImport.Namespace)
@js.native
object typesReferenceMod extends js.Object {
  
  @js.native
  class ReferenceConverter () extends TypeNodeConverter[TypeReference, TypeReferenceNode] {
    
    var convertLiteral: js.Any = js.native
    
    def convertType(context: Context, `type`: TypeReference): js.UndefOr[Type] = js.native
    
    def supportsType(context: Context, `type`: TypeReference): Boolean = js.native
  }
}
