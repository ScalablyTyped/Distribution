package typings.webpackDashConfigDashUtils.webpackDashConfigDashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-config-utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getIfUtils[E /* <: EnvVars | String */](env: E): IfUtils = js.native
  def getIfUtils[E /* <: EnvVars | String */](env: E, vars: js.Array[EnvVars | String]): IfUtils = js.native
  def getIfUtils[E /* <: EnvVars | String */](
    env: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in E ]: boolean | string}
    */ typings.webpackDashConfigDashUtils.webpackDashConfigDashUtilsStrings.getIfUtils with js.Any
  ): IfUtils = js.native
  def getIfUtils[E /* <: EnvVars | String */](
    env: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in E ]: boolean | string}
    */ typings.webpackDashConfigDashUtils.webpackDashConfigDashUtilsStrings.getIfUtils with js.Any,
    vars: js.Array[EnvVars | String]
  ): IfUtils = js.native
  def propIf[I](a: js.Any, value: I, alternate: js.Any): I = js.native
  def propIf[E](a: Falsy, value: js.Any, alternate: E): E = js.native
  def propIfNot[E](a: js.Any, value: js.Any, alternate: E): E = js.native
  def propIfNot[I](a: Falsy, value: I, alternate: js.Any): I = js.native
  def removeEmpty[T](
    input: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: T[P]}
    */ typings.webpackDashConfigDashUtils.webpackDashConfigDashUtilsStrings.removeEmpty with T
  ): NonEmptyObject[T, DefinedObjKeys[T]] = js.native
  def removeEmpty[T](input: js.Array[js.UndefOr[T]]): js.Array[T] = js.native
}

