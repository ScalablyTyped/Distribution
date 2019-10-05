package typings.yadda.libMod

import typings.yadda.libLocalisationLanguageMod.^
import typings.yadda.libParsersFeatureParserMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yadda/lib", "parsers")
@js.native
object parsers extends js.Object {
  @js.native
  class FeatureFileParser ()
    extends typings.yadda.libParsersMod.FeatureFileParser {
    def this(language: ^[typings.yadda.libLocalisationLanguageMod.Library]) = this()
    def this(options: Options) = this()
  }
  
  @js.native
  class FeatureParser ()
    extends typings.yadda.libParsersMod.FeatureParser {
    def this(language: ^[typings.yadda.libLocalisationLanguageMod.Library]) = this()
    def this(options: Options) = this()
  }
  
  @js.native
  class StepParser ()
    extends typings.yadda.libParsersMod.StepParser
  
}

