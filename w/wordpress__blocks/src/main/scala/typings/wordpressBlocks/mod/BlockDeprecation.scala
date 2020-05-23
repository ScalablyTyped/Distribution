package typings.wordpressBlocks.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ComponentType
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<@wordpress/blocks.@wordpress/blocks.Block<T>, 'attributes' | 'save' | 'supports'> */
trait BlockDeprecation[T /* <: Record[String, _] */] extends js.Object {
  var attributes: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? any : T[k]>}
    */ typings.wordpressBlocks.wordpressBlocksStrings.BlockDeprecation with TopLevel[js.Any]
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
  ] = js.undefined
  /**
    * A function which, given the old attributes and inner blocks is
    * expected to return either the new attributes or a tuple array of
    * [attributes, innerBlocks] compatible with the block.
    */
  var migrate: js.UndefOr[
    (js.Function1[/* attributes */ Record[String, _], T]) with (js.Function2[
      /* attributes */ Record[String, _], 
      /* innerBlocks */ js.Array[BlockInstance[StringDictionary[_]]], 
      js.Tuple2[T, js.Array[BlockInstance[StringDictionary[_]]]]
    ])
  ] = js.undefined
  var save: ComponentType[BlockSaveProps[T]]
  var supports: js.UndefOr[BlockSupports] = js.undefined
}

object BlockDeprecation {
  @scala.inline
  def apply[T](
    attributes: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? any : T[k]>}
    */ typings.wordpressBlocks.wordpressBlocksStrings.BlockDeprecation with TopLevel[js.Any],
    save: ComponentType[BlockSaveProps[T]],
    isEligible: (/* attributes */ Record[String, _], /* innerBlocks */ js.Array[BlockInstance[StringDictionary[_]]]) => Boolean = null,
    migrate: (js.Function1[/* attributes */ Record[String, _], T]) with (js.Function2[
      /* attributes */ Record[String, _], 
      /* innerBlocks */ js.Array[BlockInstance[StringDictionary[_]]], 
      js.Tuple2[T, js.Array[BlockInstance[StringDictionary[_]]]]
    ]) = null,
    supports: BlockSupports = null
  ): BlockDeprecation[T] = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], save = save.asInstanceOf[js.Any])
    if (isEligible != null) __obj.updateDynamic("isEligible")(js.Any.fromFunction2(isEligible))
    if (migrate != null) __obj.updateDynamic("migrate")(migrate.asInstanceOf[js.Any])
    if (supports != null) __obj.updateDynamic("supports")(supports.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockDeprecation[T]]
  }
}

