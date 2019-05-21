package typings
package ternLib.libInferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Constraint extends ANull {
  /** May return a string when this constraint is indicative of the presence of a specific property in the source AVal. */
  def propHint(): js.UndefOr[java.lang.String]
  /** May return a type that `getType` can use to “guess” its type based on the fact that it propagates to this constraint. */
  def typeHint(): js.UndefOr[Type]
}

@JSImport("tern/lib/infer", "constraint")
@js.native
class constraint protected ()
  extends ternLib.Anon_Constraint {
  def this(methods: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
}

object Constraint {
  @scala.inline
  def apply(
    addType: /* repeated */ js.Any => scala.Unit,
    forAllProps: /* repeated */ js.Any => scala.Unit,
    gatherProperties: /* repeated */ js.Any => scala.Unit,
    getFunctionType: /* repeated */ js.Any => js.UndefOr[ANull],
    getObjType: /* repeated */ js.Any => js.UndefOr[ANull | scala.Null],
    getProp: /* repeated */ js.Any => ANull,
    getSymbolType: /* repeated */ js.Any => js.UndefOr[ANull],
    getType: /* repeated */ js.Any => js.UndefOr[ANull | scala.Null],
    hasType: /* repeated */ js.Any => scala.Boolean,
    isEmpty: /* repeated */ js.Any => scala.Boolean,
    propHint: () => js.UndefOr[java.lang.String],
    propagate: /* repeated */ js.Any => scala.Unit,
    propagatesTo: () => js.Any,
    toString: /* repeated */ js.Any => java.lang.String,
    typeHint: () => js.UndefOr[Type]
  ): Constraint = {
    val __obj = js.Dynamic.literal(addType = js.Any.fromFunction1(addType), forAllProps = js.Any.fromFunction1(forAllProps), gatherProperties = js.Any.fromFunction1(gatherProperties), getFunctionType = js.Any.fromFunction1(getFunctionType), getObjType = js.Any.fromFunction1(getObjType), getProp = js.Any.fromFunction1(getProp), getSymbolType = js.Any.fromFunction1(getSymbolType), getType = js.Any.fromFunction1(getType), hasType = js.Any.fromFunction1(hasType), isEmpty = js.Any.fromFunction1(isEmpty), propHint = js.Any.fromFunction0(propHint), propagate = js.Any.fromFunction1(propagate), propagatesTo = js.Any.fromFunction0(propagatesTo), toString = js.Any.fromFunction1(toString), typeHint = js.Any.fromFunction0(typeHint))
  
    __obj.asInstanceOf[Constraint]
  }
}

