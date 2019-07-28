package typings.atUirouterCore.atUirouterCoreMod

import typings.atUirouterCore.libParamsInterfaceMod.RawParams
import typings.atUirouterCore.libStateInterfaceMod.StateDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core", "Param")
@js.native
class Param protected ()
  extends typings.atUirouterCore.libParamsMod.Param {
  def this(
    id: String,
    `type`: typings.atUirouterCore.libParamsParamTypeMod.ParamType,
    location: typings.atUirouterCore.libParamsParamMod.DefType,
    urlConfig: typings.atUirouterCore.libUrlMod.UrlConfig,
    state: StateDeclaration
  ) = this()
}

/* static members */
@JSImport("@uirouter/core", "Param")
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
  def changed(params: js.Array[typings.atUirouterCore.libParamsParamMod.Param]): js.Array[typings.atUirouterCore.libParamsParamMod.Param] = js.native
  def changed(params: js.Array[typings.atUirouterCore.libParamsParamMod.Param], values1: RawParams): js.Array[typings.atUirouterCore.libParamsParamMod.Param] = js.native
  def changed(
    params: js.Array[typings.atUirouterCore.libParamsParamMod.Param],
    values1: RawParams,
    values2: RawParams
  ): js.Array[typings.atUirouterCore.libParamsParamMod.Param] = js.native
  /**
    * Checks if two param value objects are equal (for a set of [[Param]] objects)
    *
    * @param params The list of [[Param]] objects to check
    * @param values1 The first set of param values
    * @param values2 The second set of param values
    *
    * @returns true if the param values in values1 and values2 are equal
    */
  def equals(params: js.Array[typings.atUirouterCore.libParamsParamMod.Param]): Boolean = js.native
  def equals(params: js.Array[typings.atUirouterCore.libParamsParamMod.Param], values1: js.Object): Boolean = js.native
  def equals(
    params: js.Array[typings.atUirouterCore.libParamsParamMod.Param],
    values1: js.Object,
    values2: js.Object
  ): Boolean = js.native
  /** Returns true if a the parameter values are valid, according to the Param definitions */
  def validates(params: js.Array[typings.atUirouterCore.libParamsParamMod.Param]): Boolean = js.native
  def validates(params: js.Array[typings.atUirouterCore.libParamsParamMod.Param], values: RawParams): Boolean = js.native
  def values(params: js.Array[typings.atUirouterCore.libParamsParamMod.Param]): RawParams = js.native
  def values(params: js.Array[typings.atUirouterCore.libParamsParamMod.Param], values: RawParams): RawParams = js.native
}

