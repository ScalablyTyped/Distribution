package typings.swaggerNodeRunner.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Middleware extends js.Object {
  
  /** Back-reference to `swagger-node-runner`s `Runner` that has created this middleware */
  var runner: Runner = js.native
}
object Middleware {
  
  @scala.inline
  def apply(runner: Runner): Middleware = {
    val __obj = js.Dynamic.literal(runner = runner.asInstanceOf[js.Any])
    __obj.asInstanceOf[Middleware]
  }
  
  @scala.inline
  implicit class MiddlewareOps[Self <: Middleware] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRunner(value: Runner): Self = this.set("runner", value.asInstanceOf[js.Any])
  }
}
