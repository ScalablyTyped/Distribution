package typings.whatwgEncoding

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("whatwg-encoding", "decode")
  @js.native
  def decode(buffer: Buffer, fallbackEncodingName: String): String = js.native
  
  @JSImport("whatwg-encoding", "getBOMEncoding")
  @js.native
  def getBOMEncoding(buffer: Buffer): String | Null = js.native
  
  @JSImport("whatwg-encoding", "isSupported")
  @js.native
  def isSupported(name: String): Boolean = js.native
  
  @JSImport("whatwg-encoding", "labelToName")
  @js.native
  def labelToName(label: String): String | Null = js.native
}
