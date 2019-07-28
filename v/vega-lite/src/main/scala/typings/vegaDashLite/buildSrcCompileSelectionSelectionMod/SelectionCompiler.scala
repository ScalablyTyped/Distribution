package typings.vegaDashLite.buildSrcCompileSelectionSelectionMod

import typings.vegaDashLite.buildSrcCompileModelMod.Model
import typings.vegaDashLite.buildSrcCompileUnitMod.UnitModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionCompiler extends js.Object {
  var marks: js.UndefOr[
    js.Function3[
      /* model */ UnitModel, 
      /* selCmpt */ SelectionComponent, 
      /* marks */ js.Array[_], 
      js.Array[_]
    ]
  ] = js.undefined
  var predicate: String
  var scaleDomain: String
  var topLevelSignals: js.UndefOr[
    js.Function3[
      /* model */ Model, 
      /* selCmpt */ SelectionComponent, 
      /* signals */ js.Array[_], 
      js.Array[_]
    ]
  ] = js.undefined
  def modifyExpr(model: UnitModel, selCmpt: SelectionComponent): String
  def signals(model: UnitModel, selCmpt: SelectionComponent): js.Array[_]
}

object SelectionCompiler {
  @scala.inline
  def apply(
    modifyExpr: (UnitModel, SelectionComponent) => String,
    predicate: String,
    scaleDomain: String,
    signals: (UnitModel, SelectionComponent) => js.Array[_],
    marks: (/* model */ UnitModel, /* selCmpt */ SelectionComponent, /* marks */ js.Array[_]) => js.Array[_] = null,
    topLevelSignals: (/* model */ Model, /* selCmpt */ SelectionComponent, /* signals */ js.Array[_]) => js.Array[_] = null
  ): SelectionCompiler = {
    val __obj = js.Dynamic.literal(modifyExpr = js.Any.fromFunction2(modifyExpr), predicate = predicate, scaleDomain = scaleDomain, signals = js.Any.fromFunction2(signals))
    if (marks != null) __obj.updateDynamic("marks")(js.Any.fromFunction3(marks))
    if (topLevelSignals != null) __obj.updateDynamic("topLevelSignals")(js.Any.fromFunction3(topLevelSignals))
    __obj.asInstanceOf[SelectionCompiler]
  }
}

