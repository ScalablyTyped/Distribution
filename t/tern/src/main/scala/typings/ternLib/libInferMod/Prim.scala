package typings
package ternLib.libInferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Prim
  extends IType
     with Type {
  /** The name of the type, if any. */
  var name: ternLib.ternLibStrings.string | ternLib.ternLibStrings.bool | ternLib.ternLibStrings.number
  /** The prototype of the object, or null. */
  var proto: Obj with ternLib.Anon_NameString_1260399121
  def gatherProperties(f: js.Function1[/* repeated */ js.Any, scala.Unit], depth: scala.Double): scala.Unit
  /** Get an `AVal` that represents the named property of this type. */
  def getProp(prop: java.lang.String): AVal
}

@JSImport("tern/lib/infer", "Prim")
@js.native
class PrimCls () extends Prim {
  def this(proto: js.Object) = this()
  def this(proto: js.Object, name: java.lang.String) = this()
  def this(proto: scala.Null, name: java.lang.String) = this()
  /** The name of the type, if any. */
  /* CompleteClass */
  override var name: ternLib.ternLibStrings.string | ternLib.ternLibStrings.bool | ternLib.ternLibStrings.number = js.native
  /** The origin file of the type. */
  /* CompleteClass */
  override var origin: java.lang.String = js.native
  /** The prototype of the object, or null. */
  /* CompleteClass */
  override var proto: Obj with ternLib.Anon_NameString_1260399121 = js.native
  /* CompleteClass */
  override def addType(args: js.Any*): scala.Unit = js.native
  /* CompleteClass */
  override def forAllProps(args: js.Any*): scala.Unit = js.native
  /* CompleteClass */
  override def gatherProperties(args: js.Any*): scala.Unit = js.native
  /* CompleteClass */
  override def gatherProperties(f: js.Function1[/* repeated */ js.Any, scala.Unit], depth: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def getFunctionType(args: js.Any*): js.UndefOr[ANull] = js.native
  /* CompleteClass */
  override def getObjType(args: js.Any*): js.UndefOr[ANull | scala.Null] = js.native
  /* CompleteClass */
  override def getProp(args: js.Any*): ANull = js.native
  /** Get an `AVal` that represents the named property of this type. */
  /* CompleteClass */
  override def getProp(prop: java.lang.String): AVal = js.native
  /* CompleteClass */
  override def getSymbolType(args: js.Any*): js.UndefOr[ANull] = js.native
  /* CompleteClass */
  override def getType(): Type = js.native
  /* CompleteClass */
  override def getType(args: js.Any*): js.UndefOr[ANull | scala.Null] = js.native
  /* CompleteClass */
  override def hasType(args: js.Any*): scala.Boolean = js.native
  /** Queries whether the AVal _currently_ holds the given type. */
  /* CompleteClass */
  override def hasType(`type`: Type): scala.Boolean = js.native
  /* CompleteClass */
  override def isEmpty(args: js.Any*): scala.Boolean = js.native
  /* CompleteClass */
  override def propHint(args: js.Any*): js.UndefOr[java.lang.String] = js.native
  /* CompleteClass */
  override def propagate(args: js.Any*): scala.Unit = js.native
  /* CompleteClass */
  override def propagatesTo(): js.Any = js.native
  /* CompleteClass */
  override def toString(args: js.Any*): java.lang.String = js.native
  /** Return a string that describes the type. maxDepth indicates the depth to which inner types should be shown. */
  /* CompleteClass */
  override def toString(maxDepth: scala.Double): java.lang.String = js.native
  /* CompleteClass */
  override def typeHint(args: js.Any*): js.UndefOr[ANull | scala.Null] = js.native
}

object Prim {
  @scala.inline
  def apply(
    addType: /* repeated */ js.Any => scala.Unit,
    forAllProps: /* repeated */ js.Any => scala.Unit,
    gatherProperties: (js.Function1[/* repeated */ js.Any, scala.Unit], scala.Double) => scala.Unit,
    getFunctionType: /* repeated */ js.Any => js.UndefOr[ANull],
    getObjType: /* repeated */ js.Any => js.UndefOr[ANull | scala.Null],
    getProp: java.lang.String => AVal,
    getSymbolType: /* repeated */ js.Any => js.UndefOr[ANull],
    getType: () => Prim,
    hasType: Type => scala.Boolean,
    isEmpty: /* repeated */ js.Any => scala.Boolean,
    name: ternLib.ternLibStrings.string | ternLib.ternLibStrings.bool | ternLib.ternLibStrings.number,
    origin: java.lang.String,
    propHint: /* repeated */ js.Any => js.UndefOr[java.lang.String],
    propagate: /* repeated */ js.Any => scala.Unit,
    propagatesTo: () => js.Any,
    proto: Obj with ternLib.Anon_NameString_1260399121,
    toString: scala.Double => java.lang.String,
    typeHint: /* repeated */ js.Any => js.UndefOr[ANull | scala.Null],
    originNode: estreeLib.estreeMod.Node = null
  ): Prim = {
    val __obj = js.Dynamic.literal(addType = js.Any.fromFunction1(addType), forAllProps = js.Any.fromFunction1(forAllProps), gatherProperties = js.Any.fromFunction2(gatherProperties), getFunctionType = js.Any.fromFunction1(getFunctionType), getObjType = js.Any.fromFunction1(getObjType), getProp = js.Any.fromFunction1(getProp), getSymbolType = js.Any.fromFunction1(getSymbolType), getType = js.Any.fromFunction0(getType), hasType = js.Any.fromFunction1(hasType), isEmpty = js.Any.fromFunction1(isEmpty), name = name.asInstanceOf[js.Any], origin = origin, propHint = js.Any.fromFunction1(propHint), propagate = js.Any.fromFunction1(propagate), propagatesTo = js.Any.fromFunction0(propagatesTo), proto = proto, toString = js.Any.fromFunction1(toString), typeHint = js.Any.fromFunction1(typeHint))
    if (originNode != null) __obj.updateDynamic("originNode")(originNode)
    __obj.asInstanceOf[Prim]
  }
}

