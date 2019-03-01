package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformationContext extends js.Object {
  /**
    * Enables before/after emit notifications in the pretty printer for the provided
    * SyntaxKind.
    */
  def enableEmitNotification(kind: SyntaxKind): scala.Unit
  /** Enables expression substitutions in the pretty printer for the provided SyntaxKind. */
  def enableSubstitution(kind: SyntaxKind): scala.Unit
  /** Ends a lexical environment, returning any declarations. */
  def endLexicalEnvironment(): js.UndefOr[js.Array[Statement]]
  /** Gets the compiler options supplied to the transformer. */
  def getCompilerOptions(): CompilerOptions
  /** Hoists a function declaration to the containing scope. */
  def hoistFunctionDeclaration(node: FunctionDeclaration): scala.Unit
  /** Hoists a variable declaration to the containing scope. */
  def hoistVariableDeclaration(node: Identifier): scala.Unit
  /**
    * Determines whether before/after emit notifications should be raised in the pretty
    * printer when it emits a node.
    */
  def isEmitNotificationEnabled(node: Node): scala.Boolean
  /** Determines whether expression substitutions are enabled for the provided node. */
  def isSubstitutionEnabled(node: Node): scala.Boolean
  /**
    * Hook used to allow transformers to capture state before or after
    * the printer emits a node.
    *
    * NOTE: Transformation hooks should only be modified during `Transformer` initialization,
    * before returning the `NodeTransformer` callback.
    */
  def onEmitNode(
    hint: EmitHint,
    node: Node,
    emitCallback: js.Function2[/* hint */ EmitHint, /* node */ Node, scala.Unit]
  ): scala.Unit
  /**
    * Hook used by transformers to substitute expressions just before they
    * are emitted by the pretty printer.
    *
    * NOTE: Transformation hooks should only be modified during `Transformer` initialization,
    * before returning the `NodeTransformer` callback.
    */
  def onSubstituteNode(hint: EmitHint, node: Node): Node
  /** Gets and resets the requested non-scoped emit helpers. */
  def readEmitHelpers(): js.UndefOr[js.Array[EmitHelper]]
  /** Records a request for a non-scoped emit helper in the current context. */
  def requestEmitHelper(helper: EmitHelper): scala.Unit
  /** Resumes a suspended lexical environment, usually before visiting a function body. */
  def resumeLexicalEnvironment(): scala.Unit
  /** Starts a new lexical environment. */
  def startLexicalEnvironment(): scala.Unit
  /** Suspends the current lexical environment, usually after visiting a parameter list. */
  def suspendLexicalEnvironment(): scala.Unit
}

object TransformationContext {
  @scala.inline
  def apply(
    enableEmitNotification: js.Function1[SyntaxKind, scala.Unit],
    enableSubstitution: js.Function1[SyntaxKind, scala.Unit],
    endLexicalEnvironment: js.Function0[js.UndefOr[js.Array[Statement]]],
    getCompilerOptions: js.Function0[CompilerOptions],
    hoistFunctionDeclaration: js.Function1[FunctionDeclaration, scala.Unit],
    hoistVariableDeclaration: js.Function1[Identifier, scala.Unit],
    isEmitNotificationEnabled: js.Function1[Node, scala.Boolean],
    isSubstitutionEnabled: js.Function1[Node, scala.Boolean],
    onEmitNode: js.Function3[
      EmitHint, 
      Node, 
      js.Function2[/* hint */ EmitHint, /* node */ Node, scala.Unit], 
      scala.Unit
    ],
    onSubstituteNode: js.Function2[EmitHint, Node, Node],
    readEmitHelpers: js.Function0[js.UndefOr[js.Array[EmitHelper]]],
    requestEmitHelper: js.Function1[EmitHelper, scala.Unit],
    resumeLexicalEnvironment: js.Function0[scala.Unit],
    startLexicalEnvironment: js.Function0[scala.Unit],
    suspendLexicalEnvironment: js.Function0[scala.Unit]
  ): TransformationContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enableEmitNotification")(enableEmitNotification)
    __obj.updateDynamic("enableSubstitution")(enableSubstitution)
    __obj.updateDynamic("endLexicalEnvironment")(endLexicalEnvironment)
    __obj.updateDynamic("getCompilerOptions")(getCompilerOptions)
    __obj.updateDynamic("hoistFunctionDeclaration")(hoistFunctionDeclaration)
    __obj.updateDynamic("hoistVariableDeclaration")(hoistVariableDeclaration)
    __obj.updateDynamic("isEmitNotificationEnabled")(isEmitNotificationEnabled)
    __obj.updateDynamic("isSubstitutionEnabled")(isSubstitutionEnabled)
    __obj.updateDynamic("onEmitNode")(onEmitNode)
    __obj.updateDynamic("onSubstituteNode")(onSubstituteNode)
    __obj.updateDynamic("readEmitHelpers")(readEmitHelpers)
    __obj.updateDynamic("requestEmitHelper")(requestEmitHelper)
    __obj.updateDynamic("resumeLexicalEnvironment")(resumeLexicalEnvironment)
    __obj.updateDynamic("startLexicalEnvironment")(startLexicalEnvironment)
    __obj.updateDynamic("suspendLexicalEnvironment")(suspendLexicalEnvironment)
    __obj.asInstanceOf[TransformationContext]
  }
}

