package typings.yadda

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.std.Error
import typings.std.RegExp
import typings.yadda.contextMod.Properties
import typings.yadda.featureParserMod.Options
import typings.yadda.languageMod.Vocabulary
import typings.yadda.pluginsMod.MochaPlugin
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
  class Context protected ()
    extends typings.yadda.contextMod.^ {
    def this(properties: Properties) = this()
  }
  
  @JSImport("yadda/lib", "Dictionary")
  @js.native
  class Dictionary ()
    extends typings.yadda.dictionaryMod.^ {
    def this(prefix: String) = this()
  }
  
  object EventBus {
    
    @JSImport("yadda/lib", "EventBus")
    @js.native
    val ^ : js.Any = js.native
    @JSImport("yadda/lib", "EventBus.EventBus")
    @js.native
    class EventBus ()
      extends typings.yadda.eventBusMod.EventBus
    
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
    
    inline def instance(): typings.yadda.eventBusMod.EventBus = ^.asInstanceOf[js.Dynamic].applyDynamic("instance")().asInstanceOf[typings.yadda.eventBusMod.EventBus]
  }
  
  @JSImport("yadda/lib", "FeatureFileSearch")
  @js.native
  class FeatureFileSearch protected ()
    extends typings.yadda.featureFileSearchMod.^ {
    def this(directories: String) = this()
  }
  
  @JSImport("yadda/lib", "FileSearch")
  @js.native
  class FileSearch protected ()
    extends typings.yadda.fileSearchMod.^ {
    def this(directories: String) = this()
    def this(directories: String, patterns: RegExp) = this()
  }
  
  @JSImport("yadda/lib", "Interpreter")
  @js.native
  class Interpreter protected ()
    extends typings.yadda.interpreterMod.^ {
    def this(libraries: js.Array[typings.yadda.libraryMod.^]) = this()
    def this(libraries: typings.yadda.libraryMod.^) = this()
  }
  
  @JSImport("yadda/lib", "Library")
  @js.native
  class Library ()
    extends typings.yadda.libraryMod.^ {
    def this(dictionary: typings.yadda.dictionaryMod.^) = this()
  }
  
  @JSImport("yadda/lib", "Platform")
  @js.native
  class Platform ()
    extends typings.yadda.platformMod.^
  
  @JSImport("yadda/lib", "Yadda")
  @js.native
  class Yadda protected ()
    extends typings.yadda.yaddaMod.^ {
    def this(libraries: js.Array[typings.yadda.libraryMod.^]) = this()
    def this(libraries: typings.yadda.libraryMod.^) = this()
    def this(libraries: js.Array[typings.yadda.libraryMod.^], interpreter_context: Properties) = this()
    def this(libraries: js.Array[typings.yadda.libraryMod.^], interpreter_context: typings.yadda.contextMod.^) = this()
    def this(libraries: typings.yadda.libraryMod.^, interpreter_context: Properties) = this()
    def this(libraries: typings.yadda.libraryMod.^, interpreter_context: typings.yadda.contextMod.^) = this()
  }
  
  object converters {
    
    @JSImport("yadda/lib", "converters")
    @js.native
    val ^ : js.Any = js.native
    
    inline def date(value: String, next: js.Function2[/* err */ Error | Null, /* value */ Date, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(value.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def float(value: String, next: js.Function2[/* err */ Error | Null, /* value */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("float")(value.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def integer(value: String, next: js.Function2[/* err */ Error | Null, /* value */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("integer")(value.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def list(value: String, next: js.Function2[/* err */ Error | Null, /* value */ js.Array[String], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(value.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def passThrough(value: String, next: js.Function2[/* err */ Error | Null, /* value */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pass_through")(value.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def table(value: String, next: js.Function2[/* err */ Error | Null, /* value */ js.Array[String], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("table")(value.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  inline def createInstance(): typings.yadda.yaddaMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")().asInstanceOf[typings.yadda.yaddaMod.^]
  inline def createInstance(libraries: js.Array[typings.yadda.languageMod.Library]): typings.yadda.yaddaMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(libraries.asInstanceOf[js.Any]).asInstanceOf[typings.yadda.yaddaMod.^]
  inline def createInstance(libraries: js.Array[typings.yadda.languageMod.Library], context: Properties): typings.yadda.yaddaMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(libraries.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.yadda.yaddaMod.^]
  inline def createInstance(libraries: Unit, context: Properties): typings.yadda.yaddaMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(libraries.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.yadda.yaddaMod.^]
  inline def createInstance(libraries: typings.yadda.languageMod.Library): typings.yadda.yaddaMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(libraries.asInstanceOf[js.Any]).asInstanceOf[typings.yadda.yaddaMod.^]
  inline def createInstance(libraries: typings.yadda.languageMod.Library, context: Properties): typings.yadda.yaddaMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(libraries.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.yadda.yaddaMod.^]
  
  object localisation {
    
    object default extends Shortcut {
      
      @JSImport("yadda/lib", "localisation.default")
      @js.native
      val ^ : typings.yadda.languageMod.^[typings.yadda.englishMod.Library] = js.native
      
      type _To = typings.yadda.languageMod.^[typings.yadda.englishMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `default.foo` */
      override def _to: typings.yadda.languageMod.^[typings.yadda.englishMod.Library] = ^
    }
    
    object Chinese extends Shortcut {
      
      @JSImport("yadda/lib", "localisation.Chinese")
      @js.native
      val ^ : typings.yadda.languageMod.^[typings.yadda.chineseMod.Library] = js.native
      
      type _To = typings.yadda.languageMod.^[typings.yadda.chineseMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `Chinese.foo` */
      override def _to: typings.yadda.languageMod.^[typings.yadda.chineseMod.Library] = ^
    }
    
    object Dutch extends Shortcut {
      
      @JSImport("yadda/lib", "localisation.Dutch")
      @js.native
      val ^ : typings.yadda.languageMod.^[typings.yadda.dutchMod.Library] = js.native
      
      type _To = typings.yadda.languageMod.^[typings.yadda.dutchMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `Dutch.foo` */
      override def _to: typings.yadda.languageMod.^[typings.yadda.dutchMod.Library] = ^
    }
    
    object English extends Shortcut {
      
      @JSImport("yadda/lib", "localisation.English")
      @js.native
      val ^ : typings.yadda.languageMod.^[typings.yadda.englishMod.Library] = js.native
      
      type _To = typings.yadda.languageMod.^[typings.yadda.englishMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `English.foo` */
      override def _to: typings.yadda.languageMod.^[typings.yadda.englishMod.Library] = ^
    }
    
    object French extends Shortcut {
      
      @JSImport("yadda/lib", "localisation.French")
      @js.native
      val ^ : typings.yadda.languageMod.^[typings.yadda.frenchMod.Library] = js.native
      
      type _To = typings.yadda.languageMod.^[typings.yadda.frenchMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `French.foo` */
      override def _to: typings.yadda.languageMod.^[typings.yadda.frenchMod.Library] = ^
    }
    
    object German extends Shortcut {
      
      @JSImport("yadda/lib", "localisation.German")
      @js.native
      val ^ : typings.yadda.languageMod.^[typings.yadda.germanMod.Library] = js.native
      
      type _To = typings.yadda.languageMod.^[typings.yadda.germanMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `German.foo` */
      override def _to: typings.yadda.languageMod.^[typings.yadda.germanMod.Library] = ^
    }
    
    @JSImport("yadda/lib", "localisation.Language")
    @js.native
    class Language[TLibrary /* <: typings.yadda.languageMod.Library */] protected ()
      extends typings.yadda.localisationMod.Language[TLibrary] {
      def this(name: String, vocabulary: Vocabulary) = this()
    }
    
    object Norwegian extends Shortcut {
      
      @JSImport("yadda/lib", "localisation.Norwegian")
      @js.native
      val ^ : typings.yadda.languageMod.^[typings.yadda.norwegianMod.Library] = js.native
      
      type _To = typings.yadda.languageMod.^[typings.yadda.norwegianMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `Norwegian.foo` */
      override def _to: typings.yadda.languageMod.^[typings.yadda.norwegianMod.Library] = ^
    }
    
    object Pirate extends Shortcut {
      
      @JSImport("yadda/lib", "localisation.Pirate")
      @js.native
      val ^ : typings.yadda.languageMod.^[typings.yadda.pirateMod.Library] = js.native
      
      type _To = typings.yadda.languageMod.^[typings.yadda.pirateMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `Pirate.foo` */
      override def _to: typings.yadda.languageMod.^[typings.yadda.pirateMod.Library] = ^
    }
    
    object Polish extends Shortcut {
      
      @JSImport("yadda/lib", "localisation.Polish")
      @js.native
      val ^ : typings.yadda.languageMod.^[typings.yadda.polishMod.Library] = js.native
      
      type _To = typings.yadda.languageMod.^[typings.yadda.polishMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `Polish.foo` */
      override def _to: typings.yadda.languageMod.^[typings.yadda.polishMod.Library] = ^
    }
    
    object Portuguese extends Shortcut {
      
      @JSImport("yadda/lib", "localisation.Portuguese")
      @js.native
      val ^ : typings.yadda.languageMod.^[typings.yadda.portugueseMod.Library] = js.native
      
      type _To = typings.yadda.languageMod.^[typings.yadda.portugueseMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `Portuguese.foo` */
      override def _to: typings.yadda.languageMod.^[typings.yadda.portugueseMod.Library] = ^
    }
    
    object Russian extends Shortcut {
      
      @JSImport("yadda/lib", "localisation.Russian")
      @js.native
      val ^ : typings.yadda.languageMod.^[typings.yadda.russianMod.Library] = js.native
      
      type _To = typings.yadda.languageMod.^[typings.yadda.russianMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `Russian.foo` */
      override def _to: typings.yadda.languageMod.^[typings.yadda.russianMod.Library] = ^
    }
    
    object Spanish extends Shortcut {
      
      @JSImport("yadda/lib", "localisation.Spanish")
      @js.native
      val ^ : typings.yadda.languageMod.^[typings.yadda.spanishMod.Library] = js.native
      
      type _To = typings.yadda.languageMod.^[typings.yadda.spanishMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `Spanish.foo` */
      override def _to: typings.yadda.languageMod.^[typings.yadda.spanishMod.Library] = ^
    }
    
    object Ukrainian extends Shortcut {
      
      @JSImport("yadda/lib", "localisation.Ukrainian")
      @js.native
      val ^ : typings.yadda.languageMod.^[typings.yadda.ukrainianMod.Library] = js.native
      
      type _To = typings.yadda.languageMod.^[typings.yadda.ukrainianMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `Ukrainian.foo` */
      override def _to: typings.yadda.languageMod.^[typings.yadda.ukrainianMod.Library] = ^
    }
  }
  
  object parsers {
    
    @JSImport("yadda/lib", "parsers.FeatureFileParser")
    @js.native
    class FeatureFileParser ()
      extends typings.yadda.parsersMod.FeatureFileParser {
      def this(language: typings.yadda.languageMod.^[typings.yadda.languageMod.Library]) = this()
      def this(options: Options) = this()
    }
    
    @JSImport("yadda/lib", "parsers.FeatureParser")
    @js.native
    class FeatureParser ()
      extends typings.yadda.parsersMod.FeatureParser {
      def this(language: typings.yadda.languageMod.^[typings.yadda.languageMod.Library]) = this()
      def this(options: Options) = this()
    }
    
    @JSImport("yadda/lib", "parsers.StepParser")
    @js.native
    class StepParser ()
      extends typings.yadda.parsersMod.StepParser
  }
  
  object plugins {
    
    @JSImport("yadda/lib", "plugins")
    @js.native
    val ^ : js.Any = js.native
    
    inline def casper(yadda: typings.yadda.yaddaMod.^, casper: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("casper")(yadda.asInstanceOf[js.Any], casper.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
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
    /* next */ js.Function2[/* err */ Error | Null, /* value */ js.Any, Unit], 
    Unit
  ]) | (js.Function3[
    /* arg1 */ String, 
    /* arg2 */ String, 
    /* next */ js.Function2[/* err */ Error | Null, /* value */ js.Any, Unit], 
    Unit
  ]) | (js.Function4[
    /* arg1 */ String, 
    /* arg2 */ String, 
    /* arg3 */ String, 
    /* next */ js.Function2[/* err */ Error | Null, /* value */ js.Any, Unit], 
    Unit
  ]) | (js.Function5[
    /* arg1 */ String, 
    /* arg2 */ String, 
    /* arg3 */ String, 
    /* arg4 */ String, 
    /* next */ js.Function2[/* err */ Error | Null, /* value */ js.Any, Unit], 
    Unit
  ]) | (js.Function6[
    /* arg1 */ String, 
    /* arg2 */ String, 
    /* arg3 */ String, 
    /* arg4 */ String, 
    /* arg5 */ String, 
    /* next */ js.Function2[/* err */ Error | Null, /* value */ js.Any, Unit], 
    Unit
  ]) | (js.Function7[
    /* arg1 */ String, 
    /* arg2 */ String, 
    /* arg3 */ String, 
    /* arg4 */ String, 
    /* arg5 */ String, 
    /* arg6 */ String, 
    /* next */ js.Function2[/* err */ Error | Null, /* value */ js.Any, Unit], 
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
    
    extension [Self <: Feature](x: Self) {
      
      inline def setAnnotations(value: Annotations): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: js.Array[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionVarargs(value: String*): Self = StObject.set(x, "description", js.Array(value :_*))
      
      inline def setScenarios(value: js.Array[Scenario]): Self = StObject.set(x, "scenarios", value.asInstanceOf[js.Any])
      
      inline def setScenariosVarargs(value: Scenario*): Self = StObject.set(x, "scenarios", js.Array(value :_*))
      
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
    
    extension [Self <: Scenario](x: Self) {
      
      inline def setAnnotations(value: Annotations): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: js.Array[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionVarargs(value: String*): Self = StObject.set(x, "description", js.Array(value :_*))
      
      inline def setSteps(value: js.Array[Step]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsVarargs(value: Step*): Self = StObject.set(x, "steps", js.Array(value :_*))
      
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
    
    extension [Self <: StepFn](x: Self) {
      
      inline def setCtx(value: Properties): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
      
      inline def setStep(value: String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    }
  }
}
