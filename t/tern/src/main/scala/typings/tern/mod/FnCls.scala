package typings.tern.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern", "Fn")
@js.native
class FnCls protected ()
  extends typings.tern.inferMod.Fn {
  def this(
    name: js.UndefOr[String],
    self: typings.tern.inferMod.AVal,
    args: js.Array[typings.tern.inferMod.AVal],
    argNames: js.Array[String],
    retval: typings.tern.inferMod.AVal
  ) = this()
  /** The origin file of the type. */
  /* CompleteClass */
  override var origin: String = js.native
  /* CompleteClass */
  override def addType(args: js.Any*): Unit = js.native
  /* CompleteClass */
  override def forAllProps(args: js.Any*): Unit = js.native
  /* CompleteClass */
  override def gatherProperties(args: js.Any*): Unit = js.native
  /* CompleteClass */
  override def getFunctionType(args: js.Any*): js.UndefOr[typings.tern.inferMod.ANull] = js.native
  /* CompleteClass */
  override def getObjType(args: js.Any*): js.UndefOr[typings.tern.inferMod.ANull | Null] = js.native
  /* CompleteClass */
  override def getProp(args: js.Any*): typings.tern.inferMod.ANull = js.native
  /* CompleteClass */
  override def getSymbolType(args: js.Any*): js.UndefOr[typings.tern.inferMod.ANull] = js.native
  /* CompleteClass */
  override def getType(): typings.tern.inferMod.Type = js.native
  /* CompleteClass */
  override def getType(args: js.Any*): js.UndefOr[typings.tern.inferMod.ANull | Null] = js.native
  /* CompleteClass */
  override def hasType(args: js.Any*): Boolean = js.native
  /** Queries whether the AVal _currently_ holds the given type. */
  /* CompleteClass */
  override def hasType(`type`: typings.tern.inferMod.Type): Boolean = js.native
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
  override def typeHint(args: js.Any*): js.UndefOr[typings.tern.inferMod.ANull | Null] = js.native
}

