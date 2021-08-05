package typings.typescript

import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.CompletionEntry
import typings.typescript.mod.Decorator
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.HeritageClause
import typings.typescript.mod.Identifier
import typings.typescript.mod.JSDocAugmentsTag
import typings.typescript.mod.JSDocImplementsTag
import typings.typescript.mod.LeftHandSideExpression
import typings.typescript.mod.ModifiersArray
import typings.typescript.mod.Node
import typings.typescript.mod.NodeArray
import typings.typescript.mod.NodeFlags
import typings.typescript.mod.Program
import typings.typescript.mod.PropertyAccessEntityNameExpression
import typings.typescript.mod.SourceFile
import typings.typescript.mod.SourceFileLike
import typings.typescript.mod.SyntaxKind.ExpressionWithTypeArguments
import typings.typescript.mod.TextSpan
import typings.typescript.mod.TypeAcquisition
import typings.typescript.mod.TypeNode
import typings.typescript.mod.Visitor
import typings.typescript.typescriptBooleans.`false`
import typings.typescript.typescriptBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var done: `true`
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal(done = true)
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setDone(value: `true`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    }
  }
  
  trait Affected[T] extends StObject {
    
    var affected: SourceFile | Program
    
    var result: T
  }
  object Affected {
    
    inline def apply[T](affected: SourceFile | Program, result: T): Affected[T] = {
      val __obj = js.Dynamic.literal(affected = affected.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[Affected[T]]
    }
    
    extension [Self <: Affected[?], T](x: Self & Affected[T]) {
      
      inline def setAffected(value: SourceFile | Program): Self = StObject.set(x, "affected", value.asInstanceOf[js.Any])
      
      inline def setResult(value: T): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  trait Assignable extends StObject {
    
    var assignable: Double
    
    var identity: Double
    
    var strictSubtype: Double
    
    var subtype: Double
  }
  object Assignable {
    
    inline def apply(assignable: Double, identity: Double, strictSubtype: Double, subtype: Double): Assignable = {
      val __obj = js.Dynamic.literal(assignable = assignable.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], strictSubtype = strictSubtype.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any])
      __obj.asInstanceOf[Assignable]
    }
    
    extension [Self <: Assignable](x: Self) {
      
      inline def setAssignable(value: Double): Self = StObject.set(x, "assignable", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: Double): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setStrictSubtype(value: Double): Self = StObject.set(x, "strictSubtype", value.asInstanceOf[js.Any])
      
      inline def setSubtype(value: Double): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    }
  }
  
  trait Config extends StObject {
    
    var config: js.UndefOr[js.Any] = js.undefined
    
    var error: js.UndefOr[Diagnostic] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setConfig(value: js.Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setError(value: Diagnostic): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    }
  }
  
  trait Done[T] extends StObject {
    
    var done: js.UndefOr[`false`] = js.undefined
    
    var value: T
  }
  object Done {
    
    inline def apply[T](value: T): Done[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Done[T]]
    }
    
    extension [Self <: Done[?], T](x: Self & Done[T]) {
      
      inline def setDone(value: `false`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Errors extends StObject {
    
    var errors: js.Array[Diagnostic]
    
    var options: CompilerOptions
  }
  object Errors {
    
    inline def apply(errors: js.Array[Diagnostic], options: CompilerOptions): Errors = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Errors]
    }
    
    extension [Self <: Errors](x: Self) {
      
      inline def setErrors(value: js.Array[Diagnostic]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: Diagnostic*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      inline def setOptions(value: CompilerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  trait EscapedIdentifier extends StObject {
    
    var __escapedIdentifier: Unit
  }
  object EscapedIdentifier {
    
    inline def apply(__escapedIdentifier: Unit): EscapedIdentifier = {
      val __obj = js.Dynamic.literal(__escapedIdentifier = __escapedIdentifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[EscapedIdentifier]
    }
    
    extension [Self <: EscapedIdentifier](x: Self) {
      
      inline def set__escapedIdentifier(value: Unit): Self = StObject.set(x, "__escapedIdentifier", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined typescript.typescript.ExpressionWithTypeArguments & { readonly expression :typescript.typescript.Identifier | typescript.typescript.PropertyAccessEntityNameExpression} */
  @js.native
  trait ExpressionWithTypeArgumen extends StObject {
    
    var _typeNodeBrand: js.Any = js.native
    
    val decorators: js.UndefOr[NodeArray[Decorator]] = js.native
    
    val end: Double = js.native
    
    val expression: LeftHandSideExpression & (Identifier | PropertyAccessEntityNameExpression) = js.native
    
    val flags: NodeFlags = js.native
    
    def forEachChild[T](cbNode: js.Function1[/* node */ Node, js.UndefOr[T]]): js.UndefOr[T] = js.native
    def forEachChild[T](
      cbNode: js.Function1[/* node */ Node, js.UndefOr[T]],
      cbNodeArray: js.Function1[/* nodes */ NodeArray[Node], js.UndefOr[T]]
    ): js.UndefOr[T] = js.native
    
    def getChildAt(index: Double): Node = js.native
    def getChildAt(index: Double, sourceFile: SourceFile): Node = js.native
    
    def getChildCount(): Double = js.native
    def getChildCount(sourceFile: SourceFile): Double = js.native
    
    def getChildren(): js.Array[Node] = js.native
    def getChildren(sourceFile: SourceFile): js.Array[Node] = js.native
    
    def getEnd(): Double = js.native
    
    def getFirstToken(): js.UndefOr[Node] = js.native
    def getFirstToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getFullStart(): Double = js.native
    
    def getFullText(): String = js.native
    def getFullText(sourceFile: SourceFile): String = js.native
    
    def getFullWidth(): Double = js.native
    
    def getLastToken(): js.UndefOr[Node] = js.native
    def getLastToken(sourceFile: SourceFile): js.UndefOr[Node] = js.native
    
    def getLeadingTriviaWidth(): Double = js.native
    def getLeadingTriviaWidth(sourceFile: SourceFile): Double = js.native
    
    def getSourceFile(): SourceFile = js.native
    
    def getStart(): Double = js.native
    def getStart(sourceFile: Unit, includeJsDocComment: Boolean): Double = js.native
    def getStart(sourceFile: SourceFile): Double = js.native
    def getStart(sourceFile: SourceFile, includeJsDocComment: Boolean): Double = js.native
    
    def getText(): String = js.native
    def getText(sourceFile: SourceFile): String = js.native
    
    def getWidth(): Double = js.native
    def getWidth(sourceFile: SourceFileLike): Double = js.native
    
    val kind: ExpressionWithTypeArguments = js.native
    
    val modifiers: js.UndefOr[ModifiersArray] = js.native
    
    val parent: HeritageClause | JSDocAugmentsTag | JSDocImplementsTag = js.native
    
    val pos: Double = js.native
    
    val typeArguments: js.UndefOr[NodeArray[TypeNode]] = js.native
  }
  
  trait FileExists extends StObject {
    
    def fileExists(fileName: String): Boolean
    
    def getExecutingFilePath(): String
    
    def readFile(fileName: String): js.UndefOr[String]
    
    def resolvePath(path: String): String
  }
  object FileExists {
    
    inline def apply(
      fileExists: String => Boolean,
      getExecutingFilePath: () => String,
      readFile: String => js.UndefOr[String],
      resolvePath: String => String
    ): FileExists = {
      val __obj = js.Dynamic.literal(fileExists = js.Any.fromFunction1(fileExists), getExecutingFilePath = js.Any.fromFunction0(getExecutingFilePath), readFile = js.Any.fromFunction1(readFile), resolvePath = js.Any.fromFunction1(resolvePath))
      __obj.asInstanceOf[FileExists]
    }
    
    extension [Self <: FileExists](x: Self) {
      
      inline def setFileExists(value: String => Boolean): Self = StObject.set(x, "fileExists", js.Any.fromFunction1(value))
      
      inline def setGetExecutingFilePath(value: () => String): Self = StObject.set(x, "getExecutingFilePath", js.Any.fromFunction0(value))
      
      inline def setReadFile(value: String => js.UndefOr[String]): Self = StObject.set(x, "readFile", js.Any.fromFunction1(value))
      
      inline def setResolvePath(value: String => String): Self = StObject.set(x, "resolvePath", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[T /* <: Node */](): js.UndefOr[NodeArray[T]] = js.native
    def apply[T /* <: Node */](nodes: Unit, visitor: Unit, test: js.Function1[/* node */ Node, Boolean]): js.UndefOr[NodeArray[T]] = js.native
    def apply[T /* <: Node */](nodes: Unit, visitor: Unit, test: js.Function1[/* node */ Node, Boolean], start: Double): js.UndefOr[NodeArray[T]] = js.native
    def apply[T /* <: Node */](
      nodes: Unit,
      visitor: Unit,
      test: js.Function1[/* node */ Node, Boolean],
      start: Double,
      count: Double
    ): js.UndefOr[NodeArray[T]] = js.native
    def apply[T /* <: Node */](
      nodes: Unit,
      visitor: Unit,
      test: js.Function1[/* node */ Node, Boolean],
      start: Unit,
      count: Double
    ): js.UndefOr[NodeArray[T]] = js.native
    def apply[T /* <: Node */](nodes: Unit, visitor: Unit, test: Unit, start: Double): js.UndefOr[NodeArray[T]] = js.native
    def apply[T /* <: Node */](nodes: Unit, visitor: Unit, test: Unit, start: Double, count: Double): js.UndefOr[NodeArray[T]] = js.native
    def apply[T /* <: Node */](nodes: Unit, visitor: Unit, test: Unit, start: Unit, count: Double): js.UndefOr[NodeArray[T]] = js.native
    def apply[T /* <: Node */](nodes: Unit, visitor: Visitor): js.UndefOr[NodeArray[T]] = js.native
    def apply[T /* <: Node */](nodes: Unit, visitor: Visitor, test: js.Function1[/* node */ Node, Boolean]): js.UndefOr[NodeArray[T]] = js.native
    def apply[T /* <: Node */](nodes: Unit, visitor: Visitor, test: js.Function1[/* node */ Node, Boolean], start: Double): js.UndefOr[NodeArray[T]] = js.native
    def apply[T /* <: Node */](
      nodes: Unit,
      visitor: Visitor,
      test: js.Function1[/* node */ Node, Boolean],
      start: Double,
      count: Double
    ): js.UndefOr[NodeArray[T]] = js.native
    def apply[T /* <: Node */](
      nodes: Unit,
      visitor: Visitor,
      test: js.Function1[/* node */ Node, Boolean],
      start: Unit,
      count: Double
    ): js.UndefOr[NodeArray[T]] = js.native
    def apply[T /* <: Node */](nodes: Unit, visitor: Visitor, test: Unit, start: Double): js.UndefOr[NodeArray[T]] = js.native
    def apply[T /* <: Node */](nodes: Unit, visitor: Visitor, test: Unit, start: Double, count: Double): js.UndefOr[NodeArray[T]] = js.native
    def apply[T /* <: Node */](nodes: Unit, visitor: Visitor, test: Unit, start: Unit, count: Double): js.UndefOr[NodeArray[T]] = js.native
    def apply[T /* <: Node */](nodes: NodeArray[T]): NodeArray[T] = js.native
    def apply[T /* <: Node */](nodes: NodeArray[T], visitor: Unit, test: js.Function1[/* node */ Node, Boolean]): NodeArray[T] = js.native
    def apply[T /* <: Node */](nodes: NodeArray[T], visitor: Unit, test: js.Function1[/* node */ Node, Boolean], start: Double): NodeArray[T] = js.native
    def apply[T /* <: Node */](
      nodes: NodeArray[T],
      visitor: Unit,
      test: js.Function1[/* node */ Node, Boolean],
      start: Double,
      count: Double
    ): NodeArray[T] = js.native
    def apply[T /* <: Node */](
      nodes: NodeArray[T],
      visitor: Unit,
      test: js.Function1[/* node */ Node, Boolean],
      start: Unit,
      count: Double
    ): NodeArray[T] = js.native
    def apply[T /* <: Node */](nodes: NodeArray[T], visitor: Unit, test: Unit, start: Double): NodeArray[T] = js.native
    def apply[T /* <: Node */](nodes: NodeArray[T], visitor: Unit, test: Unit, start: Double, count: Double): NodeArray[T] = js.native
    def apply[T /* <: Node */](nodes: NodeArray[T], visitor: Unit, test: Unit, start: Unit, count: Double): NodeArray[T] = js.native
    def apply[T /* <: Node */](nodes: NodeArray[T], visitor: Visitor): NodeArray[T] = js.native
    def apply[T /* <: Node */](nodes: NodeArray[T], visitor: Visitor, test: js.Function1[/* node */ Node, Boolean]): NodeArray[T] = js.native
    def apply[T /* <: Node */](nodes: NodeArray[T], visitor: Visitor, test: js.Function1[/* node */ Node, Boolean], start: Double): NodeArray[T] = js.native
    def apply[T /* <: Node */](
      nodes: NodeArray[T],
      visitor: Visitor,
      test: js.Function1[/* node */ Node, Boolean],
      start: Double,
      count: Double
    ): NodeArray[T] = js.native
    def apply[T /* <: Node */](
      nodes: NodeArray[T],
      visitor: Visitor,
      test: js.Function1[/* node */ Node, Boolean],
      start: Unit,
      count: Double
    ): NodeArray[T] = js.native
    def apply[T /* <: Node */](nodes: NodeArray[T], visitor: Visitor, test: Unit, start: Double): NodeArray[T] = js.native
    def apply[T /* <: Node */](nodes: NodeArray[T], visitor: Visitor, test: Unit, start: Double, count: Double): NodeArray[T] = js.native
    def apply[T /* <: Node */](nodes: NodeArray[T], visitor: Visitor, test: Unit, start: Unit, count: Double): NodeArray[T] = js.native
  }
  
  trait Metadata extends StObject {
    
    var metadata: js.UndefOr[js.Any] = js.undefined
  }
  object Metadata {
    
    inline def apply(): Metadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Metadata]
    }
    
    extension [Self <: Metadata](x: Self) {
      
      inline def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var errors: js.Array[Diagnostic]
    
    var options: TypeAcquisition
  }
  object Options {
    
    inline def apply(errors: js.Array[Diagnostic], options: TypeAcquisition): Options = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setErrors(value: js.Array[Diagnostic]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: Diagnostic*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      inline def setOptions(value: TypeAcquisition): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeArguments extends StObject {
    
    var typeArguments: js.UndefOr[NodeArray[TypeNode]] = js.undefined
  }
  object TypeArguments {
    
    inline def apply(): TypeArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypeArguments]
    }
    
    extension [Self <: TypeArguments](x: Self) {
      
      inline def setTypeArguments(value: NodeArray[TypeNode]): Self = StObject.set(x, "typeArguments", value.asInstanceOf[js.Any])
      
      inline def setTypeArgumentsUndefined: Self = StObject.set(x, "typeArguments", js.undefined)
    }
  }
  
  /* Inlined typescript.typescript.WithMetadata<typescript.typescript.CompletionInfo> */
  trait WithMetadataCompletionInf extends StObject {
    
    var entries: js.Array[CompletionEntry]
    
    /** Not true for all global completions. This will be true if the enclosing scope matches a few syntax kinds. See `isSnippetScope`. */
    var isGlobalCompletion: Boolean
    
    var isMemberCompletion: Boolean
    
    /**
      * true when the current location also allows for a new identifier
      */
    var isNewIdentifierLocation: Boolean
    
    var metadata: js.UndefOr[js.Any] = js.undefined
    
    /**
      * In the absence of `CompletionEntry["replacementSpan"], the editor may choose whether to use
      * this span or its default one. If `CompletionEntry["replacementSpan"]` is defined, that span
      * must be used to commit that completion entry.
      */
    var optionalReplacementSpan: js.UndefOr[TextSpan] = js.undefined
  }
  object WithMetadataCompletionInf {
    
    inline def apply(
      entries: js.Array[CompletionEntry],
      isGlobalCompletion: Boolean,
      isMemberCompletion: Boolean,
      isNewIdentifierLocation: Boolean
    ): WithMetadataCompletionInf = {
      val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], isGlobalCompletion = isGlobalCompletion.asInstanceOf[js.Any], isMemberCompletion = isMemberCompletion.asInstanceOf[js.Any], isNewIdentifierLocation = isNewIdentifierLocation.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithMetadataCompletionInf]
    }
    
    extension [Self <: WithMetadataCompletionInf](x: Self) {
      
      inline def setEntries(value: js.Array[CompletionEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setEntriesVarargs(value: CompletionEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
      
      inline def setIsGlobalCompletion(value: Boolean): Self = StObject.set(x, "isGlobalCompletion", value.asInstanceOf[js.Any])
      
      inline def setIsMemberCompletion(value: Boolean): Self = StObject.set(x, "isMemberCompletion", value.asInstanceOf[js.Any])
      
      inline def setIsNewIdentifierLocation(value: Boolean): Self = StObject.set(x, "isNewIdentifierLocation", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setOptionalReplacementSpan(value: TextSpan): Self = StObject.set(x, "optionalReplacementSpan", value.asInstanceOf[js.Any])
      
      inline def setOptionalReplacementSpanUndefined: Self = StObject.set(x, "optionalReplacementSpan", js.undefined)
    }
  }
}
