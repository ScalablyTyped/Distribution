package typings
package ternLib.libInferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern/lib/infer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ANull: ternLib.libInferMod.ANull = js.native
  val AVal: AValConstructor = js.native
  val Arr: ArrConstructor = js.native
  val Context: ContextConstructor = js.native
  val Fn: FnConstructor = js.native
  val Obj: ObjConstructor = js.native
  val Prim: PrimConstructor = js.native
  val Scope: ScopeConstructor = js.native
  val Type: TypeConstructor = js.native
  val constraint: ConstraintConstructor = js.native
  def analyze(ast: estreeLib.estreeMod.Program, name: java.lang.String): scala.Unit = js.native
  def analyze(ast: estreeLib.estreeMod.Program, name: java.lang.String, scope: Scope): scala.Unit = js.native
  def cx(): Context = js.native
  def didGuess(): scala.Boolean = js.native
  def expressionType(expr: ternLib.Anon_NodeState): AVal | Type = js.native
  def findClosestExpression(ast: estreeLib.estreeMod.Program, start: js.UndefOr[scala.Nothing], end: scala.Double): ternLib.Anon_Node | scala.Null = js.native
  def findClosestExpression(
    ast: estreeLib.estreeMod.Program,
    start: js.UndefOr[scala.Nothing],
    end: scala.Double,
    scope: Scope
  ): ternLib.Anon_Node | scala.Null = js.native
  def findClosestExpression(ast: estreeLib.estreeMod.Program, start: scala.Double, end: scala.Double): ternLib.Anon_Node | scala.Null = js.native
  def findClosestExpression(ast: estreeLib.estreeMod.Program, start: scala.Double, end: scala.Double, scope: Scope): ternLib.Anon_Node | scala.Null = js.native
  def findExpressionAround(ast: estreeLib.estreeMod.Program, start: js.UndefOr[scala.Nothing], end: scala.Double): ternLib.Anon_Node | scala.Null = js.native
  def findExpressionAround(
    ast: estreeLib.estreeMod.Program,
    start: js.UndefOr[scala.Nothing],
    end: scala.Double,
    scope: Scope
  ): ternLib.Anon_Node | scala.Null = js.native
  def findExpressionAround(ast: estreeLib.estreeMod.Program, start: scala.Double, end: scala.Double): ternLib.Anon_Node | scala.Null = js.native
  def findExpressionAround(ast: estreeLib.estreeMod.Program, start: scala.Double, end: scala.Double, scope: Scope): ternLib.Anon_Node | scala.Null = js.native
  def findExpressionAt(ast: estreeLib.estreeMod.Program, start: js.UndefOr[scala.Nothing], end: scala.Double): ternLib.Anon_Node | scala.Null = js.native
  def findExpressionAt(
    ast: estreeLib.estreeMod.Program,
    start: js.UndefOr[scala.Nothing],
    end: scala.Double,
    scope: Scope
  ): ternLib.Anon_Node | scala.Null = js.native
  def findExpressionAt(ast: estreeLib.estreeMod.Program, start: scala.Double, end: scala.Double): ternLib.Anon_Node | scala.Null = js.native
  def findExpressionAt(ast: estreeLib.estreeMod.Program, start: scala.Double, end: scala.Double, scope: Scope): ternLib.Anon_Node | scala.Null = js.native
  def findPropRefs(
    ast: estreeLib.estreeMod.Program,
    scope: Scope,
    objType: Obj,
    propName: java.lang.String,
    f: js.Function1[/* Node */ estreeLib.estreeMod.Node, scala.Unit]
  ): scala.Unit = js.native
  def findRefs(
    ast: estreeLib.estreeMod.Program,
    scope: Scope,
    name: java.lang.String,
    refScope: Scope,
    f: js.Function2[/* Node */ estreeLib.estreeMod.Node, /* Scope */ Scope, scala.Unit]
  ): scala.Unit = js.native
  def markVariablesDefinedBy(scope: Scope, origins: js.Array[java.lang.String]): scala.Unit = js.native
  def markVariablesDefinedBy(scope: Scope, origins: js.Array[java.lang.String], start: scala.Double): scala.Unit = js.native
  def markVariablesDefinedBy(scope: Scope, origins: js.Array[java.lang.String], start: scala.Double, end: scala.Double): scala.Unit = js.native
  def parse(text: java.lang.String): estreeLib.estreeMod.Program = js.native
  def parse(text: java.lang.String, options: js.Object): estreeLib.estreeMod.Program = js.native
  def purgeMarkedVariables(): scala.Unit = js.native
  def purgeTypes(origins: js.Array[java.lang.String]): scala.Unit = js.native
  def purgeTypes(origins: js.Array[java.lang.String], start: scala.Double): scala.Unit = js.native
  def purgeTypes(origins: js.Array[java.lang.String], start: scala.Double, end: scala.Double): scala.Unit = js.native
  def resetGuessing(): scala.Unit = js.native
  def resetGuessing(`val`: scala.Boolean): scala.Unit = js.native
  def scopeAt(ast: estreeLib.estreeMod.Program, pos: scala.Double): Scope = js.native
  def scopeAt(ast: estreeLib.estreeMod.Program, pos: scala.Double, scope: Scope): Scope = js.native
  def withContext[R](context: Context, f: js.Function0[R]): R = js.native
}

