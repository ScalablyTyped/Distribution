package typings.xmlpoke

import org.scalablytyped.runtime.StringDictionary
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object XmlPoke {
  
  @js.native
  trait API extends StObject {
    
    def add(map: PathToValueMap): API = js.native
    def add(xpath: String, value: Value): API = js.native
    
    def addNamespace(prefix: String, uri: String): API = js.native
    
    def clear(xpath: String): API = js.native
    
    def ensure(xpath: String): API = js.native
    
    def errorOnNoMatches(): API = js.native
    
    def remove(xpath: String): API = js.native
    
    def set(map: PathToValueMap): API = js.native
    def set(xpath: String, value: Value): API = js.native
    
    def setOrAdd(map: PathToValueMap): API = js.native
    def setOrAdd(xpath: String, value: Value): API = js.native
    
    def withBasePath(xpath: String): API = js.native
  }
  
  trait CDataValue
    extends StObject
       with _Value {
    
    var value: String
  }
  object CDataValue {
    
    inline def apply(value: String): CDataValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CDataValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CDataValue] (val x: Self) extends AnyVal {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type PathToValueMap = {[xpath: string] : xmlpoke.XmlPoke.Value}
  }}}
  to avoid circular code involving: 
  - xmlpoke.XmlPoke.PathToValueMap
  - xmlpoke.XmlPoke.Transform
  - xmlpoke.XmlPoke.Value
  */
  trait PathToValueMap
    extends StObject
       with /* xpath */ StringDictionary[Value]
       with _Value
  object PathToValueMap {
    
    inline def apply(): PathToValueMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathToValueMap]
    }
  }
  
  // ghost module
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type Transform = (node : std.Node, value : string): xmlpoke.XmlPoke.Value
  }}}
  to avoid circular code involving: 
  - xmlpoke.XmlPoke.Transform
  - xmlpoke.XmlPoke.Value
  */
  @js.native
  trait Transform
    extends StObject
       with _Value {
    
    def apply(node: Node, value: String): Value = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Boolean
    - scala.Double
    - typings.xmlpoke.XmlPoke.XmlValue
    - typings.xmlpoke.XmlPoke.CDataValue
    - typings.xmlpoke.XmlPoke.PathToValueMap
    - typings.xmlpoke.XmlPoke.Transform
  */
  type Value = _Value | String | Boolean | Double
  
  trait XmlValue
    extends StObject
       with _Value {
    
    var value: String
  }
  object XmlValue {
    
    inline def apply(value: String): XmlValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[XmlValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XmlValue] (val x: Self) extends AnyVal {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait _Value extends StObject
}
