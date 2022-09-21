package typings.yaml.anon

import typings.yaml.documentMod.Document
import typings.yaml.pairMod.Pair
import typings.yaml.scalarMod.Scalar
import typings.yaml.visitMod.asyncVisitorFn
import typings.yaml.yamlStrings.key
import typings.yaml.yamlStrings.value
import typings.yaml.yamlmapMod.YAMLMap
import typings.yaml.yamlseqMod.YAMLSeq
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Collection extends StObject {
  
  var Alias: js.UndefOr[asyncVisitorFn[typings.yaml.aliasMod.Alias]] = js.undefined
  
  var Collection: js.UndefOr[asyncVisitorFn[(YAMLMap[Any, Any]) | YAMLSeq[Any]]] = js.undefined
  
  var Map: js.UndefOr[asyncVisitorFn[YAMLMap[Any, Any]]] = js.undefined
  
  var Node: js.UndefOr[
    asyncVisitorFn[typings.yaml.aliasMod.Alias | Scalar[Any] | (YAMLMap[Any, Any]) | YAMLSeq[Any]]
  ] = js.undefined
  
  var Pair: js.UndefOr[asyncVisitorFn[typings.yaml.pairMod.Pair[Any, Any]]] = js.undefined
  
  var Scalar: js.UndefOr[asyncVisitorFn[typings.yaml.scalarMod.Scalar[Any]]] = js.undefined
  
  var Seq: js.UndefOr[asyncVisitorFn[YAMLSeq[Any]]] = js.undefined
  
  var Value: js.UndefOr[asyncVisitorFn[Scalar[Any] | (YAMLMap[Any, Any]) | YAMLSeq[Any]]] = js.undefined
}
object Collection {
  
  inline def apply(): Collection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Collection]
  }
  
  extension [Self <: Collection](x: Self) {
    
    inline def setAlias(
      value: (/* key */ Double | key | value | Null, typings.yaml.aliasMod.Alias, /* path */ js.Array[
          Document[typings.yaml.nodeMod.Node[Any]] | typings.yaml.nodeMod.Node[Any] | (Pair[Any, Any])
        ]) => Unit | js.Symbol | Double | typings.yaml.nodeMod.Node[Any] | (Pair[Any, Any]) | (js.Promise[Unit | js.Symbol | Double | typings.yaml.nodeMod.Node[Any] | (Pair[Any, Any])])
    ): Self = StObject.set(x, "Alias", js.Any.fromFunction3(value))
    
    inline def setAliasUndefined: Self = StObject.set(x, "Alias", js.undefined)
    
    inline def setCollection(
      value: (/* key */ Double | key | value | Null, (YAMLMap[Any, Any]) | YAMLSeq[Any], /* path */ js.Array[
          Document[typings.yaml.nodeMod.Node[Any]] | typings.yaml.nodeMod.Node[Any] | (Pair[Any, Any])
        ]) => Unit | js.Symbol | Double | typings.yaml.nodeMod.Node[Any] | (Pair[Any, Any]) | (js.Promise[Unit | js.Symbol | Double | typings.yaml.nodeMod.Node[Any] | (Pair[Any, Any])])
    ): Self = StObject.set(x, "Collection", js.Any.fromFunction3(value))
    
    inline def setCollectionUndefined: Self = StObject.set(x, "Collection", js.undefined)
    
    inline def setMap(
      value: (/* key */ Double | key | value | Null, YAMLMap[Any, Any], /* path */ js.Array[
          Document[typings.yaml.nodeMod.Node[Any]] | typings.yaml.nodeMod.Node[Any] | (Pair[Any, Any])
        ]) => Unit | js.Symbol | Double | typings.yaml.nodeMod.Node[Any] | (Pair[Any, Any]) | (js.Promise[Unit | js.Symbol | Double | typings.yaml.nodeMod.Node[Any] | (Pair[Any, Any])])
    ): Self = StObject.set(x, "Map", js.Any.fromFunction3(value))
    
    inline def setMapUndefined: Self = StObject.set(x, "Map", js.undefined)
    
    inline def setNode(
      value: (/* key */ Double | key | value | Null, typings.yaml.aliasMod.Alias | Scalar[Any] | (YAMLMap[Any, Any]) | YAMLSeq[Any], /* path */ js.Array[
          Document[typings.yaml.nodeMod.Node[Any]] | typings.yaml.nodeMod.Node[Any] | (Pair[Any, Any])
        ]) => Unit | js.Symbol | Double | typings.yaml.nodeMod.Node[Any] | (Pair[Any, Any]) | (js.Promise[Unit | js.Symbol | Double | typings.yaml.nodeMod.Node[Any] | (Pair[Any, Any])])
    ): Self = StObject.set(x, "Node", js.Any.fromFunction3(value))
    
    inline def setNodeUndefined: Self = StObject.set(x, "Node", js.undefined)
    
    inline def setPair(
      value: (/* key */ Double | key | value | Null, Pair[Any, Any], /* path */ js.Array[
          Document[typings.yaml.nodeMod.Node[Any]] | typings.yaml.nodeMod.Node[Any] | (Pair[Any, Any])
        ]) => Unit | js.Symbol | Double | typings.yaml.nodeMod.Node[Any] | (Pair[Any, Any]) | (js.Promise[Unit | js.Symbol | Double | typings.yaml.nodeMod.Node[Any] | (Pair[Any, Any])])
    ): Self = StObject.set(x, "Pair", js.Any.fromFunction3(value))
    
    inline def setPairUndefined: Self = StObject.set(x, "Pair", js.undefined)
    
    inline def setScalar(
      value: (/* key */ Double | key | value | Null, Scalar[Any], /* path */ js.Array[
          Document[typings.yaml.nodeMod.Node[Any]] | typings.yaml.nodeMod.Node[Any] | (Pair[Any, Any])
        ]) => Unit | js.Symbol | Double | typings.yaml.nodeMod.Node[Any] | (Pair[Any, Any]) | (js.Promise[Unit | js.Symbol | Double | typings.yaml.nodeMod.Node[Any] | (Pair[Any, Any])])
    ): Self = StObject.set(x, "Scalar", js.Any.fromFunction3(value))
    
    inline def setScalarUndefined: Self = StObject.set(x, "Scalar", js.undefined)
    
    inline def setSeq(
      value: (/* key */ Double | key | value | Null, YAMLSeq[Any], /* path */ js.Array[
          Document[typings.yaml.nodeMod.Node[Any]] | typings.yaml.nodeMod.Node[Any] | (Pair[Any, Any])
        ]) => Unit | js.Symbol | Double | typings.yaml.nodeMod.Node[Any] | (Pair[Any, Any]) | (js.Promise[Unit | js.Symbol | Double | typings.yaml.nodeMod.Node[Any] | (Pair[Any, Any])])
    ): Self = StObject.set(x, "Seq", js.Any.fromFunction3(value))
    
    inline def setSeqUndefined: Self = StObject.set(x, "Seq", js.undefined)
    
    inline def setValue(
      value: (/* key */ Double | key | value | Null, Scalar[Any] | (YAMLMap[Any, Any]) | YAMLSeq[Any], /* path */ js.Array[
          Document[typings.yaml.nodeMod.Node[Any]] | typings.yaml.nodeMod.Node[Any] | (Pair[Any, Any])
        ]) => Unit | js.Symbol | Double | typings.yaml.nodeMod.Node[Any] | (Pair[Any, Any]) | (js.Promise[Unit | js.Symbol | Double | typings.yaml.nodeMod.Node[Any] | (Pair[Any, Any])])
    ): Self = StObject.set(x, "Value", js.Any.fromFunction3(value))
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
