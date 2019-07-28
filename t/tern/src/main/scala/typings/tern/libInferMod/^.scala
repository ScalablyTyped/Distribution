package typings.tern.libInferMod

import typings.estree.estreeMod.Node
import typings.estree.estreeMod.Program
import typings.tern.Anon_Node
import typings.tern.Anon_NodeState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern/lib/infer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ANull: typings.tern.libInferMod.ANull = js.native
  val AVal: AValConstructor = js.native
  val Arr: ArrConstructor = js.native
  val Context: ContextConstructor = js.native
  val Fn: FnConstructor = js.native
  val Obj: ObjConstructor = js.native
  val Prim: PrimConstructor = js.native
  val Scope: ScopeConstructor = js.native
  val Type: TypeConstructor = js.native
  val constraint: ConstraintConstructor = js.native
  def analyze(ast: Program, name: String): Unit = js.native
  def analyze(ast: Program, name: String, scope: typings.tern.libInferMod.Scope): Unit = js.native
  def cx(): typings.tern.libInferMod.Context = js.native
  def didGuess(): Boolean = js.native
  def expressionType(expr: Anon_NodeState): typings.tern.libInferMod.AVal | typings.tern.libInferMod.Type = js.native
  def findClosestExpression(ast: Program, start: js.UndefOr[scala.Nothing], end: Double): Anon_Node | Null = js.native
  def findClosestExpression(ast: Program, start: js.UndefOr[scala.Nothing], end: Double, scope: typings.tern.libInferMod.Scope): Anon_Node | Null = js.native
  def findClosestExpression(ast: Program, start: Double, end: Double): Anon_Node | Null = js.native
  def findClosestExpression(ast: Program, start: Double, end: Double, scope: typings.tern.libInferMod.Scope): Anon_Node | Null = js.native
  def findExpressionAround(ast: Program, start: js.UndefOr[scala.Nothing], end: Double): Anon_Node | Null = js.native
  def findExpressionAround(ast: Program, start: js.UndefOr[scala.Nothing], end: Double, scope: typings.tern.libInferMod.Scope): Anon_Node | Null = js.native
  def findExpressionAround(ast: Program, start: Double, end: Double): Anon_Node | Null = js.native
  def findExpressionAround(ast: Program, start: Double, end: Double, scope: typings.tern.libInferMod.Scope): Anon_Node | Null = js.native
  def findExpressionAt(ast: Program, start: js.UndefOr[scala.Nothing], end: Double): Anon_Node | Null = js.native
  def findExpressionAt(ast: Program, start: js.UndefOr[scala.Nothing], end: Double, scope: typings.tern.libInferMod.Scope): Anon_Node | Null = js.native
  def findExpressionAt(ast: Program, start: Double, end: Double): Anon_Node | Null = js.native
  def findExpressionAt(ast: Program, start: Double, end: Double, scope: typings.tern.libInferMod.Scope): Anon_Node | Null = js.native
  def findPropRefs(
    ast: Program,
    scope: typings.tern.libInferMod.Scope,
    objType: typings.tern.libInferMod.Obj,
    propName: String,
    f: js.Function1[/* Node */ Node, Unit]
  ): Unit = js.native
  def findRefs(
    ast: Program,
    scope: typings.tern.libInferMod.Scope,
    name: String,
    refScope: typings.tern.libInferMod.Scope,
    f: js.Function2[/* Node */ Node, /* Scope */ typings.tern.libInferMod.Scope, Unit]
  ): Unit = js.native
  def markVariablesDefinedBy(scope: typings.tern.libInferMod.Scope, origins: js.Array[String]): Unit = js.native
  def markVariablesDefinedBy(scope: typings.tern.libInferMod.Scope, origins: js.Array[String], start: Double): Unit = js.native
  def markVariablesDefinedBy(scope: typings.tern.libInferMod.Scope, origins: js.Array[String], start: Double, end: Double): Unit = js.native
  def parse(text: String): Program = js.native
  def parse(text: String, options: js.Object): Program = js.native
  def purgeMarkedVariables(): Unit = js.native
  def purgeTypes(origins: js.Array[String]): Unit = js.native
  def purgeTypes(origins: js.Array[String], start: Double): Unit = js.native
  def purgeTypes(origins: js.Array[String], start: Double, end: Double): Unit = js.native
  def resetGuessing(): Unit = js.native
  def resetGuessing(`val`: Boolean): Unit = js.native
  def scopeAt(ast: Program, pos: Double): typings.tern.libInferMod.Scope = js.native
  def scopeAt(ast: Program, pos: Double, scope: typings.tern.libInferMod.Scope): typings.tern.libInferMod.Scope = js.native
  def withContext[R](context: typings.tern.libInferMod.Context, f: js.Function0[R]): R = js.native
}

