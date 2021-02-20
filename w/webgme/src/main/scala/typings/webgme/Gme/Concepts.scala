package typings.webgme.Gme

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Concepts {
  
  @js.native
  trait ComposeChain extends StObject {
    
    var objId: String = js.native
    
    var subCompId: js.UndefOr[String] = js.native
  }
  object ComposeChain {
    
    @scala.inline
    def apply(objId: String): ComposeChain = {
      val __obj = js.Dynamic.literal(objId = objId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComposeChain]
    }
    
    @scala.inline
    implicit class ComposeChainMutableBuilder[Self <: ComposeChain] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setObjId(value: String): Self = StObject.set(x, "objId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubCompId(value: String): Self = StObject.set(x, "subCompId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubCompIdUndefined: Self = StObject.set(x, "subCompId", js.undefined)
    }
  }
  
  @js.native
  trait ConnectionCollectionPair extends StObject {
    
    var destinations: js.Array[ComposeChain] = js.native
    
    var sources: js.Array[ComposeChain] = js.native
  }
  object ConnectionCollectionPair {
    
    @scala.inline
    def apply(destinations: js.Array[ComposeChain], sources: js.Array[ComposeChain]): ConnectionCollectionPair = {
      val __obj = js.Dynamic.literal(destinations = destinations.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionCollectionPair]
    }
    
    @scala.inline
    implicit class ConnectionCollectionPairMutableBuilder[Self <: ConnectionCollectionPair] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestinations(value: js.Array[ComposeChain]): Self = StObject.set(x, "destinations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationsVarargs(value: ComposeChain*): Self = StObject.set(x, "destinations", js.Array(value :_*))
      
      @scala.inline
      def setSources(value: js.Array[ComposeChain]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcesVarargs(value: ComposeChain*): Self = StObject.set(x, "sources", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ConnectionStyle extends StObject {
    
    var endArrow: String = js.native
    
    var startArrow: String = js.native
  }
  object ConnectionStyle {
    
    @scala.inline
    def apply(endArrow: String, startArrow: String): ConnectionStyle = {
      val __obj = js.Dynamic.literal(endArrow = endArrow.asInstanceOf[js.Any], startArrow = startArrow.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionStyle]
    }
    
    @scala.inline
    implicit class ConnectionStyleMutableBuilder[Self <: ConnectionStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndArrow(value: String): Self = StObject.set(x, "endArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartArrow(value: String): Self = StObject.set(x, "startArrow", value.asInstanceOf[js.Any])
    }
  }
}
