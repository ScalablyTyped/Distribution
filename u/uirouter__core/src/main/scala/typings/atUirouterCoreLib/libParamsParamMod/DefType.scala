package typings
package atUirouterCoreLib.libParamsParamMod

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
  sealed trait CONFIG
    extends atUirouterCoreLib.libParamsParamMod.DefType
  
  @js.native
  sealed trait PATH
    extends atUirouterCoreLib.libParamsParamMod.DefType
  
  @js.native
  sealed trait SEARCH
    extends atUirouterCoreLib.libParamsParamMod.DefType
  
  /* 2 */ val CONFIG: CONFIG with scala.Double = js.native
  /* 0 */ val PATH: PATH with scala.Double = js.native
  /* 1 */ val SEARCH: SEARCH with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[atUirouterCoreLib.libParamsParamMod.DefType with scala.Double] = js.native
}

