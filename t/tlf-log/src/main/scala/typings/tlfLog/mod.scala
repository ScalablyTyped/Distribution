package typings.tlfLog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tlf-log", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addLevel(name: String, opts: NewLevelAfter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_addLevel")(name.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addLevel(name: String, opts: NewLevelBefore): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_addLevel")(name.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def debug(messages: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(messages.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def debug_(messages: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug_")(messages.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def deindent(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_deindent")().asInstanceOf[Unit]
  
  inline def deprefix(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_deprefix")().asInstanceOf[Unit]
  
  inline def error(messages: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(messages.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def error_(messages: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error_")(messages.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def fatal(messages: Any*): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("fatal")(messages.asInstanceOf[Seq[js.Any]]*).asInstanceOf[scala.Nothing]
  
  inline def fatal_(messages: Any*): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("fatal_")(messages.asInstanceOf[Seq[js.Any]]*).asInstanceOf[scala.Nothing]
  
  inline def indent(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_indent")().asInstanceOf[Unit]
  
  inline def info(messages: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(messages.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def info_(messages: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info_")(messages.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def prefix(str: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_prefix")(str.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setLevel(level: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_setLevel")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def trace(messages: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")(messages.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def trace_(messages: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trace_")(messages.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def warn(messages: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(messages.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def warn_(messages: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn_")(messages.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  trait NewLevel extends StObject {
    
    var afterLog: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object NewLevel {
    
    inline def apply(): NewLevel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NewLevel]
    }
    
    extension [Self <: NewLevel](x: Self) {
      
      inline def setAfterLog(value: () => Unit): Self = StObject.set(x, "afterLog", js.Any.fromFunction0(value))
      
      inline def setAfterLogUndefined: Self = StObject.set(x, "afterLog", js.undefined)
    }
  }
  
  trait NewLevelAfter
    extends StObject
       with NewLevel {
    
    var after: String
  }
  object NewLevelAfter {
    
    inline def apply(after: String): NewLevelAfter = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewLevelAfter]
    }
    
    extension [Self <: NewLevelAfter](x: Self) {
      
      inline def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    }
  }
  
  trait NewLevelBefore
    extends StObject
       with NewLevel {
    
    var before: String
  }
  object NewLevelBefore {
    
    inline def apply(before: String): NewLevelBefore = {
      val __obj = js.Dynamic.literal(before = before.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewLevelBefore]
    }
    
    extension [Self <: NewLevelBefore](x: Self) {
      
      inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    }
  }
}
