package typings.tabtab

import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.tabtab.anon.ReadonlyCompletionItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tabtab", "completionItem")
  @js.native
  def completionItem(item: String): CompletionItem_ = js.native
  @JSImport("tabtab", "completionItem")
  @js.native
  def completionItem(item: CompletionItem_): CompletionItem_ = js.native
  
  @JSImport("tabtab", "install")
  @js.native
  def install(options: InstallOptions): js.Promise[Unit] = js.native
  
  @JSImport("tabtab", "log")
  @js.native
  def log(args: js.Array[String | ReadonlyCompletionItem]): Unit = js.native
  
  @JSImport("tabtab", "parseEnv")
  @js.native
  def parseEnv(env: ProcessEnv): TabtabEnv = js.native
  
  @JSImport("tabtab", "uninstall")
  @js.native
  def uninstall(options: UninstallOptions): js.Promise[Unit] = js.native
  
  type CompleteItemOrString = String | CompletionItem_
  
  @js.native
  trait CompletionItem_ extends StObject {
    
    /**
      * The optional description of the completion.
      */
    var description: js.UndefOr[String] = js.native
    
    /**
      * The sub-command or option name.
      */
    var name: String = js.native
  }
  object CompletionItem_ {
    
    @scala.inline
    def apply(name: String): CompletionItem_ = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompletionItem_]
    }
    
    @scala.inline
    implicit class CompletionItem_MutableBuilder[Self <: CompletionItem_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InstallOptions extends StObject {
    
    /** The program that does the completion (can be the same program). */
    val completer: String = js.native
    
    /** The program to complete. */
    val name: String = js.native
  }
  object InstallOptions {
    
    @scala.inline
    def apply(completer: String, name: String): InstallOptions = {
      val __obj = js.Dynamic.literal(completer = completer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstallOptions]
    }
    
    @scala.inline
    implicit class InstallOptionsMutableBuilder[Self <: InstallOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompleter(value: String): Self = StObject.set(x, "completer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TabtabEnv extends StObject {
    
    /**
      * A Boolean indicating whether we act in "plumbing mode" or not
      */
    var complete: Boolean = js.native
    
    /**
      * The last String word of the line
      */
    var last: String = js.native
    
    /**
      * The last word String of partial
      */
    var lastPartial: String = js.native
    
    /**
      * The String input line
      */
    var line: String = js.native
    
    /**
      * The String part of line preceding cursor position
      */
    var partial: String = js.native
    
    /**
      * A Number indicating cursor position
      */
    var point: Double = js.native
    
    /**
      * The String word preceding last
      */
    var prev: String = js.native
    
    /**
      * The Number of words in the completed line
      */
    var words: Double = js.native
  }
  object TabtabEnv {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class TabtabEnvMutableBuilder[Self <: TabtabEnv] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast(value: String): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastPartial(value: String): Self = StObject.set(x, "lastPartial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartial(value: String): Self = StObject.set(x, "partial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoint(value: Double): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrev(value: String): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWords(value: Double): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UninstallOptions extends StObject {
    
    /** The program to remove completions for. */
    val name: String = js.native
  }
  object UninstallOptions {
    
    @scala.inline
    def apply(name: String): UninstallOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[UninstallOptions]
    }
    
    @scala.inline
    implicit class UninstallOptionsMutableBuilder[Self <: UninstallOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
