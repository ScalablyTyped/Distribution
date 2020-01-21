package typings.webassemblyWebApi.WebAssembly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultObject extends js.Object {
  var instance: Instance
  var module: Module
}

object ResultObject {
  @scala.inline
  def apply(instance: Instance, module: Module): ResultObject = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResultObject]
  }
}

