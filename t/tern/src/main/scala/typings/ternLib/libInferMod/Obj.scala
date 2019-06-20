package typings
package ternLib.libInferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Obj
  extends IType
     with Type {
  /** The name of the type, if any. */
  var name: js.UndefOr[java.lang.String] = js.native
  /** An object mapping the object’s known properties to AVals. Don’t manipulate this directly (ever), only use it if you have to iterate over the properties. */
  var props: org.scalablytyped.runtime.StringDictionary[AVal] = js.native
  /** The prototype of the object, or null. */
  var proto: (Obj with ternLib.Anon_NameString_1260399121) | scala.Null = js.native
  /** Looks up the given property, or defines it if it did not yet exist (in which case it will be associated with the given AST node). */
  def defProp(prop: java.lang.String): AVal = js.native
  def defProp(prop: java.lang.String, originNode: estreeLib.estreeMod.Node): AVal = js.native
  /** Call the given function for all properties of the object, including properties that are added in the future. */
  def forAllProps(
    f: js.Function3[/* prop */ java.lang.String, /* val */ AVal, /* local */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def gatherProperties(f: js.Function1[/* repeated */ js.Any, scala.Unit], depth: scala.Double): scala.Unit = js.native
  /**
    * Asks the AVal if it contains an Object type. Useful when
    * you aren’t interested in other kinds of types.
    */
  def getObjType(): Obj = js.native
  /** Get an `AVal` that represents the named property of this type. */
  def getProp(prop: java.lang.String): AVal = js.native
  /** Looks up the AVal associated with the given property, or returns null if it doesn’t exist. */
  def hasProp(prop: java.lang.String): AVal | scala.Null = js.native
}

@JSImport("tern/lib/infer", "Obj")
@js.native
class ObjCls () extends Obj {
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
  override def getFunctionType(args: js.Any*): js.UndefOr[ANull] = js.native
  /* CompleteClass */
  override def getObjType(args: js.Any*): js.UndefOr[ANull | scala.Null] = js.native
  /* CompleteClass */
  override def getProp(args: js.Any*): ANull = js.native
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

