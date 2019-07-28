package typings.tern.ternMod

import typings.tern.Anon_NameString_1260399121
import typings.tern.libInferMod.ANull
import typings.tern.libInferMod.AVal
import typings.tern.libInferMod.Obj
import typings.tern.libInferMod.Prim
import typings.tern.libInferMod.Type
import typings.tern.ternStrings.bool
import typings.tern.ternStrings.number
import typings.tern.ternStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern", "Prim")
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

