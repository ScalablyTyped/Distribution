package typings.typedoc

import typings.typedoc.typesAbstractMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/types/inferred", JSImport.Namespace)
@js.native
object typesInferredMod extends js.Object {
  @js.native
  class InferredType protected () extends Type {
    def this(name: String) = this()
    var name: String = js.native
    def equals(`type`: js.Any): Boolean = js.native
  }
  
}

