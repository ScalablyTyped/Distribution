package typings.termImg

import typings.ansiEscapes.mod.ImageOptions
import typings.node.bufferMod.global.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("term-img", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[FallbackType](image: String): String | FallbackType = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(image.asInstanceOf[js.Any]).asInstanceOf[String | FallbackType]
  inline def default[FallbackType](image: String, options: Options[FallbackType]): String | FallbackType = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(image.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | FallbackType]
  inline def default[FallbackType](image: Buffer): String | FallbackType = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(image.asInstanceOf[js.Any]).asInstanceOf[String | FallbackType]
  inline def default[FallbackType](image: Buffer, options: Options[FallbackType]): String | FallbackType = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(image.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | FallbackType]
  
  @JSImport("term-img", "UnsupportedTerminalError")
  @js.native
  open class UnsupportedTerminalError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    @JSName("name")
    val name_UnsupportedTerminalError: typings.termImg.termImgStrings.UnsupportedTerminalError = js.native
  }
  
  trait Options[FallbackType]
    extends StObject
       with ImageOptions {
    
    /**
    	Enables you to do something else when the terminal doesn't support images.
    	@default () => throw new UnsupportedTerminalError()
    	*/
    val fallback: js.UndefOr[js.Function0[FallbackType]] = js.undefined
  }
  object Options {
    
    inline def apply[FallbackType](): Options[FallbackType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[FallbackType]]
    }
    
    extension [Self <: Options[?], FallbackType](x: Self & Options[FallbackType]) {
      
      inline def setFallback(value: () => FallbackType): Self = StObject.set(x, "fallback", js.Any.fromFunction0(value))
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    }
  }
}
