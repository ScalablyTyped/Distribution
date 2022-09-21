package typings.testConsole

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("test-console", "stderr")
  @js.native
  val stderr: TestStream = js.native
  
  @JSImport("test-console", "stdout")
  @js.native
  val stdout: TestStream = js.native
  
  type AsyncNoOutputCallback = js.Function0[js.Promise[Unit]]
  
  type AsyncOutputCallback = js.Function1[/* output */ Output, js.Promise[Unit]]
  
  trait Inspector extends StObject {
    
    var output: Output
    
    def restore(): Unit
    @JSName("restore")
    var restore_Original: Restore
  }
  object Inspector {
    
    inline def apply(output: Output, restore: () => Unit): Inspector = {
      val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any], restore = js.Any.fromFunction0(restore))
      __obj.asInstanceOf[Inspector]
    }
    
    extension [Self <: Inspector](x: Self) {
      
      inline def setOutput(value: Output): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputVarargs(value: String*): Self = StObject.set(x, "output", js.Array(value*))
      
      inline def setRestore(value: () => Unit): Self = StObject.set(x, "restore", js.Any.fromFunction0(value))
    }
  }
  
  type NoOutputCallback = js.Function0[Unit]
  
  trait Options extends StObject {
    
    var isTTY: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setIsTTY(value: Boolean): Self = StObject.set(x, "isTTY", value.asInstanceOf[js.Any])
      
      inline def setIsTTYUndefined: Self = StObject.set(x, "isTTY", js.undefined)
    }
  }
  
  type Output = js.Array[String]
  
  type OutputCallback = js.Function1[/* output */ Output, Unit]
  
  type Restore = js.Function0[Unit]
  
  @js.native
  trait TestStream extends StObject {
    
    def ignore(): Restore = js.native
    def ignore(options: Options): Restore = js.native
    
    def ignoreAsync(fn: AsyncNoOutputCallback): js.Promise[Unit] = js.native
    def ignoreAsync(options: Options, fn: AsyncNoOutputCallback): js.Promise[Unit] = js.native
    
    def ignoreSync(fn: NoOutputCallback): Unit = js.native
    def ignoreSync(options: Options, fn: NoOutputCallback): Unit = js.native
    
    def inspect(): Inspector = js.native
    def inspect(options: Options): Inspector = js.native
    
    def inspectAsync(fn: AsyncOutputCallback): js.Promise[Output] = js.native
    def inspectAsync(options: Options, fn: AsyncOutputCallback): js.Promise[Output] = js.native
    
    def inspectSync(fn: OutputCallback): Output = js.native
    def inspectSync(options: Options, fn: OutputCallback): Output = js.native
  }
}
