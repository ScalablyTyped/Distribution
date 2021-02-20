package typings.tern

import org.scalablytyped.runtime.StringDictionary
import typings.estree.mod.Node
import typings.estree.mod.Program
import typings.tern.anon.Instantiable
import typings.tern.anon.State
import typings.tern.inferMod.AValConstructor
import typings.tern.inferMod.ArrConstructor
import typings.tern.inferMod.ConstraintConstructor
import typings.tern.inferMod.ContextConstructor
import typings.tern.inferMod.FnConstructor
import typings.tern.inferMod.ObjConstructor
import typings.tern.inferMod.PrimConstructor
import typings.tern.inferMod.ScopeConstructor
import typings.tern.inferMod.TypeConstructor
import typings.tern.ternBooleans.`true`
import typings.tern.ternMod.ConstructorOptions
import typings.tern.ternMod.Desc
import typings.tern.ternMod.TernConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tern", "ANull")
  @js.native
  val ANull: typings.tern.inferMod.ANull = js.native
  
  @JSImport("tern", "AVal")
  @js.native
  val AVal: AValConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("tern", "AVal")
  @js.native
  class AValCls ()
    extends typings.tern.inferMod.AVal
  
  @JSImport("tern", "Arr")
  @js.native
  val Arr: ArrConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("tern", "Arr")
  @js.native
  /** Constructor that creates an array type with the given content type. */
  class ArrCls ()
    extends typings.tern.inferMod.Arr {
    def this(contentType: typings.tern.inferMod.AVal) = this()
  }
  
  @JSImport("tern", "Context")
  @js.native
  val Context: ContextConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("tern", "Context")
  @js.native
  class ContextCls protected ()
    extends typings.tern.inferMod.Context {
    def this(defs: js.Array[_], parent: typings.tern.ternMod.Server) = this()
  }
  
  @JSImport("tern", "Fn")
  @js.native
  val Fn: FnConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("tern", "Fn")
  @js.native
  class FnCls protected ()
    extends typings.tern.inferMod.Fn {
    def this(
      name: js.UndefOr[scala.Nothing],
      self: typings.tern.inferMod.AVal,
      args: js.Array[typings.tern.inferMod.AVal],
      argNames: js.Array[String],
      retval: typings.tern.inferMod.AVal
    ) = this()
    def this(
      name: String,
      self: typings.tern.inferMod.AVal,
      args: js.Array[typings.tern.inferMod.AVal],
      argNames: js.Array[String],
      retval: typings.tern.inferMod.AVal
    ) = this()
  }
  
  @JSImport("tern", "Obj")
  @js.native
  val Obj: ObjConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("tern", "Obj")
  @js.native
  class ObjCls ()
    extends typings.tern.inferMod.Obj {
    def this(proto: js.Object) = this()
    def this(proto: `true`) = this()
    def this(proto: js.Object, name: String) = this()
    def this(proto: Null, name: String) = this()
    def this(proto: `true`, name: String) = this()
  }
  
  @JSImport("tern", "Prim")
  @js.native
  val Prim: PrimConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("tern", "Prim")
  @js.native
  class PrimCls ()
    extends typings.tern.inferMod.Prim {
    def this(proto: js.Object) = this()
    def this(proto: js.Object, name: String) = this()
    def this(proto: Null, name: String) = this()
  }
  
  @JSImport("tern", "Scope")
  @js.native
  val Scope: ScopeConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("tern", "Scope")
  @js.native
  class ScopeCls ()
    extends typings.tern.inferMod.Scope {
    def this(parent: typings.tern.inferMod.Scope, originNode: Node) = this()
  }
  
  @JSImport("tern", "Server")
  @js.native
  val Server: TernConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("tern", "Server")
  @js.native
  class ServerCls ()
    extends typings.tern.ternMod.Server {
    def this(options: ConstructorOptions) = this()
  }
  
  @JSImport("tern", "Type")
  @js.native
  val Type: TypeConstructor = js.native
  
  @JSImport("tern", "analyze")
  @js.native
  def analyze(ast: Program, name: String): Unit = js.native
  @JSImport("tern", "analyze")
  @js.native
  def analyze(ast: Program, name: String, scope: typings.tern.inferMod.Scope): Unit = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("tern", "constraint")
  @js.native
  class constraint protected () extends Instantiable {
    def this(methods: StringDictionary[js.Any]) = this()
  }
  @JSImport("tern", "constraint")
  @js.native
  val constraint: ConstraintConstructor = js.native
  
  @JSImport("tern", "cx")
  @js.native
  def cx(): typings.tern.inferMod.Context = js.native
  
  @JSImport("tern", "defineQueryType")
  @js.native
  def defineQueryType[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.Query['type'] */ js.Any */](name: T, desc: Desc[T]): Unit = js.native
  
  @JSImport("tern", "didGuess")
  @js.native
  def didGuess(): Boolean = js.native
  
  @JSImport("tern", "expressionType")
  @js.native
  def expressionType(expr: State): typings.tern.inferMod.AVal | typings.tern.inferMod.Type = js.native
  
  @JSImport("tern", "findClosestExpression")
  @js.native
  def findClosestExpression(ast: Program, start: js.UndefOr[scala.Nothing], end: Double): typings.tern.anon.Node | Null = js.native
  @JSImport("tern", "findClosestExpression")
  @js.native
  def findClosestExpression(ast: Program, start: js.UndefOr[scala.Nothing], end: Double, scope: typings.tern.inferMod.Scope): typings.tern.anon.Node | Null = js.native
  @JSImport("tern", "findClosestExpression")
  @js.native
  def findClosestExpression(ast: Program, start: Double, end: Double): typings.tern.anon.Node | Null = js.native
  @JSImport("tern", "findClosestExpression")
  @js.native
  def findClosestExpression(ast: Program, start: Double, end: Double, scope: typings.tern.inferMod.Scope): typings.tern.anon.Node | Null = js.native
  
  @JSImport("tern", "findExpressionAround")
  @js.native
  def findExpressionAround(ast: Program, start: js.UndefOr[scala.Nothing], end: Double): typings.tern.anon.Node | Null = js.native
  @JSImport("tern", "findExpressionAround")
  @js.native
  def findExpressionAround(ast: Program, start: js.UndefOr[scala.Nothing], end: Double, scope: typings.tern.inferMod.Scope): typings.tern.anon.Node | Null = js.native
  @JSImport("tern", "findExpressionAround")
  @js.native
  def findExpressionAround(ast: Program, start: Double, end: Double): typings.tern.anon.Node | Null = js.native
  @JSImport("tern", "findExpressionAround")
  @js.native
  def findExpressionAround(ast: Program, start: Double, end: Double, scope: typings.tern.inferMod.Scope): typings.tern.anon.Node | Null = js.native
  
  @JSImport("tern", "findExpressionAt")
  @js.native
  def findExpressionAt(ast: Program, start: js.UndefOr[scala.Nothing], end: Double): typings.tern.anon.Node | Null = js.native
  @JSImport("tern", "findExpressionAt")
  @js.native
  def findExpressionAt(ast: Program, start: js.UndefOr[scala.Nothing], end: Double, scope: typings.tern.inferMod.Scope): typings.tern.anon.Node | Null = js.native
  @JSImport("tern", "findExpressionAt")
  @js.native
  def findExpressionAt(ast: Program, start: Double, end: Double): typings.tern.anon.Node | Null = js.native
  @JSImport("tern", "findExpressionAt")
  @js.native
  def findExpressionAt(ast: Program, start: Double, end: Double, scope: typings.tern.inferMod.Scope): typings.tern.anon.Node | Null = js.native
  
  @JSImport("tern", "findPropRefs")
  @js.native
  def findPropRefs(
    ast: Program,
    scope: typings.tern.inferMod.Scope,
    objType: typings.tern.inferMod.Obj,
    propName: String,
    f: js.Function1[/* Node */ Node, Unit]
  ): Unit = js.native
  
  @JSImport("tern", "findRefs")
  @js.native
  def findRefs(
    ast: Program,
    scope: typings.tern.inferMod.Scope,
    name: String,
    refScope: typings.tern.inferMod.Scope,
    f: js.Function2[/* Node */ Node, /* Scope */ typings.tern.inferMod.Scope, Unit]
  ): Unit = js.native
  
  @JSImport("tern", "markVariablesDefinedBy")
  @js.native
  def markVariablesDefinedBy(scope: typings.tern.inferMod.Scope, origins: js.Array[String]): Unit = js.native
  @JSImport("tern", "markVariablesDefinedBy")
  @js.native
  def markVariablesDefinedBy(
    scope: typings.tern.inferMod.Scope,
    origins: js.Array[String],
    start: js.UndefOr[scala.Nothing],
    end: Double
  ): Unit = js.native
  @JSImport("tern", "markVariablesDefinedBy")
  @js.native
  def markVariablesDefinedBy(scope: typings.tern.inferMod.Scope, origins: js.Array[String], start: Double): Unit = js.native
  @JSImport("tern", "markVariablesDefinedBy")
  @js.native
  def markVariablesDefinedBy(scope: typings.tern.inferMod.Scope, origins: js.Array[String], start: Double, end: Double): Unit = js.native
  
  @JSImport("tern", "parse")
  @js.native
  def parse(text: String): Program = js.native
  @JSImport("tern", "parse")
  @js.native
  def parse(text: String, options: js.Object): Program = js.native
  
  @JSImport("tern", "purgeMarkedVariables")
  @js.native
  def purgeMarkedVariables(): Unit = js.native
  
  @JSImport("tern", "purgeTypes")
  @js.native
  def purgeTypes(origins: js.Array[String]): Unit = js.native
  @JSImport("tern", "purgeTypes")
  @js.native
  def purgeTypes(origins: js.Array[String], start: js.UndefOr[scala.Nothing], end: Double): Unit = js.native
  @JSImport("tern", "purgeTypes")
  @js.native
  def purgeTypes(origins: js.Array[String], start: Double): Unit = js.native
  @JSImport("tern", "purgeTypes")
  @js.native
  def purgeTypes(origins: js.Array[String], start: Double, end: Double): Unit = js.native
  
  @JSImport("tern", "registerPlugin")
  @js.native
  def registerPlugin(
    name: String,
    init: js.Function2[
      /* server */ typings.tern.ternMod.Server, 
      /* options */ js.UndefOr[ConstructorOptions], 
      Unit
    ]
  ): Unit = js.native
  
  @JSImport("tern", "resetGuessing")
  @js.native
  def resetGuessing(): Unit = js.native
  @JSImport("tern", "resetGuessing")
  @js.native
  def resetGuessing(`val`: Boolean): Unit = js.native
  
  @JSImport("tern", "scopeAt")
  @js.native
  def scopeAt(ast: Program, pos: Double): typings.tern.inferMod.Scope = js.native
  @JSImport("tern", "scopeAt")
  @js.native
  def scopeAt(ast: Program, pos: Double, scope: typings.tern.inferMod.Scope): typings.tern.inferMod.Scope = js.native
  
  @JSImport("tern", "version")
  @js.native
  val version: String = js.native
  
  @JSImport("tern", "withContext")
  @js.native
  def withContext[R](context: typings.tern.inferMod.Context, f: js.Function0[R]): R = js.native
}
