package typings
package webidl2Lib.webidl2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncludesType extends js.Object {
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttributes]
  /** The interface mixin that is being included by the target. */
  var includes: java.lang.String
  /** The interface that includes an interface mixin. */
  var target: java.lang.String
  var `type`: webidl2Lib.webidl2LibStrings.includes
}

