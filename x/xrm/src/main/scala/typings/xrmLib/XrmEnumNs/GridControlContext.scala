package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GridControlContext extends js.Object

/**
     * Enumeration of grid control context resolutions.
     */
@JSGlobal("XrmEnum.GridControlContext")
@js.native
object GridControlContext extends js.Object {
  @js.native
  sealed trait FormContextRelated
    extends xrmLib.XrmEnumNs.GridControlContext
  
  @js.native
  sealed trait FormContextUnrelated
    extends xrmLib.XrmEnumNs.GridControlContext
  
  @js.native
  sealed trait RibbonContextForm
    extends xrmLib.XrmEnumNs.GridControlContext
  
  @js.native
  sealed trait RibbonContextListing
    extends xrmLib.XrmEnumNs.GridControlContext
  
  @js.native
  sealed trait Unknown
    extends xrmLib.XrmEnumNs.GridControlContext
  
  /* 4 */ val FormContextRelated: FormContextRelated with scala.Double = js.native
  /* 3 */ val FormContextUnrelated: FormContextUnrelated with scala.Double = js.native
  /* 1 */ val RibbonContextForm: RibbonContextForm with scala.Double = js.native
  /* 2 */ val RibbonContextListing: RibbonContextListing with scala.Double = js.native
  /* 0 */ val Unknown: Unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[xrmLib.XrmEnumNs.GridControlContext with scala.Double] = js.native
}

