package typings.yaml.parseCstMod.CST

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseContext extends js.Object {
  
  /** Node starts at beginning of line */
  var atLineStart: Boolean = js.native
  
  /** true if currently in a collection context */
  var inCollection: Boolean = js.native
  
  /** true if currently in a flow context */
  var inFlow: Boolean = js.native
  
  /** Current level of indentation */
  var indent: Double = js.native
  
  /** Start of the current line */
  var lineStart: Double = js.native
  
  /** The parent of the node */
  var parent: Node = js.native
  
  /** Source of the YAML document */
  var src: String = js.native
}
object ParseContext {
  
  @scala.inline
  def apply(
    atLineStart: Boolean,
    inCollection: Boolean,
    inFlow: Boolean,
    indent: Double,
    lineStart: Double,
    parent: Node,
    src: String
  ): ParseContext = {
    val __obj = js.Dynamic.literal(atLineStart = atLineStart.asInstanceOf[js.Any], inCollection = inCollection.asInstanceOf[js.Any], inFlow = inFlow.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], lineStart = lineStart.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseContext]
  }
  
  @scala.inline
  implicit class ParseContextOps[Self <: ParseContext] (val x: Self) extends AnyVal {
    
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
    def setAtLineStart(value: Boolean): Self = this.set("atLineStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInCollection(value: Boolean): Self = this.set("inCollection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInFlow(value: Boolean): Self = this.set("inFlow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndent(value: Double): Self = this.set("indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineStart(value: Double): Self = this.set("lineStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: Node): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
  }
}
