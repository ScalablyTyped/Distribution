package typings.atTensorflowTfjsDashCore.distBackendsWebglBackendUnderscoreWebglMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KernelInfo extends js.Object {
  var name: String
  var query: js.Promise[Double]
}

object KernelInfo {
  @scala.inline
  def apply(name: String, query: js.Promise[Double]): KernelInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KernelInfo]
  }
}

