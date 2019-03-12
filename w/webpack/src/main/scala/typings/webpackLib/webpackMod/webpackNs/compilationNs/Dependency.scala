package typings
package webpackLib.webpackMod.webpackNs.compilationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dependency extends js.Object {
  def disconnect(): scala.Unit
  def getErrors(): js.Any
  def getExports(): js.Any
  def getReference(): js.Any
  def getResourceIdentifier(): js.Any
  def getWarnings(): js.Any
  def updateHash(hash: js.Any): scala.Unit
}

object Dependency {
  @scala.inline
  def apply(
    disconnect: () => scala.Unit,
    getErrors: () => js.Any,
    getExports: () => js.Any,
    getReference: () => js.Any,
    getResourceIdentifier: () => js.Any,
    getWarnings: () => js.Any,
    updateHash: js.Any => scala.Unit
  ): Dependency = {
    val __obj = js.Dynamic.literal(disconnect = js.Any.fromFunction0(disconnect), getErrors = js.Any.fromFunction0(getErrors), getExports = js.Any.fromFunction0(getExports), getReference = js.Any.fromFunction0(getReference), getResourceIdentifier = js.Any.fromFunction0(getResourceIdentifier), getWarnings = js.Any.fromFunction0(getWarnings), updateHash = js.Any.fromFunction1(updateHash))
  
    __obj.asInstanceOf[Dependency]
  }
}

