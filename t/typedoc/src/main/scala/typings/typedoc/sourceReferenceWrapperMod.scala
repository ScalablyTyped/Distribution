package typings.typedoc

import typings.typedoc.fileMod.SourceReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization/serializers/models/source-reference-wrapper", JSImport.Namespace)
@js.native
object sourceReferenceWrapperMod extends js.Object {
  
  @js.native
  class SourceReferenceWrapper protected () extends js.Object {
    def this(sourceReference: SourceReference) = this()
    
    var sourceReference: SourceReference = js.native
  }
}
