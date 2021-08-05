package typings.webgme

import org.scalablytyped.runtime.StringDictionary
import typings.webgme.GmeCommon.RelId
import typings.webgme.anon.Guid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
Things in this module are deprecated.
This was a serialization supported in version 1.
*/
object v1Mod {
  
  type GUID = String
  
  trait JsonContainment
    extends StObject
       with /* index */ StringDictionary[JsonContainment]
  object JsonContainment {
    
    inline def apply(): JsonContainment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonContainment]
    }
  }
  
  trait JsonNode extends StObject {
    
    var attributes: js.Any
    
    var base: String
    
    var constratints: js.Any
    
    var meta: js.Any
    
    var parent: String
    
    var pointers: js.Any
    
    var registry: js.Any
    
    var sets: js.Any
  }
  object JsonNode {
    
    inline def apply(
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
    
    extension [Self <: JsonNode](x: Self) {
      
      inline def setAttributes(value: js.Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setConstratints(value: js.Any): Self = StObject.set(x, "constratints", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: js.Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setPointers(value: js.Any): Self = StObject.set(x, "pointers", value.asInstanceOf[js.Any])
      
      inline def setRegistry(value: js.Any): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      inline def setSets(value: js.Any): Self = StObject.set(x, "sets", value.asInstanceOf[js.Any])
    }
  }
  
  trait JsonObj extends StObject {
    
    // guid tree of hashes
    var bases: js.Any
    
    var containment: JsonContainment
    
    var metaSheets: js.Any
    
    //
    var nodes: js.Any
    
    var relids: js.Array[RelId]
    
    var root: Guid
  }
  object JsonObj {
    
    inline def apply(
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
    
    extension [Self <: JsonObj](x: Self) {
      
      inline def setBases(value: js.Any): Self = StObject.set(x, "bases", value.asInstanceOf[js.Any])
      
      inline def setContainment(value: JsonContainment): Self = StObject.set(x, "containment", value.asInstanceOf[js.Any])
      
      inline def setMetaSheets(value: js.Any): Self = StObject.set(x, "metaSheets", value.asInstanceOf[js.Any])
      
      inline def setNodes(value: js.Any): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setRelids(value: js.Array[RelId]): Self = StObject.set(x, "relids", value.asInstanceOf[js.Any])
      
      inline def setRelidsVarargs(value: RelId*): Self = StObject.set(x, "relids", js.Array(value :_*))
      
      inline def setRoot(value: Guid): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
