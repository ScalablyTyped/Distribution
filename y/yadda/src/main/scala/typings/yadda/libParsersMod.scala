package typings.yadda

import typings.yadda.libLocalisationLanguageMod.Library
import typings.yadda.libParsersFeatureFileParserMod.^
import typings.yadda.libParsersFeatureParserMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libParsersMod {
  
  @JSImport("yadda/lib/parsers", "FeatureFileParser")
  @js.native
  open class FeatureFileParser () extends ^ {
    def this(language: typings.yadda.libLocalisationLanguageMod.^[Library]) = this()
    def this(options: Options) = this()
  }
  
  @JSImport("yadda/lib/parsers", "FeatureParser")
  @js.native
  open class FeatureParser ()
    extends typings.yadda.libParsersFeatureParserMod.^ {
    def this(language: typings.yadda.libLocalisationLanguageMod.^[Library]) = this()
    def this(options: Options) = this()
  }
  
  @JSImport("yadda/lib/parsers", "StepParser")
  @js.native
  open class StepParser ()
    extends typings.yadda.libParsersStepParserMod.^
}
