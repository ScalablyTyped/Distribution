package typings.vscodeLanguageclient.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceProviderFeature[PR] extends js.Object {
  def getProviders(): js.Array[PR]
}

object WorkspaceProviderFeature {
  @scala.inline
  def apply[PR](getProviders: () => js.Array[PR]): WorkspaceProviderFeature[PR] = {
    val __obj = js.Dynamic.literal(getProviders = js.Any.fromFunction0(getProviders))
    __obj.asInstanceOf[WorkspaceProviderFeature[PR]]
  }
}

