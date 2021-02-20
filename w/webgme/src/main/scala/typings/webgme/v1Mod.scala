package typings.webgme

import org.scalablytyped.runtime.StringDictionary
import typings.webgme.GmeCommon.RelId
import typings.webgme.anon.Guid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
Things in this module are deprecated.
This was a serialization supported in version 1.
*/
object v1Mod {
  
  type GUID = String
  
  @js.native
  trait JsonContainment extends /* index */ StringDictionary[JsonContainment]
  object JsonContainment {
    
    @scala.inline
    def apply(): JsonContainment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonContainment]
    }
  }
  
  @js.native
  trait JsonNode extends StObject {
    
    var attributes: js.Any = js.native
    
    var base: String = js.native
    
    var constratints: js.Any = js.native
    
    var meta: js.Any = js.native
    
    var parent: String = js.native
    
    var pointers: js.Any = js.native
    
    var registry: js.Any = js.native
    
    var sets: js.Any = js.native
  }
  object JsonNode {
    
    @scala.inline
    def apply(
      attributes: js.Any,
      base: String,
      constratints: js.Any,
      meta: js.Any,
      parent: String,
      pointers: js.Any,
      registry: js.Any,
      sets: js.Any
    ): JsonNode = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], constratints = constratints.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], pointers = pointers.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], sets = sets.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonNode]
    }
    
    @scala.inline
    implicit class JsonNodeMutableBuilder[Self <: JsonNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: js.Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstratints(value: js.Any): Self = StObject.set(x, "constratints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeta(value: js.Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointers(value: js.Any): Self = StObject.set(x, "pointers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistry(value: js.Any): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSets(value: js.Any): Self = StObject.set(x, "sets", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait JsonObj extends StObject {
    
    // guid tree of hashes
    var bases: js.Any = js.native
    
    var containment: JsonContainment = js.native
    
    var metaSheets: js.Any = js.native
    
    //
    var nodes: js.Any = js.native
    
    var relids: js.Array[RelId] = js.native
    
    var root: Guid = js.native
  }
  object JsonObj {
    
    @scala.inline
    def apply(
      bases: js.Any,
      containment: JsonContainment,
      metaSheets: js.Any,
      nodes: js.Any,
      relids: js.Array[RelId],
      root: Guid
    ): JsonObj = {
      val __obj = js.Dynamic.literal(bases = bases.asInstanceOf[js.Any], containment = containment.asInstanceOf[js.Any], metaSheets = metaSheets.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], relids = relids.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonObj]
    }
    
    @scala.inline
    implicit class JsonObjMutableBuilder[Self <: JsonObj] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBases(value: js.Any): Self = StObject.set(x, "bases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainment(value: JsonContainment): Self = StObject.set(x, "containment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaSheets(value: js.Any): Self = StObject.set(x, "metaSheets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodes(value: js.Any): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelids(value: js.Array[RelId]): Self = StObject.set(x, "relids", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelidsVarargs(value: RelId*): Self = StObject.set(x, "relids", js.Array(value :_*))
      
      @scala.inline
      def setRoot(value: Guid): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
