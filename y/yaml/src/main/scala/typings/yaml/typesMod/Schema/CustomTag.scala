package typings.yaml.typesMod.Schema

import org.scalablytyped.runtime.Instantiable0
import typings.yaml.mod.Document
import typings.yaml.parseCstMod.CST.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomTag
  extends BaseTag
     with Tag {
  
  /**
    * A JavaScript class that should be matched to this tag, e.g. `Date` for `!!timestamp`.
    * @deprecated Use `Tag.identify` instead
    */
  var `class`: js.UndefOr[Instantiable0[js.Any]] = js.native
  
  /**
    * Turns a CST node into an AST node. If returning a non-`Node` value, the
    * output will be wrapped as a `Scalar`.
    */
  def resolve(doc: Document, cstNode: Node): typings.yaml.typesMod.Node | js.Any = js.native
}
object CustomTag {
  
  @scala.inline
  def apply(
    identify: js.Any => Boolean,
    resolve: (Document, Node) => typings.yaml.typesMod.Node | js.Any,
    tag: String
  ): CustomTag = {
    val __obj = js.Dynamic.literal(identify = js.Any.fromFunction1(identify), resolve = js.Any.fromFunction2(resolve), tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomTag]
  }
  
  @scala.inline
  implicit class CustomTagOps[Self <: CustomTag] (val x: Self) extends AnyVal {
    
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
    def setResolve(value: (Document, Node) => typings.yaml.typesMod.Node | js.Any): Self = this.set("resolve", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClass(value: Instantiable0[js.Any]): Self = this.set("class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
  }
}
