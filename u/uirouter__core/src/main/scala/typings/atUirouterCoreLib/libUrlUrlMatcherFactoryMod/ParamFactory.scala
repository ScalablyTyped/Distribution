package typings
package atUirouterCoreLib.libUrlUrlMatcherFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/url/urlMatcherFactory", "ParamFactory")
@js.native
class ParamFactory protected () extends js.Object {
  def this(router: atUirouterCoreLib.libRouterMod.UIRouter) = this()
  var router: js.Any = js.native
  def fromConfig(
    id: java.lang.String,
    `type`: atUirouterCoreLib.libParamsMod.ParamType,
    state: atUirouterCoreLib.libStateInterfaceMod.StateDeclaration
  ): atUirouterCoreLib.libParamsMod.Param = js.native
  def fromPath(
    id: java.lang.String,
    `type`: atUirouterCoreLib.libParamsMod.ParamType,
    state: atUirouterCoreLib.libStateInterfaceMod.StateDeclaration
  ): atUirouterCoreLib.libParamsMod.Param = js.native
  def fromSearch(
    id: java.lang.String,
    `type`: atUirouterCoreLib.libParamsMod.ParamType,
    state: atUirouterCoreLib.libStateInterfaceMod.StateDeclaration
  ): atUirouterCoreLib.libParamsMod.Param = js.native
}

