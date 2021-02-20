package typings.tsInvariant

import typings.node.processMod.global.NodeJS.Process
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ts-invariant", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("ts-invariant", JSImport.Default)
    @js.native
    def apply(condition: js.Any): Unit = js.native
    @JSImport("ts-invariant", JSImport.Default)
    @js.native
    def apply(condition: js.Any, message: String): Unit = js.native
    @JSImport("ts-invariant", JSImport.Default)
    @js.native
    def apply(condition: js.Any, message: Double): Unit = js.native
    
    @JSImport("ts-invariant", "default.error")
    @js.native
    def error(args: js.Any*): Unit = js.native
    
    @JSImport("ts-invariant", "default.warn")
    @js.native
    def warn(args: js.Any*): Unit = js.native
  }
  
  @JSImport("ts-invariant", "InvariantError")
  @js.native
  class InvariantError () extends Error {
    def this(message: String) = this()
    def this(message: Double) = this()
    
    var framesToPop: Double = js.native
  }
  
  object invariant {
    
    @JSImport("ts-invariant", "invariant")
    @js.native
    def apply(condition: js.Any): Unit = js.native
    @JSImport("ts-invariant", "invariant")
    @js.native
    def apply(condition: js.Any, message: String): Unit = js.native
    @JSImport("ts-invariant", "invariant")
    @js.native
    def apply(condition: js.Any, message: Double): Unit = js.native
    
    @JSImport("ts-invariant", "invariant.error")
    @js.native
    def error(args: js.Any*): Unit = js.native
    
    @JSImport("ts-invariant", "invariant.warn")
    @js.native
    def warn(args: js.Any*): Unit = js.native
  }
  
  @JSImport("ts-invariant", "process")
  @js.native
  def process: Process = js.native
  @scala.inline
  def process_=(x: Process): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("process")(x.asInstanceOf[js.Any])
}
