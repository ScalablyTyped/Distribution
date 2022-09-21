package typings.typedoc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "Application")
@js.native
/**
  * Create a new TypeDoc application instance.
  *
  * @param options An object containing the options that should be used.
  */
open class Application ()
  extends typings.typedoc.applicationMod.Application
/* static members */
object Application {
  
  @JSImport("typedoc", "Application")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Emitted after plugins have been loaded and options have been read, but before they have been frozen.
    * The listener will be given an instance of {@link Application} and the {@link TypeDocOptions | Partial<TypeDocOptions>}
    * passed to `bootstrap`.
    */
  @JSImport("typedoc", "Application.EVENT_BOOTSTRAP_END")
  @js.native
  val EVENT_BOOTSTRAP_END: String = js.native
  
  /**
    * The version number of TypeDoc.
    */
  @JSImport("typedoc", "Application.VERSION")
  @js.native
  def VERSION: String = js.native
  inline def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
}
