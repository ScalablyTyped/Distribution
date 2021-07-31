package typings.typedoc

import typings.typedoc.abstractMod.Reflection
import typings.typedoc.typesAbstractMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelsTypesReferenceMod {
  
  @JSImport("typedoc/dist/lib/models/types/reference", "ReferenceType")
  @js.native
  class ReferenceType protected () extends Type {
    def this(name: String, symbolFQN: String) = this()
    def this(name: String, symbolFQN: String, reflection: Reflection) = this()
    
    def equals(other: ReferenceType): Boolean = js.native
    
    var name: String = js.native
    
    var reflection: js.UndefOr[Reflection] = js.native
    
    var symbolFullyQualifiedName: String = js.native
    
    var typeArguments: js.UndefOr[js.Array[Type]] = js.native
  }
  /* static members */
  object ReferenceType {
    
    @JSImport("typedoc/dist/lib/models/types/reference", "ReferenceType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/models/types/reference", "ReferenceType.SYMBOL_FQN_RESOLVED")
    @js.native
    def SYMBOL_FQN_RESOLVED: String = js.native
    @scala.inline
    def SYMBOL_FQN_RESOLVED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SYMBOL_FQN_RESOLVED")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/models/types/reference", "ReferenceType.SYMBOL_FQN_RESOLVE_BY_NAME")
    @js.native
    def SYMBOL_FQN_RESOLVE_BY_NAME: String = js.native
    @scala.inline
    def SYMBOL_FQN_RESOLVE_BY_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SYMBOL_FQN_RESOLVE_BY_NAME")(x.asInstanceOf[js.Any])
  }
}
