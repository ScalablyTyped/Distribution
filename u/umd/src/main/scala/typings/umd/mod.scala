package typings.umd

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("umd", JSImport.Namespace)
  @js.native
  def apply(name: String, src: String): String = js.native
  @JSImport("umd", JSImport.Namespace)
  @js.native
  def apply(name: String, src: String, options: Boolean): String = js.native
  @JSImport("umd", JSImport.Namespace)
  @js.native
  def apply(name: String, src: String, options: Options): String = js.native
  
  @JSImport("umd", "postlude")
  @js.native
  def postlude(moduleName: String): String = js.native
  @JSImport("umd", "postlude")
  @js.native
  def postlude(moduleName: String, options: Boolean): String = js.native
  @JSImport("umd", "postlude")
  @js.native
  def postlude(moduleName: String, options: Options): String = js.native
  
  @JSImport("umd", "prelude")
  @js.native
  def prelude(moduleName: String): String = js.native
  @JSImport("umd", "prelude")
  @js.native
  def prelude(moduleName: String, options: Boolean): String = js.native
  @JSImport("umd", "prelude")
  @js.native
  def prelude(moduleName: String, options: Options): String = js.native
  
  @js.native
  trait Options extends StObject {
    
    var commonJS: js.UndefOr[Boolean] = js.native
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
      def setCommonJS(value: Boolean): Self = StObject.set(x, "commonJS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommonJSUndefined: Self = StObject.set(x, "commonJS", js.undefined)
    }
  }
}
