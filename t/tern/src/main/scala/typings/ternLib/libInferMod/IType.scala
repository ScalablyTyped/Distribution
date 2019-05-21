package typings
package ternLib.libInferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IType extends ANull {
  /** The origin file of the type. */
  var origin: java.lang.String
  /**
    * The syntax node that defined the type. Only present for object and function types,
    * and even for those it may be missing (if the type was created by a type definition file,
    * or synthesized in some other way).
    */
  var originNode: js.UndefOr[estreeLib.estreeMod.Node] = js.undefined
  def getType(): Type
  /** Queries whether the AVal _currently_ holds the given type. */
  def hasType(`type`: Type): scala.Boolean
  /** Return a string that describes the type. maxDepth indicates the depth to which inner types should be shown. */
  def toString(maxDepth: scala.Double): java.lang.String
}

object IType {
  @scala.inline
  def apply(
    addType: /* repeated */ js.Any => scala.Unit,
    forAllProps: /* repeated */ js.Any => scala.Unit,
    gatherProperties: /* repeated */ js.Any => scala.Unit,
    getFunctionType: /* repeated */ js.Any => js.UndefOr[ANull],
    getObjType: /* repeated */ js.Any => js.UndefOr[ANull | scala.Null],
    getProp: /* repeated */ js.Any => ANull,
    getSymbolType: /* repeated */ js.Any => js.UndefOr[ANull],
    getType: () => Type,
    hasType: Type => scala.Boolean,
    isEmpty: /* repeated */ js.Any => scala.Boolean,
    origin: java.lang.String,
    propHint: /* repeated */ js.Any => js.UndefOr[java.lang.String],
    propagate: /* repeated */ js.Any => scala.Unit,
    propagatesTo: () => js.Any,
    toString: scala.Double => java.lang.String,
    typeHint: /* repeated */ js.Any => js.UndefOr[ANull | scala.Null],
    originNode: estreeLib.estreeMod.Node = null
  ): IType = {
    val __obj = js.Dynamic.literal(addType = js.Any.fromFunction1(addType), forAllProps = js.Any.fromFunction1(forAllProps), gatherProperties = js.Any.fromFunction1(gatherProperties), getFunctionType = js.Any.fromFunction1(getFunctionType), getObjType = js.Any.fromFunction1(getObjType), getProp = js.Any.fromFunction1(getProp), getSymbolType = js.Any.fromFunction1(getSymbolType), getType = js.Any.fromFunction0(getType), hasType = js.Any.fromFunction1(hasType), isEmpty = js.Any.fromFunction1(isEmpty), origin = origin, propHint = js.Any.fromFunction1(propHint), propagate = js.Any.fromFunction1(propagate), propagatesTo = js.Any.fromFunction0(propagatesTo), toString = js.Any.fromFunction1(toString), typeHint = js.Any.fromFunction1(typeHint))
    if (originNode != null) __obj.updateDynamic("originNode")(originNode)
    __obj.asInstanceOf[IType]
  }
}

