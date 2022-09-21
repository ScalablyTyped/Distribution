package typings.unicodeTrie

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builderMod {
  
  @JSImport("unicode-trie/builder", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with UnicodeTrieBuilder {
    def this(initialValue: Double, errorValue: Double) = this()
  }
  
  @js.native
  trait UnicodeTrieBuilder extends StObject {
    
    def freeze(): typings.unicodeTrie.mod.^ = js.native
    
    def get(codePoint: Double): Double = js.native
    def get(codePoint: Double, fromLSCP: Boolean): Double = js.native
    
    def set(codePoint: Double, value: Double): UnicodeTrieBuilder = js.native
    
    def setRange(start: Double, end: Double, value: Double): UnicodeTrieBuilder = js.native
    def setRange(start: Double, end: Double, value: Double, overwrite: Boolean): UnicodeTrieBuilder = js.native
    
    def toBuffer(): Buffer = js.native
  }
}
