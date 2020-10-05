package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformationContext extends js.Object {
  /**
    * Enables before/after emit notifications in the pretty printer for the provided
    * SyntaxKind.
    */
  def enableEmitNotification(kind: SyntaxKind): Unit = js.native
  /** Enables expression substitutions in the pretty printer for the provided SyntaxKind. */
  def enableSubstitution(kind: SyntaxKind): Unit = js.native
  /** Ends a lexical environment, returning any declarations. */
  def endLexicalEnvironment(): js.UndefOr[js.Array[Statement]] = js.native
  /** Gets the compiler options supplied to the transformer. */
  def getCompilerOptions(): CompilerOptions = js.native
  /** Hoists a function declaration to the containing scope. */
  def hoistFunctionDeclaration(node: FunctionDeclaration): Unit = js.native
  /** Hoists a variable declaration to the containing scope. */
  def hoistVariableDeclaration(node: Identifier): Unit = js.native
  /**
    * Determines whether before/after emit notifications should be raised in the pretty
    * printer when it emits a node.
    */
  def isEmitNotificationEnabled(node: Node): Boolean = js.native
  /** Determines whether expression substitutions are enabled for the provided node. */
  def isSubstitutionEnabled(node: Node): Boolean = js.native
  /**
    * Hook used to allow transformers to capture state before or after
    * the printer emits a node.
    *
    * NOTE: Transformation hooks should only be modified during `Transformer` initialization,
    * before returning the `NodeTransformer` callback.
    */
  def onEmitNode(hint: EmitHint, node: Node, emitCallback: js.Function2[/* hint */ EmitHint, /* node */ Node, Unit]): Unit = js.native
  /**
    * Hook used by transformers to substitute expressions just before they
    * are emitted by the pretty printer.
    *
    * NOTE: Transformation hooks should only be modified during `Transformer` initialization,
    * before returning the `NodeTransformer` callback.
    */
  def onSubstituteNode(hint: EmitHint, node: Node): Node = js.native
  /** Gets and resets the requested non-scoped emit helpers. */
  def readEmitHelpers(): js.UndefOr[js.Array[EmitHelper]] = js.native
  /** Records a request for a non-scoped emit helper in the current context. */
  def requestEmitHelper(helper: EmitHelper): Unit = js.native
  /** Resumes a suspended lexical environment, usually before visiting a function body. */
  def resumeLexicalEnvironment(): Unit = js.native
  /** Starts a new lexical environment. */
  def startLexicalEnvironment(): Unit = js.native
  /** Suspends the current lexical environment, usually after visiting a parameter list. */
  def suspendLexicalEnvironment(): Unit = js.native
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
  @scala.inline
  implicit class TransformationContextOps[Self <: TransformationContext] (val x: Self) extends AnyVal {
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
    def setEnableEmitNotification(value: SyntaxKind => Unit): Self = this.set("enableEmitNotification", js.Any.fromFunction1(value))
    @scala.inline
    def setEnableSubstitution(value: SyntaxKind => Unit): Self = this.set("enableSubstitution", js.Any.fromFunction1(value))
    @scala.inline
    def setEndLexicalEnvironment(value: () => js.UndefOr[js.Array[Statement]]): Self = this.set("endLexicalEnvironment", js.Any.fromFunction0(value))
    @scala.inline
    def setGetCompilerOptions(value: () => CompilerOptions): Self = this.set("getCompilerOptions", js.Any.fromFunction0(value))
    @scala.inline
    def setHoistFunctionDeclaration(value: FunctionDeclaration => Unit): Self = this.set("hoistFunctionDeclaration", js.Any.fromFunction1(value))
    @scala.inline
    def setHoistVariableDeclaration(value: Identifier => Unit): Self = this.set("hoistVariableDeclaration", js.Any.fromFunction1(value))
    @scala.inline
    def setIsEmitNotificationEnabled(value: Node => Boolean): Self = this.set("isEmitNotificationEnabled", js.Any.fromFunction1(value))
    @scala.inline
    def setIsSubstitutionEnabled(value: Node => Boolean): Self = this.set("isSubstitutionEnabled", js.Any.fromFunction1(value))
    @scala.inline
    def setOnEmitNode(value: (EmitHint, Node, js.Function2[/* hint */ EmitHint, /* node */ Node, Unit]) => Unit): Self = this.set("onEmitNode", js.Any.fromFunction3(value))
    @scala.inline
    def setOnSubstituteNode(value: (EmitHint, Node) => Node): Self = this.set("onSubstituteNode", js.Any.fromFunction2(value))
    @scala.inline
    def setReadEmitHelpers(value: () => js.UndefOr[js.Array[EmitHelper]]): Self = this.set("readEmitHelpers", js.Any.fromFunction0(value))
    @scala.inline
    def setRequestEmitHelper(value: EmitHelper => Unit): Self = this.set("requestEmitHelper", js.Any.fromFunction1(value))
    @scala.inline
    def setResumeLexicalEnvironment(value: () => Unit): Self = this.set("resumeLexicalEnvironment", js.Any.fromFunction0(value))
    @scala.inline
    def setStartLexicalEnvironment(value: () => Unit): Self = this.set("startLexicalEnvironment", js.Any.fromFunction0(value))
    @scala.inline
    def setSuspendLexicalEnvironment(value: () => Unit): Self = this.set("suspendLexicalEnvironment", js.Any.fromFunction0(value))
  }
  
}

