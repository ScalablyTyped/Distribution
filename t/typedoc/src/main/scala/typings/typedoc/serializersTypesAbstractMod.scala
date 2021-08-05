package typings.typedoc

import typings.typedoc.modelsMod.Type
import typings.typedoc.serializationComponentsMod.TypeSerializerComponent
import typings.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersTypesAbstractMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types/abstract", "TypeSerializer")
  @js.native
  class TypeSerializer protected () extends TypeSerializerComponent[Type] {
    def this(owner: Serializer) = this()
  }
  /* static members */
  object TypeSerializer {
    
    @JSImport("typedoc/dist/lib/serialization/serializers/types/abstract", "TypeSerializer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/serialization/serializers/types/abstract", "TypeSerializer.PRIORITY")
    @js.native
    def PRIORITY: Double = js.native
    inline def PRIORITY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIORITY")(x.asInstanceOf[js.Any])
  }
}
