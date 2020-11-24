package typings.stylus.mod.Stylus.Nodes

import typings.stylus.anon.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Node extends js.Object {
  
  /**
    *  Default coercion throws.
    */
  def coerce(other: Node): Node = js.native
  
  var column: Double = js.native
  
  /**
    * Nodes by default evaluate to themselves.
    */
  def eval(): Node = js.native
  
  var filename: java.lang.String = js.native
  
  var first: Node = js.native
  
  var hash: java.lang.String = js.native
  
  var lineno: Double = js.native
  
  var nodeName: java.lang.String = js.native
  
  /**
    * Operate on `right` with the given `op`.
    */
  def operate(op: java.lang.String, right: Node): Node = js.native
  
  /**
    * Return false if `op` is generally not coerced.
    */
  def shouldCoerce(op: java.lang.String): scala.Boolean = js.native
  
  /**
    * Return true.
    */
  // tslint:disable-next-line no-unnecessary-qualifier
  def toBoolean(): Boolean = js.native
  
  /**
    * Return the expression, or wrap this node in an expression.
    */
  def toExpression(): Expression = js.native
  
  /**
    * Return a JSON representation of this node.
    */
  def toJSON(): Column = js.native
}
object Node {
  
  @scala.inline
  def apply(
    coerce: Node => Node,
    column: Double,
    eval: () => Node,
    filename: java.lang.String,
    first: Node,
    hash: java.lang.String,
    lineno: Double,
    nodeName: java.lang.String,
    operate: (java.lang.String, Node) => Node,
    shouldCoerce: java.lang.String => scala.Boolean,
    toBoolean: () => Boolean,
    toExpression: () => Expression,
    toJSON: () => Column
  ): Node = {
    val __obj = js.Dynamic.literal(coerce = js.Any.fromFunction1(coerce), column = column.asInstanceOf[js.Any], eval = js.Any.fromFunction0(eval), filename = filename.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], operate = js.Any.fromFunction2(operate), shouldCoerce = js.Any.fromFunction1(shouldCoerce), toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCoerce(value: Node => Node): Self = this.set("coerce", js.Any.fromFunction1(value))
    
    @scala.inline
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEval(value: () => Node): Self = this.set("eval", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFilename(value: java.lang.String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst(value: Node): Self = this.set("first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: java.lang.String): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineno(value: Double): Self = this.set("lineno", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeName(value: java.lang.String): Self = this.set("nodeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperate(value: (java.lang.String, Node) => Node): Self = this.set("operate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setShouldCoerce(value: java.lang.String => scala.Boolean): Self = this.set("shouldCoerce", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToBoolean(value: () => Boolean): Self = this.set("toBoolean", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToExpression(value: () => Expression): Self = this.set("toExpression", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToJSON(value: () => Column): Self = this.set("toJSON", js.Any.fromFunction0(value))
  }
}
