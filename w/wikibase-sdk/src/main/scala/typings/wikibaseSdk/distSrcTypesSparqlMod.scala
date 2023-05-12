package typings.wikibaseSdk

import typings.std.Record
import typings.wikibaseSdk.anon.Bindings
import typings.wikibaseSdk.anon.Vars
import typings.wikibaseSdk.wikibaseSdkStrings.bnode
import typings.wikibaseSdk.wikibaseSdkStrings.uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesSparqlMod {
  
  trait SparqlResults extends StObject {
    
    val head: Vars
    
    val results: Bindings
  }
  object SparqlResults {
    
    inline def apply(head: Vars, results: Bindings): SparqlResults = {
      val __obj = js.Dynamic.literal(head = head.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
      __obj.asInstanceOf[SparqlResults]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SparqlResults] (val x: Self) extends AnyVal {
      
      inline def setHead(value: Vars): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      inline def setResults(value: Bindings): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    }
  }
  
  trait SparqlValueObj extends StObject {
    
    val datatype: js.UndefOr[String] = js.undefined
    
    val `type`: uri | bnode
    
    val value: String
  }
  object SparqlValueObj {
    
    inline def apply(`type`: uri | bnode, value: String): SparqlValueObj = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SparqlValueObj]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SparqlValueObj] (val x: Self) extends AnyVal {
      
      inline def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      inline def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      inline def setType(value: uri | bnode): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type SparqlValueRaw = String | Double | Boolean
  
  type SparqlValueType = SparqlValueRaw | (Record[String, SparqlValueRaw])
}
