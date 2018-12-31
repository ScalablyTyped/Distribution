package typings
package ternLib.libTernMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefinitionQueryResult extends js.Object {
  /** A slice of the code in front of the definition Can be used to find a definition’s location in a modified file. */
  var context: js.UndefOr[java.lang.String] = js.undefined
  /** The offset from the start of the context to the actual definition. Can be used to find a definition’s location in a modified file. */
  var contextOffset: js.UndefOr[scala.Double] = js.undefined
  /** If the definition had documentation associated with it, these will also be returned. */
  var doc: js.UndefOr[java.lang.String] = js.undefined
  /** The end position of the expression. */
  var end: js.UndefOr[scala.Double | Position] = js.undefined
  /** The file in which the definition was defined. */
  var file: js.UndefOr[java.lang.String] = js.undefined
  /** If the definition had origin information associated with it, these will also be returned. */
  var origin: js.UndefOr[java.lang.String] = js.undefined
  /** The start position of the expression. */
  var start: js.UndefOr[scala.Double | Position] = js.undefined
  /** If the definition had urls associated with it, these will also be returned. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

