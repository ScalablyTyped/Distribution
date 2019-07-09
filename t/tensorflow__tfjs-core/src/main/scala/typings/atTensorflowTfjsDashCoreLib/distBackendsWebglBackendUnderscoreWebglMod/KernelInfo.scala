package typings
package atTensorflowTfjsDashCoreLib.distBackendsWebglBackendUnderscoreWebglMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KernelInfo extends js.Object {
  var name: java.lang.String
  var query: js.Promise[scala.Double]
}

object KernelInfo {
  @scala.inline
  def apply(name: java.lang.String, query: js.Promise[scala.Double]): KernelInfo = {
    val __obj = js.Dynamic.literal(name = name, query = query)
  
    __obj.asInstanceOf[KernelInfo]
  }
}

