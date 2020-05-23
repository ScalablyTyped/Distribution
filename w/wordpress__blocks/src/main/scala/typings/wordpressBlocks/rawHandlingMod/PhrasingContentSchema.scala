package typings.wordpressBlocks.rawHandlingMod

import typings.wordpressBlocks.anon.Attributes
import typings.wordpressBlocks.anon.Children
import typings.wordpressBlocks.anon.ChildrenPhrasingContentSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {readonly [ k in '#text' | 'a' | 'abbr' | 'br' | 'code' | 'del' | 'em' | 'ins' | 's' | 'strong' | 'sub' | 'sup' ]: k extends '#text' | 'br'? {} : k extends 'a'? { readonly attributes  :std.ReadonlyArray<keyof std.HTMLAnchorElement>,  readonly children  :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : k extends 'abbr'? { readonly attributes  :std.ReadonlyArray<keyof std.HTMLElement>,  readonly children  :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema} : { readonly children  :@wordpress/blocks.@wordpress/blocks/api/raw-handling.PhrasingContentSchema}} */
trait PhrasingContentSchema extends js.Object {
  @JSName("#text")
  val Numbersigntext: ChildrenPhrasingContentSchema | Children | Attributes | js.Object
  val a: ChildrenPhrasingContentSchema | Children | Attributes | js.Object
  val abbr: ChildrenPhrasingContentSchema | Children | Attributes | js.Object
  val br: ChildrenPhrasingContentSchema | Children | Attributes | js.Object
  val code: ChildrenPhrasingContentSchema | Children | Attributes | js.Object
  val del: ChildrenPhrasingContentSchema | Children | Attributes | js.Object
  val em: ChildrenPhrasingContentSchema | Children | Attributes | js.Object
  val ins: ChildrenPhrasingContentSchema | Children | Attributes | js.Object
  val s: ChildrenPhrasingContentSchema | Children | Attributes | js.Object
  val strong: ChildrenPhrasingContentSchema | Children | Attributes | js.Object
  val sub: ChildrenPhrasingContentSchema | Children | Attributes | js.Object
  val sup: ChildrenPhrasingContentSchema | Children | Attributes | js.Object
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
}

