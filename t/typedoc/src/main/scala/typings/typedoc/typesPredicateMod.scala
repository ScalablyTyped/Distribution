package typings.typedoc

import typings.typedoc.typesAbstractMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPredicateMod {
  
  @JSImport("typedoc/dist/lib/models/types/predicate", "PredicateType")
  @js.native
  class PredicateType protected () extends Type {
    def this(name: String, asserts: Boolean) = this()
    def this(name: String, asserts: Boolean, targetType: Type) = this()
    
    var asserts: Boolean = js.native
    
    var name: String = js.native
    
    var targetType: js.UndefOr[Type] = js.native
  }
}
