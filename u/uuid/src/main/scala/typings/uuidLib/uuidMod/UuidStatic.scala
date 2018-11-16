package typings
package uuidLib.uuidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UuidStatic extends js.Object {
  @JSName("v1")
  var v1_Original: uuidLib.interfacesMod.v1 = js.native
  @JSName("v4")
  var v4_Original: uuidLib.interfacesMod.v4 = js.native
  def v1(): java.lang.String = js.native
  def v1(options: uuidLib.interfacesMod.V1Options): java.lang.String = js.native
  def v1[T /* <: uuidLib.interfacesMod.OutputBuffer */](options: js.UndefOr[scala.Nothing], buffer: T): T = js.native
  def v1[T /* <: uuidLib.interfacesMod.OutputBuffer */](options: js.UndefOr[scala.Nothing], buffer: T, offset: scala.Double): T = js.native
  def v1[T /* <: uuidLib.interfacesMod.OutputBuffer */](options: scala.Null, buffer: T): T = js.native
  def v1[T /* <: uuidLib.interfacesMod.OutputBuffer */](options: scala.Null, buffer: T, offset: scala.Double): T = js.native
  def v1[T /* <: uuidLib.interfacesMod.OutputBuffer */](options: uuidLib.interfacesMod.V1Options, buffer: T): T = js.native
  def v1[T /* <: uuidLib.interfacesMod.OutputBuffer */](options: uuidLib.interfacesMod.V1Options, buffer: T, offset: scala.Double): T = js.native
  def v4(): java.lang.String = js.native
  def v4(options: uuidLib.interfacesMod.V4Options): java.lang.String = js.native
  def v4[T /* <: uuidLib.interfacesMod.OutputBuffer */](options: js.UndefOr[scala.Nothing] | uuidLib.interfacesMod.V4Options, buffer: T): T = js.native
  def v4[T /* <: uuidLib.interfacesMod.OutputBuffer */](
    options: js.UndefOr[scala.Nothing] | uuidLib.interfacesMod.V4Options,
    buffer: T,
    offset: scala.Double
  ): T = js.native
  def v4[T /* <: uuidLib.interfacesMod.OutputBuffer */](options: scala.Null, buffer: T): T = js.native
  def v4[T /* <: uuidLib.interfacesMod.OutputBuffer */](options: scala.Null, buffer: T, offset: scala.Double): T = js.native
}

