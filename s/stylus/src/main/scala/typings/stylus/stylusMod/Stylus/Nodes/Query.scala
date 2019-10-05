package typings.stylus.stylusMod.Stylus.Nodes

import typings.stylus.Anon_ColumnFilenameLinenoNodesPredicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query extends Node {
  var nodes: js.Array[QueryExpr]
  var predicate: java.lang.String
  var resolvedPredicate: java.lang.String
  var resolvedType: java.lang.String
  var `type`: java.lang.String
  /**
    * Merges this query with the `other`.
    */
  def merge(other: Query): Query
  /**
    * Push the given `expr`.
    */
  def push(expr: QueryExpr): scala.Unit
}

object Query {
  @scala.inline
  def apply(
    clone: () => Node,
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
    toJSON: () => Anon_ColumnFilenameLinenoNodesPredicate,
    `type`: java.lang.String
  ): Query = {
    val __obj = js.Dynamic.literal(clone = js.Any.fromFunction0(clone), coerce = js.Any.fromFunction1(coerce), column = column, eval = js.Any.fromFunction0(eval), filename = filename, first = first, hash = hash, lineno = lineno, merge = js.Any.fromFunction1(merge), nodeName = nodeName, nodes = nodes, operate = js.Any.fromFunction2(operate), predicate = predicate, push = js.Any.fromFunction1(push), resolvedPredicate = resolvedPredicate, resolvedType = resolvedType, shouldCoerce = js.Any.fromFunction1(shouldCoerce), toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Query]
  }
}

