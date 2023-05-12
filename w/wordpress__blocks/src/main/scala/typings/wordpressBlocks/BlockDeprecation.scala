package typings.wordpressBlocks

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<@wordpress/blocks.Block<O>, 'attributes' | 'save' | 'supports'> */
trait BlockDeprecation[// The new block attribute types.
N /* <: Record[String, Any] */, // The old block attribute types.
O /* <: Record[String, Any] */] extends StObject {
  
  var attributes: /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ k in keyof O ]: @wordpress/blocks.BlockAttribute<O[k] extends std.Array<infer U>? U : O[k]>} */ js.Any
  
  /**
    * A function which, given the attributes and inner blocks of the
    * parsed block, returns true if the deprecation can handle the block
    * migration. This is particularly useful in cases where a block is
    * technically valid even once deprecated, and requires updates to its
    * attributes or inner blocks.
    */
  var isEligible: js.UndefOr[
    js.Function2[
      /* attributes */ Record[String, Any], 
      /* innerBlocks */ js.Array[BlockInstance[StringDictionary[Any]]], 
      Boolean
    ]
  ] = js.undefined
  
  /**
    * A function which, given the old attributes and inner blocks is
    * expected to return either the new attributes or a tuple array of
    * [attributes, innerBlocks] compatible with the block.
    */
  var migrate: js.UndefOr[
    js.Function2[
      /* attributes */ O, 
      /* innerBlocks */ js.Array[BlockInstance[StringDictionary[Any]]], 
      N | (js.Tuple2[N, js.Array[BlockInstance[StringDictionary[Any]]]])
    ]
  ] = js.undefined
  
  var save: ComponentType[BlockSaveProps[O]]
  
  var supports: js.UndefOr[BlockSupports] = js.undefined
}
object BlockDeprecation {
  
  inline def apply[// The new block attribute types.
  N /* <: Record[String, Any] */, // The old block attribute types.
  O /* <: Record[String, Any] */](
    attributes: /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ k in keyof O ]: @wordpress/blocks.BlockAttribute<O[k] extends std.Array<infer U>? U : O[k]>} */ js.Any,
    save: ComponentType[BlockSaveProps[O]]
  ): BlockDeprecation[N, O] = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], save = save.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockDeprecation[N, O]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockDeprecation[?, ?], // The new block attribute types.
  N /* <: Record[String, Any] */, // The old block attribute types.
  O /* <: Record[String, Any] */] (val x: Self & (BlockDeprecation[N, O])) extends AnyVal {
    
    inline def setAttributes(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {readonly [ k in keyof O ]: @wordpress/blocks.BlockAttribute<O[k] extends std.Array<infer U>? U : O[k]>} */ js.Any
    ): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setIsEligible(
      value: (/* attributes */ Record[String, Any], /* innerBlocks */ js.Array[BlockInstance[StringDictionary[Any]]]) => Boolean
    ): Self = StObject.set(x, "isEligible", js.Any.fromFunction2(value))
    
    inline def setIsEligibleUndefined: Self = StObject.set(x, "isEligible", js.undefined)
    
    inline def setMigrate(
      value: (/* attributes */ O, /* innerBlocks */ js.Array[BlockInstance[StringDictionary[Any]]]) => N | (js.Tuple2[N, js.Array[BlockInstance[StringDictionary[Any]]]])
    ): Self = StObject.set(x, "migrate", js.Any.fromFunction2(value))
    
    inline def setMigrateUndefined: Self = StObject.set(x, "migrate", js.undefined)
    
    inline def setSave(value: ComponentType[BlockSaveProps[O]]): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
    
    inline def setSupports(value: BlockSupports): Self = StObject.set(x, "supports", value.asInstanceOf[js.Any])
    
    inline def setSupportsUndefined: Self = StObject.set(x, "supports", js.undefined)
  }
}
