package typings.tabtab

import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.tabtab.anon.ReadonlyCompletionItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tabtab", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def completionItem(item: String): CompletionItem_ = ^.asInstanceOf[js.Dynamic].applyDynamic("completionItem")(item.asInstanceOf[js.Any]).asInstanceOf[CompletionItem_]
  inline def completionItem(item: CompletionItem_): CompletionItem_ = ^.asInstanceOf[js.Dynamic].applyDynamic("completionItem")(item.asInstanceOf[js.Any]).asInstanceOf[CompletionItem_]
  
  inline def install(options: InstallOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def log(args: js.Array[String | ReadonlyCompletionItem]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def parseEnv(env: ProcessEnv): TabtabEnv = ^.asInstanceOf[js.Dynamic].applyDynamic("parseEnv")(env.asInstanceOf[js.Any]).asInstanceOf[TabtabEnv]
  
  inline def uninstall(options: UninstallOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("uninstall")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  type CompleteItemOrString = String | CompletionItem_
  
  trait CompletionItem_ extends StObject {
    
    /**
      * The optional description of the completion.
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * The sub-command or option name.
      */
    var name: String
  }
  object CompletionItem_ {
    
    inline def apply(name: String): CompletionItem_ = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompletionItem_]
    }
    
    extension [Self <: CompletionItem_](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InstallOptions extends StObject {
    
    /** The program that does the completion (can be the same program). */
    val completer: String
    
    /** The program to complete. */
    val name: String
  }
  object InstallOptions {
    
    inline def apply(completer: String, name: String): InstallOptions = {
      val __obj = js.Dynamic.literal(completer = completer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstallOptions]
    }
    
    extension [Self <: InstallOptions](x: Self) {
      
      inline def setCompleter(value: String): Self = StObject.set(x, "completer", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait TabtabEnv extends StObject {
    
    /**
      * A Boolean indicating whether we act in "plumbing mode" or not
      */
    var complete: Boolean
    
    /**
      * The last String word of the line
      */
    var last: String
    
    /**
      * The last word String of partial
      */
    var lastPartial: String
    
    /**
      * The String input line
      */
    var line: String
    
    /**
      * The String part of line preceding cursor position
      */
    var partial: String
    
    /**
      * A Number indicating cursor position
      */
    var point: Double
    
    /**
      * The String word preceding last
      */
    var prev: String
    
    /**
      * The Number of words in the completed line
      */
    var words: Double
  }
  object TabtabEnv {
    
    inline def apply(
      complete: Boolean,
      last: String,
      lastPartial: String,
      line: String,
      partial: String,
      point: Double,
      prev: String,
      words: Double
    ): TabtabEnv = {
      val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], lastPartial = lastPartial.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], partial = partial.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabtabEnv]
    }
    
    extension [Self <: TabtabEnv](x: Self) {
      
      inline def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setLast(value: String): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      inline def setLastPartial(value: String): Self = StObject.set(x, "lastPartial", value.asInstanceOf[js.Any])
      
      inline def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setPartial(value: String): Self = StObject.set(x, "partial", value.asInstanceOf[js.Any])
      
      inline def setPoint(value: Double): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
      
      inline def setPrev(value: String): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      inline def setWords(value: Double): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
    }
  }
  
  trait UninstallOptions extends StObject {
    
    /** The program to remove completions for. */
    val name: String
  }
  object UninstallOptions {
    
    inline def apply(name: String): UninstallOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[UninstallOptions]
    }
    
    extension [Self <: UninstallOptions](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
