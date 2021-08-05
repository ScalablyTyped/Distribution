package typings.stylableJest

import typings.stylableJest.anon.Instrument
import typings.stylableJest.anon.PartialOptions
import typings.stylableJest.anon.PartialStylableConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@stylable/jest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCacheKey(fileData: String, filename: String, configString: String, hasInstrument: Instrument): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getCacheKey")(fileData.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], configString.asInstanceOf[js.Any], hasInstrument.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def process(source: String, path: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("process")(source.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def processFactory(): js.Function2[/* source */ String, /* path */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("processFactory")().asInstanceOf[js.Function2[/* source */ String, /* path */ String, String]]
  inline def processFactory(stylableConfig: Unit, factoryOptions: PartialOptions): js.Function2[/* source */ String, /* path */ String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("processFactory")(stylableConfig.asInstanceOf[js.Any], factoryOptions.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* source */ String, /* path */ String, String]]
  inline def processFactory(stylableConfig: PartialStylableConfig): js.Function2[/* source */ String, /* path */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("processFactory")(stylableConfig.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* source */ String, /* path */ String, String]]
  inline def processFactory(stylableConfig: PartialStylableConfig, factoryOptions: PartialOptions): js.Function2[/* source */ String, /* path */ String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("processFactory")(stylableConfig.asInstanceOf[js.Any], factoryOptions.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* source */ String, /* path */ String, String]]
}
