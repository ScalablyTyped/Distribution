package typings.tlfLog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tlf-log", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addLevel(name: String, opts: NewLevelAfter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_addLevel")(name.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def addLevel(name: String, opts: NewLevelBefore): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_addLevel")(name.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def debug(messages: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(messages.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def debug_(messages: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug_")(messages.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def deindent(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_deindent")().asInstanceOf[Unit]
  
  @scala.inline
  def deprefix(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_deprefix")().asInstanceOf[Unit]
  
  @scala.inline
  def error(messages: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(messages.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def error_(messages: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error_")(messages.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def fatal(messages: js.Any*): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("fatal")(messages.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  @scala.inline
  def fatal_(messages: js.Any*): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("fatal_")(messages.asInstanceOf[js.Any]).asInstanceOf[scala.Nothing]
  
  @scala.inline
  def indent(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_indent")().asInstanceOf[Unit]
  
  @scala.inline
  def info(messages: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(messages.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def info_(messages: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info_")(messages.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def prefix(str: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_prefix")(str.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setLevel(level: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_setLevel")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def trace(messages: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")(messages.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def trace_(messages: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trace_")(messages.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def warn(messages: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(messages.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def warn_(messages: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn_")(messages.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait NewLevel extends StObject {
    
    var afterLog: js.UndefOr[js.Function0[Unit]] = js.undefined
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
  
  trait NewLevelAfter
    extends StObject
       with NewLevel {
    
    var after: String
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
  
  trait NewLevelBefore
    extends StObject
       with NewLevel {
    
    var before: String
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
