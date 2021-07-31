package typings.thrift.mod

import typings.thrift.mod.Thrift.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TMessage extends StObject {
  
  var fname: String
  
  var mtype: MessageType
  
  var rseqid: Double
}
object TMessage {
  
  @scala.inline
  def apply(fname: String, mtype: MessageType, rseqid: Double): TMessage = {
    val __obj = js.Dynamic.literal(fname = fname.asInstanceOf[js.Any], mtype = mtype.asInstanceOf[js.Any], rseqid = rseqid.asInstanceOf[js.Any])
    __obj.asInstanceOf[TMessage]
  }
  
  @scala.inline
  implicit class TMessageMutableBuilder[Self <: TMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFname(value: String): Self = StObject.set(x, "fname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMtype(value: MessageType): Self = StObject.set(x, "mtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRseqid(value: Double): Self = StObject.set(x, "rseqid", value.asInstanceOf[js.Any])
  }
}
