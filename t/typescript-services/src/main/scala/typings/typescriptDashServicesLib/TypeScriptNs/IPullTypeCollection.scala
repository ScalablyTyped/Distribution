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
  def apply(getLength: () => scala.Double, getTypeAtIndex: scala.Double => PullTypeSymbol): IPullTypeCollection = {
    val __obj = js.Dynamic.literal(getLength = js.Any.fromFunction0(getLength), getTypeAtIndex = js.Any.fromFunction1(getTypeAtIndex))
  
    __obj.asInstanceOf[IPullTypeCollection]
  }
}

