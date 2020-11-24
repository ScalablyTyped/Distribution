package typings.typedoc

import typings.typedoc.reflectionsDeclarationMod.DeclarationReflection
import typings.typedoc.typesAbstractMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/models/types/reflection", JSImport.Namespace)
@js.native
object reflectionMod extends js.Object {
  
  @js.native
  class ReflectionType protected () extends Type {
    def this(declaration: DeclarationReflection) = this()
    
    var declaration: DeclarationReflection = js.native
    
    def equals(`type`: ReflectionType): Boolean = js.native
  }
}
