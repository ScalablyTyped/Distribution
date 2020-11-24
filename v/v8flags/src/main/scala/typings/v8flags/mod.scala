package typings.v8flags

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("v8flags", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(cb: js.Function2[/* err */ js.Any, /* flags */ js.Array[String], Unit]): Unit = js.native
  
  val configPath: String = js.native
  
  val configfile: String = js.native
}
