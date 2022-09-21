package typings.tableauJsApi.enumsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TableauEventName extends StObject
@JSImport("tableau-js-api/enums", "TableauEventName")
@js.native
object TableauEventName extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TableauEventName & String] = js.native
  
  @js.native
  sealed trait CUSTOM_VIEW_LOAD
    extends StObject
       with TableauEventName
  /* "customviewload" */ val CUSTOM_VIEW_LOAD: typings.tableauJsApi.enumsMod.TableauEventName.CUSTOM_VIEW_LOAD & String = js.native
  
  @js.native
  sealed trait CUSTOM_VIEW_REMOVE
    extends StObject
       with TableauEventName
  /* "customviewremove" */ val CUSTOM_VIEW_REMOVE: typings.tableauJsApi.enumsMod.TableauEventName.CUSTOM_VIEW_REMOVE & String = js.native
  
  @js.native
  sealed trait CUSTOM_VIEW_SAVE
    extends StObject
       with TableauEventName
  /* "customviewsave" */ val CUSTOM_VIEW_SAVE: typings.tableauJsApi.enumsMod.TableauEventName.CUSTOM_VIEW_SAVE & String = js.native
  
  @js.native
  sealed trait CUSTOM_VIEW_SET_DEFAULT
    extends StObject
       with TableauEventName
  /* "customviewsetdefault" */ val CUSTOM_VIEW_SET_DEFAULT: typings.tableauJsApi.enumsMod.TableauEventName.CUSTOM_VIEW_SET_DEFAULT & String = js.native
  
  @js.native
  sealed trait FILTER_CHANGE
    extends StObject
       with TableauEventName
  /* "filterchange" */ val FILTER_CHANGE: typings.tableauJsApi.enumsMod.TableauEventName.FILTER_CHANGE & String = js.native
  
  @js.native
  sealed trait FIRST_INTERACTIVE
    extends StObject
       with TableauEventName
  /* "firstinteractive" */ val FIRST_INTERACTIVE: typings.tableauJsApi.enumsMod.TableauEventName.FIRST_INTERACTIVE & String = js.native
  
  @js.native
  sealed trait FIRST_VIZ_SIZE_KNOWN
    extends StObject
       with TableauEventName
  /* "firstvizsizeknown" */ val FIRST_VIZ_SIZE_KNOWN: typings.tableauJsApi.enumsMod.TableauEventName.FIRST_VIZ_SIZE_KNOWN & String = js.native
  
  @js.native
  sealed trait MARKS_HIGHLIGHT
    extends StObject
       with TableauEventName
  /* "markshighlight" */ val MARKS_HIGHLIGHT: typings.tableauJsApi.enumsMod.TableauEventName.MARKS_HIGHLIGHT & String = js.native
  
  @js.native
  sealed trait MARKS_SELECTION
    extends StObject
       with TableauEventName
  /* "marksselection" */ val MARKS_SELECTION: typings.tableauJsApi.enumsMod.TableauEventName.MARKS_SELECTION & String = js.native
  
  @js.native
  sealed trait PARAMETER_VALUE_CHANGE
    extends StObject
       with TableauEventName
  /* "parametervaluechange" */ val PARAMETER_VALUE_CHANGE: typings.tableauJsApi.enumsMod.TableauEventName.PARAMETER_VALUE_CHANGE & String = js.native
  
  @js.native
  sealed trait STORY_POINT_SWITCH
    extends StObject
       with TableauEventName
  /* "storypointswitch" */ val STORY_POINT_SWITCH: typings.tableauJsApi.enumsMod.TableauEventName.STORY_POINT_SWITCH & String = js.native
  
  @js.native
  sealed trait TAB_SWITCH
    extends StObject
       with TableauEventName
  /* "tabswitch" */ val TAB_SWITCH: typings.tableauJsApi.enumsMod.TableauEventName.TAB_SWITCH & String = js.native
  
  @js.native
  sealed trait TOOLBAR_STATE_CHANGE
    extends StObject
       with TableauEventName
  /* "toolbarstatechange" */ val TOOLBAR_STATE_CHANGE: typings.tableauJsApi.enumsMod.TableauEventName.TOOLBAR_STATE_CHANGE & String = js.native
  
  @js.native
  sealed trait URL_ACTION
    extends StObject
       with TableauEventName
  /* "urlaction" */ val URL_ACTION: typings.tableauJsApi.enumsMod.TableauEventName.URL_ACTION & String = js.native
  
  @js.native
  sealed trait VIZ_RESIZE
    extends StObject
       with TableauEventName
  /* "vizresize" */ val VIZ_RESIZE: typings.tableauJsApi.enumsMod.TableauEventName.VIZ_RESIZE & String = js.native
}
