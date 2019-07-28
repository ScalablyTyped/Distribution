package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPullTypeCollection extends js.Object {
  def getLength(): Double
  def getTypeAtIndex(index: Double): PullTypeSymbol
}

object IPullTypeCollection {
  @scala.inline
  def apply(getLength: () => Double, getTypeAtIndex: Double => PullTypeSymbol): IPullTypeCollection = {
    val __obj = js.Dynamic.literal(getLength = js.Any.fromFunction0(getLength), getTypeAtIndex = js.Any.fromFunction1(getTypeAtIndex))
  
    __obj.asInstanceOf[IPullTypeCollection]
  }
}

