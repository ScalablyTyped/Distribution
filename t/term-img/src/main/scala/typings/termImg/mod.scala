package typings.termImg

import org.scalablytyped.runtime.Instantiable0
import typings.ansiEscapes.mod.ImageOptions
import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Get the image as a `string` that you can log manually.
  	@param image - Filepath to an image or an image as a buffer.
  	@example
  	```
  	import termImg = require('term-img');
  	function fallback() {
  		// Do something else when not supported
  	}
  	termImg('unicorn.jpg', {fallback});
  	```
  	*/
  @JSImport("term-img", JSImport.Namespace)
  @js.native
  def apply[FallbackType](image: String): String | FallbackType = js.native
  @JSImport("term-img", JSImport.Namespace)
  @js.native
  def apply[FallbackType](image: String, options: Options[FallbackType]): String | FallbackType = js.native
  @JSImport("term-img", JSImport.Namespace)
  @js.native
  def apply[FallbackType](image: Buffer): String | FallbackType = js.native
  @JSImport("term-img", JSImport.Namespace)
  @js.native
  def apply[FallbackType](image: Buffer, options: Options[FallbackType]): String | FallbackType = js.native
  
  @JSImport("term-img", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("term-img", "UnsupportedTerminalError")
  @js.native
  def UnsupportedTerminalError: Instantiable0[UnsupportedTerminalErrorClass] = js.native
  type UnsupportedTerminalError = UnsupportedTerminalErrorClass
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("term-img", "UnsupportedTerminalError")
  @js.native
  class UnsupportedTerminalErrorCls () extends UnsupportedTerminalErrorClass
  
  @scala.inline
  def UnsupportedTerminalError_=(x: Instantiable0[UnsupportedTerminalErrorClass]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnsupportedTerminalError")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Options[FallbackType] extends ImageOptions {
    
    /**
    		Enables you to do something else when the terminal doesn't support images.
    		@default () => throw new UnsupportedTerminalError()
    		*/
    val fallback: js.UndefOr[js.Function0[FallbackType]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply[FallbackType](): Options[FallbackType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[FallbackType]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[_], FallbackType] (val x: Self with Options[FallbackType]) extends AnyVal {
      
      @scala.inline
      def setFallback(value: () => FallbackType): Self = StObject.set(x, "fallback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    }
  }
  
  @js.native
  trait UnsupportedTerminalErrorClass extends Error {
    
    @JSName("name")
    val name_UnsupportedTerminalErrorClass: typings.termImg.termImgStrings.UnsupportedTerminalError = js.native
  }
  object UnsupportedTerminalErrorClass {
    
    @scala.inline
    def apply(message: String, name: typings.termImg.termImgStrings.UnsupportedTerminalError): UnsupportedTerminalErrorClass = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnsupportedTerminalErrorClass]
    }
    
    @scala.inline
    implicit class UnsupportedTerminalErrorClassMutableBuilder[Self <: UnsupportedTerminalErrorClass] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.termImg.termImgStrings.UnsupportedTerminalError): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
