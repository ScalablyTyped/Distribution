package typings.tern.libInferMod

import typings.estree.estreeMod.Node
import typings.tern.Anon_NameString_1260399121
import typings.tern.ternStrings.bool
import typings.tern.ternStrings.number
import typings.tern.ternStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Prim
  extends IType
     with Type {
  /** The name of the type, if any. */
  var name: string | bool | number
  /** The prototype of the object, or null. */
  var proto: Obj with Anon_NameString_1260399121
  def gatherProperties(f: js.Function1[/* repeated */ js.Any, Unit], depth: Double): Unit
  /** Get an `AVal` that represents the named property of this type. */
  def getProp(prop: String): AVal
}

@JSImport("tern/lib/infer", "Prim")
@js.native
class PrimCls () extends Prim {
  def this(proto: js.Object) = this()
  def this(proto: js.Object, name: String) = this()
  def this(proto: Null, name: String) = this()
  /** The name of the type, if any. */
  /* CompleteClass */
  override var name: string | bool | number = js.native
  /** The origin file of the type. */
  /* CompleteClass */
  override var origin: String = js.native
  /** The prototype of the object, or null. */
  /* CompleteClass */
  override var proto: Obj with Anon_NameString_1260399121 = js.native
  /* CompleteClass */
  override def addType(args: js.Any*): Unit = js.native
  /* CompleteClass */
  override def forAllProps(args: js.Any*): Unit = js.native
  /* CompleteClass */
  override def gatherProperties(args: js.Any*): Unit = js.native
  /* CompleteClass */
  override def gatherProperties(f: js.Function1[/* repeated */ js.Any, Unit], depth: Double): Unit = js.native
  /* CompleteClass */
  override def getFunctionType(args: js.Any*): js.UndefOr[ANull] = js.native
  /* CompleteClass */
  override def getObjType(args: js.Any*): js.UndefOr[ANull | Null] = js.native
  /* CompleteClass */
  override def getProp(args: js.Any*): ANull = js.native
  /** Get an `AVal` that represents the named property of this type. */
  /* CompleteClass */
  override def getProp(prop: String): AVal = js.native
  /* CompleteClass */
  override def getSymbolType(args: js.Any*): js.UndefOr[ANull] = js.native
  /* CompleteClass */
  override def getType(): Type = js.native
  /* CompleteClass */
  override def getType(args: js.Any*): js.UndefOr[ANull | Null] = js.native
  /* CompleteClass */
  override def hasType(args: js.Any*): Boolean = js.native
  /** Queries whether the AVal _currently_ holds the given type. */
  /* CompleteClass */
  override def hasType(`type`: Type): Boolean = js.native
  /* CompleteClass */
  override def isEmpty(args: js.Any*): Boolean = js.native
  /* CompleteClass */
  override def propHint(args: js.Any*): js.UndefOr[String] = js.native
  /* CompleteClass */
  override def propagate(args: js.Any*): Unit = js.native
  /* CompleteClass */
  override def propagatesTo(): js.Any = js.native
  /* CompleteClass */
  override def toString(args: js.Any*): String = js.native
  /** Return a string that describes the type. maxDepth indicates the depth to which inner types should be shown. */
  /* CompleteClass */
  override def toString(maxDepth: Double): String = js.native
  /* CompleteClass */
  override def typeHint(args: js.Any*): js.UndefOr[ANull | Null] = js.native
}

object Prim {
  @scala.inline
  def apply(
    addType: /* repeated */ js.Any => Unit,
    forAllProps: /* repeated */ js.Any => Unit,
    gatherProperties: (js.Function1[/* repeated */ js.Any, Unit], Double) => Unit,
    getFunctionType: /* repeated */ js.Any => js.UndefOr[ANull],
    getObjType: /* repeated */ js.Any => js.UndefOr[ANull | Null],
    getProp: String => AVal,
    getSymbolType: /* repeated */ js.Any => js.UndefOr[ANull],
    getType: () => Prim,
    hasType: Type => Boolean,
    isEmpty: /* repeated */ js.Any => Boolean,
    name: string | bool | number,
    origin: String,
    propHint: /* repeated */ js.Any => js.UndefOr[String],
    propagate: /* repeated */ js.Any => Unit,
    propagatesTo: () => js.Any,
    proto: Obj with Anon_NameString_1260399121,
    toString: Double => String,
    typeHint: /* repeated */ js.Any => js.UndefOr[ANull | Null],
    originNode: Node = null
  ): Prim = {
    val __obj = js.Dynamic.literal(addType = js.Any.fromFunction1(addType), forAllProps = js.Any.fromFunction1(forAllProps), gatherProperties = js.Any.fromFunction2(gatherProperties), getFunctionType = js.Any.fromFunction1(getFunctionType), getObjType = js.Any.fromFunction1(getObjType), getProp = js.Any.fromFunction1(getProp), getSymbolType = js.Any.fromFunction1(getSymbolType), getType = js.Any.fromFunction0(getType), hasType = js.Any.fromFunction1(hasType), isEmpty = js.Any.fromFunction1(isEmpty), name = name.asInstanceOf[js.Any], origin = origin, propHint = js.Any.fromFunction1(propHint), propagate = js.Any.fromFunction1(propagate), propagatesTo = js.Any.fromFunction0(propagatesTo), proto = proto, toString = js.Any.fromFunction1(toString), typeHint = js.Any.fromFunction1(typeHint))
    if (originNode != null) __obj.updateDynamic("originNode")(originNode)
    __obj.asInstanceOf[Prim]
  }
}

