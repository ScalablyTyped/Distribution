package typings
package ternLib.libTernMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeQueryResult extends js.Object {
  /** If the type had documentation associated with it, these will also be returned. */
  var doc: js.UndefOr[java.lang.String] = js.undefined
  /** When the inspected expression was an identifier or a property access, this will hold the name of the variable or property. */
  var exprName: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the given type was guessed, or should be considered reliable. */
  var guess: scala.Boolean
  /** The name associated with the type. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** If the type had origin information associated with it, these will also be returned. */
  var origin: js.UndefOr[java.lang.String] = js.undefined
  /** A description of the type of the value. May be "?" when no type was found. */
  var `type`: java.lang.String
  /** If the type had urls associated with it, these will also be returned. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object TypeQueryResult {
  @scala.inline
  def apply(
    guess: scala.Boolean,
    `type`: java.lang.String,
    doc: java.lang.String = null,
    exprName: java.lang.String = null,
    name: java.lang.String = null,
    origin: java.lang.String = null,
    url: java.lang.String = null
  ): TypeQueryResult = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("guess")(guess)
    if (doc != null) __obj.updateDynamic("doc")(doc)
    if (exprName != null) __obj.updateDynamic("exprName")(exprName)
    if (name != null) __obj.updateDynamic("name")(name)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[TypeQueryResult]
  }
}

