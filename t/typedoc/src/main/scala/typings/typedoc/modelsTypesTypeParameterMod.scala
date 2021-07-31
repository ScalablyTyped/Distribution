package typings.typedoc

import typings.typedoc.typesAbstractMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelsTypesTypeParameterMod {
  
  @JSImport("typedoc/dist/lib/models/types/type-parameter", "TypeParameterType")
  @js.native
  class TypeParameterType protected () extends Type {
    def this(name: String) = this()
    
    var default: js.UndefOr[Type] = js.native
    
    var constraint: js.UndefOr[Type] = js.native
    
    def equals(`type`: TypeParameterType): Boolean = js.native
    
    val name: String = js.native
  }
}
