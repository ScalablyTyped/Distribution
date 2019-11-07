package typings.struct

import typings.node.Buffer
import typings.struct.structMod.Struct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("struct", JSImport.Namespace)
@js.native
object structMod extends js.Object {
  @js.native
  class Struct[T] () extends js.Object {
    var fields: T = js.native
    def allocate(): Struct[T] = js.native
    def array(name: String, length: Double): Struct[T] = js.native
    def array(name: String, length: Double, `type`: String): Struct[T] = js.native
    def array(name: String, length: Double, `type`: Struct[T]): Struct[T] = js.native
    def buffer(): Buffer = js.native
    def chars(name: String, length: Double): Struct[T] = js.native
    def chars(name: String, length: Double, encoding: String): Struct[T] = js.native
    def charsnt(name: String, length: Double): Struct[T] = js.native
    def charsnt(name: String, length: Double, encoding: String): Struct[T] = js.native
    def doublebe(name: String): Struct[T] = js.native
    def doublele(name: String): Struct[T] = js.native
    def floatbe(name: String): Struct[T] = js.native
    def floatle(name: String): Struct[T] = js.native
    def get(fieldName: String): js.Any = js.native
    def set(fieldName: String, value: js.Any): Unit = js.native
    def setBuffer(buffer: Buffer): Unit = js.native
    def setBuffer(buffer: Buffer, buffLength: Double): Unit = js.native
    def struct(name: String, struct: Struct[T]): Struct[T] = js.native
    def word16Sbe(name: String): Struct[T] = js.native
    def word16Sle(name: String): Struct[T] = js.native
    def word16Ube(name: String): Struct[T] = js.native
    def word16Ule(name: String): Struct[T] = js.native
    def word32Sbe(name: String): Struct[T] = js.native
    def word32Sle(name: String): Struct[T] = js.native
    def word32Ube(name: String): Struct[T] = js.native
    def word32Ule(name: String): Struct[T] = js.native
    def word64Sbe(name: String): Struct[T] = js.native
    def word64Sle(name: String): Struct[T] = js.native
    def word64Ube(name: String): Struct[T] = js.native
    def word64Ule(name: String): Struct[T] = js.native
    def word8(name: String): Struct[T] = js.native
    def word8Sbe(name: String): Struct[T] = js.native
    def word8Sle(name: String): Struct[T] = js.native
  }
  
  def default[T](): Struct[T] = js.native
}

