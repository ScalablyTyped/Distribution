package typings
package yaddaLib.yaddaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yadda", "parsers")
@js.native
object parsersNs extends js.Object {
  @js.native
  class FeatureFileParser ()
    extends yaddaLib.libMod.parsersNs.FeatureFileParser {
    def this(language: yaddaLib.libLocalisationLanguageMod.^[yaddaLib.libLocalisationLanguageMod.Library]) = this()
    def this(options: yaddaLib.libParsersFeatureParserMod.Options) = this()
  }
  
  @js.native
  class FeatureParser ()
    extends yaddaLib.libMod.parsersNs.FeatureParser {
    def this(language: yaddaLib.libLocalisationLanguageMod.^[yaddaLib.libLocalisationLanguageMod.Library]) = this()
    def this(options: yaddaLib.libParsersFeatureParserMod.Options) = this()
  }
  
  @js.native
  class StepParser ()
    extends yaddaLib.libMod.parsersNs.StepParser
  
}

