package typings.yadda

import typings.yadda.libMod.Converter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dictionaryMod {
  
  @JSImport("yadda/lib/Dictionary", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Dictionary {
    def this(prefix: String) = this()
  }
  
  @js.native
  trait Dictionary extends StObject {
    
    def define(term: String, pattern: String): this.type = js.native
    def define(term: String, pattern: String, converters: js.Array[Converter]): this.type = js.native
    def define(term: String, pattern: String, converters: Converter): this.type = js.native
    def define(term: String, pattern: js.RegExp): this.type = js.native
    def define(term: String, pattern: js.RegExp, converters: js.Array[Converter]): this.type = js.native
    def define(term: String, pattern: js.RegExp, converters: Converter): this.type = js.native
    
    def merge(other: Dictionary): Dictionary = js.native
  }
}
