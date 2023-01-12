package typings.yadda

import org.scalablytyped.runtime.StringDictionary
import typings.yadda.libLocalisationLanguageMod.Library
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libParsersFeatureParserMod {
  
  @JSImport("yadda/lib/parsers/FeatureParser", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with FeatureParser {
    def this(language: typings.yadda.libLocalisationLanguageMod.^[Library]) = this()
    def this(options: Options) = this()
  }
  
  type AnnotationsExport = StringDictionary[String]
  
  trait FeatureExport extends StObject {
    
    var annotations: AnnotationsExport
    
    var description: String
    
    var scenarios: js.Array[ScenarioExport]
    
    var title: String
  }
  object FeatureExport {
    
    inline def apply(
      annotations: AnnotationsExport,
      description: String,
      scenarios: js.Array[ScenarioExport],
      title: String
    ): FeatureExport = {
      val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], scenarios = scenarios.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeatureExport]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FeatureExport] (val x: Self) extends AnyVal {
      
      inline def setAnnotations(value: AnnotationsExport): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setScenarios(value: js.Array[ScenarioExport]): Self = StObject.set(x, "scenarios", value.asInstanceOf[js.Any])
      
      inline def setScenariosVarargs(value: ScenarioExport*): Self = StObject.set(x, "scenarios", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FeatureParser extends StObject {
    
    def parse(text: String): SpecificationExport = js.native
    def parse(text: String, next: js.Function1[/* specification */ SpecificationExport, Unit]): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var language: js.UndefOr[typings.yadda.libLocalisationLanguageMod.^[Library]] = js.undefined
    
    var leftPlaceholderChar: String
    
    var rightPlaceholderChar: String
  }
  object Options {
    
    inline def apply(leftPlaceholderChar: String, rightPlaceholderChar: String): Options = {
      val __obj = js.Dynamic.literal(leftPlaceholderChar = leftPlaceholderChar.asInstanceOf[js.Any], rightPlaceholderChar = rightPlaceholderChar.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setLanguage(value: typings.yadda.libLocalisationLanguageMod.^[Library]): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setLeftPlaceholderChar(value: String): Self = StObject.set(x, "leftPlaceholderChar", value.asInstanceOf[js.Any])
      
      inline def setRightPlaceholderChar(value: String): Self = StObject.set(x, "rightPlaceholderChar", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScenarioExport extends StObject {
    
    var annotations: AnnotationsExport
    
    var description: String
    
    var steps: js.Array[String]
    
    var title: String
  }
  object ScenarioExport {
    
    inline def apply(annotations: AnnotationsExport, description: String, steps: js.Array[String], title: String): ScenarioExport = {
      val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScenarioExport]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScenarioExport] (val x: Self) extends AnyVal {
      
      inline def setAnnotations(value: AnnotationsExport): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setSteps(value: js.Array[String]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsVarargs(value: String*): Self = StObject.set(x, "steps", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type SpecificationExport = FeatureExport
}
