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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xrmStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with Theme
       with typings.xrm.Xrm.Theme
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait ERROR
    extends StObject
       with FormNotificationLevel
       with typings.xrm.Xrm.FormNotificationLevel
       with NotificationLevel
  inline def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @js.native
  sealed trait INFO
    extends StObject
       with FormNotificationLevel
       with typings.xrm.Xrm.FormNotificationLevel
  inline def INFO: INFO = "INFO".asInstanceOf[INFO]
  
  @js.native
  sealed trait MaxChildIncidentNumber
    extends StObject
       with AdvancedConfigSettingOption
  inline def MaxChildIncidentNumber: MaxChildIncidentNumber = "MaxChildIncidentNumber".asInstanceOf[MaxChildIncidentNumber]
  
  @js.native
  sealed trait MaxIncidentMergeNumber
    extends StObject
       with AdvancedConfigSettingOption
  inline def MaxIncidentMergeNumber: MaxIncidentMergeNumber = "MaxIncidentMergeNumber".asInstanceOf[MaxIncidentMergeNumber]
  
  @js.native
  sealed trait Mobile
    extends StObject
       with Client
       with typings.xrm.Xrm.Client
  inline def Mobile: Mobile = "Mobile".asInstanceOf[Mobile]
  
  @js.native
  sealed trait Next
    extends StObject
       with StageChangeDirection
       with typings.xrm.Xrm.ProcessFlow.StageChangeDirection
  inline def Next: Next = "Next".asInstanceOf[Next]
  
  @js.native
  sealed trait Office12Blue
    extends StObject
       with Theme
       with typings.xrm.Xrm.Theme
  inline def Office12Blue: Office12Blue = "Office12Blue".asInstanceOf[Office12Blue]
  
  @js.native
  sealed trait Office14Silver
    extends StObject
       with Theme
       with typings.xrm.Xrm.Theme
  inline def Office14Silver: Office14Silver = "Office14Silver".asInstanceOf[Office14Silver]
  
  @js.native
  sealed trait Offline
    extends StObject
       with ClientState
       with typings.xrm.Xrm.ClientState
  inline def Offline: Offline = "Offline".asInstanceOf[Offline]
  
  @js.native
  sealed trait Online
    extends StObject
       with ClientState
       with typings.xrm.Xrm.ClientState
  inline def Online: Online = "Online".asInstanceOf[Online]
  
  @js.native
  sealed trait Outlook
    extends StObject
       with Client
       with typings.xrm.Xrm.Client
  inline def Outlook: Outlook = "Outlook".asInstanceOf[Outlook]
  
  @js.native
  sealed trait Percentsign extends StObject
  inline def Percentsign: Percentsign = "%".asInstanceOf[Percentsign]
  
  @js.native
  sealed trait Previous
    extends StObject
       with StageChangeDirection
       with typings.xrm.Xrm.ProcessFlow.StageChangeDirection
  inline def Previous: Previous = "Previous".asInstanceOf[Previous]
  
  @js.native
  sealed trait RECOMMENDATION
    extends StObject
       with NotificationLevel
  inline def RECOMMENDATION: RECOMMENDATION = "RECOMMENDATION".asInstanceOf[RECOMMENDATION]
  
  @js.native
  sealed trait UnifiedServiceDesk
    extends StObject
       with Client
       with typings.xrm.Xrm.Client
  inline def UnifiedServiceDesk: UnifiedServiceDesk = "UnifiedServiceDesk".asInstanceOf[UnifiedServiceDesk]
  
  @js.native
  sealed trait WARNING
    extends StObject
       with FormNotificationLevel
       with typings.xrm.Xrm.FormNotificationLevel
  inline def WARNING: WARNING = "WARNING".asInstanceOf[WARNING]
  
  @js.native
  sealed trait Web
    extends StObject
       with Client
       with typings.xrm.Xrm.Client
  inline def Web: Web = "Web".asInstanceOf[Web]
  
  @js.native
  sealed trait aborted
    extends StObject
       with ProcessStatus
       with typings.xrm.Xrm.ProcessFlow.ProcessStatus
  inline def aborted: aborted = "aborted".asInstanceOf[aborted]
  
  @js.native
  sealed trait active
    extends StObject
       with ProcessStatus
       with typings.xrm.Xrm.ProcessFlow.ProcessStatus
       with StageStatus
       with typings.xrm.Xrm.ProcessFlow.StageStatus
  inline def active: active = "active".asInstanceOf[active]
  
  @js.native
  sealed trait always
    extends StObject
       with SubmitMode
       with typings.xrm.Xrm.SubmitMode
  inline def always: always = "always".asInstanceOf[always]
  
  @js.native
  sealed trait audio
    extends StObject
       with DevicePickFileType
       with PickFileTypes
  inline def audio: audio = "audio".asInstanceOf[audio]
  
  @js.native
  sealed trait boolean
    extends StObject
       with AttributeType
       with typings.xrm.Xrm.Attributes.AttributeType
  inline def boolean: boolean = "boolean".asInstanceOf[boolean]
  
  @js.native
  sealed trait collapsed
    extends StObject
       with DisplayState
       with typings.xrm.Xrm.DisplayState
  inline def collapsed: collapsed = "collapsed".asInstanceOf[collapsed]
  
  @js.native
  sealed trait date
    extends StObject
       with AttributeFormat
       with DateAttributeFormat
       with typings.xrm.Xrm.Attributes.DateAttributeFormat
  inline def date: date = "date".asInstanceOf[date]
  
  @js.native
  sealed trait datetime
    extends StObject
       with AttributeFormat
       with AttributeType
       with typings.xrm.Xrm.Attributes.AttributeType
       with DateAttributeFormat
       with typings.xrm.Xrm.Attributes.DateAttributeFormat
  inline def datetime: datetime = "datetime".asInstanceOf[datetime]
  
  @js.native
  sealed trait decimal
    extends StObject
       with AttributeType
       with typings.xrm.Xrm.Attributes.AttributeType
  inline def decimal: decimal = "decimal".asInstanceOf[decimal]
  
  @js.native
  sealed trait dirty
    extends StObject
       with SubmitMode
       with typings.xrm.Xrm.SubmitMode
  inline def dirty: dirty = "dirty".asInstanceOf[dirty]
  
  @js.native
  sealed trait double
    extends StObject
       with AttributeType
       with typings.xrm.Xrm.Attributes.AttributeType
  inline def double: double = "double".asInstanceOf[double]
  
  @js.native
  sealed trait duration
    extends StObject
       with AttributeFormat
       with IntegerAttributeFormat
       with typings.xrm.Xrm.Attributes.IntegerAttributeFormat
  inline def duration: duration = "duration".asInstanceOf[duration]
  
  @js.native
  sealed trait email
    extends StObject
       with AttributeFormat
       with StringAttributeFormat
       with typings.xrm.Xrm.Attributes.StringAttributeFormat
  inline def email: email = "email".asInstanceOf[email]
  
  @js.native
  sealed trait entity
    extends StObject
       with NavBarDisplay
       with typings.xrm.Xrm.Url.NavBarDisplay
  inline def entity: entity = "entity".asInstanceOf[entity]
  
  @js.native
  sealed trait entitylist extends StObject
  inline def entitylist: entitylist = "entitylist".asInstanceOf[entitylist]
  
  @js.native
  sealed trait entityrecord extends StObject
  inline def entityrecord: entityrecord = "entityrecord".asInstanceOf[entityrecord]
  
  @js.native
  sealed trait expanded
    extends StObject
       with DisplayState
       with typings.xrm.Xrm.DisplayState
  inline def expanded: expanded = "expanded".asInstanceOf[expanded]
  
  @js.native
  sealed trait `false`
    extends StObject
       with CmdBarDisplay
       with typings.xrm.Xrm.Url.CmdBarDisplay
  inline def `false`: `false` = "false".asInstanceOf[`false`]
  
  @js.native
  sealed trait filter
    extends StObject
       with ReportAction
       with typings.xrm.Xrm.Url.ReportAction
  inline def filter: filter = "filter".asInstanceOf[filter]
  
  @js.native
  sealed trait finished
    extends StObject
       with ProcessStatus
       with typings.xrm.Xrm.ProcessFlow.ProcessStatus
  inline def finished: finished = "finished".asInstanceOf[finished]
  
  @js.native
  sealed trait iframe
    extends StObject
       with StandardControlType
       with _ControlType
  inline def iframe: iframe = "iframe".asInstanceOf[iframe]
  
  @js.native
  sealed trait image
    extends StObject
       with DevicePickFileType
       with PickFileTypes
  inline def image: image = "image".asInstanceOf[image]
  
  @js.native
  sealed trait inactive
    extends StObject
       with StageStatus
       with typings.xrm.Xrm.ProcessFlow.StageStatus
  inline def inactive: inactive = "inactive".asInstanceOf[inactive]
  
  @js.native
  sealed trait integer
    extends StObject
       with AttributeType
       with typings.xrm.Xrm.Attributes.AttributeType
  inline def integer: integer = "integer".asInstanceOf[integer]
  
  @js.native
  sealed trait kbsearch
    extends StObject
       with StandardControlType
       with _ControlType
  inline def kbsearch: kbsearch = "kbsearch".asInstanceOf[kbsearch]
  
  @js.native
  sealed trait language
    extends StObject
       with AttributeFormat
       with OptionSetAttributeFormat
       with typings.xrm.Xrm.Attributes.OptionSetAttributeFormat
  inline def language: language = "language".asInstanceOf[language]
  
  @js.native
  sealed trait lookup
    extends StObject
       with AttributeType
       with typings.xrm.Xrm.Attributes.AttributeType
       with StandardControlType
       with _ControlType
  inline def lookup: lookup = "lookup".asInstanceOf[lookup]
  
  @js.native
  sealed trait memo
    extends StObject
       with AttributeType
       with typings.xrm.Xrm.Attributes.AttributeType
  inline def memo: memo = "memo".asInstanceOf[memo]
  
  @js.native
  sealed trait money
    extends StObject
       with AttributeType
       with typings.xrm.Xrm.Attributes.AttributeType
  inline def money: money = "money".asInstanceOf[money]
  
  @js.native
  sealed trait multioptionset
    extends StObject
       with AttributeType
  inline def multioptionset: multioptionset = "multioptionset".asInstanceOf[multioptionset]
  
  @js.native
  sealed trait multiselectoptionset
    extends StObject
       with typings.xrm.Xrm.Attributes.AttributeType
       with StandardControlType
  inline def multiselectoptionset: multiselectoptionset = "multiselectoptionset".asInstanceOf[multiselectoptionset]
  
  @js.native
  sealed trait never
    extends StObject
       with SubmitMode
       with typings.xrm.Xrm.SubmitMode
  inline def never: never = "never".asInstanceOf[never]
  
  @js.native
  sealed trait none
    extends StObject
       with AttributeFormat
       with AttributeRequirementLevel
       with IntegerAttributeFormat
       with typings.xrm.Xrm.Attributes.IntegerAttributeFormat
       with RequirementLevel
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait notes
    extends StObject
       with StandardControlType
       with _ControlType
  inline def notes: notes = "notes".asInstanceOf[notes]
  
  @js.native
  sealed trait off
    extends StObject
       with NavBarDisplay
       with typings.xrm.Xrm.Url.NavBarDisplay
  inline def off: off = "off".asInstanceOf[off]
  
  @js.native
  sealed trait on
    extends StObject
       with NavBarDisplay
       with typings.xrm.Xrm.Url.NavBarDisplay
  inline def on: on = "on".asInstanceOf[on]
  
  @js.native
  sealed trait optionset
    extends StObject
       with AttributeType
       with typings.xrm.Xrm.Attributes.AttributeType
       with StandardControlType
       with _ControlType
  inline def optionset: optionset = "optionset".asInstanceOf[optionset]
  
  @js.native
  sealed trait phone
    extends StObject
       with AttributeFormat
       with StringAttributeFormat
       with typings.xrm.Xrm.Attributes.StringAttributeFormat
  inline def phone: phone = "phone".asInstanceOf[phone]
  
  @js.native
  sealed trait px extends StObject
  inline def px: px = "px".asInstanceOf[px]
  
  @js.native
  sealed trait quickform
    extends StObject
       with StandardControlType
  inline def quickform: quickform = "quickform".asInstanceOf[quickform]
  
  @js.native
  sealed trait recommended
    extends StObject
       with AttributeRequirementLevel
       with RequirementLevel
  inline def recommended: recommended = "recommended".asInstanceOf[recommended]
  
  @js.native
  sealed trait required
    extends StObject
       with AttributeRequirementLevel
       with RequirementLevel
  inline def required: required = "required".asInstanceOf[required]
  
  @js.native
  sealed trait run
    extends StObject
       with ReportAction
       with typings.xrm.Xrm.Url.ReportAction
  inline def run: run = "run".asInstanceOf[run]
  
  @js.native
  sealed trait saveandclose
    extends StObject
       with EntitySaveMode
       with typings.xrm.Xrm.EntitySaveMode
  inline def saveandclose: saveandclose = "saveandclose".asInstanceOf[saveandclose]
  
  @js.native
  sealed trait saveandnew
    extends StObject
       with EntitySaveMode
       with typings.xrm.Xrm.EntitySaveMode
  inline def saveandnew: saveandnew = "saveandnew".asInstanceOf[saveandnew]
  
  @js.native
  sealed trait savedquery extends StObject
  inline def savedquery: savedquery = "savedquery".asInstanceOf[savedquery]
  
  @js.native
  sealed trait standard
    extends StObject
       with StandardControlType
       with _ControlType
  inline def standard: standard = "standard".asInstanceOf[standard]
  
  @js.native
  sealed trait string
    extends StObject
       with AttributeType
       with typings.xrm.Xrm.Attributes.AttributeType
  inline def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait subgrid
    extends StObject
       with StandardControlType
       with _ControlType
  inline def subgrid: subgrid = "subgrid".asInstanceOf[subgrid]
  
  @js.native
  sealed trait text
    extends StObject
       with AttributeFormat
       with StringAttributeFormat
       with typings.xrm.Xrm.Attributes.StringAttributeFormat
  inline def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait textarea
    extends StObject
       with AttributeFormat
       with StringAttributeFormat
       with typings.xrm.Xrm.Attributes.StringAttributeFormat
  inline def textarea: textarea = "textarea".asInstanceOf[textarea]
  
  @js.native
  sealed trait tickersymbol
    extends StObject
       with AttributeFormat
       with StringAttributeFormat
       with typings.xrm.Xrm.Attributes.StringAttributeFormat
  inline def tickersymbol: tickersymbol = "tickersymbol".asInstanceOf[tickersymbol]
  
  @js.native
  sealed trait timelinewall
    extends StObject
       with StandardControlType
       with _ControlType
  inline def timelinewall: timelinewall = "timelinewall".asInstanceOf[timelinewall]
  
  @js.native
  sealed trait timercontrol
    extends StObject
       with StandardControlType
       with _ControlType
  inline def timercontrol: timercontrol = "timercontrol".asInstanceOf[timercontrol]
  
  @js.native
  sealed trait timezone
    extends StObject
       with AttributeFormat
       with OptionSetAttributeFormat
       with typings.xrm.Xrm.Attributes.OptionSetAttributeFormat
  inline def timezone: timezone = "timezone".asInstanceOf[timezone]
  
  @js.native
  sealed trait `true`
    extends StObject
       with CmdBarDisplay
       with typings.xrm.Xrm.Url.CmdBarDisplay
  inline def `true`: `true` = "true".asInstanceOf[`true`]
  
  @js.native
  sealed trait url
    extends StObject
       with AttributeFormat
       with StringAttributeFormat
       with typings.xrm.Xrm.Attributes.StringAttributeFormat
  inline def url: url = "url".asInstanceOf[url]
  
  @js.native
  sealed trait userquery extends StObject
  inline def userquery: userquery = "userquery".asInstanceOf[userquery]
  
  @js.native
  sealed trait video
    extends StObject
       with DevicePickFileType
       with PickFileTypes
  inline def video: video = "video".asInstanceOf[video]
  
  @js.native
  sealed trait webresource
    extends StObject
       with StandardControlType
       with _ControlType
  inline def webresource: webresource = "webresource".asInstanceOf[webresource]
}
