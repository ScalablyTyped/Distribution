package typings.tern.libTernMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeQueryResult extends js.Object {
  /** If the type had documentation associated with it, these will also be returned. */
  var doc: js.UndefOr[String] = js.undefined
  /** When the inspected expression was an identifier or a property access, this will hold the name of the variable or property. */
  var exprName: js.UndefOr[String] = js.undefined
  /** Whether the given type was guessed, or should be considered reliable. */
  var guess: Boolean
  /** The name associated with the type. */
  var name: js.UndefOr[String] = js.undefined
  /** If the type had origin information associated with it, these will also be returned. */
  var origin: js.UndefOr[String] = js.undefined
  /** A description of the type of the value. May be "?" when no type was found. */
  var `type`: String
  /** If the type had urls associated with it, these will also be returned. */
  var url: js.UndefOr[String] = js.undefined
}

object TypeQueryResult {
  @scala.inline
  def apply(
    guess: Boolean,
    `type`: String,
    doc: String = null,
    exprName: String = null,
    name: String = null,
    origin: String = null,
    url: String = null
  ): TypeQueryResult = {
    val __obj = js.Dynamic.literal(guess = guess)
    __obj.updateDynamic("type")(`type`)
    if (doc != null) __obj.updateDynamic("doc")(doc)
    if (exprName != null) __obj.updateDynamic("exprName")(exprName)
    if (name != null) __obj.updateDynamic("name")(name)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[TypeQueryResult]
  }
}

