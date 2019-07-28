package typings.typesafeDashActions.distCreateDashAsyncDashActionMod

import typings.typesafeDashActions.distTypeDashHelpersMod.TypeConstant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesafe-actions/dist/create-async-action", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createAsyncAction[TType1 /* <: TypeConstant */, TType2 /* <: TypeConstant */, TType3 /* <: TypeConstant */, TType4 /* <: TypeConstant */](requestType: TType1, successType: TType2, failureType: TType3): AsyncActionBuilder[TType1, TType2, TType3, TType4] = js.native
  def createAsyncAction[TType1 /* <: TypeConstant */, TType2 /* <: TypeConstant */, TType3 /* <: TypeConstant */, TType4 /* <: TypeConstant */](requestType: TType1, successType: TType2, failureType: TType3, cancelType: TType4): AsyncActionBuilder[TType1, TType2, TType3, TType4] = js.native
}

