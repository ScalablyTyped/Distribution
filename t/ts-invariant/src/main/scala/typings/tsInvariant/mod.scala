package typings.tsInvariant

import typings.node.processMod.global.NodeJS.Process
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ts-invariant", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    inline def apply(condition: js.Any): Unit = ^.asInstanceOf[js.Dynamic].apply(condition.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def apply(condition: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].apply(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(condition: js.Any, message: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("ts-invariant", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def error(args: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def warn(args: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("ts-invariant", "InvariantError")
  @js.native
  class InvariantError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    def this(message: Double) = this()
    
    var framesToPop: Double = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  object invariant {
    
    inline def apply(condition: js.Any): Unit = ^.asInstanceOf[js.Dynamic].apply(condition.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def apply(condition: js.Any, message: String): Unit = (^.asInstanceOf[js.Dynamic].apply(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(condition: js.Any, message: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("ts-invariant", "invariant")
    @js.native
    val ^ : js.Any = js.native
    
    inline def error(args: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def warn(args: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("ts-invariant", "process")
  @js.native
  def process: Process = js.native
  inline def process_=(x: Process): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("process")(x.asInstanceOf[js.Any])
}
