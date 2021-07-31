package typings.typedoc

import typings.typedoc.fileMod.SourceReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceReferenceWrapperMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/models/source-reference-wrapper", "SourceReferenceWrapper")
  @js.native
  class SourceReferenceWrapper protected () extends StObject {
    def this(sourceReference: SourceReference) = this()
    
    var sourceReference: SourceReference = js.native
  }
}
