package typings
package ternLib.libInferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AVal extends ANull {
  var originNode: js.UndefOr[estreeLib.estreeMod.Node] = js.native
  val propertyOf: js.UndefOr[Obj] = js.native
  /** An object mapping the object’s known properties to AVals. Don’t manipulate this directly (ever), only use it if you have to iterate over the properties. */
  var props: stdLib.Partial[stdLib.Readonly[org.scalablytyped.runtime.StringDictionary[AVal]]] = js.native
  val types: js.Array[Type] = js.native
  /**
    * Add a type to this abstract value. If the type is already in there,
    * this is a no-op. weight can be given to give this type a non-default
    * weight, which is mostly useful when adding a provisionary type that
    * should be overridden later if a real type is found. The default weight
    * is 100, and passing a weight lower than that will make the type
    * assignment “weak”.
    */
  def addType(`type`: Type): scala.Unit = js.native
  def addType(`type`: Type, weight: scala.Double): scala.Unit = js.native
  /** Call the given function for all properties of the object, including properties that are added in the future. */
  def forAllProps(
    f: js.Function3[
      /* prop */ java.lang.String, 
      /* val */ this.type, 
      /* local */ scala.Boolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Abstract values that are used to represent variables
    * or properties will have, when possible, an `originNode`
    * property pointing to an AST node.
    */
  def gatherProperties(f: js.Function1[/* repeated */ js.Any, scala.Unit], depth: scala.Double): scala.Unit = js.native
  /**
    * Asks the AVal if it contains a function type. Useful when
    * you aren’t interested in other kinds of types.
    */
  def getFunctionType(): js.UndefOr[Fn] = js.native
  /**
    * Asks the AVal if it contains an Object type. Useful when
    * you aren’t interested in other kinds of types.
    */
  def getObjType(): Obj | scala.Null = js.native
  /** Get an `AVal` that represents the named property of this type. */
  def getProp(prop: java.lang.String): AVal = js.native
  /**
    * Asks the abstract value for its current type. May return `null`
    * when there is no type, or conflicting types are present. When
    * `guess` is true or not given, an empty AVal will try to use
    * heuristics based on its propagation edges to guess a type.
    */
  def getType(): Type | scala.Null = js.native
  def getType(guess: scala.Boolean): Type | scala.Null = js.native
  /** Queries whether the AVal _currently_ holds the given type. */
  def hasType(`type`: Type): scala.Boolean = js.native
  /** Queries whether the AVal is empty. */
  def isEmpty(): scala.Boolean = js.native
  /**
    * Sets this AVal to propagate all types it receives to the given
    * constraint. This is the mechanism by which types are propagated
    * through the type graph.
    */
  def propagate(target: Constraint): scala.Unit = js.native
}

@JSImport("tern/lib/infer", "AVal")
@js.native
class AValCls () extends AVal {
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
  override def getType(args: js.Any*): js.UndefOr[ANull | scala.Null] = js.native
  /* CompleteClass */
  override def hasType(args: js.Any*): scala.Boolean = js.native
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
  /* CompleteClass */
  override def typeHint(args: js.Any*): js.UndefOr[ANull | scala.Null] = js.native
}

