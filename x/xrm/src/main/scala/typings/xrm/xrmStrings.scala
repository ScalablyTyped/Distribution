package typings.xrm

import typings.xrm.Xrm.Attributes.AttributeFormat
import typings.xrm.Xrm.Attributes.RequirementLevel
import typings.xrm.Xrm.Controls.NotificationLevel
import typings.xrm.Xrm.Controls._ControlType
import typings.xrm.Xrm.Device.PickFileTypes
import typings.xrm.XrmEnum.AdvancedConfigSettingOption
import typings.xrm.XrmEnum.AttributeRequirementLevel
import typings.xrm.XrmEnum.AttributeType
import typings.xrm.XrmEnum.Client
import typings.xrm.XrmEnum.ClientState
import typings.xrm.XrmEnum.CmdBarDisplay
import typings.xrm.XrmEnum.DateAttributeFormat
import typings.xrm.XrmEnum.DevicePickFileType
import typings.xrm.XrmEnum.DisplayState
import typings.xrm.XrmEnum.EntitySaveMode
import typings.xrm.XrmEnum.FormNotificationLevel
import typings.xrm.XrmEnum.IntegerAttributeFormat
import typings.xrm.XrmEnum.NavBarDisplay
import typings.xrm.XrmEnum.OptionSetAttributeFormat
import typings.xrm.XrmEnum.ProcessStatus
import typings.xrm.XrmEnum.ReportAction
import typings.xrm.XrmEnum.StageChangeDirection
import typings.xrm.XrmEnum.StageStatus
import typings.xrm.XrmEnum.StandardControlType
import typings.xrm.XrmEnum.StringAttributeFormat
import typings.xrm.XrmEnum.SubmitMode
import typings.xrm.XrmEnum.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object xrmStrings {
  @js.native
  sealed trait ERROR
    extends FormNotificationLevel
       with typings.xrm.Xrm.FormNotificationLevel
       with NotificationLevel
  
  @js.native
  sealed trait INFO
    extends FormNotificationLevel
       with typings.xrm.Xrm.FormNotificationLevel
  
  @js.native
  sealed trait MaxChildIncidentNumber extends AdvancedConfigSettingOption
  
  @js.native
  sealed trait MaxIncidentMergeNumber extends AdvancedConfigSettingOption
  
  @js.native
  sealed trait Mobile
    extends Client
       with typings.xrm.Xrm.Client
  
  @js.native
  sealed trait Next
    extends StageChangeDirection
       with typings.xrm.Xrm.ProcessFlow.StageChangeDirection
  
  @js.native
  sealed trait Office12Blue
    extends Theme
       with typings.xrm.Xrm.Theme
  
  @js.native
  sealed trait Office14Silver
    extends Theme
       with typings.xrm.Xrm.Theme
  
  @js.native
  sealed trait Offline
    extends ClientState
       with typings.xrm.Xrm.ClientState
  
  @js.native
  sealed trait Online
    extends ClientState
       with typings.xrm.Xrm.ClientState
  
  @js.native
  sealed trait Outlook
    extends Client
       with typings.xrm.Xrm.Client
  
  @js.native
  sealed trait Percentsign extends js.Object
  
  @js.native
  sealed trait Previous
    extends StageChangeDirection
       with typings.xrm.Xrm.ProcessFlow.StageChangeDirection
  
  @js.native
  sealed trait RECOMMENDATION extends NotificationLevel
  
  @js.native
  sealed trait UnifiedServiceDesk
    extends Client
       with typings.xrm.Xrm.Client
  
  @js.native
  sealed trait WARNING
    extends FormNotificationLevel
       with typings.xrm.Xrm.FormNotificationLevel
  
  @js.native
  sealed trait Web
    extends Client
       with typings.xrm.Xrm.Client
  
  @js.native
  sealed trait aborted
    extends ProcessStatus
       with typings.xrm.Xrm.ProcessFlow.ProcessStatus
  
  @js.native
  sealed trait active
    extends ProcessStatus
       with typings.xrm.Xrm.ProcessFlow.ProcessStatus
       with StageStatus
       with typings.xrm.Xrm.ProcessFlow.StageStatus
  
  @js.native
  sealed trait always
    extends SubmitMode
       with typings.xrm.Xrm.SubmitMode
  
  @js.native
  sealed trait audio
    extends DevicePickFileType
       with PickFileTypes
  
  @js.native
  sealed trait boolean
    extends AttributeType
       with typings.xrm.Xrm.Attributes.AttributeType
  
  @js.native
  sealed trait collapsed
    extends DisplayState
       with typings.xrm.Xrm.DisplayState
  
  @js.native
  sealed trait date
    extends AttributeFormat
       with DateAttributeFormat
       with typings.xrm.Xrm.Attributes.DateAttributeFormat
  
  @js.native
  sealed trait datetime
    extends AttributeFormat
       with AttributeType
       with typings.xrm.Xrm.Attributes.AttributeType
       with DateAttributeFormat
       with typings.xrm.Xrm.Attributes.DateAttributeFormat
  
  @js.native
  sealed trait decimal
    extends AttributeType
       with typings.xrm.Xrm.Attributes.AttributeType
  
  @js.native
  sealed trait default
    extends Theme
       with typings.xrm.Xrm.Theme
  
  @js.native
  sealed trait dirty
    extends SubmitMode
       with typings.xrm.Xrm.SubmitMode
  
  @js.native
  sealed trait double
    extends AttributeType
       with typings.xrm.Xrm.Attributes.AttributeType
  
  @js.native
  sealed trait duration
    extends AttributeFormat
       with IntegerAttributeFormat
       with typings.xrm.Xrm.Attributes.IntegerAttributeFormat
  
  @js.native
  sealed trait email
    extends AttributeFormat
       with StringAttributeFormat
       with typings.xrm.Xrm.Attributes.StringAttributeFormat
  
  @js.native
  sealed trait entity
    extends NavBarDisplay
       with typings.xrm.Xrm.Url.NavBarDisplay
  
  @js.native
  sealed trait entitylist extends js.Object
  
  @js.native
  sealed trait expanded
    extends DisplayState
       with typings.xrm.Xrm.DisplayState
  
  @js.native
  sealed trait `false`
    extends CmdBarDisplay
       with typings.xrm.Xrm.Url.CmdBarDisplay
  
  @js.native
  sealed trait filter
    extends ReportAction
       with typings.xrm.Xrm.Url.ReportAction
  
  @js.native
  sealed trait finished
    extends ProcessStatus
       with typings.xrm.Xrm.ProcessFlow.ProcessStatus
  
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
       with typings.xrm.Xrm.ProcessFlow.StageStatus
  
  @js.native
  sealed trait integer
    extends AttributeType
       with typings.xrm.Xrm.Attributes.AttributeType
  
  @js.native
  sealed trait kbsearch
    extends StandardControlType
       with _ControlType
  
  @js.native
  sealed trait language
    extends AttributeFormat
       with OptionSetAttributeFormat
       with typings.xrm.Xrm.Attributes.OptionSetAttributeFormat
  
  @js.native
  sealed trait lookup
    extends AttributeType
       with typings.xrm.Xrm.Attributes.AttributeType
       with StandardControlType
       with _ControlType
  
  @js.native
  sealed trait memo
    extends AttributeType
       with typings.xrm.Xrm.Attributes.AttributeType
  
  @js.native
  sealed trait money
    extends AttributeType
       with typings.xrm.Xrm.Attributes.AttributeType
  
  @js.native
  sealed trait multioptionset
    extends AttributeType
       with typings.xrm.Xrm.Attributes.AttributeType
  
  @js.native
  sealed trait multiselectoptionset extends StandardControlType
  
  @js.native
  sealed trait never
    extends SubmitMode
       with typings.xrm.Xrm.SubmitMode
  
  @js.native
  sealed trait none
    extends AttributeFormat
       with AttributeRequirementLevel
       with IntegerAttributeFormat
       with typings.xrm.Xrm.Attributes.IntegerAttributeFormat
       with RequirementLevel
  
  @js.native
  sealed trait notes
    extends StandardControlType
       with _ControlType
  
  @js.native
  sealed trait off
    extends NavBarDisplay
       with typings.xrm.Xrm.Url.NavBarDisplay
  
  @js.native
  sealed trait on
    extends NavBarDisplay
       with typings.xrm.Xrm.Url.NavBarDisplay
  
  @js.native
  sealed trait optionset
    extends AttributeType
       with typings.xrm.Xrm.Attributes.AttributeType
       with StandardControlType
       with _ControlType
  
  @js.native
  sealed trait phone
    extends AttributeFormat
       with StringAttributeFormat
       with typings.xrm.Xrm.Attributes.StringAttributeFormat
  
  @js.native
  sealed trait px extends js.Object
  
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
       with typings.xrm.Xrm.Url.ReportAction
  
  @js.native
  sealed trait saveandclose
    extends EntitySaveMode
       with typings.xrm.Xrm.EntitySaveMode
  
  @js.native
  sealed trait saveandnew
    extends EntitySaveMode
       with typings.xrm.Xrm.EntitySaveMode
  
  @js.native
  sealed trait savedquery extends js.Object
  
  @js.native
  sealed trait standard
    extends StandardControlType
       with _ControlType
  
  @js.native
  sealed trait string
    extends AttributeType
       with typings.xrm.Xrm.Attributes.AttributeType
  
  @js.native
  sealed trait subgrid
    extends StandardControlType
       with _ControlType
  
  @js.native
  sealed trait text
    extends AttributeFormat
       with StringAttributeFormat
       with typings.xrm.Xrm.Attributes.StringAttributeFormat
  
  @js.native
  sealed trait textarea
    extends AttributeFormat
       with StringAttributeFormat
       with typings.xrm.Xrm.Attributes.StringAttributeFormat
  
  @js.native
  sealed trait tickersymbol
    extends AttributeFormat
       with StringAttributeFormat
       with typings.xrm.Xrm.Attributes.StringAttributeFormat
  
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
    extends AttributeFormat
       with OptionSetAttributeFormat
       with typings.xrm.Xrm.Attributes.OptionSetAttributeFormat
  
  @js.native
  sealed trait `true`
    extends CmdBarDisplay
       with typings.xrm.Xrm.Url.CmdBarDisplay
  
  @js.native
  sealed trait url
    extends AttributeFormat
       with StringAttributeFormat
       with typings.xrm.Xrm.Attributes.StringAttributeFormat
  
  @js.native
  sealed trait userquery extends js.Object
  
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
  def Percentsign: Percentsign = "%".asInstanceOf[Percentsign]
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
  def entitylist: entitylist = "entitylist".asInstanceOf[entitylist]
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
  def px: px = "px".asInstanceOf[px]
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
  def savedquery: savedquery = "savedquery".asInstanceOf[savedquery]
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
  def userquery: userquery = "userquery".asInstanceOf[userquery]
  @scala.inline
  def video: video = "video".asInstanceOf[video]
  @scala.inline
  def webresource: webresource = "webresource".asInstanceOf[webresource]
}

