package typings.stylus.mod.Stylus.Nodes

import typings.stylus.anon.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query
  extends StObject
     with Node {
  
  /**
    * Merges this query with the `other`.
    */
  def merge(other: Query): Query
  
  var nodes: js.Array[QueryExpr]
  
  var predicate: java.lang.String
  
  /**
    * Push the given `expr`.
    */
  def push(expr: QueryExpr): scala.Unit
  
  var resolvedPredicate: java.lang.String
  
  var resolvedType: java.lang.String
  
  var `type`: java.lang.String
}
object Query {
  
  inline def apply(
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
  
  extension [Self <: Query](x: Self) {
    
    inline def setMerge(value: Query => Query): Self = StObject.set(x, "merge", js.Any.fromFunction1(value))
    
    inline def setNodes(value: js.Array[QueryExpr]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesVarargs(value: QueryExpr*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    inline def setPredicate(value: java.lang.String): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
    
    inline def setPush(value: QueryExpr => scala.Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    
    inline def setResolvedPredicate(value: java.lang.String): Self = StObject.set(x, "resolvedPredicate", value.asInstanceOf[js.Any])
    
    inline def setResolvedType(value: java.lang.String): Self = StObject.set(x, "resolvedType", value.asInstanceOf[js.Any])
    
    inline def setType(value: java.lang.String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
