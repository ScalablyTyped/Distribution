package typings.yamlAstParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object markMod {
  
  @JSImport("yaml-ast-parser/dist/src/mark", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Mark {
    def this(name: String, buffer: String, position: Double, line: Double, column: Double) = this()
  }
  
  @js.native
  trait Mark extends StObject {
    
    var buffer: String = js.native
    
    var column: Double = js.native
    
    var filePath: String = js.native
    
    def getSnippet(): String = js.native
    def getSnippet(indent: Double): String = js.native
    def getSnippet(indent: Double, maxLength: Double): String = js.native
    def getSnippet(indent: Unit, maxLength: Double): String = js.native
    
    var line: Double = js.native
    
    var name: String = js.native
    
    var position: Double = js.native
    
    var toLineEnd: Boolean = js.native
    
    def toString(compact: Boolean): String = js.native
  }
}
