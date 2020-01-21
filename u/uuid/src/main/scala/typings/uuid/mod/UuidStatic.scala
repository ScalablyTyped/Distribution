package typings.uuid.mod

import typings.uuid.interfacesMod.OutputBuffer
import typings.uuid.interfacesMod.V1Options
import typings.uuid.interfacesMod.V4Options
import typings.uuid.interfacesMod.v1
import typings.uuid.interfacesMod.v4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UuidStatic extends js.Object {
  @JSName("v1")
  var v1_Original: v1 = js.native
  @JSName("v4")
  var v4_Original: v4 = js.native
  def v1(): String = js.native
  def v1(options: V1Options): String = js.native
  def v1[T /* <: OutputBuffer */](options: js.UndefOr[scala.Nothing], buffer: T): T = js.native
  def v1[T /* <: OutputBuffer */](options: js.UndefOr[scala.Nothing], buffer: T, offset: Double): T = js.native
  def v1[T /* <: OutputBuffer */](options: Null, buffer: T): T = js.native
  def v1[T /* <: OutputBuffer */](options: Null, buffer: T, offset: Double): T = js.native
  def v1[T /* <: OutputBuffer */](options: V1Options, buffer: T): T = js.native
  def v1[T /* <: OutputBuffer */](options: V1Options, buffer: T, offset: Double): T = js.native
  def v4(): String = js.native
  def v4(options: V4Options): String = js.native
  def v4[T /* <: OutputBuffer */](options: js.UndefOr[scala.Nothing], buffer: T): T = js.native
  def v4[T /* <: OutputBuffer */](options: js.UndefOr[scala.Nothing], buffer: T, offset: Double): T = js.native
  def v4[T /* <: OutputBuffer */](options: Null, buffer: T): T = js.native
  def v4[T /* <: OutputBuffer */](options: Null, buffer: T, offset: Double): T = js.native
  def v4[T /* <: OutputBuffer */](options: V4Options, buffer: T): T = js.native
  def v4[T /* <: OutputBuffer */](options: V4Options, buffer: T, offset: Double): T = js.native
}

