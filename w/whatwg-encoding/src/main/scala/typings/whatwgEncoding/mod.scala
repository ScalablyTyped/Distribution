package typings.whatwgEncoding

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("whatwg-encoding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def decode(buffer: Buffer, fallbackEncodingName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buffer.asInstanceOf[js.Any], fallbackEncodingName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getBOMEncoding(buffer: Buffer): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getBOMEncoding")(buffer.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  @scala.inline
  def isSupported(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def labelToName(label: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("labelToName")(label.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
