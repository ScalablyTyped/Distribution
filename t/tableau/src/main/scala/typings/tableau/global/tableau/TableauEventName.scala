package typings.tableau.global.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Viz Event Classes
/**
  * Defines strings passed to the Viz.addEventListener and Viz.removeEventListener methods.
  * The values of the enums are all lowercase strings with no underscores.
  * For example, CUSTOM_VIEW_LOAD is customviewload.
  * Either the fully-qualified enum (tableau.TableauEventName.FILTER_CHANGE) or the raw string (filterchange) is acceptable.
  */
@JSGlobal("tableau.TableauEventName")
@js.native
object TableauEventName extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.tableau.tableau.TableauEventName with String] = js.native
  
  /* "customviewload" */ val CUSTOM_VIEW_LOAD: typings.tableau.tableau.TableauEventName.CUSTOM_VIEW_LOAD with String = js.native
  
  /* "customviewremove" */ val CUSTOM_VIEW_REMOVE: typings.tableau.tableau.TableauEventName.CUSTOM_VIEW_REMOVE with String = js.native
  
  /* "customviewsave" */ val CUSTOM_VIEW_SAVE: typings.tableau.tableau.TableauEventName.CUSTOM_VIEW_SAVE with String = js.native
  
  /* "customviewsetdefault" */ val CUSTOM_VIEW_SET_DEFAULT: typings.tableau.tableau.TableauEventName.CUSTOM_VIEW_SET_DEFAULT with String = js.native
  
  /* "filterchange" */ val FILTER_CHANGE: typings.tableau.tableau.TableauEventName.FILTER_CHANGE with String = js.native
  
  /* "marksselection" */ val MARKS_SELECTION: typings.tableau.tableau.TableauEventName.MARKS_SELECTION with String = js.native
  
  /* "parametervaluechange" */ val PARAMETER_VALUE_CHANGE: typings.tableau.tableau.TableauEventName.PARAMETER_VALUE_CHANGE with String = js.native
  
  /* "storypointswitch" */ val STORY_POINT_SWITCH: typings.tableau.tableau.TableauEventName.STORY_POINT_SWITCH with String = js.native
  
  /* "tabswitch" */ val TAB_SWITCH: typings.tableau.tableau.TableauEventName.TAB_SWITCH with String = js.native
  
  /* "toolbarstatechange" */ val TOOLBAR_STATE_CHANGE: typings.tableau.tableau.TableauEventName.TOOLBAR_STATE_CHANGE with String = js.native
  
  /* "vizresize" */ val VIZ_RESIZE: typings.tableau.tableau.TableauEventName.VIZ_RESIZE with String = js.native
}
