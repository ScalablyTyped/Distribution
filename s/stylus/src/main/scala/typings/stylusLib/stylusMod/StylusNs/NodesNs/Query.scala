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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("clone")(clone)
    __obj.updateDynamic("coerce")(coerce)
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("eval")(eval)
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("first")(first)
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("lineno")(lineno)
    __obj.updateDynamic("merge")(merge)
    __obj.updateDynamic("nodeName")(nodeName)
    __obj.updateDynamic("nodes")(nodes)
    __obj.updateDynamic("operate")(operate)
    __obj.updateDynamic("predicate")(predicate)
    __obj.updateDynamic("push")(push)
    __obj.updateDynamic("resolvedPredicate")(resolvedPredicate)
    __obj.updateDynamic("resolvedType")(resolvedType)
    __obj.updateDynamic("shouldCoerce")(shouldCoerce)
    __obj.updateDynamic("toBoolean")(toBoolean)
    __obj.updateDynamic("toExpression")(toExpression)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.asInstanceOf[Query]
  }
}

