package typings
package ternLib.libTernMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertiesQuery extends BaseQuery {
  /** Causes the server to only return properties that start with the given string. */
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the result should be sorted. Default `true` */
  var sort: js.UndefOr[scala.Boolean] = js.undefined
  /** Get a list of all known object property names (for any object). */
  @JSName("type")
  var type_PropertiesQuery: ternLib.ternLibStrings.properties
}

