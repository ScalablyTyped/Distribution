package typings.xml2js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParserOptions extends js.Object {
  
  var async: js.UndefOr[Boolean] = js.native
  
  var attrNameProcessors: js.UndefOr[js.Array[js.Function1[/* name */ String, _]]] = js.native
  
  var attrValueProcessors: js.UndefOr[js.Array[js.Function2[/* value */ String, /* name */ String, _]]] = js.native
  
  var attrkey: js.UndefOr[String] = js.native
  
  var charkey: js.UndefOr[String] = js.native
  
  var charsAsChildren: js.UndefOr[Boolean] = js.native
  
  var childkey: js.UndefOr[String] = js.native
  
  var chunkSize: js.UndefOr[Double] = js.native
  
  var emptyTag: js.UndefOr[js.Any] = js.native
  
  var explicitArray: js.UndefOr[Boolean] = js.native
  
  var explicitCharkey: js.UndefOr[Boolean] = js.native
  
  var explicitChildren: js.UndefOr[Boolean] = js.native
  
  var explicitRoot: js.UndefOr[Boolean] = js.native
  
  var ignoreAttrs: js.UndefOr[Boolean] = js.native
  
  var includeWhiteChars: js.UndefOr[Boolean] = js.native
  
  var mergeAttrs: js.UndefOr[Boolean] = js.native
  
  var normalize: js.UndefOr[Boolean] = js.native
  
  var normalizeTags: js.UndefOr[Boolean] = js.native
  
  var preserveChildrenOrder: js.UndefOr[Boolean] = js.native
  
  var strict: js.UndefOr[Boolean] = js.native
  
  var tagNameProcessors: js.UndefOr[js.Array[js.Function1[/* name */ String, _]]] = js.native
  
  var trim: js.UndefOr[Boolean] = js.native
  
  var validator: js.UndefOr[js.Function] = js.native
  
  var valueProcessors: js.UndefOr[js.Array[js.Function2[/* value */ String, /* name */ String, _]]] = js.native
  
  var xmlns: js.UndefOr[Boolean] = js.native
}
object ParserOptions {
  
  @scala.inline
  def apply(): ParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParserOptions]
  }
  
  @scala.inline
  implicit class ParserOptionsOps[Self <: ParserOptions] (val x: Self) extends AnyVal {
    
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
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    
    @scala.inline
    def setAttrNameProcessorsVarargs(value: (js.Function1[/* name */ String, js.Any])*): Self = this.set("attrNameProcessors", js.Array(value :_*))
    
    @scala.inline
    def setAttrNameProcessors(value: js.Array[js.Function1[/* name */ String, _]]): Self = this.set("attrNameProcessors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttrNameProcessors: Self = this.set("attrNameProcessors", js.undefined)
    
    @scala.inline
    def setAttrValueProcessorsVarargs(value: (js.Function2[/* value */ String, /* name */ String, js.Any])*): Self = this.set("attrValueProcessors", js.Array(value :_*))
    
    @scala.inline
    def setAttrValueProcessors(value: js.Array[js.Function2[/* value */ String, /* name */ String, _]]): Self = this.set("attrValueProcessors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttrValueProcessors: Self = this.set("attrValueProcessors", js.undefined)
    
    @scala.inline
    def setAttrkey(value: String): Self = this.set("attrkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttrkey: Self = this.set("attrkey", js.undefined)
    
    @scala.inline
    def setCharkey(value: String): Self = this.set("charkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharkey: Self = this.set("charkey", js.undefined)
    
    @scala.inline
    def setCharsAsChildren(value: Boolean): Self = this.set("charsAsChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharsAsChildren: Self = this.set("charsAsChildren", js.undefined)
    
    @scala.inline
    def setChildkey(value: String): Self = this.set("childkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildkey: Self = this.set("childkey", js.undefined)
    
    @scala.inline
    def setChunkSize(value: Double): Self = this.set("chunkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunkSize: Self = this.set("chunkSize", js.undefined)
    
    @scala.inline
    def setEmptyTag(value: js.Any): Self = this.set("emptyTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptyTag: Self = this.set("emptyTag", js.undefined)
    
    @scala.inline
    def setExplicitArray(value: Boolean): Self = this.set("explicitArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplicitArray: Self = this.set("explicitArray", js.undefined)
    
    @scala.inline
    def setExplicitCharkey(value: Boolean): Self = this.set("explicitCharkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplicitCharkey: Self = this.set("explicitCharkey", js.undefined)
    
    @scala.inline
    def setExplicitChildren(value: Boolean): Self = this.set("explicitChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplicitChildren: Self = this.set("explicitChildren", js.undefined)
    
    @scala.inline
    def setExplicitRoot(value: Boolean): Self = this.set("explicitRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplicitRoot: Self = this.set("explicitRoot", js.undefined)
    
    @scala.inline
    def setIgnoreAttrs(value: Boolean): Self = this.set("ignoreAttrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreAttrs: Self = this.set("ignoreAttrs", js.undefined)
    
    @scala.inline
    def setIncludeWhiteChars(value: Boolean): Self = this.set("includeWhiteChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeWhiteChars: Self = this.set("includeWhiteChars", js.undefined)
    
    @scala.inline
    def setMergeAttrs(value: Boolean): Self = this.set("mergeAttrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMergeAttrs: Self = this.set("mergeAttrs", js.undefined)
    
    @scala.inline
    def setNormalize(value: Boolean): Self = this.set("normalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalize: Self = this.set("normalize", js.undefined)
    
    @scala.inline
    def setNormalizeTags(value: Boolean): Self = this.set("normalizeTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalizeTags: Self = this.set("normalizeTags", js.undefined)
    
    @scala.inline
    def setPreserveChildrenOrder(value: Boolean): Self = this.set("preserveChildrenOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveChildrenOrder: Self = this.set("preserveChildrenOrder", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
    
    @scala.inline
    def setTagNameProcessorsVarargs(value: (js.Function1[/* name */ String, js.Any])*): Self = this.set("tagNameProcessors", js.Array(value :_*))
    
    @scala.inline
    def setTagNameProcessors(value: js.Array[js.Function1[/* name */ String, _]]): Self = this.set("tagNameProcessors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagNameProcessors: Self = this.set("tagNameProcessors", js.undefined)
    
    @scala.inline
    def setTrim(value: Boolean): Self = this.set("trim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrim: Self = this.set("trim", js.undefined)
    
    @scala.inline
    def setValidator(value: js.Function): Self = this.set("validator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidator: Self = this.set("validator", js.undefined)
    
    @scala.inline
    def setValueProcessorsVarargs(value: (js.Function2[/* value */ String, /* name */ String, js.Any])*): Self = this.set("valueProcessors", js.Array(value :_*))
    
    @scala.inline
    def setValueProcessors(value: js.Array[js.Function2[/* value */ String, /* name */ String, _]]): Self = this.set("valueProcessors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueProcessors: Self = this.set("valueProcessors", js.undefined)
    
    @scala.inline
    def setXmlns(value: Boolean): Self = this.set("xmlns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmlns: Self = this.set("xmlns", js.undefined)
  }
}
