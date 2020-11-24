package typings.wordpressBlocks.mod

import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ComponentType
import typings.std.Partial
import typings.std.Record
import typings.wordpressBlocks.anon.From
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Omit<@wordpress/blocks.@wordpress/blocks.Block<T>, 'icon'>> & std.Pick<@wordpress/blocks.@wordpress/blocks.Block<T>, 'attributes' | 'category' | 'title'> & {  icon :@wordpress/blocks.@wordpress/blocks.BlockIcon | undefined} */
@js.native
trait BlockConfiguration[T /* <: Record[String, _] */] extends js.Object {
  
  var attributes: (js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? any : T[k]>}
    */ typings.wordpressBlocks.wordpressBlocksStrings.BlockConfiguration with TopLevel[js.Any]
  ]) with typings.wordpressBlocks.wordpressBlocksStrings.BlockConfiguration with TopLevel[js.Any] = js.native
  
  var category: js.UndefOr[String] with String = js.native
  
  var deprecated: js.UndefOr[js.Array[BlockDeprecation[T]]] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var edit: js.UndefOr[ComponentType[BlockEditProps[T]]] = js.native
  
  var getEditWrapperProps: js.UndefOr[js.Function1[/* attrs */ T, Record[String, String | Double | Boolean]]] = js.native
  
  var icon: js.UndefOr[BlockIcon] = js.native
  
  var keywords: js.UndefOr[js.Array[String]] = js.native
  
  var merge: js.UndefOr[js.Function2[/* attributes */ T, /* attributesToMerge */ T, Partial[T]]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var parent: js.UndefOr[js.Array[String]] = js.native
  
  var save: js.UndefOr[ComponentType[BlockSaveProps[T]]] = js.native
  
  var styles: js.UndefOr[js.Array[BlockStyle]] = js.native
  
  var supports: js.UndefOr[BlockSupports] = js.native
  
  var title: js.UndefOr[String] with String = js.native
  
  var transforms: js.UndefOr[From[T]] = js.native
}
object BlockConfiguration {
  
  @scala.inline
  def apply[T /* <: Record[String, _] */](
    attributes: (js.UndefOr[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? any : T[k]>}
    */ typings.wordpressBlocks.wordpressBlocksStrings.BlockConfiguration with TopLevel[js.Any]
    ]) with typings.wordpressBlocks.wordpressBlocksStrings.BlockConfiguration with TopLevel[js.Any],
    category: js.UndefOr[String] with String,
    title: js.UndefOr[String] with String
  ): BlockConfiguration[T] = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockConfiguration[T]]
  }
  
  @scala.inline
  implicit class BlockConfigurationOps[Self <: BlockConfiguration[_], T /* <: Record[String, _] */] (val x: Self with BlockConfiguration[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttributes(
      value: (js.UndefOr[
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {readonly [ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? any : T[k]>}
      */ typings.wordpressBlocks.wordpressBlocksStrings.BlockConfiguration with TopLevel[js.Any]
        ]) with typings.wordpressBlocks.wordpressBlocksStrings.BlockConfiguration with TopLevel[js.Any]
    ): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategory(value: js.UndefOr[String] with String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: js.UndefOr[String] with String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedVarargs(value: BlockDeprecation[T]*): Self = this.set("deprecated", js.Array(value :_*))
    
    @scala.inline
    def setDeprecated(value: js.Array[BlockDeprecation[T]]): Self = this.set("deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeprecated: Self = this.set("deprecated", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEdit(value: ComponentType[BlockEditProps[T]]): Self = this.set("edit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdit: Self = this.set("edit", js.undefined)
    
    @scala.inline
    def setGetEditWrapperProps(value: /* attrs */ T => Record[String, String | Double | Boolean]): Self = this.set("getEditWrapperProps", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetEditWrapperProps: Self = this.set("getEditWrapperProps", js.undefined)
    
    @scala.inline
    def setIcon(value: BlockIcon): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setKeywordsVarargs(value: String*): Self = this.set("keywords", js.Array(value :_*))
    
    @scala.inline
    def setKeywords(value: js.Array[String]): Self = this.set("keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeywords: Self = this.set("keywords", js.undefined)
    
    @scala.inline
    def setMerge(value: (/* attributes */ T, /* attributesToMerge */ T) => Partial[T]): Self = this.set("merge", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMerge: Self = this.set("merge", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParentVarargs(value: String*): Self = this.set("parent", js.Array(value :_*))
    
    @scala.inline
    def setParent(value: js.Array[String]): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setSave(value: ComponentType[BlockSaveProps[T]]): Self = this.set("save", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSave: Self = this.set("save", js.undefined)
    
    @scala.inline
    def setStylesVarargs(value: BlockStyle*): Self = this.set("styles", js.Array(value :_*))
    
    @scala.inline
    def setStyles(value: js.Array[BlockStyle]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setSupports(value: BlockSupports): Self = this.set("supports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupports: Self = this.set("supports", js.undefined)
    
    @scala.inline
    def setTransforms(value: From[T]): Self = this.set("transforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransforms: Self = this.set("transforms", js.undefined)
  }
}
