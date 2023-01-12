package typings.yadda

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.yadda.libContextMod.Properties
import typings.yadda.libLocalisationLanguageMod.Vocabulary
import typings.yadda.libParsersFeatureParserMod.Options
import typings.yadda.libPluginsMod.MochaPlugin
import typings.yadda.yaddaStrings.__ON_DEFINE__
import typings.yadda.yaddaStrings.__ON_EXECUTE__
import typings.yadda.yaddaStrings.__ON_SCENARIO__
import typings.yadda.yaddaStrings.__ON_STEP__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("yadda/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yadda/lib", "Context")
  @js.native
  open class Context protected ()
    extends typings.yadda.libContextMod.^ {
    def this(properties: Properties) = this()
  }
  
  @JSImport("yadda/lib", "Dictionary")
  @js.native
  open class Dictionary ()
    extends typings.yadda.libDictionaryMod.^ {
    def this(prefix: String) = this()
  }
  
  object EventBus {
    
    @JSImport("yadda/lib", "EventBus")
    @js.native
    val ^ : js.Any = js.native
    @JSImport("yadda/lib", "EventBus.EventBus")
    @js.native
    open class EventBus ()
      extends typings.yadda.libEventBusMod.EventBus
    
    @JSImport("yadda/lib", "EventBus.ON_DEFINE")
    @js.native
    val ON_DEFINE: __ON_DEFINE__ = js.native
    
    @JSImport("yadda/lib", "EventBus.ON_EXECUTE")
    @js.native
    val ON_EXECUTE: __ON_EXECUTE__ = js.native
    
    @JSImport("yadda/lib", "EventBus.ON_SCENARIO")
    @js.native
    val ON_SCENARIO: __ON_SCENARIO__ = js.native
    
    @JSImport("yadda/lib", "EventBus.ON_STEP")
    @js.native
    val ON_STEP: __ON_STEP__ = js.native
    
    inline def instance(): typings.yadda.libEventBusMod.EventBus = ^.asInstanceOf[js.Dynamic].applyDynamic("instance")().asInstanceOf[typings.yadda.libEventBusMod.EventBus]
  }
  
  @JSImport("yadda/lib", "FeatureFileSearch")
  @js.native
  open class FeatureFileSearch protected ()
    extends typings.yadda.libFeatureFileSearchMod.^ {
    def this(directories: String) = this()
  }
  
  @JSImport("yadda/lib", "FileSearch")
  @js.native
  open class FileSearch protected ()
    extends typings.yadda.libFileSearchMod.^ {
    def this(directories: String) = this()
    def this(directories: String, patterns: js.RegExp) = this()
  }
  
  @JSImport("yadda/lib", "Interpreter")
  @js.native
  open class Interpreter protected ()
    extends typings.yadda.libInterpreterMod.^ {
    def this(libraries: js.Array[typings.yadda.libLibraryMod.^]) = this()
    def this(libraries: typings.yadda.libLibraryMod.^) = this()
  }
  
  @JSImport("yadda/lib", "Library")
  @js.native
  open class Library ()
    extends typings.yadda.libLibraryMod.^ {
    def this(dictionary: typings.yadda.libDictionaryMod.^) = this()
  }
  
  @JSImport("yadda/lib", "Platform")
  @js.native
  open class Platform ()
    extends typings.yadda.libPlatformMod.^
  
  @JSImport("yadda/lib", "Yadda")
  @js.native
  open class Yadda protected ()
    extends typings.yadda.libYaddaMod.^ {
    def this(libraries: js.Array[typings.yadda.libLibraryMod.^]) = this()
    def this(libraries: typings.yadda.libLibraryMod.^) = this()
    def this(libraries: js.Array[typings.yadda.libLibraryMod.^], interpreter_context: Properties) = this()
    def this(
      libraries: js.Array[typings.yadda.libLibraryMod.^],
      interpreter_context: typings.yadda.libContextMod.^
    ) = this()
    def this(libraries: typings.yadda.libLibraryMod.^, interpreter_context: Properties) = this()
    def this(libraries: typings.yadda.libLibraryMod.^, interpreter_context: typings.yadda.libContextMod.^) = this()
  }
  
  object converters {
    
    @JSImport("yadda/lib", "converters")
    @js.native
    val ^ : js.Any = js.native
    
    inline def date(value: String, next: js.Function2[/* err */ js.Error | Null, /* value */ js.Date, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(value.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def float(value: String, next: js.Function2[/* err */ js.Error | Null, /* value */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("float")(value.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def integer(value: String, next: js.Function2[/* err */ js.Error | Null, /* value */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("integer")(value.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def list(value: String, next: js.Function2[/* err */ js.Error | Null, /* value */ js.Array[String], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(value.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def passThrough(value: String, next: js.Function2[/* err */ js.Error | Null, /* value */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pass_through")(value.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def table(value: String, next: js.Function2[/* err */ js.Error | Null, /* value */ js.Array[String], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("table")(value.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  inline def createInstance(): typings.yadda.libYaddaMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")().asInstanceOf[typings.yadda.libYaddaMod.^]
  inline def createInstance(libraries: js.Array[typings.yadda.libLocalisationLanguageMod.Library]): typings.yadda.libYaddaMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(libraries.asInstanceOf[js.Any]).asInstanceOf[typings.yadda.libYaddaMod.^]
  inline def createInstance(libraries: js.Array[typings.yadda.libLocalisationLanguageMod.Library], context: Properties): typings.yadda.libYaddaMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(libraries.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.yadda.libYaddaMod.^]
  inline def createInstance(libraries: Unit, context: Properties): typings.yadda.libYaddaMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(libraries.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.yadda.libYaddaMod.^]
  inline def createInstance(libraries: typings.yadda.libLocalisationLanguageMod.Library): typings.yadda.libYaddaMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(libraries.asInstanceOf[js.Any]).asInstanceOf[typings.yadda.libYaddaMod.^]
  inline def createInstance(libraries: typings.yadda.libLocalisationLanguageMod.Library, context: Properties): typings.yadda.libYaddaMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(libraries.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.yadda.libYaddaMod.^]
  
  object localisation extends Shortcut {
    
    @JSImport("yadda/lib", "localisation.default")
    @js.native
    val default: typings.yadda.libLocalisationLanguageMod.^[typings.yadda.libLocalisationEnglishMod.Library] = js.native
    
    @JSImport("yadda/lib", "localisation.Chinese")
    @js.native
    val Chinese: typings.yadda.libLocalisationLanguageMod.^[typings.yadda.libLocalisationChineseMod.Library] = js.native
    
    @JSImport("yadda/lib", "localisation.Dutch")
    @js.native
    val Dutch: typings.yadda.libLocalisationLanguageMod.^[typings.yadda.libLocalisationDutchMod.Library] = js.native
    
    @JSImport("yadda/lib", "localisation.English")
    @js.native
    val English: typings.yadda.libLocalisationLanguageMod.^[typings.yadda.libLocalisationEnglishMod.Library] = js.native
    
    @JSImport("yadda/lib", "localisation.French")
    @js.native
    val French: typings.yadda.libLocalisationLanguageMod.^[typings.yadda.libLocalisationFrenchMod.Library] = js.native
    
    @JSImport("yadda/lib", "localisation.German")
    @js.native
    val German: typings.yadda.libLocalisationLanguageMod.^[typings.yadda.libLocalisationGermanMod.Library] = js.native
    
    @JSImport("yadda/lib", "localisation.Language")
    @js.native
    open class Language[TLibrary /* <: typings.yadda.libLocalisationLanguageMod.Library */] protected ()
      extends typings.yadda.libLocalisationMod.Language[TLibrary] {
      def this(name: String, vocabulary: Vocabulary) = this()
    }
    
    @JSImport("yadda/lib", "localisation.Norwegian")
    @js.native
    val Norwegian: typings.yadda.libLocalisationLanguageMod.^[typings.yadda.libLocalisationNorwegianMod.Library] = js.native
    
    @JSImport("yadda/lib", "localisation.Pirate")
    @js.native
    val Pirate: typings.yadda.libLocalisationLanguageMod.^[typings.yadda.libLocalisationPirateMod.Library] = js.native
    
    @JSImport("yadda/lib", "localisation.Polish")
    @js.native
    val Polish: typings.yadda.libLocalisationLanguageMod.^[typings.yadda.libLocalisationPolishMod.Library] = js.native
    
    @JSImport("yadda/lib", "localisation.Portuguese")
    @js.native
    val Portuguese: typings.yadda.libLocalisationLanguageMod.^[typings.yadda.libLocalisationPortugueseMod.Library] = js.native
    
    @JSImport("yadda/lib", "localisation.Russian")
    @js.native
    val Russian: typings.yadda.libLocalisationLanguageMod.^[typings.yadda.libLocalisationRussianMod.Library] = js.native
    
    @JSImport("yadda/lib", "localisation.Spanish")
    @js.native
    val Spanish: typings.yadda.libLocalisationLanguageMod.^[typings.yadda.libLocalisationSpanishMod.Library] = js.native
    
    @JSImport("yadda/lib", "localisation.Ukrainian")
    @js.native
    val Ukrainian: typings.yadda.libLocalisationLanguageMod.^[typings.yadda.libLocalisationUkrainianMod.Library] = js.native
    
    type _To = typings.yadda.libLocalisationLanguageMod.^[typings.yadda.libLocalisationEnglishMod.Library]
    
    /* This means you don't have to write `default`, but can instead just say `localisation.foo` */
    override def _to: typings.yadda.libLocalisationLanguageMod.^[typings.yadda.libLocalisationEnglishMod.Library] = default
  }
  
  object parsers {
    
    @JSImport("yadda/lib", "parsers.FeatureFileParser")
    @js.native
    open class FeatureFileParser ()
      extends typings.yadda.libParsersMod.FeatureFileParser {
      def this(language: typings.yadda.libLocalisationLanguageMod.^[typings.yadda.libLocalisationLanguageMod.Library]) = this()
      def this(options: Options) = this()
    }
    
    @JSImport("yadda/lib", "parsers.FeatureParser")
    @js.native
    open class FeatureParser ()
      extends typings.yadda.libParsersMod.FeatureParser {
      def this(language: typings.yadda.libLocalisationLanguageMod.^[typings.yadda.libLocalisationLanguageMod.Library]) = this()
      def this(options: Options) = this()
    }
    
    @JSImport("yadda/lib", "parsers.StepParser")
    @js.native
    open class StepParser ()
      extends typings.yadda.libParsersMod.StepParser
  }
  
  object plugins {
    
    @JSImport("yadda/lib", "plugins")
    @js.native
    val ^ : js.Any = js.native
    
    inline def casper(yadda: typings.yadda.libYaddaMod.^, casper: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("casper")(yadda.asInstanceOf[js.Any], casper.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("yadda/lib", "plugins.jasmine")
    @js.native
    val jasmine: MochaPlugin = js.native
    
    @JSImport("yadda/lib", "plugins.mocha")
    @js.native
    val mocha: MochaPlugin = js.native
  }
  
  type Annotations = StringDictionary[String]
  
  type Converter = (js.Function2[
    /* arg1 */ String, 
    /* next */ js.Function2[/* err */ js.Error | Null, /* value */ Any, Unit], 
    Unit
  ]) | (js.Function3[
    /* arg1 */ String, 
    /* arg2 */ String, 
    /* next */ js.Function2[/* err */ js.Error | Null, /* value */ Any, Unit], 
    Unit
  ]) | (js.Function4[
    /* arg1 */ String, 
    /* arg2 */ String, 
    /* arg3 */ String, 
    /* next */ js.Function2[/* err */ js.Error | Null, /* value */ Any, Unit], 
    Unit
  ]) | (js.Function5[
    /* arg1 */ String, 
    /* arg2 */ String, 
    /* arg3 */ String, 
    /* arg4 */ String, 
    /* next */ js.Function2[/* err */ js.Error | Null, /* value */ Any, Unit], 
    Unit
  ]) | (js.Function6[
    /* arg1 */ String, 
    /* arg2 */ String, 
    /* arg3 */ String, 
    /* arg4 */ String, 
    /* arg5 */ String, 
    /* next */ js.Function2[/* err */ js.Error | Null, /* value */ Any, Unit], 
    Unit
  ]) | (js.Function7[
    /* arg1 */ String, 
    /* arg2 */ String, 
    /* arg3 */ String, 
    /* arg4 */ String, 
    /* arg5 */ String, 
    /* arg6 */ String, 
    /* next */ js.Function2[/* err */ js.Error | Null, /* value */ Any, Unit], 
    Unit
  ])
  
  trait Feature extends StObject {
    
    var annotations: Annotations
    
    var description: js.Array[String]
    
    var scenarios: js.Array[Scenario]
    
    var title: String
  }
  object Feature {
    
    inline def apply(
      annotations: Annotations,
      description: js.Array[String],
      scenarios: js.Array[Scenario],
      title: String
    ): Feature = {
      val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], scenarios = scenarios.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Feature]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Feature] (val x: Self) extends AnyVal {
      
      inline def setAnnotations(value: Annotations): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: js.Array[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionVarargs(value: String*): Self = StObject.set(x, "description", js.Array(value*))
      
      inline def setScenarios(value: js.Array[Scenario]): Self = StObject.set(x, "scenarios", value.asInstanceOf[js.Any])
      
      inline def setScenariosVarargs(value: Scenario*): Self = StObject.set(x, "scenarios", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait Scenario extends StObject {
    
    var annotations: Annotations
    
    var description: js.Array[String]
    
    var steps: js.Array[Step]
    
    var title: String
  }
  object Scenario {
    
    inline def apply(annotations: Annotations, description: js.Array[String], steps: js.Array[Step], title: String): Scenario = {
      val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scenario]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Scenario] (val x: Self) extends AnyVal {
      
      inline def setAnnotations(value: Annotations): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: js.Array[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionVarargs(value: String*): Self = StObject.set(x, "description", js.Array(value*))
      
      inline def setSteps(value: js.Array[Step]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsVarargs(value: Step*): Self = StObject.set(x, "steps", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type Step = String
  
  trait StepFn extends StObject {
    
    var ctx: Properties
    
    var step: String
  }
  object StepFn {
    
    inline def apply(ctx: Properties, step: String): StepFn = {
      val __obj = js.Dynamic.literal(ctx = ctx.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepFn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StepFn] (val x: Self) extends AnyVal {
      
      inline def setCtx(value: Properties): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setStep(value: String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    }
  }
}
