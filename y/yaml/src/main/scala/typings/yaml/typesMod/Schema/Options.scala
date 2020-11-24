package typings.yaml.typesMod.Schema

import typings.yaml.typesMod.Pair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Array of additional tags to include in the schema, or a function that may
    * modify the schema's base tag array.
    */
  var customTags: js.UndefOr[
    (js.Array[TagId | Tag]) | (js.Function1[/* tags */ js.Array[Tag], js.Array[Tag]])
  ] = js.native
  
  /**
    * Enable support for `<<` merge keys.
    *
    * Default: `false` for YAML 1.2, `true` for earlier versions
    */
  var merge: js.UndefOr[Boolean] = js.native
  
  /**
    * The base schema to use.
    *
    * Default: `"core"` for YAML 1.2, `"yaml-1.1"` for earlier versions
    */
  var schema: js.UndefOr[Name] = js.native
  
  /**
    * When stringifying, sort map entries. If `true`, sort by comparing key values with `<`.
    *
    * Default: `false`
    */
  var sortMapEntries: js.UndefOr[Boolean | (js.Function2[/* a */ Pair, /* b */ Pair, Double])] = js.native
  
  /**
    * @deprecated Use `customTags` instead.
    */
  var tags: js.UndefOr[
    (js.Array[TagId | Tag]) | (js.Function1[/* tags */ js.Array[Tag], js.Array[Tag]])
  ] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setCustomTagsVarargs(value: (TagId | Tag)*): Self = this.set("customTags", js.Array(value :_*))
    
    @scala.inline
    def setCustomTagsFunction1(value: /* tags */ js.Array[Tag] => js.Array[Tag]): Self = this.set("customTags", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCustomTags(value: (js.Array[TagId | Tag]) | (js.Function1[/* tags */ js.Array[Tag], js.Array[Tag]])): Self = this.set("customTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomTags: Self = this.set("customTags", js.undefined)
    
    @scala.inline
    def setMerge(value: Boolean): Self = this.set("merge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMerge: Self = this.set("merge", js.undefined)
    
    @scala.inline
    def setSchema(value: Name): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    
    @scala.inline
    def setSortMapEntriesFunction2(value: (/* a */ Pair, /* b */ Pair) => Double): Self = this.set("sortMapEntries", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSortMapEntries(value: Boolean | (js.Function2[/* a */ Pair, /* b */ Pair, Double])): Self = this.set("sortMapEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortMapEntries: Self = this.set("sortMapEntries", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: (TagId | Tag)*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTagsFunction1(value: /* tags */ js.Array[Tag] => js.Array[Tag]): Self = this.set("tags", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTags(value: (js.Array[TagId | Tag]) | (js.Function1[/* tags */ js.Array[Tag], js.Array[Tag]])): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
