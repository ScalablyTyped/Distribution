package typings
package xrmLib.XrmEnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StandardControlType extends js.Object

/**
     * Constant Enum: Control types for {@link Controls.Control.getControlType Controls.Control.getControlType()}.
     * @see {@link Xrm.Controls.ControlType}
     */
@JSGlobal("XrmEnum.StandardControlType")
@js.native
object StandardControlType extends js.Object {
  @js.native
  sealed trait IFrame
    extends xrmLib.XrmEnumNs.StandardControlType
  
  @js.native
  sealed trait KBSearch
    extends xrmLib.XrmEnumNs.StandardControlType
  
  @js.native
  sealed trait Lookup
    extends xrmLib.XrmEnumNs.StandardControlType
  
  @js.native
  sealed trait Notes
    extends xrmLib.XrmEnumNs.StandardControlType
  
  @js.native
  sealed trait OptionSet
    extends xrmLib.XrmEnumNs.StandardControlType
  
  @js.native
  sealed trait QuickForm
    extends xrmLib.XrmEnumNs.StandardControlType
  
  @js.native
  sealed trait Standard
    extends xrmLib.XrmEnumNs.StandardControlType
  
  @js.native
  sealed trait SubGrid
    extends xrmLib.XrmEnumNs.StandardControlType
  
  @js.native
  sealed trait TimeLineWall
    extends xrmLib.XrmEnumNs.StandardControlType
  
  @js.native
  sealed trait TimerControl
    extends xrmLib.XrmEnumNs.StandardControlType
  
  @js.native
  sealed trait WebResource
    extends xrmLib.XrmEnumNs.StandardControlType
  
  /* "iframe" */ val IFrame: IFrame with java.lang.String = js.native
  /* "kbsearch" */ val KBSearch: KBSearch with java.lang.String = js.native
  /* "lookup" */ val Lookup: Lookup with java.lang.String = js.native
  /* "notes" */ val Notes: Notes with java.lang.String = js.native
  /* "optionset" */ val OptionSet: OptionSet with java.lang.String = js.native
  /* "quickform" */ val QuickForm: QuickForm with java.lang.String = js.native
  /* "standard" */ val Standard: Standard with java.lang.String = js.native
  /* "subgrid" */ val SubGrid: SubGrid with java.lang.String = js.native
  /* "timelinewall" */ val TimeLineWall: TimeLineWall with java.lang.String = js.native
  /* "timercontrol" */ val TimerControl: TimerControl with java.lang.String = js.native
  /* "webresource" */ val WebResource: WebResource with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[xrmLib.XrmEnumNs.StandardControlType with java.lang.String] = js.native
}

