package typings.yadda

import typings.yadda.libLocalisationLanguageMod.Library
import typings.yadda.libParsersFeatureFileParserMod.^
import typings.yadda.libParsersFeatureParserMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yadda/lib/parsers", JSImport.Namespace)
@js.native
object libParsersMod extends js.Object {
  @js.native
  class FeatureFileParser () extends ^ {
    def this(language: typings.yadda.libLocalisationLanguageMod.^[Library]) = this()
    def this(options: Options) = this()
  }
  
  @js.native
  class FeatureParser ()
    extends typings.yadda.libParsersFeatureParserMod.^ {
    def this(language: typings.yadda.libLocalisationLanguageMod.^[Library]) = this()
    def this(options: Options) = this()
  }
  
  @js.native
  class StepParser ()
    extends typings.yadda.libParsersStepParserMod.^
  
}

