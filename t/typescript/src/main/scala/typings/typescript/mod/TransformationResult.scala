package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformationResult[T /* <: Node */] extends StObject {
  
  /** Gets diagnostics for the transformation. */
  var diagnostics: js.UndefOr[js.Array[DiagnosticWithLocation]] = js.undefined
  
  /**
    * Clean up EmitNode entries on any parse-tree nodes.
    */
  def dispose(): Unit
  
  /**
    * Emits a node with possible notification.
    *
    * @param hint A hint as to the intended usage of the node.
    * @param node The node to emit.
    * @param emitCallback A callback used to emit the node.
    */
  def emitNodeWithNotification(hint: EmitHint, node: Node, emitCallback: js.Function2[/* hint */ EmitHint, /* node */ Node, Unit]): Unit
  
  /**
    * Indicates if a given node needs an emit notification
    *
    * @param node The node to emit.
    */
  var isEmitNotificationEnabled: js.UndefOr[js.Function1[/* node */ Node, Boolean]] = js.undefined
  
  /**
    * Gets a substitute for a node, if one is available; otherwise, returns the original node.
    *
    * @param hint A hint as to the intended usage of the node.
    * @param node The node to substitute.
    */
  def substituteNode(hint: EmitHint, node: Node): Node
  
  /** Gets the transformed source files. */
  var transformed: js.Array[T]
}
object TransformationResult {
  
  inline def apply[T /* <: Node */](
    dispose: () => Unit,
    emitNodeWithNotification: (EmitHint, Node, js.Function2[/* hint */ EmitHint, /* node */ Node, Unit]) => Unit,
    substituteNode: (EmitHint, Node) => Node,
    transformed: js.Array[T]
  ): TransformationResult[T] = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), emitNodeWithNotification = js.Any.fromFunction3(emitNodeWithNotification), substituteNode = js.Any.fromFunction2(substituteNode), transformed = transformed.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformationResult[T]]
  }
  
  extension [Self <: TransformationResult[?], T /* <: Node */](x: Self & TransformationResult[T]) {
    
    inline def setDiagnostics(value: js.Array[DiagnosticWithLocation]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
    
    inline def setDiagnosticsVarargs(value: DiagnosticWithLocation*): Self = StObject.set(x, "diagnostics", js.Array(value :_*))
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setEmitNodeWithNotification(value: (EmitHint, Node, js.Function2[/* hint */ EmitHint, /* node */ Node, Unit]) => Unit): Self = StObject.set(x, "emitNodeWithNotification", js.Any.fromFunction3(value))
    
    inline def setIsEmitNotificationEnabled(value: /* node */ Node => Boolean): Self = StObject.set(x, "isEmitNotificationEnabled", js.Any.fromFunction1(value))
    
    inline def setIsEmitNotificationEnabledUndefined: Self = StObject.set(x, "isEmitNotificationEnabled", js.undefined)
    
    inline def setSubstituteNode(value: (EmitHint, Node) => Node): Self = StObject.set(x, "substituteNode", js.Any.fromFunction2(value))
    
    inline def setTransformed(value: js.Array[T]): Self = StObject.set(x, "transformed", value.asInstanceOf[js.Any])
    
    inline def setTransformedVarargs(value: T*): Self = StObject.set(x, "transformed", js.Array(value :_*))
  }
}
