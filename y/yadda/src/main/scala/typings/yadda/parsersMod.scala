package typings.yadda

import typings.yadda.featureFileParserMod.^
import typings.yadda.featureParserMod.Options
import typings.yadda.languageMod.Library
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parsersMod {
  
  @JSImport("yadda/lib/parsers", "FeatureFileParser")
  @js.native
  class FeatureFileParser () extends ^ {
    def this(language: typings.yadda.languageMod.^[Library]) = this()
    def this(options: Options) = this()
  }
  
  @JSImport("yadda/lib/parsers", "FeatureParser")
  @js.native
  class FeatureParser ()
    extends typings.yadda.featureParserMod.^ {
    def this(language: typings.yadda.languageMod.^[Library]) = this()
    def this(options: Options) = this()
  }
  
  @JSImport("yadda/lib/parsers", "StepParser")
  @js.native
  class StepParser ()
    extends typings.yadda.stepParserMod.^
}
