package typings.typedoc

import typings.typedoc.abstractMod.Decorator
import typings.typedoc.fileMod.SourceReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersModelsMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/models", "DecoratorWrapper")
  @js.native
  class DecoratorWrapper protected ()
    extends typings.typedoc.decoratorWrapperMod.DecoratorWrapper {
    def this(decorator: Decorator) = this()
  }
  
  @JSImport("typedoc/dist/lib/serialization/serializers/models", "SourceReferenceWrapper")
  @js.native
  class SourceReferenceWrapper protected ()
    extends typings.typedoc.sourceReferenceWrapperMod.SourceReferenceWrapper {
    def this(sourceReference: SourceReference) = this()
  }
}
