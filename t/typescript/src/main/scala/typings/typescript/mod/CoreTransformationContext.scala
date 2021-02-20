package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoreTransformationContext extends StObject {
  
  /** Ends a lexical environment, returning any declarations. */
  def endLexicalEnvironment(): js.UndefOr[js.Array[Statement]] = js.native
  
  val factory: NodeFactory = js.native
  
  /** Gets the compiler options supplied to the transformer. */
  def getCompilerOptions(): CompilerOptions = js.native
  
  /** Hoists a function declaration to the containing scope. */
  def hoistFunctionDeclaration(node: FunctionDeclaration): Unit = js.native
  
  /** Hoists a variable declaration to the containing scope. */
  def hoistVariableDeclaration(node: Identifier): Unit = js.native
  
  /** Resumes a suspended lexical environment, usually before visiting a function body. */
  def resumeLexicalEnvironment(): Unit = js.native
  
  /** Starts a new lexical environment. */
  def startLexicalEnvironment(): Unit = js.native
  
  /** Suspends the current lexical environment, usually after visiting a parameter list. */
  def suspendLexicalEnvironment(): Unit = js.native
}
object CoreTransformationContext {
  
  @scala.inline
  def apply(
    endLexicalEnvironment: () => js.UndefOr[js.Array[Statement]],
    factory: NodeFactory,
    getCompilerOptions: () => CompilerOptions,
    hoistFunctionDeclaration: FunctionDeclaration => Unit,
    hoistVariableDeclaration: Identifier => Unit,
    resumeLexicalEnvironment: () => Unit,
    startLexicalEnvironment: () => Unit,
    suspendLexicalEnvironment: () => Unit
  ): CoreTransformationContext = {
    val __obj = js.Dynamic.literal(endLexicalEnvironment = js.Any.fromFunction0(endLexicalEnvironment), factory = factory.asInstanceOf[js.Any], getCompilerOptions = js.Any.fromFunction0(getCompilerOptions), hoistFunctionDeclaration = js.Any.fromFunction1(hoistFunctionDeclaration), hoistVariableDeclaration = js.Any.fromFunction1(hoistVariableDeclaration), resumeLexicalEnvironment = js.Any.fromFunction0(resumeLexicalEnvironment), startLexicalEnvironment = js.Any.fromFunction0(startLexicalEnvironment), suspendLexicalEnvironment = js.Any.fromFunction0(suspendLexicalEnvironment))
    __obj.asInstanceOf[CoreTransformationContext]
  }
  
  @scala.inline
  implicit class CoreTransformationContextMutableBuilder[Self <: CoreTransformationContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndLexicalEnvironment(value: () => js.UndefOr[js.Array[Statement]]): Self = StObject.set(x, "endLexicalEnvironment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFactory(value: NodeFactory): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCompilerOptions(value: () => CompilerOptions): Self = StObject.set(x, "getCompilerOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHoistFunctionDeclaration(value: FunctionDeclaration => Unit): Self = StObject.set(x, "hoistFunctionDeclaration", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHoistVariableDeclaration(value: Identifier => Unit): Self = StObject.set(x, "hoistVariableDeclaration", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResumeLexicalEnvironment(value: () => Unit): Self = StObject.set(x, "resumeLexicalEnvironment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStartLexicalEnvironment(value: () => Unit): Self = StObject.set(x, "startLexicalEnvironment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSuspendLexicalEnvironment(value: () => Unit): Self = StObject.set(x, "suspendLexicalEnvironment", js.Any.fromFunction0(value))
  }
}
