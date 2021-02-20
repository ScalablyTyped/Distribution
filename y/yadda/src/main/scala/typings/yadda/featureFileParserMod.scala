package typings.yadda

import typings.yadda.featureParserMod.SpecificationExport
import typings.yadda.languageMod.Library
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featureFileParserMod {
  
  @JSImport("yadda/lib/parsers/FeatureFileParser", JSImport.Namespace)
  @js.native
  class ^ () extends FeatureFileParser {
    def this(language: typings.yadda.languageMod.^[Library]) = this()
    def this(options: typings.yadda.featureParserMod.Options) = this()
  }
  
  @js.native
  trait FeatureFileParser extends StObject {
    
    def parse(file: String): SpecificationExport = js.native
    def parse(file: String, next: js.Function1[/* specification */ SpecificationExport, Unit]): Unit = js.native
  }
  
  type Options = typings.yadda.featureParserMod.Options
}
