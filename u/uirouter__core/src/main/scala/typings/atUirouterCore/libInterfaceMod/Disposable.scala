package typings.atUirouterCore.libInterfaceMod

import typings.atUirouterCore.libRouterMod.UIRouter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Disposable extends js.Object {
  /** Instructs the Disposable to clean up any resources */
  def dispose(): js.Any = js.native
  def dispose(router: UIRouter): js.Any = js.native
}

