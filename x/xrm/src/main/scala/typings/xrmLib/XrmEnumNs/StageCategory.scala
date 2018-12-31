package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StageCategory extends js.Object

/**
  * Enumeration of stage categories.
  */
@JSGlobal("XrmEnum.StageCategory")
@js.native
object StageCategory extends js.Object {
  @js.native
  sealed trait Close
    extends xrmLib.XrmEnumNs.StageCategory
  
  @js.native
  sealed trait Develop
    extends xrmLib.XrmEnumNs.StageCategory
  
  @js.native
  sealed trait Identify
    extends xrmLib.XrmEnumNs.StageCategory
  
  @js.native
  sealed trait Propose
    extends xrmLib.XrmEnumNs.StageCategory
  
  @js.native
  sealed trait Qualify
    extends xrmLib.XrmEnumNs.StageCategory
  
  @js.native
  sealed trait Research
    extends xrmLib.XrmEnumNs.StageCategory
  
  @js.native
  sealed trait Resolve
    extends xrmLib.XrmEnumNs.StageCategory
  
  /* 3 */ val Close: Close with scala.Double = js.native
  /* 1 */ val Develop: Develop with scala.Double = js.native
  /* 4 */ val Identify: Identify with scala.Double = js.native
  /* 2 */ val Propose: Propose with scala.Double = js.native
  /* 0 */ val Qualify: Qualify with scala.Double = js.native
  /* 5 */ val Research: Research with scala.Double = js.native
  /* 6 */ val Resolve: Resolve with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[xrmLib.XrmEnumNs.StageCategory with scala.Double] = js.native
}

