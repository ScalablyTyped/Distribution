package typings
package xrmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object xrmLibStrings {
  @js.native
  sealed trait ERROR
    extends xrmLib.XrmNs.FormNotificationLevel
       with xrmLib.XrmEnumNs.FormNotificationLevel
       with xrmLib.XrmNs.ControlsNs.NotificationLevel
  
  @js.native
  sealed trait INFO
    extends xrmLib.XrmNs.FormNotificationLevel
       with xrmLib.XrmEnumNs.FormNotificationLevel
  
  @js.native
  sealed trait MaxChildIncidentNumber
    extends xrmLib.XrmEnumNs.AdvancedConfigSettingOption
  
  @js.native
  sealed trait MaxIncidentMergeNumber
    extends xrmLib.XrmEnumNs.AdvancedConfigSettingOption
  
  @js.native
  sealed trait Mobile
    extends xrmLib.XrmNs.Client
       with xrmLib.XrmEnumNs.Client
  
  @js.native
  sealed trait Next
    extends xrmLib.XrmNs.ProcessFlowNs.StageChangeDirection
       with xrmLib.XrmEnumNs.StageChangeDirection
  
  @js.native
  sealed trait Office12Blue
    extends xrmLib.XrmNs.Theme
       with xrmLib.XrmEnumNs.Theme
  
  @js.native
  sealed trait Office14Silver
    extends xrmLib.XrmNs.Theme
       with xrmLib.XrmEnumNs.Theme
  
  @js.native
  sealed trait Offline
    extends xrmLib.XrmNs.ClientState
       with xrmLib.XrmEnumNs.ClientState
  
  @js.native
  sealed trait Online
    extends xrmLib.XrmNs.ClientState
       with xrmLib.XrmEnumNs.ClientState
  
  @js.native
  sealed trait Outlook
    extends xrmLib.XrmNs.Client
       with xrmLib.XrmEnumNs.Client
  
  @js.native
  sealed trait Previous
    extends xrmLib.XrmNs.ProcessFlowNs.StageChangeDirection
       with xrmLib.XrmEnumNs.StageChangeDirection
  
  @js.native
  sealed trait RECOMMENDATION
    extends xrmLib.XrmNs.ControlsNs.NotificationLevel
  
  @js.native
  sealed trait UnifiedServiceDesk
    extends xrmLib.XrmNs.Client
       with xrmLib.XrmEnumNs.Client
  
  @js.native
  sealed trait WARNING
    extends xrmLib.XrmNs.FormNotificationLevel
       with xrmLib.XrmEnumNs.FormNotificationLevel
  
  @js.native
  sealed trait Web
    extends xrmLib.XrmNs.Client
       with xrmLib.XrmEnumNs.Client
  
  @js.native
  sealed trait aborted
    extends xrmLib.XrmNs.ProcessFlowNs.ProcessStatus
       with xrmLib.XrmEnumNs.ProcessStatus
  
  @js.native
  sealed trait active
    extends xrmLib.XrmNs.ProcessFlowNs.ProcessStatus
       with xrmLib.XrmEnumNs.ProcessStatus
       with xrmLib.XrmNs.ProcessFlowNs.StageStatus
       with xrmLib.XrmEnumNs.StageStatus
  
  @js.native
  sealed trait always
    extends xrmLib.XrmNs.SubmitMode
       with xrmLib.XrmEnumNs.SubmitMode
  
  @js.native
  sealed trait audio
    extends xrmLib.XrmEnumNs.DevicePickFileType
       with xrmLib.XrmNs.DeviceNs.PickFileTypes
  
  @js.native
  sealed trait boolean
    extends xrmLib.XrmNs.AttributesNs.AttributeType
       with xrmLib.XrmEnumNs.AttributeType
  
  @js.native
  sealed trait collapsed
    extends xrmLib.XrmNs.DisplayState
       with xrmLib.XrmEnumNs.DisplayState
  
  @js.native
  sealed trait date
    extends xrmLib.XrmNs.AttributesNs.DateAttributeFormat
       with xrmLib.XrmEnumNs.DateAttributeFormat
  
  @js.native
  sealed trait datetime
    extends xrmLib.XrmNs.AttributesNs.DateAttributeFormat
       with xrmLib.XrmNs.AttributesNs.AttributeType
       with xrmLib.XrmEnumNs.AttributeType
       with xrmLib.XrmEnumNs.DateAttributeFormat
  
  @js.native
  sealed trait decimal
    extends xrmLib.XrmNs.AttributesNs.AttributeType
       with xrmLib.XrmEnumNs.AttributeType
  
  @js.native
  sealed trait default
    extends xrmLib.XrmNs.Theme
       with xrmLib.XrmEnumNs.Theme
  
  @js.native
  sealed trait dirty
    extends xrmLib.XrmNs.SubmitMode
       with xrmLib.XrmEnumNs.SubmitMode
  
  @js.native
  sealed trait double
    extends xrmLib.XrmNs.AttributesNs.AttributeType
       with xrmLib.XrmEnumNs.AttributeType
  
  @js.native
  sealed trait duration
    extends xrmLib.XrmNs.AttributesNs.IntegerAttributeFormat
       with xrmLib.XrmEnumNs.IntegerAttributeFormat
  
  @js.native
  sealed trait email
    extends xrmLib.XrmNs.AttributesNs.StringAttributeFormat
       with xrmLib.XrmEnumNs.StringAttributeFormat
  
  @js.native
  sealed trait entity
    extends xrmLib.XrmNs.UrlNs.NavBarDisplay
       with xrmLib.XrmEnumNs.NavBarDisplay
  
  @js.native
  sealed trait expanded
    extends xrmLib.XrmNs.DisplayState
       with xrmLib.XrmEnumNs.DisplayState
  
  @js.native
  sealed trait `false`
    extends xrmLib.XrmNs.UrlNs.CmdBarDisplay
       with xrmLib.XrmEnumNs.CmdBarDisplay
  
  @js.native
  sealed trait filter
    extends xrmLib.XrmNs.UrlNs.ReportAction
       with xrmLib.XrmEnumNs.ReportAction
  
  @js.native
  sealed trait finished
    extends xrmLib.XrmNs.ProcessFlowNs.ProcessStatus
       with xrmLib.XrmEnumNs.ProcessStatus
  
  @js.native
  sealed trait iframe
    extends xrmLib.XrmEnumNs.StandardControlType
       with xrmLib.XrmNs.ControlsNs._ControlType
  
  @js.native
  sealed trait image
    extends xrmLib.XrmEnumNs.DevicePickFileType
       with xrmLib.XrmNs.DeviceNs.PickFileTypes
  
  @js.native
  sealed trait inactive
    extends xrmLib.XrmNs.ProcessFlowNs.StageStatus
       with xrmLib.XrmEnumNs.StageStatus
  
  @js.native
  sealed trait integer
    extends xrmLib.XrmNs.AttributesNs.AttributeType
       with xrmLib.XrmEnumNs.AttributeType
  
  @js.native
  sealed trait kbsearch
    extends xrmLib.XrmEnumNs.StandardControlType
       with xrmLib.XrmNs.ControlsNs._ControlType
  
  @js.native
  sealed trait language
    extends xrmLib.XrmNs.AttributesNs.OptionSetAttributeFormat
       with xrmLib.XrmEnumNs.OptionSetAttributeFormat
  
  @js.native
  sealed trait lookup
    extends xrmLib.XrmNs.AttributesNs.AttributeType
       with xrmLib.XrmEnumNs.AttributeType
       with xrmLib.XrmEnumNs.StandardControlType
       with xrmLib.XrmNs.ControlsNs._ControlType
  
  @js.native
  sealed trait memo
    extends xrmLib.XrmNs.AttributesNs.AttributeType
       with xrmLib.XrmEnumNs.AttributeType
  
  @js.native
  sealed trait money
    extends xrmLib.XrmNs.AttributesNs.AttributeType
       with xrmLib.XrmEnumNs.AttributeType
  
  @js.native
  sealed trait multioptionset
    extends xrmLib.XrmNs.AttributesNs.AttributeType
       with xrmLib.XrmEnumNs.AttributeType
  
  @js.native
  sealed trait multiselectoptionset
    extends xrmLib.XrmEnumNs.StandardControlType
  
  @js.native
  sealed trait never
    extends xrmLib.XrmNs.SubmitMode
       with xrmLib.XrmEnumNs.SubmitMode
  
  @js.native
  sealed trait none
    extends xrmLib.XrmNs.AttributesNs.IntegerAttributeFormat
       with xrmLib.XrmEnumNs.AttributeRequirementLevel
       with xrmLib.XrmEnumNs.IntegerAttributeFormat
       with xrmLib.XrmNs.AttributesNs.RequirementLevel
  
  @js.native
  sealed trait notes
    extends xrmLib.XrmEnumNs.StandardControlType
       with xrmLib.XrmNs.ControlsNs._ControlType
  
  @js.native
  sealed trait off
    extends xrmLib.XrmNs.UrlNs.NavBarDisplay
       with xrmLib.XrmEnumNs.NavBarDisplay
  
  @js.native
  sealed trait on
    extends xrmLib.XrmNs.UrlNs.NavBarDisplay
       with xrmLib.XrmEnumNs.NavBarDisplay
  
  @js.native
  sealed trait optionset
    extends xrmLib.XrmNs.AttributesNs.AttributeType
       with xrmLib.XrmEnumNs.AttributeType
       with xrmLib.XrmEnumNs.StandardControlType
       with xrmLib.XrmNs.ControlsNs._ControlType
  
  @js.native
  sealed trait phone
    extends xrmLib.XrmNs.AttributesNs.StringAttributeFormat
       with xrmLib.XrmEnumNs.StringAttributeFormat
  
  @js.native
  sealed trait quickform
    extends xrmLib.XrmEnumNs.StandardControlType
  
  @js.native
  sealed trait recommended
    extends xrmLib.XrmEnumNs.AttributeRequirementLevel
       with xrmLib.XrmNs.AttributesNs.RequirementLevel
  
  @js.native
  sealed trait required
    extends xrmLib.XrmEnumNs.AttributeRequirementLevel
       with xrmLib.XrmNs.AttributesNs.RequirementLevel
  
  @js.native
  sealed trait run
    extends xrmLib.XrmNs.UrlNs.ReportAction
       with xrmLib.XrmEnumNs.ReportAction
  
  @js.native
  sealed trait saveandclose
    extends xrmLib.XrmNs.EntitySaveMode
       with xrmLib.XrmEnumNs.EntitySaveMode
  
  @js.native
  sealed trait saveandnew
    extends xrmLib.XrmNs.EntitySaveMode
       with xrmLib.XrmEnumNs.EntitySaveMode
  
  @js.native
  sealed trait standard
    extends xrmLib.XrmEnumNs.StandardControlType
       with xrmLib.XrmNs.ControlsNs._ControlType
  
  @js.native
  sealed trait string
    extends xrmLib.XrmNs.AttributesNs.AttributeType
       with xrmLib.XrmEnumNs.AttributeType
  
  @js.native
  sealed trait subgrid
    extends xrmLib.XrmEnumNs.StandardControlType
       with xrmLib.XrmNs.ControlsNs._ControlType
  
  @js.native
  sealed trait text
    extends xrmLib.XrmNs.AttributesNs.StringAttributeFormat
       with xrmLib.XrmEnumNs.StringAttributeFormat
  
  @js.native
  sealed trait textarea
    extends xrmLib.XrmNs.AttributesNs.StringAttributeFormat
       with xrmLib.XrmEnumNs.StringAttributeFormat
  
  @js.native
  sealed trait tickersymbol
    extends xrmLib.XrmNs.AttributesNs.StringAttributeFormat
       with xrmLib.XrmEnumNs.StringAttributeFormat
  
  @js.native
  sealed trait timelinewall
    extends xrmLib.XrmEnumNs.StandardControlType
       with xrmLib.XrmNs.ControlsNs._ControlType
  
  @js.native
  sealed trait timercontrol
    extends xrmLib.XrmEnumNs.StandardControlType
       with xrmLib.XrmNs.ControlsNs._ControlType
  
  @js.native
  sealed trait timezone
    extends xrmLib.XrmNs.AttributesNs.OptionSetAttributeFormat
       with xrmLib.XrmEnumNs.OptionSetAttributeFormat
  
  @js.native
  sealed trait `true`
    extends xrmLib.XrmNs.UrlNs.CmdBarDisplay
       with xrmLib.XrmEnumNs.CmdBarDisplay
  
  @js.native
  sealed trait url
    extends xrmLib.XrmNs.AttributesNs.StringAttributeFormat
       with xrmLib.XrmEnumNs.StringAttributeFormat
  
  @js.native
  sealed trait video
    extends xrmLib.XrmEnumNs.DevicePickFileType
       with xrmLib.XrmNs.DeviceNs.PickFileTypes
  
  @js.native
  sealed trait webresource
    extends xrmLib.XrmEnumNs.StandardControlType
       with xrmLib.XrmNs.ControlsNs._ControlType
  
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

