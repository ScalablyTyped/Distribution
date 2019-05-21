package typings
package ternLib.ternMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern", "Obj")
@js.native
class ObjCls ()
  extends ternLib.libInferMod.Obj {
  def this(proto: js.Object) = this()
  def this(proto: ternLib.ternLibNumbers.`true`) = this()
  def this(proto: js.Object, name: java.lang.String) = this()
  def this(proto: scala.Null, name: java.lang.String) = this()
  def this(proto: ternLib.ternLibNumbers.`true`, name: java.lang.String) = this()
  /** The origin file of the type. */
  /* CompleteClass */
  override var origin: java.lang.String = js.native
  /* CompleteClass */
  override def addType(args: js.Any*): scala.Unit = js.native
  /* CompleteClass */
  override def forAllProps(args: js.Any*): scala.Unit = js.native
  /* CompleteClass */
  override def gatherProperties(args: js.Any*): scala.Unit = js.native
  /* CompleteClass */
  override def getFunctionType(args: js.Any*): js.UndefOr[ternLib.libInferMod.ANull] = js.native
  /* CompleteClass */
  override def getObjType(args: js.Any*): js.UndefOr[ternLib.libInferMod.ANull | scala.Null] = js.native
  /* CompleteClass */
  override def getProp(args: js.Any*): ternLib.libInferMod.ANull = js.native
  /* CompleteClass */
  override def getSymbolType(args: js.Any*): js.UndefOr[ternLib.libInferMod.ANull] = js.native
  /* CompleteClass */
  override def getType(): ternLib.libInferMod.Type = js.native
  /* CompleteClass */
  override def getType(args: js.Any*): js.UndefOr[ternLib.libInferMod.ANull | scala.Null] = js.native
  /* CompleteClass */
  override def hasType(args: js.Any*): scala.Boolean = js.native
  /** Queries whether the AVal _currently_ holds the given type. */
  /* CompleteClass */
  override def hasType(`type`: ternLib.libInferMod.Type): scala.Boolean = js.native
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
  override def typeHint(args: js.Any*): js.UndefOr[ternLib.libInferMod.ANull | scala.Null] = js.native
}

