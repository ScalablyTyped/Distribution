package typings.tsInvariant

import typings.std.Error
import typings.std.Exclude
import typings.tsInvariant.tsInvariantStrings.silent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ts-invariant", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    inline def apply(condition: Any): /* asserts condition */ Boolean = ^.asInstanceOf[js.Dynamic].apply(condition.asInstanceOf[js.Any]).asInstanceOf[/* asserts condition */ Boolean]
    inline def apply(condition: Any, message: String): /* asserts condition */ Boolean = (^.asInstanceOf[js.Dynamic].apply(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts condition */ Boolean]
    inline def apply(condition: Any, message: Double): /* asserts condition */ Boolean = (^.asInstanceOf[js.Dynamic].apply(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts condition */ Boolean]
    
    @JSImport("ts-invariant", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def debug(data: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(data.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    inline def debug(message: Any, optionalParams: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(List(message.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    inline def debug(message: Unit, optionalParams: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(List(message.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def error(data: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(data.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    inline def error(message: Any, optionalParams: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(List(message.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    inline def error(message: Unit, optionalParams: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(List(message.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def log(data: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(data.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    inline def log(message: Any, optionalParams: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(List(message.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    inline def log(message: Unit, optionalParams: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(List(message.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def warn(data: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(data.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    inline def warn(message: Any, optionalParams: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(List(message.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    inline def warn(message: Unit, optionalParams: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(List(message.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  }
  
  @JSImport("ts-invariant", "InvariantError")
  @js.native
  open class InvariantError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    def this(message: Double) = this()
    
    var framesToPop: Double = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  object invariant {
    
    inline def apply(condition: Any): /* asserts condition */ Boolean = ^.asInstanceOf[js.Dynamic].apply(condition.asInstanceOf[js.Any]).asInstanceOf[/* asserts condition */ Boolean]
    inline def apply(condition: Any, message: String): /* asserts condition */ Boolean = (^.asInstanceOf[js.Dynamic].apply(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts condition */ Boolean]
    inline def apply(condition: Any, message: Double): /* asserts condition */ Boolean = (^.asInstanceOf[js.Dynamic].apply(condition.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[/* asserts condition */ Boolean]
    
    @JSImport("ts-invariant", "invariant")
    @js.native
    val ^ : js.Any = js.native
    
    inline def debug(data: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(data.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    inline def debug(message: Any, optionalParams: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(List(message.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    inline def debug(message: Unit, optionalParams: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(List(message.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def error(data: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(data.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    inline def error(message: Any, optionalParams: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(List(message.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    inline def error(message: Unit, optionalParams: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(List(message.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def log(data: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(data.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    inline def log(message: Any, optionalParams: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(List(message.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    inline def log(message: Unit, optionalParams: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(List(message.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    inline def warn(data: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(data.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    inline def warn(message: Any, optionalParams: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(List(message.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    inline def warn(message: Unit, optionalParams: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(List(message.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  }
  
  inline def setVerbosity(level: VerbosityLevel): VerbosityLevel = ^.asInstanceOf[js.Dynamic].applyDynamic("setVerbosity")(level.asInstanceOf[js.Any]).asInstanceOf[VerbosityLevel]
  
  type ConsoleMethodName = Exclude[VerbosityLevel, silent]
  
  /* Rewritten from type alias, can be one of: 
    - typings.tsInvariant.tsInvariantStrings.debug
    - typings.tsInvariant.tsInvariantStrings.log
    - typings.tsInvariant.tsInvariantStrings.warn
    - typings.tsInvariant.tsInvariantStrings.error
    - typings.tsInvariant.tsInvariantStrings.silent
  */
  trait VerbosityLevel extends StObject
}
