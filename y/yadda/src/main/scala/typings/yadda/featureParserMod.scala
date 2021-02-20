package typings.yadda

import org.scalablytyped.runtime.StringDictionary
import typings.yadda.languageMod.Library
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object featureParserMod {
  
  @JSImport("yadda/lib/parsers/FeatureParser", JSImport.Namespace)
  @js.native
  class ^ () extends FeatureParser {
    def this(language: typings.yadda.languageMod.^[Library]) = this()
    def this(options: Options) = this()
  }
  
  type AnnotationsExport = StringDictionary[String]
  
  @js.native
  trait FeatureExport extends StObject {
    
    var annotations: AnnotationsExport = js.native
    
    var description: String = js.native
    
    var scenarios: js.Array[ScenarioExport] = js.native
    
    var title: String = js.native
  }
  object FeatureExport {
    
    @scala.inline
    def apply(
      annotations: AnnotationsExport,
      description: String,
      scenarios: js.Array[ScenarioExport],
      title: String
    ): FeatureExport = {
      val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], scenarios = scenarios.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeatureExport]
    }
    
    @scala.inline
    implicit class FeatureExportMutableBuilder[Self <: FeatureExport] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnnotations(value: AnnotationsExport): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScenarios(value: js.Array[ScenarioExport]): Self = StObject.set(x, "scenarios", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScenariosVarargs(value: ScenarioExport*): Self = StObject.set(x, "scenarios", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FeatureParser extends StObject {
    
    def parse(text: String): SpecificationExport = js.native
    def parse(text: String, next: js.Function1[/* specification */ SpecificationExport, Unit]): Unit = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var language: js.UndefOr[typings.yadda.languageMod.^[Library]] = js.native
    
    var leftPlaceholderChar: String = js.native
    
    var rightPlaceholderChar: String = js.native
  }
  object Options {
    
    @scala.inline
    def apply(leftPlaceholderChar: String, rightPlaceholderChar: String): Options = {
      val __obj = js.Dynamic.literal(leftPlaceholderChar = leftPlaceholderChar.asInstanceOf[js.Any], rightPlaceholderChar = rightPlaceholderChar.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLanguage(value: typings.yadda.languageMod.^[Library]): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setLeftPlaceholderChar(value: String): Self = StObject.set(x, "leftPlaceholderChar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightPlaceholderChar(value: String): Self = StObject.set(x, "rightPlaceholderChar", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ScenarioExport extends StObject {
    
    var annotations: AnnotationsExport = js.native
    
    var description: String = js.native
    
    var steps: js.Array[String] = js.native
    
    var title: String = js.native
  }
  object ScenarioExport {
    
    @scala.inline
    def apply(annotations: AnnotationsExport, description: String, steps: js.Array[String], title: String): ScenarioExport = {
      val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScenarioExport]
    }
    
    @scala.inline
    implicit class ScenarioExportMutableBuilder[Self <: ScenarioExport] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnnotations(value: AnnotationsExport): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSteps(value: js.Array[String]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepsVarargs(value: String*): Self = StObject.set(x, "steps", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type SpecificationExport = FeatureExport
}
