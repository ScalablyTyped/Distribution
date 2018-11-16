package typings
package thriftLib.thriftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TProtocol extends js.Object {
  def flush(): scala.Unit = js.native
  def getTransport(): TTransport = js.native
  def readBinary(): nodeLib.Buffer = js.native
  def readBool(): scala.Boolean = js.native
  def readByte(): scala.Double = js.native
  def readDouble(): scala.Double = js.native
  def readFieldBegin(): TField = js.native
  def readFieldEnd(): scala.Unit = js.native
  def readI16(): scala.Double = js.native
  def readI32(): scala.Double = js.native
  def readI64(): nodeDashInt64Lib.nodeDashInt64Mod.namespaced = js.native
  def readListBegin(): TList = js.native
  def readListEnd(): scala.Unit = js.native
  def readMapBegin(): TMap = js.native
  def readMapEnd(): scala.Unit = js.native
  def readMessageBegin(): TMessage = js.native
  def readMessageEnd(): scala.Unit = js.native
  def readSetBegin(): TSet = js.native
  def readSetEnd(): scala.Unit = js.native
  def readString(): java.lang.String = js.native
  def readStructBegin(): TStruct = js.native
  def readStructEnd(): scala.Unit = js.native
  def skip(`type`: thriftLib.thriftMod.ThriftNs.Type): scala.Unit = js.native
  def writeBinary(arg: java.lang.String): scala.Unit = js.native
  def writeBinary(arg: nodeLib.Buffer): scala.Unit = js.native
  def writeBool(bool: scala.Boolean): scala.Unit = js.native
  def writeByte(b: scala.Double): scala.Unit = js.native
  def writeDouble(dbl: scala.Double): scala.Unit = js.native
  def writeFieldBegin(name: java.lang.String, `type`: thriftLib.thriftMod.ThriftNs.Type, id: scala.Double): scala.Unit = js.native
  def writeFieldEnd(): scala.Unit = js.native
  def writeFieldStop(): scala.Unit = js.native
  def writeI16(i16: scala.Double): scala.Unit = js.native
  def writeI32(i32: scala.Double): scala.Unit = js.native
  def writeI64(i64: nodeDashInt64Lib.nodeDashInt64Mod.namespaced): scala.Unit = js.native
  def writeI64(i64: scala.Double): scala.Unit = js.native
  def writeListBegin(etype: thriftLib.thriftMod.ThriftNs.Type, size: scala.Double): scala.Unit = js.native
  def writeListEnd(): scala.Unit = js.native
  def writeMapBegin(
    ktype: thriftLib.thriftMod.ThriftNs.Type,
    vtype: thriftLib.thriftMod.ThriftNs.Type,
    size: scala.Double
  ): scala.Unit = js.native
  def writeMapEnd(): scala.Unit = js.native
  def writeMessageBegin(name: java.lang.String, `type`: thriftLib.thriftMod.ThriftNs.MessageType, seqid: scala.Double): scala.Unit = js.native
  def writeMessageEnd(): scala.Unit = js.native
  def writeSetBegin(etype: thriftLib.thriftMod.ThriftNs.Type, size: scala.Double): scala.Unit = js.native
  def writeSetEnd(): scala.Unit = js.native
  def writeString(arg: java.lang.String): scala.Unit = js.native
  def writeString(arg: nodeLib.Buffer): scala.Unit = js.native
  def writeStructBegin(name: java.lang.String): scala.Unit = js.native
  def writeStructEnd(): scala.Unit = js.native
}

