package typings.tern.libInferMod

import org.scalablytyped.runtime.StringDictionary
import typings.estree.estreeMod.Node
import typings.tern.Anon_NameString_1260399121
import typings.tern.ternNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Obj
  extends IType
     with Type {
  /** The name of the type, if any. */
  var name: js.UndefOr[String] = js.native
  /** An object mapping the object’s known properties to AVals. Don’t manipulate this directly (ever), only use it if you have to iterate over the properties. */
  var props: StringDictionary[AVal] = js.native
  /** The prototype of the object, or null. */
  var proto: (Obj with Anon_NameString_1260399121) | Null = js.native
  /** Looks up the given property, or defines it if it did not yet exist (in which case it will be associated with the given AST node). */
  def defProp(prop: String): AVal = js.native
  def defProp(prop: String, originNode: Node): AVal = js.native
  /** Call the given function for all properties of the object, including properties that are added in the future. */
  def forAllProps(f: js.Function3[/* prop */ String, /* val */ AVal, /* local */ Boolean, Unit]): Unit = js.native
  def gatherProperties(f: js.Function1[/* repeated */ js.Any, Unit], depth: Double): Unit = js.native
  /**
    * Asks the AVal if it contains an Object type. Useful when
    * you aren’t interested in other kinds of types.
    */
  def getObjType(): Obj = js.native
  /** Get an `AVal` that represents the named property of this type. */
  def getProp(prop: String): AVal = js.native
  /** Looks up the AVal associated with the given property, or returns null if it doesn’t exist. */
  def hasProp(prop: String): AVal | Null = js.native
}

@JSImport("tern/lib/infer", "Obj")
@js.native
class ObjCls () extends Obj {
  def this(proto: js.Object) = this()
  def this(proto: `true`) = this()
  def this(proto: js.Object, name: String) = this()
  def this(proto: Null, name: String) = this()
  def this(proto: `true`, name: String) = this()
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
  override def getFunctionType(args: js.Any*): js.UndefOr[ANull] = js.native
  /* CompleteClass */
  override def getObjType(args: js.Any*): js.UndefOr[ANull | Null] = js.native
  /* CompleteClass */
  override def getProp(args: js.Any*): ANull = js.native
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

