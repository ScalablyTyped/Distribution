package typings
package stylusLib.stylusMod.StylusNs.NodesNs

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
    clone: js.Function0[Node],
    coerce: js.Function1[Node, Node],
    column: scala.Double,
    eval: js.Function0[Node],
    filename: java.lang.String,
    first: Node,
    hash: java.lang.String,
    lineno: scala.Double,
    merge: js.Function1[Query, Query],
    nodeName: java.lang.String,
    nodes: js.Array[QueryExpr],
    operate: js.Function2[java.lang.String, Node, Node],
    predicate: java.lang.String,
    push: js.Function1[QueryExpr, scala.Unit],
    resolvedPredicate: java.lang.String,
    resolvedType: java.lang.String,
    shouldCoerce: js.Function1[java.lang.String, scala.Boolean],
    toBoolean: js.Function0[Boolean],
    toExpression: js.Function0[Expression],
    toJSON: js.Function0[stylusLib.Anon_ColumnFilenameLinenoNodesPredicate],
    `type`: java.lang.String
  ): Query = {
    val __obj = js.Dynamic.literal(clone = clone, coerce = coerce, column = column, eval = eval, filename = filename, first = first, hash = hash, lineno = lineno, merge = merge, nodeName = nodeName, nodes = nodes, operate = operate, predicate = predicate, push = push, resolvedPredicate = resolvedPredicate, resolvedType = resolvedType, shouldCoerce = shouldCoerce, toBoolean = toBoolean, toExpression = toExpression, toJSON = toJSON)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Query]
  }
}

