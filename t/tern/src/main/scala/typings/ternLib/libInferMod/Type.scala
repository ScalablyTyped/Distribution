package typings
package ternLib.libInferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Type extends AVal {
  /** The name of the type, if any. */
  var name: js.UndefOr[java.lang.String] = js.native
  /** The origin file of the type. */
  var origin: java.lang.String = js.native
  /** Call the given function for all properties of the object, including properties that are added in the future. */
  def forAllProps(
    f: js.Function3[/* prop */ java.lang.String, /* val */ AVal, /* local */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  /** Return a string that describes the type. maxDepth indicates the depth to which inner types should be shown. */
  def toString(maxDepth: scala.Double): java.lang.String = js.native
}

