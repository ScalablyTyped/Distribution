package typings.atUirouterCore.libUrlUrlMatcherFactoryMod

import typings.atUirouterCore.libParamsMod.Param
import typings.atUirouterCore.libParamsMod.ParamType
import typings.atUirouterCore.libRouterMod.UIRouter
import typings.atUirouterCore.libStateInterfaceMod.StateDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/url/urlMatcherFactory", "ParamFactory")
@js.native
class ParamFactory protected () extends js.Object {
  def this(router: UIRouter) = this()
  var router: js.Any = js.native
  def fromConfig(id: String, `type`: ParamType, state: StateDeclaration): Param = js.native
  def fromPath(id: String, `type`: ParamType, state: StateDeclaration): Param = js.native
  def fromSearch(id: String, `type`: ParamType, state: StateDeclaration): Param = js.native
}

