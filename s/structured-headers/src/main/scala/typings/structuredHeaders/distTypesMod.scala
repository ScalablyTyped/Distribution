package typings.structuredHeaders

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  @JSImport("structured-headers/dist/types", "ByteSequence")
  @js.native
  open class ByteSequence protected ()
    extends StObject
       with _BareItem {
    def this(base64Value: String) = this()
    
    var base64Value: String = js.native
    
    def toBase64(): String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - java.lang.String
    - typings.structuredHeaders.distTokenMod.Token
    - typings.structuredHeaders.distTypesMod.ByteSequence
    - scala.Boolean
  */
  type BareItem = _BareItem | Double | String | Boolean
  
  type Dictionary = Map[String, Item | InnerList]
  
  type InnerList = js.Tuple2[js.Array[Item], Parameters]
  
  type Item = js.Tuple2[BareItem, Parameters]
  
  type List = js.Array[InnerList | Item]
  
  type Parameters = Map[String, BareItem]
  
  trait _BareItem extends StObject
}
