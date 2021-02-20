package typings.textr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("textr", JSImport.Namespace)
  @js.native
  def apply(): typings.textr.mod.textr = js.native
  @JSImport("textr", JSImport.Namespace)
  @js.native
  def apply(defaults: TextrArgs): typings.textr.mod.textr = js.native
  
  type TextrArgs = String | js.Object
  
  @js.native
  trait textr extends StObject {
    
    /**
      * Process given text by the middlewares.
      */
    def exec(text: String): String = js.native
    def exec(text: String, options: js.Object): String = js.native
    
    /**
      * List of registred middlewares.
      */
    def mws(): js.Array[String] = js.native
    
    /**
      * Register new middleware and array of middlewares.
      */
    def use(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param fn because its type any is not an array type */ fn: js.Any
    ): typings.textr.mod.textr = js.native
  }
}
