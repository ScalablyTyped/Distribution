package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPullTypeCollection extends js.Object {
  def getLength(): scala.Double
  def getTypeAtIndex(index: scala.Double): PullTypeSymbol
}

object IPullTypeCollection {
  @scala.inline
  def apply(getLength: js.Function0[scala.Double], getTypeAtIndex: js.Function1[scala.Double, PullTypeSymbol]): IPullTypeCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getLength")(getLength)
    __obj.updateDynamic("getTypeAtIndex")(getTypeAtIndex)
    __obj.asInstanceOf[IPullTypeCollection]
  }
}

