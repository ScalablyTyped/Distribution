package typings.workboxPrecaching

import typings.std.Generator
import typings.workboxPrecaching.typesMod.PrecacheRouteOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsGenerateURLVariationsMod {
  
  @JSImport("workbox-precaching/utils/generateURLVariations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateURLVariations(url: String): Generator[String, Unit, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateURLVariations")(url.asInstanceOf[js.Any]).asInstanceOf[Generator[String, Unit, Any]]
  inline def generateURLVariations(url: String, param1: PrecacheRouteOptions): Generator[String, Unit, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateURLVariations")(url.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Generator[String, Unit, Any]]
}
