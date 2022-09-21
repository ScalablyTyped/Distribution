package typings.typeformEmbed

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object initializeMod {
  
  @JSImport("@typeform/embed/types/initializers/initialize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def initialize(
    embedElementAttribute: String,
    cssFilename: String,
    forceReload: Boolean,
    factoryMethod: js.Function3[/* id */ String, /* options */ Any, /* element */ HTMLElement, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(embedElementAttribute.asInstanceOf[js.Any], cssFilename.asInstanceOf[js.Any], forceReload.asInstanceOf[js.Any], factoryMethod.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def initialize(
    embedElementAttribute: String,
    cssFilename: String,
    forceReload: Unit,
    factoryMethod: js.Function3[/* id */ String, /* options */ Any, /* element */ HTMLElement, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(embedElementAttribute.asInstanceOf[js.Any], cssFilename.asInstanceOf[js.Any], forceReload.asInstanceOf[js.Any], factoryMethod.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
