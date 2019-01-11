package typings
package ternLib.libInferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern/lib/infer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val ANull: ternLib.libInferMod.ANull = js.native
  val AVal: ternLib.libInferMod.AValConstructor = js.native
  val Arr: ternLib.libInferMod.ArrConstructor = js.native
  val Context: ternLib.libInferMod.ContextConstructor = js.native
  val Fn: ternLib.libInferMod.FnConstructor = js.native
  val Obj: ternLib.libInferMod.ObjConstructor = js.native
  val Scope: ternLib.libInferMod.ScopeConstructor = js.native
  val constraint: ternLib.libInferMod.ConstraintConstructor = js.native
  def analyze(ast: estreeLib.estreeMod.Program, name: java.lang.String): scala.Unit = js.native
  def analyze(ast: estreeLib.estreeMod.Program, name: java.lang.String, scope: ternLib.libInferMod.Scope): scala.Unit = js.native
  def cx(): ternLib.libInferMod.Context = js.native
  def didGuess(): scala.Boolean = js.native
  def expressionType(expr: ternLib.Anon_Node): ternLib.libInferMod.AVal | ternLib.libInferMod.Type = js.native
  def findClosestExpression(ast: estreeLib.estreeMod.Program, start: js.UndefOr[scala.Nothing], end: scala.Double): ternLib.Anon_Node | scala.Null = js.native
  def findClosestExpression(
    ast: estreeLib.estreeMod.Program,
    start: js.UndefOr[scala.Nothing],
    end: scala.Double,
    scope: ternLib.libInferMod.Scope
  ): ternLib.Anon_Node | scala.Null = js.native
  def findClosestExpression(ast: estreeLib.estreeMod.Program, start: scala.Double, end: scala.Double): ternLib.Anon_Node | scala.Null = js.native
  def findClosestExpression(
    ast: estreeLib.estreeMod.Program,
    start: scala.Double,
    end: scala.Double,
    scope: ternLib.libInferMod.Scope
  ): ternLib.Anon_Node | scala.Null = js.native
  def findExpressionAround(ast: estreeLib.estreeMod.Program, start: js.UndefOr[scala.Nothing], end: scala.Double): ternLib.Anon_Node | scala.Null = js.native
  def findExpressionAround(
    ast: estreeLib.estreeMod.Program,
    start: js.UndefOr[scala.Nothing],
    end: scala.Double,
    scope: ternLib.libInferMod.Scope
  ): ternLib.Anon_Node | scala.Null = js.native
  def findExpressionAround(ast: estreeLib.estreeMod.Program, start: scala.Double, end: scala.Double): ternLib.Anon_Node | scala.Null = js.native
  def findExpressionAround(
    ast: estreeLib.estreeMod.Program,
    start: scala.Double,
    end: scala.Double,
    scope: ternLib.libInferMod.Scope
  ): ternLib.Anon_Node | scala.Null = js.native
  def findExpressionAt(ast: estreeLib.estreeMod.Program, start: js.UndefOr[scala.Nothing], end: scala.Double): ternLib.Anon_Node | scala.Null = js.native
  def findExpressionAt(
    ast: estreeLib.estreeMod.Program,
    start: js.UndefOr[scala.Nothing],
    end: scala.Double,
    scope: ternLib.libInferMod.Scope
  ): ternLib.Anon_Node | scala.Null = js.native
  def findExpressionAt(ast: estreeLib.estreeMod.Program, start: scala.Double, end: scala.Double): ternLib.Anon_Node | scala.Null = js.native
  def findExpressionAt(
    ast: estreeLib.estreeMod.Program,
    start: scala.Double,
    end: scala.Double,
    scope: ternLib.libInferMod.Scope
  ): ternLib.Anon_Node | scala.Null = js.native
  def findPropRefs(
    ast: estreeLib.estreeMod.Program,
    scope: ternLib.libInferMod.Scope,
    objType: ternLib.libInferMod.Obj,
    propName: java.lang.String,
    f: js.Function1[/* Node */ estreeLib.estreeMod.Node, scala.Unit]
  ): scala.Unit = js.native
  def findRefs(
    ast: estreeLib.estreeMod.Program,
    scope: ternLib.libInferMod.Scope,
    name: java.lang.String,
    refScope: ternLib.libInferMod.Scope,
    f: js.Function2[
      /* Node */ estreeLib.estreeMod.Node, 
      /* Scope */ ternLib.libInferMod.Scope, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def markVariablesDefinedBy(scope: ternLib.libInferMod.Scope, origins: js.Array[java.lang.String]): scala.Unit = js.native
  def markVariablesDefinedBy(scope: ternLib.libInferMod.Scope, origins: js.Array[java.lang.String], start: scala.Double): scala.Unit = js.native
  def markVariablesDefinedBy(
    scope: ternLib.libInferMod.Scope,
    origins: js.Array[java.lang.String],
    start: scala.Double,
    end: scala.Double
  ): scala.Unit = js.native
  def parse(text: java.lang.String): estreeLib.estreeMod.Program = js.native
  def parse(text: java.lang.String, options: js.Object): estreeLib.estreeMod.Program = js.native
  def purgeMarkedVariables(): scala.Unit = js.native
  def purgeTypes(origins: js.Array[java.lang.String]): scala.Unit = js.native
  def purgeTypes(origins: js.Array[java.lang.String], start: scala.Double): scala.Unit = js.native
  def purgeTypes(origins: js.Array[java.lang.String], start: scala.Double, end: scala.Double): scala.Unit = js.native
  def resetGuessing(): scala.Unit = js.native
  def resetGuessing(`val`: scala.Boolean): scala.Unit = js.native
  def scopeAt(ast: estreeLib.estreeMod.Program, pos: scala.Double): ternLib.libInferMod.Scope = js.native
  def scopeAt(ast: estreeLib.estreeMod.Program, pos: scala.Double, scope: ternLib.libInferMod.Scope): ternLib.libInferMod.Scope = js.native
  def withContext(context: ternLib.libInferMod.Context, f: js.Function0[scala.Unit]): scala.Unit = js.native
}

