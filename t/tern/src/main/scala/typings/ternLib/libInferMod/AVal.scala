package typings
package ternLib.libInferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AVal extends js.Object {
  /**
    * Abstract values that are used to represent variables
    * or properties will have, when possible, an `originNode`
    * property pointing to an AST node.
    */
  var originNode: js.UndefOr[estreeLib.estreeMod.Node] = js.native
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
  /**
    * Asks the AVal if it contains a function type. Useful when
    * you aren’t interested in other kinds of types.
    */
  def getFunctionType(): js.UndefOr[Type] = js.native
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

