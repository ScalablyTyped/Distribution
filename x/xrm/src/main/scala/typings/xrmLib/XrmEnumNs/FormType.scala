package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FormType extends js.Object

/**
     * Enumeration of entity form states/types.
     */
@JSGlobal("XrmEnum.FormType")
@js.native
object FormType extends js.Object {
  @js.native
  sealed trait BulkEdit
    extends xrmLib.XrmEnumNs.FormType
  
  @js.native
  sealed trait Create
    extends xrmLib.XrmEnumNs.FormType
  
  @js.native
  sealed trait Disabled
    extends xrmLib.XrmEnumNs.FormType
  
  /**
           * @deprecated QuickCreate has been deprecated
           */
  @js.native
  sealed trait QuickCreate
    extends xrmLib.XrmEnumNs.FormType
  
  @js.native
  sealed trait ReadOnly
    extends xrmLib.XrmEnumNs.FormType
  
  /**
           * @deprecated ReadOptimized has been deprecated.
           */
  @js.native
  sealed trait ReadOptimized
    extends xrmLib.XrmEnumNs.FormType
  
  @js.native
  sealed trait Undefined
    extends xrmLib.XrmEnumNs.FormType
  
  @js.native
  sealed trait Update
    extends xrmLib.XrmEnumNs.FormType
  
  /* 6 */ val BulkEdit: BulkEdit with scala.Double = js.native
  /* 1 */ val Create: Create with scala.Double = js.native
  /* 4 */ val Disabled: Disabled with scala.Double = js.native
  /* 5 */ val QuickCreate: QuickCreate with scala.Double = js.native
  /* 3 */ val ReadOnly: ReadOnly with scala.Double = js.native
  /* 11 */ val ReadOptimized: ReadOptimized with scala.Double = js.native
  /* 0 */ val Undefined: Undefined with scala.Double = js.native
  /* 2 */ val Update: Update with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[xrmLib.XrmEnumNs.FormType with scala.Double] = js.native
}

