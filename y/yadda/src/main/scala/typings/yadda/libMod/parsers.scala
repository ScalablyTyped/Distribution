package typings.yadda.libMod

import typings.yadda.featureParserMod.Options
import typings.yadda.languageMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yadda/lib", "parsers")
@js.native
object parsers extends js.Object {
  
  @js.native
  class FeatureFileParser ()
    extends typings.yadda.parsersMod.FeatureFileParser {
    def this(language: ^[typings.yadda.languageMod.Library]) = this()
    def this(options: Options) = this()
  }
  
  @js.native
  class FeatureParser ()
    extends typings.yadda.parsersMod.FeatureParser {
    def this(language: ^[typings.yadda.languageMod.Library]) = this()
    def this(options: Options) = this()
  }
  
  @js.native
  class StepParser ()
    extends typings.yadda.parsersMod.StepParser
}
