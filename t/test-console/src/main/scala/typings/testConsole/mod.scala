package typings.testConsole

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("test-console", "stderr")
  @js.native
  val stderr: TestStream = js.native
  
  @JSImport("test-console", "stdout")
  @js.native
  val stdout: TestStream = js.native
  
  @js.native
  trait Inspector extends StObject {
    
    var output: Output = js.native
    
    def restore(): Unit = js.native
    @JSName("restore")
    var restore_Original: Restore = js.native
  }
  
  type NoOutputCallback = js.Function0[Unit]
  
  @js.native
  trait Options extends StObject {
    
    var isTTY: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsTTY(value: Boolean): Self = StObject.set(x, "isTTY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTTYUndefined: Self = StObject.set(x, "isTTY", js.undefined)
    }
  }
  
  type Output = js.Array[String]
  
  type OutputCallback = js.Function1[/* output */ Output, Unit]
  
  type Restore = js.Function0[Unit]
  
  @js.native
  trait TestStream extends StObject {
    
    def ignore(): Restore = js.native
    def ignore(options: Options): Restore = js.native
    
    def ignoreSync(fn: NoOutputCallback): Unit = js.native
    def ignoreSync(options: Options, fn: NoOutputCallback): Unit = js.native
    
    def inspect(): Inspector = js.native
    def inspect(options: Options): Inspector = js.native
    
    def inspectSync(fn: OutputCallback): Output = js.native
    def inspectSync(options: Options, fn: OutputCallback): Output = js.native
  }
}
