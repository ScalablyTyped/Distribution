package typings.stylus.mod.Stylus.Nodes

import typings.stylus.anon.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Query extends Node {
  var nodes: js.Array[QueryExpr] = js.native
  var predicate: java.lang.String = js.native
  var resolvedPredicate: java.lang.String = js.native
  var resolvedType: java.lang.String = js.native
  var `type`: java.lang.String = js.native
  /**
    * Merges this query with the `other`.
    */
  def merge(other: Query): Query = js.native
  /**
    * Push the given `expr`.
    */
  def push(expr: QueryExpr): scala.Unit = js.native
}

object Query {
  @scala.inline
  def apply(
    coerce: Node => Node,
    column: Double,
    eval: () => Node,
    filename: java.lang.String,
    first: Node,
    hash: java.lang.String,
    lineno: Double,
    merge: Query => Query,
    nodeName: java.lang.String,
    nodes: js.Array[QueryExpr],
    operate: (java.lang.String, Node) => Node,
    predicate: java.lang.String,
    push: QueryExpr => scala.Unit,
    resolvedPredicate: java.lang.String,
    resolvedType: java.lang.String,
    shouldCoerce: java.lang.String => scala.Boolean,
    toBoolean: () => Boolean,
    toExpression: () => Expression,
    toJSON: () => Column,
    `type`: java.lang.String
  ): Query = {
    val __obj = js.Dynamic.literal(coerce = js.Any.fromFunction1(coerce), column = column.asInstanceOf[js.Any], eval = js.Any.fromFunction0(eval), filename = filename.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], merge = js.Any.fromFunction1(merge), nodeName = nodeName.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], operate = js.Any.fromFunction2(operate), predicate = predicate.asInstanceOf[js.Any], push = js.Any.fromFunction1(push), resolvedPredicate = resolvedPredicate.asInstanceOf[js.Any], resolvedType = resolvedType.asInstanceOf[js.Any], shouldCoerce = js.Any.fromFunction1(shouldCoerce), toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
  @scala.inline
  implicit class QueryOps[Self <: Query] (val x: Self) extends AnyVal {
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
    def setMerge(value: Query => Query): Self = this.set("merge", js.Any.fromFunction1(value))
    @scala.inline
    def setNodesVarargs(value: QueryExpr*): Self = this.set("nodes", js.Array(value :_*))
    @scala.inline
    def setNodes(value: js.Array[QueryExpr]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setPredicate(value: java.lang.String): Self = this.set("predicate", value.asInstanceOf[js.Any])
    @scala.inline
    def setPush(value: QueryExpr => scala.Unit): Self = this.set("push", js.Any.fromFunction1(value))
    @scala.inline
    def setResolvedPredicate(value: java.lang.String): Self = this.set("resolvedPredicate", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolvedType(value: java.lang.String): Self = this.set("resolvedType", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: java.lang.String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

