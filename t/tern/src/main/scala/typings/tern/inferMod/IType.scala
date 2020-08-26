package typings.tern.inferMod

import typings.estree.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IType extends ANull {
  /** The origin file of the type. */
  var origin: String = js.native
  /**
    * The syntax node that defined the type. Only present for object and function types,
    * and even for those it may be missing (if the type was created by a type definition file,
    * or synthesized in some other way).
    */
  var originNode: js.UndefOr[Node] = js.native
  def getType(): Type = js.native
  /** Queries whether the AVal _currently_ holds the given type. */
  def hasType(`type`: Type): Boolean = js.native
  /** Return a string that describes the type. maxDepth indicates the depth to which inner types should be shown. */
  def toString(maxDepth: Double): String = js.native
}

object IType {
  @scala.inline
  def apply(
    addType: /* repeated */ js.Any => Unit,
    forAllProps: /* repeated */ js.Any => Unit,
    gatherProperties: /* repeated */ js.Any => Unit,
    getFunctionType: /* repeated */ js.Any => js.UndefOr[ANull],
    getObjType: /* repeated */ js.Any => js.UndefOr[ANull | Null],
    getProp: /* repeated */ js.Any => ANull,
    getSymbolType: /* repeated */ js.Any => js.UndefOr[ANull],
    getType: () => Type,
    hasType: Type => Boolean,
    isEmpty: /* repeated */ js.Any => Boolean,
    origin: String,
    propHint: /* repeated */ js.Any => js.UndefOr[String],
    propagate: /* repeated */ js.Any => Unit,
    propagatesTo: () => js.Any,
    toString: Double => String,
    typeHint: /* repeated */ js.Any => js.UndefOr[ANull | Null]
  ): IType = {
    val __obj = js.Dynamic.literal(addType = js.Any.fromFunction1(addType), forAllProps = js.Any.fromFunction1(forAllProps), gatherProperties = js.Any.fromFunction1(gatherProperties), getFunctionType = js.Any.fromFunction1(getFunctionType), getObjType = js.Any.fromFunction1(getObjType), getProp = js.Any.fromFunction1(getProp), getSymbolType = js.Any.fromFunction1(getSymbolType), getType = js.Any.fromFunction0(getType), hasType = js.Any.fromFunction1(hasType), isEmpty = js.Any.fromFunction1(isEmpty), origin = origin.asInstanceOf[js.Any], propHint = js.Any.fromFunction1(propHint), propagate = js.Any.fromFunction1(propagate), propagatesTo = js.Any.fromFunction0(propagatesTo), toString = js.Any.fromFunction1(toString), typeHint = js.Any.fromFunction1(typeHint))
    __obj.asInstanceOf[IType]
  }
  @scala.inline
  implicit class ITypeOps[Self <: IType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetType(value: () => Type): Self = this.set("getType", js.Any.fromFunction0(value))
    @scala.inline
    def setHasType(value: Type => Boolean): Self = this.set("hasType", js.Any.fromFunction1(value))
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def setToString(value: Double => String): Self = this.set("toString", js.Any.fromFunction1(value))
    @scala.inline
    def setOriginNode(value: Node): Self = this.set("originNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginNode: Self = this.set("originNode", js.undefined)
  }
  
}

