package typings.testcafe.mod.global

import typings.node.bufferMod.global.Buffer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseMock extends StObject {
  
  var headers: Record[String, String] = js.native
  
  def setBody(): Unit = js.native
  def setBody(value: String): Unit = js.native
  def setBody(value: js.Object): Unit = js.native
  def setBody(value: Buffer): Unit = js.native
  
  var statusCode: Double = js.native
}
