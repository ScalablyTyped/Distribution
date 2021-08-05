package typings.webgme.Gme

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Concepts {
  
  trait ComposeChain extends StObject {
    
    var objId: String
    
    var subCompId: js.UndefOr[String] = js.undefined
  }
  object ComposeChain {
    
    inline def apply(objId: String): ComposeChain = {
      val __obj = js.Dynamic.literal(objId = objId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComposeChain]
    }
    
    extension [Self <: ComposeChain](x: Self) {
      
      inline def setObjId(value: String): Self = StObject.set(x, "objId", value.asInstanceOf[js.Any])
      
      inline def setSubCompId(value: String): Self = StObject.set(x, "subCompId", value.asInstanceOf[js.Any])
      
      inline def setSubCompIdUndefined: Self = StObject.set(x, "subCompId", js.undefined)
    }
  }
  
  trait ConnectionCollectionPair extends StObject {
    
    var destinations: js.Array[ComposeChain]
    
    var sources: js.Array[ComposeChain]
  }
  object ConnectionCollectionPair {
    
    inline def apply(destinations: js.Array[ComposeChain], sources: js.Array[ComposeChain]): ConnectionCollectionPair = {
      val __obj = js.Dynamic.literal(destinations = destinations.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionCollectionPair]
    }
    
    extension [Self <: ConnectionCollectionPair](x: Self) {
      
      inline def setDestinations(value: js.Array[ComposeChain]): Self = StObject.set(x, "destinations", value.asInstanceOf[js.Any])
      
      inline def setDestinationsVarargs(value: ComposeChain*): Self = StObject.set(x, "destinations", js.Array(value :_*))
      
      inline def setSources(value: js.Array[ComposeChain]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      inline def setSourcesVarargs(value: ComposeChain*): Self = StObject.set(x, "sources", js.Array(value :_*))
    }
  }
  
  trait ConnectionStyle extends StObject {
    
    var endArrow: String
    
    var startArrow: String
  }
  object ConnectionStyle {
    
    inline def apply(endArrow: String, startArrow: String): ConnectionStyle = {
      val __obj = js.Dynamic.literal(endArrow = endArrow.asInstanceOf[js.Any], startArrow = startArrow.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionStyle]
    }
    
    extension [Self <: ConnectionStyle](x: Self) {
      
      inline def setEndArrow(value: String): Self = StObject.set(x, "endArrow", value.asInstanceOf[js.Any])
      
      inline def setStartArrow(value: String): Self = StObject.set(x, "startArrow", value.asInstanceOf[js.Any])
    }
  }
}
