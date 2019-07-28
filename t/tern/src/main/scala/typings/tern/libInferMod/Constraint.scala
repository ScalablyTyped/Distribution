package typings.tern.libInferMod

import org.scalablytyped.runtime.StringDictionary
import typings.tern.Anon_Constraint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Constraint extends ANull {
  /** May return a string when this constraint is indicative of the presence of a specific property in the source AVal. */
  def propHint(): js.UndefOr[String]
  /** May return a type that `getType` can use to “guess” its type based on the fact that it propagates to this constraint. */
  def typeHint(): js.UndefOr[Type]
}

@JSImport("tern/lib/infer", "constraint")
@js.native
class constraint protected () extends Anon_Constraint {
  def this(methods: StringDictionary[js.Any]) = this()
}

object Constraint {
  @scala.inline
  def apply(
    addType: /* repeated */ js.Any => Unit,
    forAllProps: /* repeated */ js.Any => Unit,
    gatherProperties: /* repeated */ js.Any => Unit,
    getFunctionType: /* repeated */ js.Any => js.UndefOr[ANull],
    getObjType: /* repeated */ js.Any => js.UndefOr[ANull | Null],
    getProp: /* repeated */ js.Any => ANull,
    getSymbolType: /* repeated */ js.Any => js.UndefOr[ANull],
    getType: /* repeated */ js.Any => js.UndefOr[ANull | Null],
    hasType: /* repeated */ js.Any => Boolean,
    isEmpty: /* repeated */ js.Any => Boolean,
    propHint: () => js.UndefOr[String],
    propagate: /* repeated */ js.Any => Unit,
    propagatesTo: () => js.Any,
    toString: /* repeated */ js.Any => String,
    typeHint: () => js.UndefOr[Type]
  ): Constraint = {
    val __obj = js.Dynamic.literal(addType = js.Any.fromFunction1(addType), forAllProps = js.Any.fromFunction1(forAllProps), gatherProperties = js.Any.fromFunction1(gatherProperties), getFunctionType = js.Any.fromFunction1(getFunctionType), getObjType = js.Any.fromFunction1(getObjType), getProp = js.Any.fromFunction1(getProp), getSymbolType = js.Any.fromFunction1(getSymbolType), getType = js.Any.fromFunction1(getType), hasType = js.Any.fromFunction1(hasType), isEmpty = js.Any.fromFunction1(isEmpty), propHint = js.Any.fromFunction0(propHint), propagate = js.Any.fromFunction1(propagate), propagatesTo = js.Any.fromFunction0(propagatesTo), toString = js.Any.fromFunction1(toString), typeHint = js.Any.fromFunction0(typeHint))
  
    __obj.asInstanceOf[Constraint]
  }
}

