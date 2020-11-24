package typings.typedoc

import typings.typedoc.abstractMod.Decorator
import typings.typedoc.fileMod.SourceReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization/serializers/models", JSImport.Namespace)
@js.native
object serializersModelsMod extends js.Object {
  
  @js.native
  class DecoratorWrapper protected ()
    extends typings.typedoc.decoratorWrapperMod.DecoratorWrapper {
    def this(decorator: Decorator) = this()
  }
  
  @js.native
  class SourceReferenceWrapper protected ()
    extends typings.typedoc.sourceReferenceWrapperMod.SourceReferenceWrapper {
    def this(sourceReference: SourceReference) = this()
  }
}
