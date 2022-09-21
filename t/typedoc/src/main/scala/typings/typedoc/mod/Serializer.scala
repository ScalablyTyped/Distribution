package typings.typedoc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "Serializer")
@js.native
open class Serializer ()
  extends typings.typedoc.serializationMod.Serializer
/* static members */
object Serializer {
  
  @JSImport("typedoc", "Serializer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Triggered when the {@link Serializer} begins transforming a project.
    * @event EVENT_BEGIN
    */
  @JSImport("typedoc", "Serializer.EVENT_BEGIN")
  @js.native
  def EVENT_BEGIN: String = js.native
  inline def EVENT_BEGIN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_BEGIN")(x.asInstanceOf[js.Any])
  
  /**
    * Triggered when the {@link Serializer} has finished transforming a project.
    * @event EVENT_END
    */
  @JSImport("typedoc", "Serializer.EVENT_END")
  @js.native
  def EVENT_END: String = js.native
  inline def EVENT_END_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_END")(x.asInstanceOf[js.Any])
}
