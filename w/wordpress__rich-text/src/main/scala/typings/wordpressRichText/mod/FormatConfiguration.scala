package typings.wordpressRichText.mod

import typings.react.mod.ComponentType
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatConfiguration extends js.Object {
  
  /**
    * Maps react prop name to html attribute name.
    *
    * { className: 'class' } => <tag class={<className attr here>}></tag>
    */
  var attributes: js.UndefOr[Record[String, String]] = js.native
  
  var className: String | Null = js.native
  
  var edit: ComponentType[FormatProps] = js.native
  
  var keywords: js.UndefOr[
    js.Array[String] | (js.Tuple2[String, String]) | (js.Tuple3[String, String, String])
  ] = js.native
  
  var `object`: js.UndefOr[Boolean] = js.native
  
  var tagName: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any) with String = js.native
  
  var title: String = js.native
}
object FormatConfiguration {
  
  @scala.inline
  def apply(
    edit: ComponentType[FormatProps],
    tagName: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any) with String,
    title: String
  ): FormatConfiguration = {
    val __obj = js.Dynamic.literal(edit = edit.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatConfiguration]
  }
  
  @scala.inline
  implicit class FormatConfigurationOps[Self <: FormatConfiguration] (val x: Self) extends AnyVal {
    
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
    def setEdit(value: ComponentType[FormatProps]): Self = this.set("edit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagName(
      value: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any) with String
    ): Self = this.set("tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributes(value: Record[String, String]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameNull: Self = this.set("className", null)
    
    @scala.inline
    def setKeywordsVarargs(value: String*): Self = this.set("keywords", js.Array(value :_*))
    
    @scala.inline
    def setKeywords(value: js.Array[String] | (js.Tuple2[String, String]) | (js.Tuple3[String, String, String])): Self = this.set("keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeywords: Self = this.set("keywords", js.undefined)
    
    @scala.inline
    def setObject(value: Boolean): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObject: Self = this.set("object", js.undefined)
  }
}
