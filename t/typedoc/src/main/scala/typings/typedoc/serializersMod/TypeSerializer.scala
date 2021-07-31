package typings.typedoc.serializersMod

import typings.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization/serializers", "TypeSerializer")
@js.native
class TypeSerializer protected ()
  extends typings.typedoc.serializersTypesMod.TypeSerializer {
  def this(owner: Serializer) = this()
}
/* static members */
object TypeSerializer {
  
  @JSImport("typedoc/dist/lib/serialization/serializers", "TypeSerializer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("typedoc/dist/lib/serialization/serializers", "TypeSerializer.PRIORITY")
  @js.native
  def PRIORITY: Double = js.native
  @scala.inline
  def PRIORITY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIORITY")(x.asInstanceOf[js.Any])
}
