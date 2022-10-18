package typings.typedoc

import typings.typedoc.distLibConverterConverterMod.Converter
import typings.typedoc.distLibModelsMod.DeclarationReflection
import typings.typedoc.distLibModelsMod.ProjectReflection
import typings.typedoc.distLibModelsMod.Reflection
import typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind
import typings.typedoc.distLibUtilsMod.Logger
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.Node
import typings.typescript.mod.Program
import typings.typescript.mod.Symbol
import typings.typescript.mod.Type
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibConverterContextMod {
  
  @JSImport("typedoc/dist/lib/converter/context", "Context")
  @js.native
  open class Context protected () extends StObject {
    /**
      * Create a new Context instance.
      *
      * @param converter  The converter instance that has created the context.
      * @internal
      */
    def this(converter: Converter, programs: js.Array[Program], project: ProjectReflection) = this()
    def this(converter: Converter, programs: js.Array[Program], project: ProjectReflection, scope: Reflection) = this()
    
    /* private */ var _program: Any = js.native
    
    def addChild(reflection: DeclarationReflection): Unit = js.native
    
    /**
      * The TypeChecker instance returned by the TypeScript compiler.
      */
    def checker: TypeChecker = js.native
    
    /**
      * The converter instance that has created the context.
      */
    val converter: Converter = js.native
    
    /* private */ var convertingTypeNode: Any = js.native
    
    def createDeclarationReflection(kind: ReflectionKind): DeclarationReflection = js.native
    def createDeclarationReflection(kind: ReflectionKind, symbol: Unit, exportSymbol: Unit, nameOverride: String): DeclarationReflection = js.native
    def createDeclarationReflection(kind: ReflectionKind, symbol: Unit, exportSymbol: Symbol): DeclarationReflection = js.native
    def createDeclarationReflection(kind: ReflectionKind, symbol: Unit, exportSymbol: Symbol, nameOverride: String): DeclarationReflection = js.native
    def createDeclarationReflection(kind: ReflectionKind, symbol: Symbol): DeclarationReflection = js.native
    def createDeclarationReflection(kind: ReflectionKind, symbol: Symbol, exportSymbol: Unit, nameOverride: String): DeclarationReflection = js.native
    def createDeclarationReflection(kind: ReflectionKind, symbol: Symbol, exportSymbol: Symbol): DeclarationReflection = js.native
    def createDeclarationReflection(kind: ReflectionKind, symbol: Symbol, exportSymbol: Symbol, nameOverride: String): DeclarationReflection = js.native
    
    def expectSymbolAtLocation(node: Node): Symbol = js.native
    
    def finalizeDeclarationReflection(reflection: DeclarationReflection): Unit = js.native
    
    /**
      * Return the compiler options.
      */
    def getCompilerOptions(): CompilerOptions = js.native
    
    def getSymbolAtLocation(node: Node): js.UndefOr[Symbol] = js.native
    
    /**
      * Return the type declaration of the given node.
      *
      * @param node  The TypeScript node whose type should be resolved.
      * @returns The type declaration of the given node.
      */
    def getTypeAtLocation(node: Node): js.UndefOr[Type] = js.native
    
    /** @internal */
    def isConvertingTypeNode(): Boolean = js.native
    
    /** @internal */
    def logger: Logger = js.native
    
    def postReflectionCreation(reflection: Reflection): Unit = js.native
    def postReflectionCreation(reflection: Reflection, symbol: Unit, exportSymbol: Symbol): Unit = js.native
    def postReflectionCreation(reflection: Reflection, symbol: Symbol): Unit = js.native
    def postReflectionCreation(reflection: Reflection, symbol: Symbol, exportSymbol: Symbol): Unit = js.native
    
    /**
      * The program currently being converted.
      * Accessing this property will throw if a source file is not currently being converted.
      */
    def program: Program = js.native
    
    /**
      * All programs being converted.
      */
    val programs: js.Array[Program] = js.native
    
    /**
      * The project that is currently processed.
      */
    val project: ProjectReflection = js.native
    
    /**
      * Register a newly generated reflection. All created reflections should be
      * passed to this method to ensure that the project helper functions work correctly.
      *
      * @param reflection  The reflection that should be registered.
      * @param symbol  The symbol the given reflection was resolved from.
      */
    def registerReflection(reflection: Reflection): Unit = js.native
    def registerReflection(reflection: Reflection, symbol: Symbol): Unit = js.native
    
    def resolveAliasedSymbol(symbol: Symbol): Symbol = js.native
    
    /**
      * The scope or parent reflection that is currently processed.
      */
    val scope: Reflection = js.native
    
    /** @internal */
    def setActiveProgram(): Unit = js.native
    def setActiveProgram(program: Program): Unit = js.native
    
    /** @internal */
    def setConvertingTypeNode(): Unit = js.native
    
    /** @internal */
    var shouldBeStatic: Boolean = js.native
    
    def shouldIgnore(symbol: Symbol): Boolean = js.native
    
    /**
      * Trigger a node reflection event.
      *
      * All events are dispatched on the current converter instance.
      *
      * @param name  The name of the event that should be triggered.
      * @param reflection  The triggering reflection.
      * @param node  The triggering TypeScript node if available.
      */
    def trigger(name: String, reflection: Reflection): Unit = js.native
    def trigger(name: String, reflection: Reflection, node: Node): Unit = js.native
    
    /**
      * @param callback  The callback function that should be executed with the changed context.
      */
    def withScope(scope: Reflection): Context = js.native
  }
}
