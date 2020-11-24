package typings.wordpressBlocks.rawHandlingMod

import typings.wordpressBlocks.anon.Attributes
import typings.wordpressBlocks.anon.Children
import typings.wordpressBlocks.anon.ChildrenPhrasingContentSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {readonly [ k in '#text' | 'a' | 'abbr' | 'br' | 'code' | 'del' | 'em' | 'ins' | 's' | 'strong' | 'sub' | 'sup' ]: k extends '#text' | 'br'? {} : k extends 'a'? { readonly attributes :std.ReadonlyArray<keyof std.HTMLAnchorElement>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : k extends 'abbr'? { readonly attributes :std.ReadonlyArray<keyof std.HTMLElement>,  readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : { readonly children :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema}} */
@js.native
trait PhrasingContentSchema extends js.Object {
  
  @JSName("#text")
  val Numbersigntext: ChildrenPhrasingContentSchema | Children | Attributes | js.Object = js.native
  
  val a: ChildrenPhrasingContentSchema | Children | Attributes | js.Object = js.native
  
  val abbr: ChildrenPhrasingContentSchema | Children | Attributes | js.Object = js.native
  
  val br: ChildrenPhrasingContentSchema | Children | Attributes | js.Object = js.native
  
  val code: ChildrenPhrasingContentSchema | Children | Attributes | js.Object = js.native
  
  val del: ChildrenPhrasingContentSchema | Children | Attributes | js.Object = js.native
  
  val em: ChildrenPhrasingContentSchema | Children | Attributes | js.Object = js.native
  
  val ins: ChildrenPhrasingContentSchema | Children | Attributes | js.Object = js.native
  
  val s: ChildrenPhrasingContentSchema | Children | Attributes | js.Object = js.native
  
  val strong: ChildrenPhrasingContentSchema | Children | Attributes | js.Object = js.native
  
  val sub: ChildrenPhrasingContentSchema | Children | Attributes | js.Object = js.native
  
  val sup: ChildrenPhrasingContentSchema | Children | Attributes | js.Object = js.native
}
object PhrasingContentSchema {
  
  @scala.inline
  def apply(
    Numbersigntext: ChildrenPhrasingContentSchema | Children | Attributes | js.Object,
    a: ChildrenPhrasingContentSchema | Children | Attributes | js.Object,
    abbr: ChildrenPhrasingContentSchema | Children | Attributes | js.Object,
    br: ChildrenPhrasingContentSchema | Children | Attributes | js.Object,
    code: ChildrenPhrasingContentSchema | Children | Attributes | js.Object,
    del: ChildrenPhrasingContentSchema | Children | Attributes | js.Object,
    em: ChildrenPhrasingContentSchema | Children | Attributes | js.Object,
    ins: ChildrenPhrasingContentSchema | Children | Attributes | js.Object,
    s: ChildrenPhrasingContentSchema | Children | Attributes | js.Object,
    strong: ChildrenPhrasingContentSchema | Children | Attributes | js.Object,
    sub: ChildrenPhrasingContentSchema | Children | Attributes | js.Object,
    sup: ChildrenPhrasingContentSchema | Children | Attributes | js.Object
  ): PhrasingContentSchema = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], abbr = abbr.asInstanceOf[js.Any], br = br.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], del = del.asInstanceOf[js.Any], em = em.asInstanceOf[js.Any], ins = ins.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], strong = strong.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], sup = sup.asInstanceOf[js.Any])
    __obj.updateDynamic("#text")(Numbersigntext.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhrasingContentSchema]
  }
  
  @scala.inline
  implicit class PhrasingContentSchemaOps[Self <: PhrasingContentSchema] (val x: Self) extends AnyVal {
    
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
    def setNumbersigntext(value: ChildrenPhrasingContentSchema | Children | Attributes | js.Object): Self = this.set("#text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setA(value: ChildrenPhrasingContentSchema | Children | Attributes | js.Object): Self = this.set("a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbbr(value: ChildrenPhrasingContentSchema | Children | Attributes | js.Object): Self = this.set("abbr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBr(value: ChildrenPhrasingContentSchema | Children | Attributes | js.Object): Self = this.set("br", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: ChildrenPhrasingContentSchema | Children | Attributes | js.Object): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDel(value: ChildrenPhrasingContentSchema | Children | Attributes | js.Object): Self = this.set("del", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEm(value: ChildrenPhrasingContentSchema | Children | Attributes | js.Object): Self = this.set("em", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIns(value: ChildrenPhrasingContentSchema | Children | Attributes | js.Object): Self = this.set("ins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS(value: ChildrenPhrasingContentSchema | Children | Attributes | js.Object): Self = this.set("s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrong(value: ChildrenPhrasingContentSchema | Children | Attributes | js.Object): Self = this.set("strong", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSub(value: ChildrenPhrasingContentSchema | Children | Attributes | js.Object): Self = this.set("sub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSup(value: ChildrenPhrasingContentSchema | Children | Attributes | js.Object): Self = this.set("sup", value.asInstanceOf[js.Any])
  }
}
