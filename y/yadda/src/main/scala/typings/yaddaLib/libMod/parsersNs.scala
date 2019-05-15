package typings
package yaddaLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yadda/lib", "parsers")
@js.native
object parsersNs extends js.Object {
  @js.native
  class FeatureFileParser ()
    extends yaddaLib.libParsersMod.FeatureFileParser {
    def this(language: yaddaLib.libLocalisationLanguageMod.^[yaddaLib.libLocalisationLanguageMod.Library]) = this()
    def this(options: yaddaLib.libParsersFeatureParserMod.Options) = this()
  }
  
  @js.native
  class FeatureParser ()
    extends yaddaLib.libParsersMod.FeatureParser {
    def this(language: yaddaLib.libLocalisationLanguageMod.^[yaddaLib.libLocalisationLanguageMod.Library]) = this()
    def this(options: yaddaLib.libParsersFeatureParserMod.Options) = this()
  }
  
  @js.native
  class StepParser ()
    extends yaddaLib.libParsersMod.StepParser
  
}

