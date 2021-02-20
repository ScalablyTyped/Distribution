package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformationResult[T /* <: Node */] extends StObject {
  
  /** Gets diagnostics for the transformation. */
  var diagnostics: js.UndefOr[js.Array[DiagnosticWithLocation]] = js.native
  
  /**
    * Clean up EmitNode entries on any parse-tree nodes.
    */
  def dispose(): Unit = js.native
  
  /**
    * Emits a node with possible notification.
    *
    * @param hint A hint as to the intended usage of the node.
    * @param node The node to emit.
    * @param emitCallback A callback used to emit the node.
    */
  def emitNodeWithNotification(hint: EmitHint, node: Node, emitCallback: js.Function2[/* hint */ EmitHint, /* node */ Node, Unit]): Unit = js.native
  
  /**
    * Indicates if a given node needs an emit notification
    *
    * @param node The node to emit.
    */
  var isEmitNotificationEnabled: js.UndefOr[js.Function1[/* node */ Node, Boolean]] = js.native
  
  /**
    * Gets a substitute for a node, if one is available; otherwise, returns the original node.
    *
    * @param hint A hint as to the intended usage of the node.
    * @param node The node to substitute.
    */
  def substituteNode(hint: EmitHint, node: Node): Node = js.native
  
  /** Gets the transformed source files. */
  var transformed: js.Array[T] = js.native
}
object TransformationResult {
  
  @scala.inline
  def apply[T /* <: Node */](
    dispose: () => Unit,
    emitNodeWithNotification: (EmitHint, Node, js.Function2[/* hint */ EmitHint, /* node */ Node, Unit]) => Unit,
    substituteNode: (EmitHint, Node) => Node,
    transformed: js.Array[T]
  ): TransformationResult[T] = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), emitNodeWithNotification = js.Any.fromFunction3(emitNodeWithNotification), substituteNode = js.Any.fromFunction2(substituteNode), transformed = transformed.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformationResult[T]]
  }
  
  @scala.inline
  implicit class TransformationResultMutableBuilder[Self <: TransformationResult[_], T /* <: Node */] (val x: Self with TransformationResult[T]) extends AnyVal {
    
    @scala.inline
    def setDiagnostics(value: js.Array[DiagnosticWithLocation]): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagnosticsUndefined: Self = StObject.set(x, "diagnostics", js.undefined)
    
    @scala.inline
    def setDiagnosticsVarargs(value: DiagnosticWithLocation*): Self = StObject.set(x, "diagnostics", js.Array(value :_*))
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEmitNodeWithNotification(value: (EmitHint, Node, js.Function2[/* hint */ EmitHint, /* node */ Node, Unit]) => Unit): Self = StObject.set(x, "emitNodeWithNotification", js.Any.fromFunction3(value))
    
    @scala.inline
    def setIsEmitNotificationEnabled(value: /* node */ Node => Boolean): Self = StObject.set(x, "isEmitNotificationEnabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsEmitNotificationEnabledUndefined: Self = StObject.set(x, "isEmitNotificationEnabled", js.undefined)
    
    @scala.inline
    def setSubstituteNode(value: (EmitHint, Node) => Node): Self = StObject.set(x, "substituteNode", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTransformed(value: js.Array[T]): Self = StObject.set(x, "transformed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformedVarargs(value: T*): Self = StObject.set(x, "transformed", js.Array(value :_*))
  }
}
