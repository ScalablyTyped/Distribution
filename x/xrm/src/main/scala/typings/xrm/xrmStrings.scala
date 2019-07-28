package typings.xrm

import typings.xrm.XrmEnumNs.AdvancedConfigSettingOption
import typings.xrm.XrmEnumNs.AttributeRequirementLevel
import typings.xrm.XrmEnumNs.DevicePickFileType
import typings.xrm.XrmEnumNs.StandardControlType
import typings.xrm.XrmNs.AttributesNs.AttributeType
import typings.xrm.XrmNs.AttributesNs.DateAttributeFormat
import typings.xrm.XrmNs.AttributesNs.IntegerAttributeFormat
import typings.xrm.XrmNs.AttributesNs.OptionSetAttributeFormat
import typings.xrm.XrmNs.AttributesNs.RequirementLevel
import typings.xrm.XrmNs.AttributesNs.StringAttributeFormat
import typings.xrm.XrmNs.Client
import typings.xrm.XrmNs.ClientState
import typings.xrm.XrmNs.ControlsNs.NotificationLevel
import typings.xrm.XrmNs.ControlsNs._ControlType
import typings.xrm.XrmNs.DeviceNs.PickFileTypes
import typings.xrm.XrmNs.DisplayState
import typings.xrm.XrmNs.EntitySaveMode
import typings.xrm.XrmNs.FormNotificationLevel
import typings.xrm.XrmNs.ProcessFlowNs.ProcessStatus
import typings.xrm.XrmNs.ProcessFlowNs.StageChangeDirection
import typings.xrm.XrmNs.ProcessFlowNs.StageStatus
import typings.xrm.XrmNs.SubmitMode
import typings.xrm.XrmNs.Theme
import typings.xrm.XrmNs.UrlNs.CmdBarDisplay
import typings.xrm.XrmNs.UrlNs.NavBarDisplay
import typings.xrm.XrmNs.UrlNs.ReportAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object xrmStrings {
  @js.native
  sealed trait ERROR
    extends FormNotificationLevel
       with typings.xrm.XrmEnumNs.FormNotificationLevel
       with NotificationLevel
  
  @js.native
  sealed trait INFO
    extends FormNotificationLevel
       with typings.xrm.XrmEnumNs.FormNotificationLevel
  
  @js.native
  sealed trait MaxChildIncidentNumber extends AdvancedConfigSettingOption
  
  @js.native
  sealed trait MaxIncidentMergeNumber extends AdvancedConfigSettingOption
  
  @js.native
  sealed trait Mobile
    extends Client
       with typings.xrm.XrmEnumNs.Client
  
  @js.native
  sealed trait Next
    extends StageChangeDirection
       with typings.xrm.XrmEnumNs.StageChangeDirection
  
  @js.native
  sealed trait Office12Blue
    extends Theme
       with typings.xrm.XrmEnumNs.Theme
  
  @js.native
  sealed trait Office14Silver
    extends Theme
       with typings.xrm.XrmEnumNs.Theme
  
  @js.native
  sealed trait Offline
    extends ClientState
       with typings.xrm.XrmEnumNs.ClientState
  
  @js.native
  sealed trait Online
    extends ClientState
       with typings.xrm.XrmEnumNs.ClientState
  
  @js.native
  sealed trait Outlook
    extends Client
       with typings.xrm.XrmEnumNs.Client
  
  @js.native
  sealed trait Previous
    extends StageChangeDirection
       with typings.xrm.XrmEnumNs.StageChangeDirection
  
  @js.native
  sealed trait RECOMMENDATION extends NotificationLevel
  
  @js.native
  sealed trait UnifiedServiceDesk
    extends Client
       with typings.xrm.XrmEnumNs.Client
  
  @js.native
  sealed trait WARNING
    extends FormNotificationLevel
       with typings.xrm.XrmEnumNs.FormNotificationLevel
  
  @js.native
  sealed trait Web
    extends Client
       with typings.xrm.XrmEnumNs.Client
  
  @js.native
  sealed trait aborted
    extends ProcessStatus
       with typings.xrm.XrmEnumNs.ProcessStatus
  
  @js.native
  sealed trait active
    extends ProcessStatus
       with typings.xrm.XrmEnumNs.ProcessStatus
       with StageStatus
       with typings.xrm.XrmEnumNs.StageStatus
  
  @js.native
  sealed trait always
    extends SubmitMode
       with typings.xrm.XrmEnumNs.SubmitMode
  
  @js.native
  sealed trait audio
    extends DevicePickFileType
       with PickFileTypes
  
  @js.native
  sealed trait boolean
    extends AttributeType
       with typings.xrm.XrmEnumNs.AttributeType
  
  @js.native
  sealed trait collapsed
    extends DisplayState
       with typings.xrm.XrmEnumNs.DisplayState
  
  @js.native
  sealed trait date
    extends DateAttributeFormat
       with typings.xrm.XrmEnumNs.DateAttributeFormat
  
  @js.native
  sealed trait datetime
    extends DateAttributeFormat
       with AttributeType
       with typings.xrm.XrmEnumNs.AttributeType
       with typings.xrm.XrmEnumNs.DateAttributeFormat
  
  @js.native
  sealed trait decimal
    extends AttributeType
       with typings.xrm.XrmEnumNs.AttributeType
  
  @js.native
  sealed trait default
    extends Theme
       with typings.xrm.XrmEnumNs.Theme
  
  @js.native
  sealed trait dirty
    extends SubmitMode
       with typings.xrm.XrmEnumNs.SubmitMode
  
  @js.native
  sealed trait double
    extends AttributeType
       with typings.xrm.XrmEnumNs.AttributeType
  
  @js.native
  sealed trait duration
    extends IntegerAttributeFormat
       with typings.xrm.XrmEnumNs.IntegerAttributeFormat
  
  @js.native
  sealed trait email
    extends StringAttributeFormat
       with typings.xrm.XrmEnumNs.StringAttributeFormat
  
  @js.native
  sealed trait entity
    extends NavBarDisplay
       with typings.xrm.XrmEnumNs.NavBarDisplay
  
  @js.native
  sealed trait expanded
    extends DisplayState
       with typings.xrm.XrmEnumNs.DisplayState
  
  @js.native
  sealed trait `false`
    extends CmdBarDisplay
       with typings.xrm.XrmEnumNs.CmdBarDisplay
  
  @js.native
  sealed trait filter
    extends ReportAction
       with typings.xrm.XrmEnumNs.ReportAction
  
  @js.native
  sealed trait finished
    extends ProcessStatus
       with typings.xrm.XrmEnumNs.ProcessStatus
  
  @js.native
  sealed trait iframe
    extends StandardControlType
       with _ControlType
  
  @js.native
  sealed trait image
    extends DevicePickFileType
       with PickFileTypes
  
  @js.native
  sealed trait inactive
    extends StageStatus
       with typings.xrm.XrmEnumNs.StageStatus
  
  @js.native
  sealed trait integer
    extends AttributeType
       with typings.xrm.XrmEnumNs.AttributeType
  
  @js.native
  sealed trait kbsearch
    extends StandardControlType
       with _ControlType
  
  @js.native
  sealed trait language
    extends OptionSetAttributeFormat
       with typings.xrm.XrmEnumNs.OptionSetAttributeFormat
  
  @js.native
  sealed trait lookup
    extends AttributeType
       with typings.xrm.XrmEnumNs.AttributeType
       with StandardControlType
       with _ControlType
  
  @js.native
  sealed trait memo
    extends AttributeType
       with typings.xrm.XrmEnumNs.AttributeType
  
  @js.native
  sealed trait money
    extends AttributeType
       with typings.xrm.XrmEnumNs.AttributeType
  
  @js.native
  sealed trait multioptionset
    extends AttributeType
       with typings.xrm.XrmEnumNs.AttributeType
  
  @js.native
  sealed trait multiselectoptionset extends StandardControlType
  
  @js.native
  sealed trait never
    extends SubmitMode
       with typings.xrm.XrmEnumNs.SubmitMode
  
  @js.native
  sealed trait none
    extends IntegerAttributeFormat
       with AttributeRequirementLevel
       with typings.xrm.XrmEnumNs.IntegerAttributeFormat
       with RequirementLevel
  
  @js.native
  sealed trait notes
    extends StandardControlType
       with _ControlType
  
  @js.native
  sealed trait off
    extends NavBarDisplay
       with typings.xrm.XrmEnumNs.NavBarDisplay
  
  @js.native
  sealed trait on
    extends NavBarDisplay
       with typings.xrm.XrmEnumNs.NavBarDisplay
  
  @js.native
  sealed trait optionset
    extends AttributeType
       with typings.xrm.XrmEnumNs.AttributeType
       with StandardControlType
       with _ControlType
  
  @js.native
  sealed trait phone
    extends StringAttributeFormat
       with typings.xrm.XrmEnumNs.StringAttributeFormat
  
  @js.native
  sealed trait quickform extends StandardControlType
  
  @js.native
  sealed trait recommended
    extends AttributeRequirementLevel
       with RequirementLevel
  
  @js.native
  sealed trait required
    extends AttributeRequirementLevel
       with RequirementLevel
  
  @js.native
  sealed trait run
    extends ReportAction
       with typings.xrm.XrmEnumNs.ReportAction
  
  @js.native
  sealed trait saveandclose
    extends EntitySaveMode
       with typings.xrm.XrmEnumNs.EntitySaveMode
  
  @js.native
  sealed trait saveandnew
    extends EntitySaveMode
       with typings.xrm.XrmEnumNs.EntitySaveMode
  
  @js.native
  sealed trait standard
    extends StandardControlType
       with _ControlType
  
  @js.native
  sealed trait string
    extends AttributeType
       with typings.xrm.XrmEnumNs.AttributeType
  
  @js.native
  sealed trait subgrid
    extends StandardControlType
       with _ControlType
  
  @js.native
  sealed trait text
    extends StringAttributeFormat
       with typings.xrm.XrmEnumNs.StringAttributeFormat
  
  @js.native
  sealed trait textarea
    extends StringAttributeFormat
       with typings.xrm.XrmEnumNs.StringAttributeFormat
  
  @js.native
  sealed trait tickersymbol
    extends StringAttributeFormat
       with typings.xrm.XrmEnumNs.StringAttributeFormat
  
  @js.native
  sealed trait timelinewall
    extends StandardControlType
       with _ControlType
  
  @js.native
  sealed trait timercontrol
    extends StandardControlType
       with _ControlType
  
  @js.native
  sealed trait timezone
    extends OptionSetAttributeFormat
       with typings.xrm.XrmEnumNs.OptionSetAttributeFormat
  
  @js.native
  sealed trait `true`
    extends CmdBarDisplay
       with typings.xrm.XrmEnumNs.CmdBarDisplay
  
  @js.native
  sealed trait url
    extends StringAttributeFormat
       with typings.xrm.XrmEnumNs.StringAttributeFormat
  
  @js.native
  sealed trait video
    extends DevicePickFileType
       with PickFileTypes
  
  @js.native
  sealed trait webresource
    extends StandardControlType
       with _ControlType
  
  @scala.inline
  def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  @scala.inline
  def INFO: INFO = "INFO".asInstanceOf[INFO]
  @scala.inline
  def MaxChildIncidentNumber: MaxChildIncidentNumber = "MaxChildIncidentNumber".asInstanceOf[MaxChildIncidentNumber]
  @scala.inline
  def MaxIncidentMergeNumber: MaxIncidentMergeNumber = "MaxIncidentMergeNumber".asInstanceOf[MaxIncidentMergeNumber]
  @scala.inline
  def Mobile: Mobile = "Mobile".asInstanceOf[Mobile]
  @scala.inline
  def Next: Next = "Next".asInstanceOf[Next]
  @scala.inline
  def Office12Blue: Office12Blue = "Office12Blue".asInstanceOf[Office12Blue]
  @scala.inline
  def Office14Silver: Office14Silver = "Office14Silver".asInstanceOf[Office14Silver]
  @scala.inline
  def Offline: Offline = "Offline".asInstanceOf[Offline]
  @scala.inline
  def Online: Online = "Online".asInstanceOf[Online]
  @scala.inline
  def Outlook: Outlook = "Outlook".asInstanceOf[Outlook]
  @scala.inline
  def Previous: Previous = "Previous".asInstanceOf[Previous]
  @scala.inline
  def RECOMMENDATION: RECOMMENDATION = "RECOMMENDATION".asInstanceOf[RECOMMENDATION]
  @scala.inline
  def UnifiedServiceDesk: UnifiedServiceDesk = "UnifiedServiceDesk".asInstanceOf[UnifiedServiceDesk]
  @scala.inline
  def WARNING: WARNING = "WARNING".asInstanceOf[WARNING]
  @scala.inline
  def Web: Web = "Web".asInstanceOf[Web]
  @scala.inline
  def aborted: aborted = "aborted".asInstanceOf[aborted]
  @scala.inline
  def active: active = "active".asInstanceOf[active]
  @scala.inline
  def always: always = "always".asInstanceOf[always]
  @scala.inline
  def audio: audio = "audio".asInstanceOf[audio]
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  @scala.inline
  def collapsed: collapsed = "collapsed".asInstanceOf[collapsed]
  @scala.inline
  def date: date = "date".asInstanceOf[date]
  @scala.inline
  def datetime: datetime = "datetime".asInstanceOf[datetime]
  @scala.inline
  def decimal: decimal = "decimal".asInstanceOf[decimal]
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  @scala.inline
  def dirty: dirty = "dirty".asInstanceOf[dirty]
  @scala.inline
  def double: double = "double".asInstanceOf[double]
  @scala.inline
  def duration: duration = "duration".asInstanceOf[duration]
  @scala.inline
  def email: email = "email".asInstanceOf[email]
  @scala.inline
  def entity: entity = "entity".asInstanceOf[entity]
  @scala.inline
  def expanded: expanded = "expanded".asInstanceOf[expanded]
  @scala.inline
  def `false`: `false` = "false".asInstanceOf[`false`]
  @scala.inline
  def filter: filter = "filter".asInstanceOf[filter]
  @scala.inline
  def finished: finished = "finished".asInstanceOf[finished]
  @scala.inline
  def iframe: iframe = "iframe".asInstanceOf[iframe]
  @scala.inline
  def image: image = "image".asInstanceOf[image]
  @scala.inline
  def inactive: inactive = "inactive".asInstanceOf[inactive]
  @scala.inline
  def integer: integer = "integer".asInstanceOf[integer]
  @scala.inline
  def kbsearch: kbsearch = "kbsearch".asInstanceOf[kbsearch]
  @scala.inline
  def language: language = "language".asInstanceOf[language]
  @scala.inline
  def lookup: lookup = "lookup".asInstanceOf[lookup]
  @scala.inline
  def memo: memo = "memo".asInstanceOf[memo]
  @scala.inline
  def money: money = "money".asInstanceOf[money]
  @scala.inline
  def multioptionset: multioptionset = "multioptionset".asInstanceOf[multioptionset]
  @scala.inline
  def multiselectoptionset: multiselectoptionset = "multiselectoptionset".asInstanceOf[multiselectoptionset]
  @scala.inline
  def never: never = "never".asInstanceOf[never]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def notes: notes = "notes".asInstanceOf[notes]
  @scala.inline
  def off: off = "off".asInstanceOf[off]
  @scala.inline
  def on: on = "on".asInstanceOf[on]
  @scala.inline
  def optionset: optionset = "optionset".asInstanceOf[optionset]
  @scala.inline
  def phone: phone = "phone".asInstanceOf[phone]
  @scala.inline
  def quickform: quickform = "quickform".asInstanceOf[quickform]
  @scala.inline
  def recommended: recommended = "recommended".asInstanceOf[recommended]
  @scala.inline
  def required: required = "required".asInstanceOf[required]
  @scala.inline
  def run: run = "run".asInstanceOf[run]
  @scala.inline
  def saveandclose: saveandclose = "saveandclose".asInstanceOf[saveandclose]
  @scala.inline
  def saveandnew: saveandnew = "saveandnew".asInstanceOf[saveandnew]
  @scala.inline
  def standard: standard = "standard".asInstanceOf[standard]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  @scala.inline
  def subgrid: subgrid = "subgrid".asInstanceOf[subgrid]
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  @scala.inline
  def textarea: textarea = "textarea".asInstanceOf[textarea]
  @scala.inline
  def tickersymbol: tickersymbol = "tickersymbol".asInstanceOf[tickersymbol]
  @scala.inline
  def timelinewall: timelinewall = "timelinewall".asInstanceOf[timelinewall]
  @scala.inline
  def timercontrol: timercontrol = "timercontrol".asInstanceOf[timercontrol]
  @scala.inline
  def timezone: timezone = "timezone".asInstanceOf[timezone]
  @scala.inline
  def `true`: `true` = "true".asInstanceOf[`true`]
  @scala.inline
  def url: url = "url".asInstanceOf[url]
  @scala.inline
  def video: video = "video".asInstanceOf[video]
  @scala.inline
  def webresource: webresource = "webresource".asInstanceOf[webresource]
}

