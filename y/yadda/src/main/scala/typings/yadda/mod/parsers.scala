package typings.yadda.mod

import typings.yadda.featureParserMod.Options
import typings.yadda.languageMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yadda", "parsers")
@js.native
object parsers extends js.Object {
  @js.native
  class FeatureFileParser ()
    extends typings.yadda.libMod.parsers.FeatureFileParser {
    def this(language: ^[typings.yadda.languageMod.Library]) = this()
    def this(options: Options) = this()
  }
  
  @js.native
  class FeatureParser ()
    extends typings.yadda.libMod.parsers.FeatureParser {
    def this(language: ^[typings.yadda.languageMod.Library]) = this()
    def this(options: Options) = this()
  }
  
  @js.native
  class StepParser ()
    extends typings.yadda.libMod.parsers.StepParser
  
}

