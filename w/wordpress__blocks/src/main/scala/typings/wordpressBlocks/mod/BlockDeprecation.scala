package typings.wordpressBlocks.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ComponentType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<@wordpress/blocks.@wordpress/blocks.Block<T>, 'attributes' | 'save' | 'supports'> */
trait BlockDeprecation[T /* <: Record[String, js.Any] */] extends StObject {
  
  var attributes: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? any : T[k]>}
    */ typings.wordpressBlocks.wordpressBlocksStrings.BlockDeprecation & TopLevel[js.Any]
  
  /**
    * A function which, given the attributes and inner blocks of the
    * parsed block, returns true if the deprecation can handle the block
    * migration. This is particularly useful in cases where a block is
    * technically valid even once deprecated, and requires updates to its
    * attributes or inner blocks.
    */
  var isEligible: js.UndefOr[
    js.Function2[
      /* attributes */ Record[String, js.Any], 
      /* innerBlocks */ js.Array[BlockInstance[StringDictionary[js.Any]]], 
      Boolean
    ]
  ] = js.undefined
  
  /**
    * A function which, given the old attributes and inner blocks is
    * expected to return either the new attributes or a tuple array of
    * [attributes, innerBlocks] compatible with the block.
    */
  var migrate: (js.UndefOr[js.Function1[/* attributes */ Record[String, js.Any], T]]) & (js.UndefOr[
    js.Function2[
      /* attributes */ Record[String, js.Any], 
      /* innerBlocks */ js.Array[BlockInstance[StringDictionary[js.Any]]], 
      js.Tuple2[T, js.Array[BlockInstance[StringDictionary[js.Any]]]]
    ]
  ])
  
  var save: ComponentType[BlockSaveProps[T]]
  
  var supports: js.UndefOr[BlockSupports] = js.undefined
}
object BlockDeprecation {
  
  @scala.inline
  def apply[T /* <: Record[String, js.Any] */](
    attributes: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? any : T[k]>}
    */ typings.wordpressBlocks.wordpressBlocksStrings.BlockDeprecation & TopLevel[js.Any],
    migrate: (js.UndefOr[js.Function1[/* attributes */ Record[String, js.Any], T]]) & (js.UndefOr[
      js.Function2[
        /* attributes */ Record[String, js.Any], 
        /* innerBlocks */ js.Array[BlockInstance[StringDictionary[js.Any]]], 
        js.Tuple2[T, js.Array[BlockInstance[StringDictionary[js.Any]]]]
      ]
    ]),
    save: ComponentType[BlockSaveProps[T]]
  ): BlockDeprecation[T] = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], migrate = migrate.asInstanceOf[js.Any], save = save.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockDeprecation[T]]
  }
  
  @scala.inline
  implicit class BlockDeprecationMutableBuilder[Self <: BlockDeprecation[?], T /* <: Record[String, js.Any] */] (val x: Self & BlockDeprecation[T]) extends AnyVal {
    
    @scala.inline
    def setAttributes(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {readonly [ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? any : T[k]>}
      */ typings.wordpressBlocks.wordpressBlocksStrings.BlockDeprecation & TopLevel[js.Any]
    ): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEligible(
      value: (/* attributes */ Record[String, js.Any], /* innerBlocks */ js.Array[BlockInstance[StringDictionary[js.Any]]]) => Boolean
    ): Self = StObject.set(x, "isEligible", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsEligibleUndefined: Self = StObject.set(x, "isEligible", js.undefined)
    
    @scala.inline
    def setMigrate(
      value: (js.UndefOr[js.Function1[/* attributes */ Record[String, js.Any], T]]) & (js.UndefOr[
          js.Function2[
            /* attributes */ Record[String, js.Any], 
            /* innerBlocks */ js.Array[BlockInstance[StringDictionary[js.Any]]], 
            js.Tuple2[T, js.Array[BlockInstance[StringDictionary[js.Any]]]]
          ]
        ])
    ): Self = StObject.set(x, "migrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSave(value: ComponentType[BlockSaveProps[T]]): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupports(value: BlockSupports): Self = StObject.set(x, "supports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsUndefined: Self = StObject.set(x, "supports", js.undefined)
  }
}
