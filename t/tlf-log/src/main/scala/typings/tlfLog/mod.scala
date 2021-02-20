package typings.tlfLog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tlf-log", "_addLevel")
  @js.native
  def addLevel(name: String, opts: NewLevelAfter): Unit = js.native
  @JSImport("tlf-log", "_addLevel")
  @js.native
  def addLevel(name: String, opts: NewLevelBefore): Unit = js.native
  
  @JSImport("tlf-log", "debug")
  @js.native
  def debug(messages: js.Any*): Unit = js.native
  
  @JSImport("tlf-log", "debug_")
  @js.native
  def debug_(messages: js.Any*): Unit = js.native
  
  @JSImport("tlf-log", "_deindent")
  @js.native
  def deindent(): Unit = js.native
  
  @JSImport("tlf-log", "_deprefix")
  @js.native
  def deprefix(): Unit = js.native
  
  @JSImport("tlf-log", "error")
  @js.native
  def error(messages: js.Any*): Unit = js.native
  
  @JSImport("tlf-log", "error_")
  @js.native
  def error_(messages: js.Any*): Unit = js.native
  
  @JSImport("tlf-log", "fatal")
  @js.native
  def fatal(messages: js.Any*): scala.Nothing = js.native
  
  @JSImport("tlf-log", "fatal_")
  @js.native
  def fatal_(messages: js.Any*): scala.Nothing = js.native
  
  @JSImport("tlf-log", "_indent")
  @js.native
  def indent(): Unit = js.native
  
  @JSImport("tlf-log", "info")
  @js.native
  def info(messages: js.Any*): Unit = js.native
  
  @JSImport("tlf-log", "info_")
  @js.native
  def info_(messages: js.Any*): Unit = js.native
  
  @JSImport("tlf-log", "_prefix")
  @js.native
  def prefix(str: String): Unit = js.native
  
  @JSImport("tlf-log", "_setLevel")
  @js.native
  def setLevel(level: String): Unit = js.native
  
  @JSImport("tlf-log", "trace")
  @js.native
  def trace(messages: js.Any*): Unit = js.native
  
  @JSImport("tlf-log", "trace_")
  @js.native
  def trace_(messages: js.Any*): Unit = js.native
  
  @JSImport("tlf-log", "warn")
  @js.native
  def warn(messages: js.Any*): Unit = js.native
  
  @JSImport("tlf-log", "warn_")
  @js.native
  def warn_(messages: js.Any*): Unit = js.native
  
  @js.native
  trait NewLevel extends StObject {
    
    var afterLog: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object NewLevel {
    
    @scala.inline
    def apply(): NewLevel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NewLevel]
    }
    
    @scala.inline
    implicit class NewLevelMutableBuilder[Self <: NewLevel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterLog(value: () => Unit): Self = StObject.set(x, "afterLog", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAfterLogUndefined: Self = StObject.set(x, "afterLog", js.undefined)
    }
  }
  
  @js.native
  trait NewLevelAfter extends NewLevel {
    
    var after: String = js.native
  }
  object NewLevelAfter {
    
    @scala.inline
    def apply(after: String): NewLevelAfter = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewLevelAfter]
    }
    
    @scala.inline
    implicit class NewLevelAfterMutableBuilder[Self <: NewLevelAfter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NewLevelBefore extends NewLevel {
    
    var before: String = js.native
  }
  object NewLevelBefore {
    
    @scala.inline
    def apply(before: String): NewLevelBefore = {
      val __obj = js.Dynamic.literal(before = before.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewLevelBefore]
    }
    
    @scala.inline
    implicit class NewLevelBeforeMutableBuilder[Self <: NewLevelBefore] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    }
  }
}
