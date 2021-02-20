package typings.typedoc

import typings.typedoc.typesAbstractMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unionMod {
  
  @JSImport("typedoc/dist/lib/models/types/union", "UnionType")
  @js.native
  class UnionType protected () extends Type {
    def this(types: js.Array[Type]) = this()
    
    def equals(`type`: UnionType): Boolean = js.native
    
    var types: js.Array[Type] = js.native
  }
}
