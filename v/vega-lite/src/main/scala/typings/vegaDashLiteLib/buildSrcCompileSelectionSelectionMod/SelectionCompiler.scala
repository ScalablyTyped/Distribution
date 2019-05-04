package typings
package vegaDashLiteLib.buildSrcCompileSelectionSelectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionCompiler extends js.Object {
  var marks: js.UndefOr[
    js.Function3[
      /* model */ vegaDashLiteLib.buildSrcCompileUnitMod.UnitModel, 
      /* selCmpt */ SelectionComponent, 
      /* marks */ js.Array[_], 
      js.Array[_]
    ]
  ] = js.undefined
  var predicate: java.lang.String
  var scaleDomain: java.lang.String
  var topLevelSignals: js.UndefOr[
    js.Function3[
      /* model */ vegaDashLiteLib.buildSrcCompileModelMod.Model, 
      /* selCmpt */ SelectionComponent, 
      /* signals */ js.Array[_], 
      js.Array[_]
    ]
  ] = js.undefined
  def modifyExpr(model: vegaDashLiteLib.buildSrcCompileUnitMod.UnitModel, selCmpt: SelectionComponent): java.lang.String
  def signals(model: vegaDashLiteLib.buildSrcCompileUnitMod.UnitModel, selCmpt: SelectionComponent): js.Array[_]
}

object SelectionCompiler {
  @scala.inline
  def apply(
    modifyExpr: (vegaDashLiteLib.buildSrcCompileUnitMod.UnitModel, SelectionComponent) => java.lang.String,
    predicate: java.lang.String,
    scaleDomain: java.lang.String,
    signals: (vegaDashLiteLib.buildSrcCompileUnitMod.UnitModel, SelectionComponent) => js.Array[_],
    marks: (/* model */ vegaDashLiteLib.buildSrcCompileUnitMod.UnitModel, /* selCmpt */ SelectionComponent, /* marks */ js.Array[_]) => js.Array[_] = null,
    topLevelSignals: (/* model */ vegaDashLiteLib.buildSrcCompileModelMod.Model, /* selCmpt */ SelectionComponent, /* signals */ js.Array[_]) => js.Array[_] = null
  ): SelectionCompiler = {
    val __obj = js.Dynamic.literal(modifyExpr = js.Any.fromFunction2(modifyExpr), predicate = predicate, scaleDomain = scaleDomain, signals = js.Any.fromFunction2(signals))
    if (marks != null) __obj.updateDynamic("marks")(js.Any.fromFunction3(marks))
    if (topLevelSignals != null) __obj.updateDynamic("topLevelSignals")(js.Any.fromFunction3(topLevelSignals))
    __obj.asInstanceOf[SelectionCompiler]
  }
}

