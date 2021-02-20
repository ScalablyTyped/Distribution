package typings.typedoc

import typings.typedoc.reflectionsDeclarationMod.DeclarationReflection
import typings.typedoc.typesAbstractMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reflectionMod {
  
  @JSImport("typedoc/dist/lib/models/types/reflection", "ReflectionType")
  @js.native
  class ReflectionType protected () extends Type {
    def this(declaration: DeclarationReflection) = this()
    
    var declaration: DeclarationReflection = js.native
    
    def equals(`type`: ReflectionType): Boolean = js.native
  }
}
