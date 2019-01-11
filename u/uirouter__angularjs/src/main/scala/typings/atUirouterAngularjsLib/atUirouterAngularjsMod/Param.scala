package typings
package atUirouterAngularjsLib.atUirouterAngularjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs", "Param")
@js.native
class Param protected ()
  extends atUirouterCoreLib.atUirouterCoreMod.Param {
  def this(id: java.lang.String, `type`: atUirouterCoreLib.libParamsParamTypeMod.ParamType, location: atUirouterCoreLib.libParamsParamMod.DefType, urlConfig: atUirouterCoreLib.libUrlMod.UrlConfig, state: atUirouterCoreLib.libStateInterfaceMod.StateDeclaration) = this()
}

@JSImport("@uirouter/angularjs", "Param")
@js.native
object Param extends js.Object {
  /**
    * Finds [[Param]] objects which have different param values
    *
    * Filters a list of [[Param]] objects to only those whose parameter values differ in two param value objects
    *
    * @param params: The list of Param objects to filter
    * @param values1: The first set of parameter values
    * @param values2: the second set of parameter values
    *
    * @returns any Param objects whose values were different between values1 and values2
    */
  def changed(params: js.Array[atUirouterCoreLib.libParamsParamMod.Param]): js.Array[atUirouterCoreLib.libParamsParamMod.Param] = js.native
  def changed(
    params: js.Array[atUirouterCoreLib.libParamsParamMod.Param],
    values1: atUirouterCoreLib.libParamsInterfaceMod.RawParams
  ): js.Array[atUirouterCoreLib.libParamsParamMod.Param] = js.native
  def changed(
    params: js.Array[atUirouterCoreLib.libParamsParamMod.Param],
    values1: atUirouterCoreLib.libParamsInterfaceMod.RawParams,
    values2: atUirouterCoreLib.libParamsInterfaceMod.RawParams
  ): js.Array[atUirouterCoreLib.libParamsParamMod.Param] = js.native
  /**
    * Checks if two param value objects are equal (for a set of [[Param]] objects)
    *
    * @param params The list of [[Param]] objects to check
    * @param values1 The first set of param values
    * @param values2 The second set of param values
    *
    * @returns true if the param values in values1 and values2 are equal
    */
  def equals(params: js.Array[atUirouterCoreLib.libParamsParamMod.Param]): scala.Boolean = js.native
  def equals(params: js.Array[atUirouterCoreLib.libParamsParamMod.Param], values1: js.Object): scala.Boolean = js.native
  def equals(
    params: js.Array[atUirouterCoreLib.libParamsParamMod.Param],
    values1: js.Object,
    values2: js.Object
  ): scala.Boolean = js.native
  /** Returns true if a the parameter values are valid, according to the Param definitions */
  def validates(params: js.Array[atUirouterCoreLib.libParamsParamMod.Param]): scala.Boolean = js.native
  def validates(
    params: js.Array[atUirouterCoreLib.libParamsParamMod.Param],
    values: atUirouterCoreLib.libParamsInterfaceMod.RawParams
  ): scala.Boolean = js.native
  def values(params: js.Array[atUirouterCoreLib.libParamsParamMod.Param]): atUirouterCoreLib.libParamsInterfaceMod.RawParams = js.native
  def values(
    params: js.Array[atUirouterCoreLib.libParamsParamMod.Param],
    values: atUirouterCoreLib.libParamsInterfaceMod.RawParams
  ): atUirouterCoreLib.libParamsInterfaceMod.RawParams = js.native
}

