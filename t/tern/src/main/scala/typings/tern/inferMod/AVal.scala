package typings.tern.inferMod

import org.scalablytyped.runtime.TopLevel
import typings.estree.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AVal extends ANull {
  var originNode: js.UndefOr[Node] = js.native
  val propertyOf: js.UndefOr[Obj] = js.native
  val types: js.Array[Type] = js.native
  /**
    * Add a type to this abstract value. If the type is already in there,
    * this is a no-op. weight can be given to give this type a non-default
    * weight, which is mostly useful when adding a provisionary type that
    * should be overridden later if a real type is found. The default weight
    * is 100, and passing a weight lower than that will make the type
    * assignment “weak”.
    */
  def addType(`type`: Type): Unit = js.native
  def addType(`type`: Type, weight: Double): Unit = js.native
  /** Call the given function for all properties of the object, including properties that are added in the future. */
  def forAllProps(f: js.Function3[/* prop */ String, /* val */ this.type, /* local */ Boolean, Unit]): Unit = js.native
  /**
    * Abstract values that are used to represent variables
    * or properties will have, when possible, an `originNode`
    * property pointing to an AST node.
    */
  def gatherProperties(f: js.Function1[/* repeated */ js.Any, Unit], depth: Double): Unit = js.native
  /**
    * Asks the AVal if it contains a function type. Useful when
    * you aren’t interested in other kinds of types.
    */
  def getFunctionType(): js.UndefOr[Fn] = js.native
  /**
    * Asks the AVal if it contains an Object type. Useful when
    * you aren’t interested in other kinds of types.
    */
  def getObjType(): Obj | Null = js.native
  /** Get an `AVal` that represents the named property of this type. */
  def getProp(prop: String): AVal = js.native
  /**
    * Asks the abstract value for its current type. May return `null`
    * when there is no type, or conflicting types are present. When
    * `guess` is true or not given, an empty AVal will try to use
    * heuristics based on its propagation edges to guess a type.
    */
  def getType(): Type | Null = js.native
  def getType(guess: Boolean): Type | Null = js.native
  /** Queries whether the AVal _currently_ holds the given type. */
  def hasType(`type`: Type): Boolean = js.native
  /** Queries whether the AVal is empty. */
  def isEmpty(): Boolean = js.native
  /**
    * Sets this AVal to propagate all types it receives to the given
    * constraint. This is the mechanism by which types are propagated
    * through the type graph.
    */
  def propagate(target: Constraint_): Unit = js.native
}

@JSImport("tern/lib/infer", "AVal")
@js.native
object AVal extends TopLevel[AValConstructor]

