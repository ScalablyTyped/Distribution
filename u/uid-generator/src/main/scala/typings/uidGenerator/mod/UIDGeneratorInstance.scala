package typings.uidGenerator.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIDGeneratorInstance extends js.Object {
  
  val base: Double = js.native
  
  val baseEncoding: String = js.native
  
  val bitSize: Double = js.native
  
  def generate(): js.Promise[String] = js.native
  def generate(cb: js.Function2[/* error */ Error | Null, /* uid */ String, _]): Unit = js.native
  
  def generateSync(): String = js.native
  
  val uidLength: Double = js.native
}
