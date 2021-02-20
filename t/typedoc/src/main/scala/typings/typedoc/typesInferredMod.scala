package typings.typedoc

import typings.typedoc.typesAbstractMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInferredMod {
  
  @JSImport("typedoc/dist/lib/models/types/inferred", "InferredType")
  @js.native
  class InferredType protected () extends Type {
    def this(name: String) = this()
    
    def equals(`type`: js.Any): Boolean = js.native
    
    var name: String = js.native
  }
}
