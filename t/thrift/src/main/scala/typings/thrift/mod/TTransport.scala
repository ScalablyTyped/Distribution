package typings.thrift.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TTransport extends StObject {
  
  def close(): Boolean = js.native
  
  def commitPosition(): Unit = js.native
  
  def ensureAvailable(len: Double): Unit = js.native
  
  def flush(): Unit = js.native
  
  def isOpen(): Boolean = js.native
  
  def open(): Boolean = js.native
  
  def read(len: Double): Buffer = js.native
  
  def readByte(): Double = js.native
  
  def readDouble(): Double = js.native
  
  def readI16(): Double = js.native
  
  def readI32(): Double = js.native
  
  def readString(): String = js.native
  
  def rollbackPosition(): Unit = js.native
  
  def setCurrSeqId(seqId: Double): Unit = js.native
  
  def write(buf: String): Unit = js.native
  def write(buf: Buffer): Unit = js.native
}
