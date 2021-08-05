package typings.whatwgMimetype

import typings.std.Map
import typings.whatwgMimetype.anon.AllowParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("whatwg-mimetype", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with MIMEType {
    def this(s: String) = this()
  }
  @JSImport("whatwg-mimetype", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def parse(s: String): MIMEType | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(s.asInstanceOf[js.Any]).asInstanceOf[MIMEType | Null]
  
  @js.native
  trait MIMEType extends StObject {
    
    val essence: String = js.native
    
    def isHTML(): Boolean = js.native
    
    def isJavaScript(): Boolean = js.native
    def isJavaScript(opts: AllowParameters): Boolean = js.native
    
    def isXML(): Boolean = js.native
    
    val parameters: Map[String, String] = js.native
    
    var subtype: String = js.native
    
    var `type`: String = js.native
  }
}
