package typings.typedoc

import typings.typedoc.modelsTypesReferenceMod.ReferenceType
import typings.typedoc.typesAbstractMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/types/query", JSImport.Namespace)
@js.native
object typesQueryMod extends js.Object {
  @js.native
  class QueryType protected () extends Type {
    def this(reference: ReferenceType) = this()
    val queryType: ReferenceType = js.native
  }
  
}

