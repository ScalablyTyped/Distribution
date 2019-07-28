package typings.atUirouterCore.libParamsParamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DefType extends js.Object

/** @internalapi */
@JSImport("@uirouter/core/lib/params/param", "DefType")
@js.native
object DefType extends js.Object {
  @js.native
  sealed trait CONFIG extends DefType
  
  @js.native
  sealed trait PATH extends DefType
  
  @js.native
  sealed trait SEARCH extends DefType
  
  /* 2 */ val CONFIG: typings.atUirouterCore.libParamsParamMod.DefType.CONFIG with Double = js.native
  /* 0 */ val PATH: typings.atUirouterCore.libParamsParamMod.DefType.PATH with Double = js.native
  /* 1 */ val SEARCH: typings.atUirouterCore.libParamsParamMod.DefType.SEARCH with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DefType with Double] = js.native
}

