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

