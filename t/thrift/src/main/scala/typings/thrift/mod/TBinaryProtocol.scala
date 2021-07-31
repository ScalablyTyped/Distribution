package typings.thrift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("thrift", "TBinaryProtocol")
@js.native
class TBinaryProtocol protected ()
  extends StObject
     with TProtocol {
  def this(trans: TTransport) = this()
  def this(trans: TTransport, strictRead: Boolean) = this()
  def this(trans: TTransport, strictRead: Boolean, strictWrite: Boolean) = this()
  def this(trans: TTransport, strictRead: Unit, strictWrite: Boolean) = this()
}
