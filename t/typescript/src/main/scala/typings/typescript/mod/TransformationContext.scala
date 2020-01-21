package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformationContext extends js.Object {
  /**
    * Enables before/after emit notifications in the pretty printer for the provided
    * SyntaxKind.
    */
  def enableEmitNotification(kind: SyntaxKind): Unit
  /** Enables expression substitutions in the pretty printer for the provided SyntaxKind. */
  def enableSubstitution(kind: SyntaxKind): Unit
  /** Ends a lexical environment, returning any declarations. */
  def endLexicalEnvironment(): js.UndefOr[js.Array[Statement]]
  /** Gets the compiler options supplied to the transformer. */
  def getCompilerOptions(): CompilerOptions
  /** Hoists a function declaration to the containing scope. */
  def hoistFunctionDeclaration(node: FunctionDeclaration): Unit
  /** Hoists a variable declaration to the containing scope. */
  def hoistVariableDeclaration(node: Identifier): Unit
  /**
    * Determines whether before/after emit notifications should be raised in the pretty
    * printer when it emits a node.
    */
  def isEmitNotificationEnabled(node: Node): Boolean
  /** Determines whether expression substitutions are enabled for the provided node. */
  def isSubstitutionEnabled(node: Node): Boolean
  /**
    * Hook used to allow transformers to capture state before or after
    * the printer emits a node.
    *
    * NOTE: Transformation hooks should only be modified during `Transformer` initialization,
    * before returning the `NodeTransformer` callback.
    */
  def onEmitNode(hint: EmitHint, node: Node, emitCallback: js.Function2[/* hint */ EmitHint, /* node */ Node, Unit]): Unit
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
  def requestEmitHelper(helper: EmitHelper): Unit
  /** Resumes a suspended lexical environment, usually before visiting a function body. */
  def resumeLexicalEnvironment(): Unit
  /** Starts a new lexical environment. */
  def startLexicalEnvironment(): Unit
  /** Suspends the current lexical environment, usually after visiting a parameter list. */
  def suspendLexicalEnvironment(): Unit
}

object TransformationContext {
  @scala.inline
  def apply(
    enableEmitNotification: SyntaxKind => Unit,
    enableSubstitution: SyntaxKind => Unit,
    endLexicalEnvironment: () => js.UndefOr[js.Array[Statement]],
    getCompilerOptions: () => CompilerOptions,
    hoistFunctionDeclaration: FunctionDeclaration => Unit,
    hoistVariableDeclaration: Identifier => Unit,
    isEmitNotificationEnabled: Node => Boolean,
    isSubstitutionEnabled: Node => Boolean,
    onEmitNode: (EmitHint, Node, js.Function2[/* hint */ EmitHint, /* node */ Node, Unit]) => Unit,
    onSubstituteNode: (EmitHint, Node) => Node,
    readEmitHelpers: () => js.UndefOr[js.Array[EmitHelper]],
    requestEmitHelper: EmitHelper => Unit,
    resumeLexicalEnvironment: () => Unit,
    startLexicalEnvironment: () => Unit,
    suspendLexicalEnvironment: () => Unit
  ): TransformationContext = {
    val __obj = js.Dynamic.literal(enableEmitNotification = js.Any.fromFunction1(enableEmitNotification), enableSubstitution = js.Any.fromFunction1(enableSubstitution), endLexicalEnvironment = js.Any.fromFunction0(endLexicalEnvironment), getCompilerOptions = js.Any.fromFunction0(getCompilerOptions), hoistFunctionDeclaration = js.Any.fromFunction1(hoistFunctionDeclaration), hoistVariableDeclaration = js.Any.fromFunction1(hoistVariableDeclaration), isEmitNotificationEnabled = js.Any.fromFunction1(isEmitNotificationEnabled), isSubstitutionEnabled = js.Any.fromFunction1(isSubstitutionEnabled), onEmitNode = js.Any.fromFunction3(onEmitNode), onSubstituteNode = js.Any.fromFunction2(onSubstituteNode), readEmitHelpers = js.Any.fromFunction0(readEmitHelpers), requestEmitHelper = js.Any.fromFunction1(requestEmitHelper), resumeLexicalEnvironment = js.Any.fromFunction0(resumeLexicalEnvironment), startLexicalEnvironment = js.Any.fromFunction0(startLexicalEnvironment), suspendLexicalEnvironment = js.Any.fromFunction0(suspendLexicalEnvironment))
  
    __obj.asInstanceOf[TransformationContext]
  }
}

