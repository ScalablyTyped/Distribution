package typings.yadda

import org.scalablytyped.runtime.Shortcut
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

object mod {
  
  @JSImport("yadda", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yadda", "Context")
  @js.native
  class Context protected ()
    extends typings.yadda.libMod.Context {
    def this(properties: Properties) = this()
  }
  
  @JSImport("yadda", "Dictionary")
  @js.native
  class Dictionary ()
    extends typings.yadda.libMod.Dictionary {
    def this(prefix: String) = this()
  }
  
  object EventBus {
    
    @JSImport("yadda", "EventBus")
    @js.native
    val ^ : js.Any = js.native
    @JSImport("yadda", "EventBus.EventBus")
    @js.native
    class EventBus ()
      extends typings.yadda.libMod.EventBus.EventBus
    
    @JSImport("yadda", "EventBus.ON_DEFINE")
    @js.native
    val ON_DEFINE: __ON_DEFINE__ = js.native
    
    @JSImport("yadda", "EventBus.ON_EXECUTE")
    @js.native
    val ON_EXECUTE: __ON_EXECUTE__ = js.native
    
    @JSImport("yadda", "EventBus.ON_SCENARIO")
    @js.native
    val ON_SCENARIO: __ON_SCENARIO__ = js.native
    
    @JSImport("yadda", "EventBus.ON_STEP")
    @js.native
    val ON_STEP: __ON_STEP__ = js.native
    
    @scala.inline
    def instance(): typings.yadda.eventBusMod.EventBus = ^.asInstanceOf[js.Dynamic].applyDynamic("instance")().asInstanceOf[typings.yadda.eventBusMod.EventBus]
  }
  
  @JSImport("yadda", "FeatureFileSearch")
  @js.native
  class FeatureFileSearch protected ()
    extends typings.yadda.libMod.FeatureFileSearch {
    def this(directories: String) = this()
  }
  
  @JSImport("yadda", "FileSearch")
  @js.native
  class FileSearch protected ()
    extends typings.yadda.libMod.FileSearch {
    def this(directories: String) = this()
    def this(directories: String, patterns: RegExp) = this()
  }
  
  @JSImport("yadda", "Interpreter")
  @js.native
  class Interpreter protected ()
    extends typings.yadda.libMod.Interpreter {
    def this(libraries: js.Array[typings.yadda.libraryMod.^]) = this()
    def this(libraries: typings.yadda.libraryMod.^) = this()
  }
  
  @JSImport("yadda", "Library")
  @js.native
  class Library ()
    extends typings.yadda.libMod.Library {
    def this(dictionary: typings.yadda.dictionaryMod.^) = this()
  }
  
  @JSImport("yadda", "Platform")
  @js.native
  class Platform ()
    extends typings.yadda.libMod.Platform
  
  @JSImport("yadda", "Yadda")
  @js.native
  class Yadda protected ()
    extends typings.yadda.libMod.Yadda {
    def this(libraries: js.Array[typings.yadda.libraryMod.^]) = this()
    def this(libraries: typings.yadda.libraryMod.^) = this()
    def this(libraries: js.Array[typings.yadda.libraryMod.^], interpreter_context: Properties) = this()
    def this(libraries: js.Array[typings.yadda.libraryMod.^], interpreter_context: typings.yadda.contextMod.^) = this()
    def this(libraries: typings.yadda.libraryMod.^, interpreter_context: Properties) = this()
    def this(libraries: typings.yadda.libraryMod.^, interpreter_context: typings.yadda.contextMod.^) = this()
  }
  
  object converters {
    
    @JSImport("yadda", "converters")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def date(value: String, next: js.Function2[/* err */ Error | Null, /* value */ Date, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(value.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def float(value: String, next: js.Function2[/* err */ Error | Null, /* value */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("float")(value.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def integer(value: String, next: js.Function2[/* err */ Error | Null, /* value */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("integer")(value.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def list(value: String, next: js.Function2[/* err */ Error | Null, /* value */ js.Array[String], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("list")(value.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def passThrough(value: String, next: js.Function2[/* err */ Error | Null, /* value */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("pass_through")(value.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def table(value: String, next: js.Function2[/* err */ Error | Null, /* value */ js.Array[String], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("table")(value.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @scala.inline
  def createInstance(): typings.yadda.yaddaMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")().asInstanceOf[typings.yadda.yaddaMod.^]
  @scala.inline
  def createInstance(libraries: js.Array[typings.yadda.languageMod.Library]): typings.yadda.yaddaMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(libraries.asInstanceOf[js.Any]).asInstanceOf[typings.yadda.yaddaMod.^]
  @scala.inline
  def createInstance(libraries: js.Array[typings.yadda.languageMod.Library], context: Properties): typings.yadda.yaddaMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(libraries.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.yadda.yaddaMod.^]
  @scala.inline
  def createInstance(libraries: Unit, context: Properties): typings.yadda.yaddaMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(libraries.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.yadda.yaddaMod.^]
  @scala.inline
  def createInstance(libraries: typings.yadda.languageMod.Library): typings.yadda.yaddaMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(libraries.asInstanceOf[js.Any]).asInstanceOf[typings.yadda.yaddaMod.^]
  @scala.inline
  def createInstance(libraries: typings.yadda.languageMod.Library, context: Properties): typings.yadda.yaddaMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(libraries.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.yadda.yaddaMod.^]
  
  object localisation {
    
    object default extends Shortcut {
      
      @JSImport("yadda", "localisation.default")
      @js.native
      val ^ : typings.yadda.languageMod.^[typings.yadda.englishMod.Library] = js.native
      
      type _To = typings.yadda.languageMod.^[typings.yadda.englishMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `default.foo` */
      override def _to: typings.yadda.languageMod.^[typings.yadda.englishMod.Library] = ^
    }
    
    object Chinese extends Shortcut {
      
      @JSImport("yadda", "localisation.Chinese")
      @js.native
      val ^ : typings.yadda.languageMod.^[typings.yadda.chineseMod.Library] = js.native
      
      type _To = typings.yadda.languageMod.^[typings.yadda.chineseMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `Chinese.foo` */
      override def _to: typings.yadda.languageMod.^[typings.yadda.chineseMod.Library] = ^
    }
    
    object Dutch extends Shortcut {
      
      @JSImport("yadda", "localisation.Dutch")
      @js.native
      val ^ : typings.yadda.languageMod.^[typings.yadda.dutchMod.Library] = js.native
      
      type _To = typings.yadda.languageMod.^[typings.yadda.dutchMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `Dutch.foo` */
      override def _to: typings.yadda.languageMod.^[typings.yadda.dutchMod.Library] = ^
    }
    
    object English extends Shortcut {
      
      @JSImport("yadda", "localisation.English")
      @js.native
      val ^ : typings.yadda.languageMod.^[typings.yadda.englishMod.Library] = js.native
      
      type _To = typings.yadda.languageMod.^[typings.yadda.englishMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `English.foo` */
      override def _to: typings.yadda.languageMod.^[typings.yadda.englishMod.Library] = ^
    }
    
    object French extends Shortcut {
      
      @JSImport("yadda", "localisation.French")
      @js.native
      val ^ : typings.yadda.languageMod.^[typings.yadda.frenchMod.Library] = js.native
      
      type _To = typings.yadda.languageMod.^[typings.yadda.frenchMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `French.foo` */
      override def _to: typings.yadda.languageMod.^[typings.yadda.frenchMod.Library] = ^
    }
    
    object German extends Shortcut {
      
      @JSImport("yadda", "localisation.German")
      @js.native
      val ^ : typings.yadda.languageMod.^[typings.yadda.germanMod.Library] = js.native
      
      type _To = typings.yadda.languageMod.^[typings.yadda.germanMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `German.foo` */
      override def _to: typings.yadda.languageMod.^[typings.yadda.germanMod.Library] = ^
    }
    
    @JSImport("yadda", "localisation.Language")
    @js.native
    class Language[TLibrary /* <: typings.yadda.languageMod.Library */] protected ()
      extends typings.yadda.libMod.localisation.Language[TLibrary] {
      def this(name: String, vocabulary: Vocabulary) = this()
    }
    
    object Norwegian extends Shortcut {
      
      @JSImport("yadda", "localisation.Norwegian")
      @js.native
      val ^ : typings.yadda.languageMod.^[typings.yadda.norwegianMod.Library] = js.native
      
      type _To = typings.yadda.languageMod.^[typings.yadda.norwegianMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `Norwegian.foo` */
      override def _to: typings.yadda.languageMod.^[typings.yadda.norwegianMod.Library] = ^
    }
    
    object Pirate extends Shortcut {
      
      @JSImport("yadda", "localisation.Pirate")
      @js.native
      val ^ : typings.yadda.languageMod.^[typings.yadda.pirateMod.Library] = js.native
      
      type _To = typings.yadda.languageMod.^[typings.yadda.pirateMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `Pirate.foo` */
      override def _to: typings.yadda.languageMod.^[typings.yadda.pirateMod.Library] = ^
    }
    
    object Polish extends Shortcut {
      
      @JSImport("yadda", "localisation.Polish")
      @js.native
      val ^ : typings.yadda.languageMod.^[typings.yadda.polishMod.Library] = js.native
      
      type _To = typings.yadda.languageMod.^[typings.yadda.polishMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `Polish.foo` */
      override def _to: typings.yadda.languageMod.^[typings.yadda.polishMod.Library] = ^
    }
    
    object Portuguese extends Shortcut {
      
      @JSImport("yadda", "localisation.Portuguese")
      @js.native
      val ^ : typings.yadda.languageMod.^[typings.yadda.portugueseMod.Library] = js.native
      
      type _To = typings.yadda.languageMod.^[typings.yadda.portugueseMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `Portuguese.foo` */
      override def _to: typings.yadda.languageMod.^[typings.yadda.portugueseMod.Library] = ^
    }
    
    object Russian extends Shortcut {
      
      @JSImport("yadda", "localisation.Russian")
      @js.native
      val ^ : typings.yadda.languageMod.^[typings.yadda.russianMod.Library] = js.native
      
      type _To = typings.yadda.languageMod.^[typings.yadda.russianMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `Russian.foo` */
      override def _to: typings.yadda.languageMod.^[typings.yadda.russianMod.Library] = ^
    }
    
    object Spanish extends Shortcut {
      
      @JSImport("yadda", "localisation.Spanish")
      @js.native
      val ^ : typings.yadda.languageMod.^[typings.yadda.spanishMod.Library] = js.native
      
      type _To = typings.yadda.languageMod.^[typings.yadda.spanishMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `Spanish.foo` */
      override def _to: typings.yadda.languageMod.^[typings.yadda.spanishMod.Library] = ^
    }
    
    object Ukrainian extends Shortcut {
      
      @JSImport("yadda", "localisation.Ukrainian")
      @js.native
      val ^ : typings.yadda.languageMod.^[typings.yadda.ukrainianMod.Library] = js.native
      
      type _To = typings.yadda.languageMod.^[typings.yadda.ukrainianMod.Library]
      
      /* This means you don't have to write `^`, but can instead just say `Ukrainian.foo` */
      override def _to: typings.yadda.languageMod.^[typings.yadda.ukrainianMod.Library] = ^
    }
  }
  
  object parsers {
    
    @JSImport("yadda", "parsers.FeatureFileParser")
    @js.native
    class FeatureFileParser ()
      extends typings.yadda.libMod.parsers.FeatureFileParser {
      def this(language: typings.yadda.languageMod.^[typings.yadda.languageMod.Library]) = this()
      def this(options: Options) = this()
    }
    
    @JSImport("yadda", "parsers.FeatureParser")
    @js.native
    class FeatureParser ()
      extends typings.yadda.libMod.parsers.FeatureParser {
      def this(language: typings.yadda.languageMod.^[typings.yadda.languageMod.Library]) = this()
      def this(options: Options) = this()
    }
    
    @JSImport("yadda", "parsers.StepParser")
    @js.native
    class StepParser ()
      extends typings.yadda.libMod.parsers.StepParser
  }
  
  object plugins {
    
    @JSImport("yadda", "plugins")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def casper(yadda: typings.yadda.yaddaMod.^, casper: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("casper")(yadda.asInstanceOf[js.Any], casper.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("yadda", "plugins.jasmine")
    @js.native
    val jasmine: MochaPlugin = js.native
    
    @JSImport("yadda", "plugins.mocha")
    @js.native
    val mocha: MochaPlugin = js.native
  }
}
