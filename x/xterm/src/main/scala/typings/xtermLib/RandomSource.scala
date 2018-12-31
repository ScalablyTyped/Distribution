package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RandomSource extends js.Object {
  def getRandomValues[T /* <: stdLib.Int8Array | stdLib.Uint8ClampedArray | stdLib.Uint8Array | stdLib.Int16Array | stdLib.Uint16Array | stdLib.Int32Array | stdLib.Uint32Array */](array: T): T
}

@JSGlobal("RandomSource")
@js.native
object RandomSource
  extends org.scalablytyped.runtime.Instantiable0[RandomSource]

