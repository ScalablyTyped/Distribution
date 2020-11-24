package typings.yadda

import typings.yadda.featureFileParserMod.^
import typings.yadda.featureParserMod.Options
import typings.yadda.languageMod.Library
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yadda/lib/parsers", JSImport.Namespace)
@js.native
object parsersMod extends js.Object {
  
  @js.native
  class FeatureFileParser () extends ^ {
    def this(language: typings.yadda.languageMod.^[Library]) = this()
    def this(options: Options) = this()
  }
  
  @js.native
  class FeatureParser ()
    extends typings.yadda.featureParserMod.^ {
    def this(language: typings.yadda.languageMod.^[Library]) = this()
    def this(options: Options) = this()
  }
  
  @js.native
  class StepParser ()
    extends typings.yadda.stepParserMod.^
}
