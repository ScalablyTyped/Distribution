package typings.thrift.mod

import typings.node.Buffer
import typings.nodeInt64.mod.^
import typings.thrift.mod.Thrift.MessageType
import typings.thrift.mod.Thrift.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TProtocol extends js.Object {
  def flush(): Unit = js.native
  def getTransport(): TTransport = js.native
  def readBinary(): Buffer = js.native
  def readBool(): Boolean = js.native
  def readByte(): Double = js.native
  def readDouble(): Double = js.native
  def readFieldBegin(): TField = js.native
  def readFieldEnd(): Unit = js.native
  def readI16(): Double = js.native
  def readI32(): Double = js.native
  def readI64(): ^ = js.native
  def readListBegin(): TList = js.native
  def readListEnd(): Unit = js.native
  def readMapBegin(): TMap = js.native
  def readMapEnd(): Unit = js.native
  def readMessageBegin(): TMessage = js.native
  def readMessageEnd(): Unit = js.native
  def readSetBegin(): TSet = js.native
  def readSetEnd(): Unit = js.native
  def readString(): String = js.native
  def readStructBegin(): TStruct = js.native
  def readStructEnd(): Unit = js.native
  def skip(`type`: Type): Unit = js.native
  def writeBinary(arg: String): Unit = js.native
  def writeBinary(arg: Buffer): Unit = js.native
  def writeBool(bool: Boolean): Unit = js.native
  def writeByte(b: Double): Unit = js.native
  def writeDouble(dbl: Double): Unit = js.native
  def writeFieldBegin(name: String, `type`: Type, id: Double): Unit = js.native
  def writeFieldEnd(): Unit = js.native
  def writeFieldStop(): Unit = js.native
  def writeI16(i16: Double): Unit = js.native
  def writeI32(i32: Double): Unit = js.native
  def writeI64(i64: Double): Unit = js.native
  def writeI64(i64: ^): Unit = js.native
  def writeListBegin(etype: Type, size: Double): Unit = js.native
  def writeListEnd(): Unit = js.native
  def writeMapBegin(ktype: Type, vtype: Type, size: Double): Unit = js.native
  def writeMapEnd(): Unit = js.native
  def writeMessageBegin(name: String, `type`: MessageType, seqid: Double): Unit = js.native
  def writeMessageEnd(): Unit = js.native
  def writeSetBegin(etype: Type, size: Double): Unit = js.native
  def writeSetEnd(): Unit = js.native
  def writeString(arg: String): Unit = js.native
  def writeString(arg: Buffer): Unit = js.native
  def writeStructBegin(name: String): Unit = js.native
  def writeStructEnd(): Unit = js.native
}

