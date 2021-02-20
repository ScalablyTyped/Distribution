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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xrmStrings {
  
  @js.native
  sealed trait default
    extends Theme
       with typings.xrm.Xrm.Theme
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait ERROR
    extends FormNotificationLevel
       with typings.xrm.Xrm.FormNotificationLevel
       with NotificationLevel
  @scala.inline
  def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @js.native
  sealed trait INFO
    extends FormNotificationLevel
       with typings.xrm.Xrm.FormNotificationLevel
  @scala.inline
  def INFO: INFO = "INFO".asInstanceOf[INFO]
  
  @js.native
  sealed trait MaxChildIncidentNumber extends AdvancedConfigSettingOption
  @scala.inline
  def MaxChildIncidentNumber: MaxChildIncidentNumber = "MaxChildIncidentNumber".asInstanceOf[MaxChildIncidentNumber]
  
  @js.native
  sealed trait MaxIncidentMergeNumber extends AdvancedConfigSettingOption
  @scala.inline
  def MaxIncidentMergeNumber: MaxIncidentMergeNumber = "MaxIncidentMergeNumber".asInstanceOf[MaxIncidentMergeNumber]
  
  @js.native
  sealed trait Mobile
    extends Client
       with typings.xrm.Xrm.Client
  @scala.inline
  def Mobile: Mobile = "Mobile".asInstanceOf[Mobile]
  
  @js.native
  sealed trait Next
    extends StageChangeDirection
       with typings.xrm.Xrm.ProcessFlow.StageChangeDirection
  @scala.inline
  def Next: Next = "Next".asInstanceOf[Next]
  
  @js.native
  sealed trait Office12Blue
    extends Theme
       with typings.xrm.Xrm.Theme
  @scala.inline
  def Office12Blue: Office12Blue = "Office12Blue".asInstanceOf[Office12Blue]
  
  @js.native
  sealed trait Office14Silver
    extends Theme
       with typings.xrm.Xrm.Theme
  @scala.inline
  def Office14Silver: Office14Silver = "Office14Silver".asInstanceOf[Office14Silver]
  
  @js.native
  sealed trait Offline
    extends ClientState
       with typings.xrm.Xrm.ClientState
  @scala.inline
  def Offline: Offline = "Offline".asInstanceOf[Offline]
  
  @js.native
  sealed trait Online
    extends ClientState
       with typings.xrm.Xrm.ClientState
  @scala.inline
  def Online: Online = "Online".asInstanceOf[Online]
  
  @js.native
  sealed trait Outlook
    extends Client
       with typings.xrm.Xrm.Client
  @scala.inline
  def Outlook: Outlook = "Outlook".asInstanceOf[Outlook]
  
  @js.native
  sealed trait Percentsign extends StObject
  @scala.inline
  def Percentsign: Percentsign = "%".asInstanceOf[Percentsign]
  
  @js.native
  sealed trait Previous
    extends StageChangeDirection
       with typings.xrm.Xrm.ProcessFlow.StageChangeDirection
  @scala.inline
  def Previous: Previous = "Previous".asInstanceOf[Previous]
  
  @js.native
  sealed trait RECOMMENDATION extends NotificationLevel
  @scala.inline
  def RECOMMENDATION: RECOMMENDATION = "RECOMMENDATION".asInstanceOf[RECOMMENDATION]
  
  @js.native
  sealed trait UnifiedServiceDesk
    extends Client
       with typings.xrm.Xrm.Client
  @scala.inline
  def UnifiedServiceDesk: UnifiedServiceDesk = "UnifiedServiceDesk".asInstanceOf[UnifiedServiceDesk]
  
  @js.native
  sealed trait WARNING
    extends FormNotificationLevel
       with typings.xrm.Xrm.FormNotificationLevel
  @scala.inline
  def WARNING: WARNING = "WARNING".asInstanceOf[WARNING]
  
  @js.native
  sealed trait Web
    extends Client
       with typings.xrm.Xrm.Client
  @scala.inline
  def Web: Web = "Web".asInstanceOf[Web]
  
  @js.native
  sealed trait aborted
    extends ProcessStatus
       with typings.xrm.Xrm.ProcessFlow.ProcessStatus
  @scala.inline
  def aborted: aborted = "aborted".asInstanceOf[aborted]
  
  @js.native
  sealed trait active
    extends ProcessStatus
       with typings.xrm.Xrm.ProcessFlow.ProcessStatus
       with StageStatus
       with typings.xrm.Xrm.ProcessFlow.StageStatus
  @scala.inline
  def active: active = "active".asInstanceOf[active]
  
  @js.native
  sealed trait always
    extends SubmitMode
       with typings.xrm.Xrm.SubmitMode
  @scala.inline
  def always: always = "always".asInstanceOf[always]
  
  @js.native
  sealed trait audio
    extends DevicePickFileType
       with PickFileTypes
  @scala.inline
  def audio: audio = "audio".asInstanceOf[audio]
  
  @js.native
  sealed trait boolean
    extends AttributeType
       with typings.xrm.Xrm.Attributes.AttributeType
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  
  @js.native
  sealed trait collapsed
    extends DisplayState
       with typings.xrm.Xrm.DisplayState
  @scala.inline
  def collapsed: collapsed = "collapsed".asInstanceOf[collapsed]
  
  @js.native
  sealed trait date
    extends AttributeFormat
       with DateAttributeFormat
       with typings.xrm.Xrm.Attributes.DateAttributeFormat
  @scala.inline
  def date: date = "date".asInstanceOf[date]
  
  @js.native
  sealed trait datetime
    extends AttributeFormat
       with AttributeType
       with typings.xrm.Xrm.Attributes.AttributeType
       with DateAttributeFormat
       with typings.xrm.Xrm.Attributes.DateAttributeFormat
  @scala.inline
  def datetime: datetime = "datetime".asInstanceOf[datetime]
  
  @js.native
  sealed trait decimal
    extends AttributeType
       with typings.xrm.Xrm.Attributes.AttributeType
  @scala.inline
  def decimal: decimal = "decimal".asInstanceOf[decimal]
  
  @js.native
  sealed trait dirty
    extends SubmitMode
       with typings.xrm.Xrm.SubmitMode
  @scala.inline
  def dirty: dirty = "dirty".asInstanceOf[dirty]
  
  @js.native
  sealed trait double
    extends AttributeType
       with typings.xrm.Xrm.Attributes.AttributeType
  @scala.inline
  def double: double = "double".asInstanceOf[double]
  
  @js.native
  sealed trait duration
    extends AttributeFormat
       with IntegerAttributeFormat
       with typings.xrm.Xrm.Attributes.IntegerAttributeFormat
  @scala.inline
  def duration: duration = "duration".asInstanceOf[duration]
  
  @js.native
  sealed trait email
    extends AttributeFormat
       with StringAttributeFormat
       with typings.xrm.Xrm.Attributes.StringAttributeFormat
  @scala.inline
  def email: email = "email".asInstanceOf[email]
  
  @js.native
  sealed trait entity
    extends NavBarDisplay
       with typings.xrm.Xrm.Url.NavBarDisplay
  @scala.inline
  def entity: entity = "entity".asInstanceOf[entity]
  
  @js.native
  sealed trait entitylist extends StObject
  @scala.inline
  def entitylist: entitylist = "entitylist".asInstanceOf[entitylist]
  
  @js.native
  sealed trait entityrecord extends StObject
  @scala.inline
  def entityrecord: entityrecord = "entityrecord".asInstanceOf[entityrecord]
  
  @js.native
  sealed trait expanded
    extends DisplayState
       with typings.xrm.Xrm.DisplayState
  @scala.inline
  def expanded: expanded = "expanded".asInstanceOf[expanded]
  
  @js.native
  sealed trait `false`
    extends CmdBarDisplay
       with typings.xrm.Xrm.Url.CmdBarDisplay
  @scala.inline
  def `false`: `false` = "false".asInstanceOf[`false`]
  
  @js.native
  sealed trait filter
    extends ReportAction
       with typings.xrm.Xrm.Url.ReportAction
  @scala.inline
  def filter: filter = "filter".asInstanceOf[filter]
  
  @js.native
  sealed trait finished
    extends ProcessStatus
       with typings.xrm.Xrm.ProcessFlow.ProcessStatus
  @scala.inline
  def finished: finished = "finished".asInstanceOf[finished]
  
  @js.native
  sealed trait iframe
    extends StandardControlType
       with _ControlType
  @scala.inline
  def iframe: iframe = "iframe".asInstanceOf[iframe]
  
  @js.native
  sealed trait image
    extends DevicePickFileType
       with PickFileTypes
  @scala.inline
  def image: image = "image".asInstanceOf[image]
  
  @js.native
  sealed trait inactive
    extends StageStatus
       with typings.xrm.Xrm.ProcessFlow.StageStatus
  @scala.inline
  def inactive: inactive = "inactive".asInstanceOf[inactive]
  
  @js.native
  sealed trait integer
    extends AttributeType
       with typings.xrm.Xrm.Attributes.AttributeType
  @scala.inline
  def integer: integer = "integer".asInstanceOf[integer]
  
  @js.native
  sealed trait kbsearch
    extends StandardControlType
       with _ControlType
  @scala.inline
  def kbsearch: kbsearch = "kbsearch".asInstanceOf[kbsearch]
  
  @js.native
  sealed trait language
    extends AttributeFormat
       with OptionSetAttributeFormat
       with typings.xrm.Xrm.Attributes.OptionSetAttributeFormat
  @scala.inline
  def language: language = "language".asInstanceOf[language]
  
  @js.native
  sealed trait lookup
    extends AttributeType
       with typings.xrm.Xrm.Attributes.AttributeType
       with StandardControlType
       with _ControlType
  @scala.inline
  def lookup: lookup = "lookup".asInstanceOf[lookup]
  
  @js.native
  sealed trait memo
    extends AttributeType
       with typings.xrm.Xrm.Attributes.AttributeType
  @scala.inline
  def memo: memo = "memo".asInstanceOf[memo]
  
  @js.native
  sealed trait money
    extends AttributeType
       with typings.xrm.Xrm.Attributes.AttributeType
  @scala.inline
  def money: money = "money".asInstanceOf[money]
  
  @js.native
  sealed trait multioptionset extends AttributeType
  @scala.inline
  def multioptionset: multioptionset = "multioptionset".asInstanceOf[multioptionset]
  
  @js.native
  sealed trait multiselectoptionset
    extends typings.xrm.Xrm.Attributes.AttributeType
       with StandardControlType
  @scala.inline
  def multiselectoptionset: multiselectoptionset = "multiselectoptionset".asInstanceOf[multiselectoptionset]
  
  @js.native
  sealed trait never
    extends SubmitMode
       with typings.xrm.Xrm.SubmitMode
  @scala.inline
  def never: never = "never".asInstanceOf[never]
  
  @js.native
  sealed trait none
    extends AttributeFormat
       with AttributeRequirementLevel
       with IntegerAttributeFormat
       with typings.xrm.Xrm.Attributes.IntegerAttributeFormat
       with RequirementLevel
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait notes
    extends StandardControlType
       with _ControlType
  @scala.inline
  def notes: notes = "notes".asInstanceOf[notes]
  
  @js.native
  sealed trait off
    extends NavBarDisplay
       with typings.xrm.Xrm.Url.NavBarDisplay
  @scala.inline
  def off: off = "off".asInstanceOf[off]
  
  @js.native
  sealed trait on
    extends NavBarDisplay
       with typings.xrm.Xrm.Url.NavBarDisplay
  @scala.inline
  def on: on = "on".asInstanceOf[on]
  
  @js.native
  sealed trait optionset
    extends AttributeType
       with typings.xrm.Xrm.Attributes.AttributeType
       with StandardControlType
       with _ControlType
  @scala.inline
  def optionset: optionset = "optionset".asInstanceOf[optionset]
  
  @js.native
  sealed trait phone
    extends AttributeFormat
       with StringAttributeFormat
       with typings.xrm.Xrm.Attributes.StringAttributeFormat
  @scala.inline
  def phone: phone = "phone".asInstanceOf[phone]
  
  @js.native
  sealed trait px extends StObject
  @scala.inline
  def px: px = "px".asInstanceOf[px]
  
  @js.native
  sealed trait quickform extends StandardControlType
  @scala.inline
  def quickform: quickform = "quickform".asInstanceOf[quickform]
  
  @js.native
  sealed trait recommended
    extends AttributeRequirementLevel
       with RequirementLevel
  @scala.inline
  def recommended: recommended = "recommended".asInstanceOf[recommended]
  
  @js.native
  sealed trait required
    extends AttributeRequirementLevel
       with RequirementLevel
  @scala.inline
  def required: required = "required".asInstanceOf[required]
  
  @js.native
  sealed trait run
    extends ReportAction
       with typings.xrm.Xrm.Url.ReportAction
  @scala.inline
  def run: run = "run".asInstanceOf[run]
  
  @js.native
  sealed trait saveandclose
    extends EntitySaveMode
       with typings.xrm.Xrm.EntitySaveMode
  @scala.inline
  def saveandclose: saveandclose = "saveandclose".asInstanceOf[saveandclose]
  
  @js.native
  sealed trait saveandnew
    extends EntitySaveMode
       with typings.xrm.Xrm.EntitySaveMode
  @scala.inline
  def saveandnew: saveandnew = "saveandnew".asInstanceOf[saveandnew]
  
  @js.native
  sealed trait savedquery extends StObject
  @scala.inline
  def savedquery: savedquery = "savedquery".asInstanceOf[savedquery]
  
  @js.native
  sealed trait standard
    extends StandardControlType
       with _ControlType
  @scala.inline
  def standard: standard = "standard".asInstanceOf[standard]
  
  @js.native
  sealed trait string
    extends AttributeType
       with typings.xrm.Xrm.Attributes.AttributeType
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait subgrid
    extends StandardControlType
       with _ControlType
  @scala.inline
  def subgrid: subgrid = "subgrid".asInstanceOf[subgrid]
  
  @js.native
  sealed trait text
    extends AttributeFormat
       with StringAttributeFormat
       with typings.xrm.Xrm.Attributes.StringAttributeFormat
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait textarea
    extends AttributeFormat
       with StringAttributeFormat
       with typings.xrm.Xrm.Attributes.StringAttributeFormat
  @scala.inline
  def textarea: textarea = "textarea".asInstanceOf[textarea]
  
  @js.native
  sealed trait tickersymbol
    extends AttributeFormat
       with StringAttributeFormat
       with typings.xrm.Xrm.Attributes.StringAttributeFormat
  @scala.inline
  def tickersymbol: tickersymbol = "tickersymbol".asInstanceOf[tickersymbol]
  
  @js.native
  sealed trait timelinewall
    extends StandardControlType
       with _ControlType
  @scala.inline
  def timelinewall: timelinewall = "timelinewall".asInstanceOf[timelinewall]
  
  @js.native
  sealed trait timercontrol
    extends StandardControlType
       with _ControlType
  @scala.inline
  def timercontrol: timercontrol = "timercontrol".asInstanceOf[timercontrol]
  
  @js.native
  sealed trait timezone
    extends AttributeFormat
       with OptionSetAttributeFormat
       with typings.xrm.Xrm.Attributes.OptionSetAttributeFormat
  @scala.inline
  def timezone: timezone = "timezone".asInstanceOf[timezone]
  
  @js.native
  sealed trait `true`
    extends CmdBarDisplay
       with typings.xrm.Xrm.Url.CmdBarDisplay
  @scala.inline
  def `true`: `true` = "true".asInstanceOf[`true`]
  
  @js.native
  sealed trait url
    extends AttributeFormat
       with StringAttributeFormat
       with typings.xrm.Xrm.Attributes.StringAttributeFormat
  @scala.inline
  def url: url = "url".asInstanceOf[url]
  
  @js.native
  sealed trait userquery extends StObject
  @scala.inline
  def userquery: userquery = "userquery".asInstanceOf[userquery]
  
  @js.native
  sealed trait video
    extends DevicePickFileType
       with PickFileTypes
  @scala.inline
  def video: video = "video".asInstanceOf[video]
  
  @js.native
  sealed trait webresource
    extends StandardControlType
       with _ControlType
  @scala.inline
  def webresource: webresource = "webresource".asInstanceOf[webresource]
}
