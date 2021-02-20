package typings.stylableJest

import typings.stylableJest.anon.Instrument
import typings.stylableJest.anon.PartialOptions
import typings.stylableJest.anon.PartialStylableConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jestMod {
  
  @JSImport("@stylable/jest/cjs/jest", "getCacheKey")
  @js.native
  def getCacheKey(fileData: String, filename: String, configString: String, hasInstrument: Instrument): String = js.native
  
  @JSImport("@stylable/jest/cjs/jest", "process")
  @js.native
  def process(source: String, path: String): String = js.native
  
  @JSImport("@stylable/jest/cjs/jest", "processFactory")
  @js.native
  def processFactory(): js.Function2[/* source */ String, /* path */ String, String] = js.native
  @JSImport("@stylable/jest/cjs/jest", "processFactory")
  @js.native
  def processFactory(stylableConfig: js.UndefOr[scala.Nothing], factoryOptions: PartialOptions): js.Function2[/* source */ String, /* path */ String, String] = js.native
  @JSImport("@stylable/jest/cjs/jest", "processFactory")
  @js.native
  def processFactory(stylableConfig: PartialStylableConfig): js.Function2[/* source */ String, /* path */ String, String] = js.native
  @JSImport("@stylable/jest/cjs/jest", "processFactory")
  @js.native
  def processFactory(stylableConfig: PartialStylableConfig, factoryOptions: PartialOptions): js.Function2[/* source */ String, /* path */ String, String] = js.native
}
