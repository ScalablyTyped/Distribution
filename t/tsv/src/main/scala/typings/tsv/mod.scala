package typings.tsv

import org.scalablytyped.runtime.Shortcut
import typings.tsv.anon.Header
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("tsv", JSImport.Namespace)
  @js.native
  val ^ : Parser = js.native
  
  @JSImport("tsv", "CSV")
  @js.native
  val CSV: Parser = js.native
  
  @JSImport("tsv", "Parser")
  @js.native
  open class Parser protected () extends StObject {
    def this(sep: String) = this()
    def this(sep: String, options: Header) = this()
    
    var header: Boolean = js.native
    
    def parse(tsv: String): js.Array[Any] = js.native
    
    var sep: String = js.native
    
    def stringify(data: js.Array[Any]): String = js.native
  }
  
  @JSImport("tsv", "TSV")
  @js.native
  val TSV: Parser = js.native
  type TSV = Parser
  
  type _To = Parser
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Parser = ^
}
