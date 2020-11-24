package typings.viewportList.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("viewport-list", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Returns a list of devices and their veiwports
    *
    * @param items - An array of device names to fetch
    * @returns - An array of viewports
    */
  def apply(): js.Array[Device] = js.native
  def apply(items: js.Array[String]): js.Array[Device] = js.native
}
