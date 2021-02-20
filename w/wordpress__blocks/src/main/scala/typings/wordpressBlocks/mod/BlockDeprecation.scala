package typings.wordpressBlocks.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ComponentType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<@wordpress/blocks.@wordpress/blocks.Block<T>, 'attributes' | 'save' | 'supports'> */
@js.native
trait BlockDeprecation[T /* <: Record[String, _] */] extends StObject {
  
  var attributes: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? any : T[k]>}
    */ typings.wordpressBlocks.wordpressBlocksStrings.BlockDeprecation with TopLevel[js.Any] = js.native
  
  /**
    * A function which, given the attributes and inner blocks of the
    * parsed block, returns true if the deprecation can handle the block
    * migration. This is particularly useful in cases where a block is
    * technically valid even once deprecated, and requires updates to its
    * attributes or inner blocks.
    */
  var isEligible: js.UndefOr[
    js.Function2[
      /* attributes */ Record[String, _], 
      /* innerBlocks */ js.Array[BlockInstance[StringDictionary[_]]], 
      Boolean
    ]
  ] = js.native
  
  /**
    * A function which, given the old attributes and inner blocks is
    * expected to return either the new attributes or a tuple array of
    * [attributes, innerBlocks] compatible with the block.
    */
  var migrate: (js.UndefOr[js.Function1[/* attributes */ Record[String, _], T]]) with (js.UndefOr[
    js.Function2[
      /* attributes */ Record[String, _], 
      /* innerBlocks */ js.Array[BlockInstance[StringDictionary[_]]], 
      js.Tuple2[T, js.Array[BlockInstance[StringDictionary[_]]]]
    ]
  ]) = js.native
  
  var save: ComponentType[BlockSaveProps[T]] = js.native
  
  var supports: js.UndefOr[BlockSupports] = js.native
}
object BlockDeprecation {
  
  @scala.inline
  def apply[T /* <: Record[String, _] */](
    attributes: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? any : T[k]>}
    */ typings.wordpressBlocks.wordpressBlocksStrings.BlockDeprecation with TopLevel[js.Any],
    migrate: (js.UndefOr[js.Function1[/* attributes */ Record[String, _], T]]) with (js.UndefOr[
      js.Function2[
        /* attributes */ Record[String, _], 
        /* innerBlocks */ js.Array[BlockInstance[StringDictionary[_]]], 
        js.Tuple2[T, js.Array[BlockInstance[StringDictionary[_]]]]
      ]
    ]),
    save: ComponentType[BlockSaveProps[T]]
  ): BlockDeprecation[T] = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], migrate = migrate.asInstanceOf[js.Any], save = save.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockDeprecation[T]]
  }
  
  @scala.inline
  implicit class BlockDeprecationMutableBuilder[Self <: BlockDeprecation[_], T /* <: Record[String, _] */] (val x: Self with BlockDeprecation[T]) extends AnyVal {
    
    @scala.inline
    def setAttributes(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {readonly [ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? any : T[k]>}
      */ typings.wordpressBlocks.wordpressBlocksStrings.BlockDeprecation with TopLevel[js.Any]
    ): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEligible(
      value: (/* attributes */ Record[String, _], /* innerBlocks */ js.Array[BlockInstance[StringDictionary[_]]]) => Boolean
    ): Self = StObject.set(x, "isEligible", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsEligibleUndefined: Self = StObject.set(x, "isEligible", js.undefined)
    
    @scala.inline
    def setMigrate(
      value: (js.UndefOr[js.Function1[/* attributes */ Record[String, _], T]]) with (js.UndefOr[
          js.Function2[
            /* attributes */ Record[String, _], 
            /* innerBlocks */ js.Array[BlockInstance[StringDictionary[_]]], 
            js.Tuple2[T, js.Array[BlockInstance[StringDictionary[_]]]]
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
