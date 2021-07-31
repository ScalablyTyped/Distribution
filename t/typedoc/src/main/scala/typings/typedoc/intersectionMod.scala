package typings.typedoc

import typings.typedoc.typesAbstractMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object intersectionMod {
  
  @JSImport("typedoc/dist/lib/models/types/intersection", "IntersectionType")
  @js.native
  class IntersectionType protected () extends Type {
    def this(types: js.Array[Type]) = this()
    
    def equals(`type`: IntersectionType): Boolean = js.native
    
    var types: js.Array[Type] = js.native
  }
}
