package typings
package webidl2Lib.webidl2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImplementsType extends js.Object {
  /** A list of extended attributes. */
  var extAttrs: js.Array[ExtendedAttributes]
  /** The interface that is being implemented by the target. */
  var implements: java.lang.String
  /** The interface that implements another. */
  var target: java.lang.String
  var `type`: webidl2Lib.webidl2LibStrings.implements
}

