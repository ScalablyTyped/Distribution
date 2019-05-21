package typings
package ternLib.libInferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ANull extends js.Object {
  def addType(args: js.Any*): scala.Unit
  def forAllProps(args: js.Any*): scala.Unit
  def gatherProperties(args: js.Any*): scala.Unit
  def getFunctionType(args: js.Any*): js.UndefOr[ANull]
  def getObjType(args: js.Any*): js.UndefOr[ANull | scala.Null]
  def getProp(args: js.Any*): ANull
  def getSymbolType(args: js.Any*): js.UndefOr[ANull]
  def getType(args: js.Any*): js.UndefOr[ANull | scala.Null]
  def hasType(args: js.Any*): scala.Boolean
  def isEmpty(args: js.Any*): scala.Boolean
  def propHint(args: js.Any*): js.UndefOr[java.lang.String]
  def propagate(args: js.Any*): scala.Unit
  def propagatesTo(): js.Any
  def toString(args: js.Any*): java.lang.String
  def typeHint(args: js.Any*): js.UndefOr[ANull | scala.Null]
}

object ANull {
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
    propHint: /* repeated */ js.Any => js.UndefOr[java.lang.String],
    propagate: /* repeated */ js.Any => scala.Unit,
    propagatesTo: () => js.Any,
    toString: /* repeated */ js.Any => java.lang.String,
    typeHint: /* repeated */ js.Any => js.UndefOr[ANull | scala.Null]
  ): ANull = {
    val __obj = js.Dynamic.literal(addType = js.Any.fromFunction1(addType), forAllProps = js.Any.fromFunction1(forAllProps), gatherProperties = js.Any.fromFunction1(gatherProperties), getFunctionType = js.Any.fromFunction1(getFunctionType), getObjType = js.Any.fromFunction1(getObjType), getProp = js.Any.fromFunction1(getProp), getSymbolType = js.Any.fromFunction1(getSymbolType), getType = js.Any.fromFunction1(getType), hasType = js.Any.fromFunction1(hasType), isEmpty = js.Any.fromFunction1(isEmpty), propHint = js.Any.fromFunction1(propHint), propagate = js.Any.fromFunction1(propagate), propagatesTo = js.Any.fromFunction0(propagatesTo), toString = js.Any.fromFunction1(toString), typeHint = js.Any.fromFunction1(typeHint))
  
    __obj.asInstanceOf[ANull]
  }
}

