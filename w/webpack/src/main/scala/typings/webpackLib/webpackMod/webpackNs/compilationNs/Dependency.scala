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
    disconnect: js.Function0[scala.Unit],
    getErrors: js.Function0[js.Any],
    getExports: js.Function0[js.Any],
    getReference: js.Function0[js.Any],
    getResourceIdentifier: js.Function0[js.Any],
    getWarnings: js.Function0[js.Any],
    updateHash: js.Function1[js.Any, scala.Unit]
  ): Dependency = {
    val __obj = js.Dynamic.literal(disconnect = disconnect, getErrors = getErrors, getExports = getExports, getReference = getReference, getResourceIdentifier = getResourceIdentifier, getWarnings = getWarnings, updateHash = updateHash)
  
    __obj.asInstanceOf[Dependency]
  }
}

