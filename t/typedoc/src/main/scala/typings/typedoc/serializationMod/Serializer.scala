package typings.typedoc.serializationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/serialization", "Serializer")
@js.native
class Serializer ()
  extends typings.typedoc.serializerMod.Serializer
/* static members */
object Serializer {
  
  @JSImport("typedoc/dist/lib/serialization", "Serializer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("typedoc/dist/lib/serialization", "Serializer.EVENT_BEGIN")
  @js.native
  def EVENT_BEGIN: String = js.native
  inline def EVENT_BEGIN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_BEGIN")(x.asInstanceOf[js.Any])
  
  @JSImport("typedoc/dist/lib/serialization", "Serializer.EVENT_END")
  @js.native
  def EVENT_END: String = js.native
  inline def EVENT_END_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_END")(x.asInstanceOf[js.Any])
}
