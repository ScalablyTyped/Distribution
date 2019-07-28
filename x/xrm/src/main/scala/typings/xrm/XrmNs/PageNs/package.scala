package typings.xrm.XrmNs

import typings.xrm.XrmNs.EntitySaveMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PageNs {
  /**
    * @deprecated Use {@link Xrm.Controls.AddControlNotificationOptions} instead.
    */
  type AddControlNotificationOptions = typings.xrm.XrmNs.ControlsNs.AddControlNotificationOptions
  /**
    * Interface for an Entity attribute.
    * @deprecated Use {@link Xrm.Attributes.Attribute} instead.
    */
  type Attribute = typings.xrm.XrmNs.AttributesNs.Attribute
  /**
    * Attribute formats for Xrm.Page.Attribute.getFormat().
    * @deprecated Use {@link Xrm.Attributes.AttributeFormat} instead.
    */
  type AttributeFormat = typings.xrm.XrmNs.AttributesNs.AttributeFormat
  /**
    * Attribute types for Xrm.ui.ProcessMonitor Xrm.Page.Attribute.setDisplayState().
    * @deprecated Use {@link Xrm.Attributes.AttributeType} instead.
    */
  type AttributeType = typings.xrm.XrmNs.AttributesNs.AttributeType
  /**
    * Interface for command of AutoCompleteResultSet.  This is displayed at the bottom of the auto complete view
    * @deprecated Use {@link Xrm.Controls.AutoCompleteCommand} instead.
    */
  type AutoCompleteCommand = typings.xrm.XrmNs.ControlsNs.AutoCompleteCommand
  /**
    * Interface for Result value of AutoCompleteResultSet
    * @deprecated Use {@link Xrm.Controls.AutoCompleteResult} instead.
    */
  type AutoCompleteResult = typings.xrm.XrmNs.ControlsNs.AutoCompleteResult
  /**
    * Interface for showAutoComplete argument
    * @deprecated Use {@link Xrm.Controls.AutoCompleteResultSet} instead.
    */
  type AutoCompleteResultSet = typings.xrm.XrmNs.ControlsNs.AutoCompleteResultSet
  /**
    * Interface for Auto Lookup Control.
    * This is not an Entity Lookup, but a control that supports AutoComplete / KeyPress Events (Text or Number)
    * @remarks This interface is not supported for CRM mobile clients (phones or tablets) and the interactive service hub.  It is only available for Updated entities.
    * @see {@link StandardControl}
    * @deprecated Use {@link Xrm.Controls.AutoLookupControl} instead.
    */
  type AutoLookupControl = typings.xrm.XrmNs.ControlsNs.AutoLookupControl
  /**
    * Interface for a Boolean attribute.
    * @see {@link EnumAttribute}
    * @deprecated Use {@link Xrm.Attributes.BooleanAttribute} instead.
    */
  type BooleanAttribute = typings.xrm.XrmNs.AttributesNs.BooleanAttribute
  /**
    * Type for a context-sensitive handler.
    * @param context The context.
    * @deprecated Use {@link Xrm.Events.ContextSensitiveHandler} instead.
    */
  type ContextSensitiveHandler = typings.xrm.XrmNs.EventsNs.ContextSensitiveHandler
  /**
    * Interface for Xrm.Page.ui controls.
    * @see {@link UiElement}
    * @deprecated Use {@link Xrm.Controls.Control} instead.
    */
  type Control = typings.xrm.XrmNs.ControlsNs.Control
  /**
    * Interface to define the actions on a control notification
    * @deprecated Use {@link Xrm.Controls.ControlNotificationAction} instead.
    */
  type ControlNotificationAction = typings.xrm.XrmNs.ControlsNs.ControlNotificationAction
  /**
    * Control type for Xrm.Page.ui.QuickForm.getControlType().
    * @deprecated Use {@link Xrm.Controls.ControlQuickFormType} instead.
    *
    */
  type ControlQuickFormType = typings.xrm.XrmNs.ControlsNs.ControlQuickFormType
  /**
    * Control types for Xrm.Page.Control.getControlType().
    * @deprecated Use {@link Xrm.Controls.ControlType} instead.
    */
  type ControlType = typings.xrm.XrmNs.ControlsNs.ControlType
  /**
    * Interface for a Date attribute.
    * @see {@link Attribute}
    * @deprecated Use {@link Xrm.Attributes.DateAttribute} instead.
    */
  type DateAttribute = typings.xrm.XrmNs.AttributesNs.DateAttribute
  /**
    * Date attribute formats for Xrm.Page.Attribute.getFormat(), used by DateAttribute.
    * @deprecated Use {@link Xrm.Attributes.DateAttributeFormat} instead.
    */
  type DateAttributeFormat = typings.xrm.XrmNs.AttributesNs.DateAttributeFormat
  /**
    * Interface for a Date control.
    * @see {@link StandardControl}
    * @deprecated Use {@link Xrm.Controls.DateControl} instead.
    */
  type DateControl = StandardControl
  /**
    * Interface for the form's record context, Xrm.Page.data.entity
    * @deprecated Use {@link Xrm.Entity} instead.
    */
  type Entity = typings.xrm.XrmNs.Entity
  /**
    * Common interface for enumeration attributes (OptionSet and Boolean).
    * @see {@link Attribute}
    * @deprecated Use {@link Xrm.Attributes.EnumAttribute} instead.
    */
  type EnumAttribute = typings.xrm.XrmNs.AttributesNs.EnumAttribute
  /**
    * Interface for the event context.
    * @deprecated Use {@link Xrm.Events.EventContext} instead.
    */
  type EventContext = typings.xrm.XrmNs.EventsNs.EventContext
  /**
    * Interface for an entity's form selector item.
    * @deprecated Use {@link Xrm.Controls.FormItem} instead.
    */
  type FormItem = typings.xrm.XrmNs.ControlsNs.FormItem
  /**
    * Interface for the form selector API.
    * @deprecated Use {@link Xrm.Controls.FormSelector} instead.
    */
  type FormSelector = typings.xrm.XrmNs.ControlsNs.FormSelector
  /**
    * Interface for a framed control, which is either a Web Resource or an Iframe.
    * @see {@link Control}
    * @remarks     An Iframe control provides additional methods, so use {@link IframeControl} where
    *              appropriate.  Silverlight controls should use {@link SilverlightControl}.
    * @deprecated  Use {@link Xrm.Controls.FramedControl} instead.
    */
  type FramedControl = typings.xrm.XrmNs.ControlsNs.FramedControl
  /**
    * Interface for a CRM grid control.
    *
    * @see {@link Control}
    * @deprecated  Use {@link Xrm.Controls.GridControl} instead.
    */
  type GridControl = typings.xrm.XrmNs.ControlsNs.GridControl
  /**
    * Interface for an Iframe control.
    * @see {@link FramedControl}
    * @deprecated  Use {@link Xrm.Controls.IframeControl} instead.
    */
  type IframeControl = typings.xrm.XrmNs.ControlsNs.IframeControl
  /**
    * Integer attribute formats for Xrm.Page.Attribute.getFormat(), used by NumberAttribute.
    * @deprecated Use {@link Xrm.Attributes.IntegerAttributeFormat} instead.
    */
  type IntegerAttributeFormat = typings.xrm.XrmNs.AttributesNs.IntegerAttributeFormat
  /**
    * Interface a Lookup attribute.
    * @see {@link Attribute}
    * @deprecated Use {@link Xrm.Attributes.LookupAttribute} instead.
    */
  type LookupAttribute = typings.xrm.XrmNs.AttributesNs.LookupAttribute
  /**
    * Interface for a Lookup control.
    * @see {@link StandardControl}
    * @deprecated Use {@link Xrm.Controls.LookupControl} instead.
    */
  type LookupControl = typings.xrm.XrmNs.ControlsNs.LookupControl
  /**
    * Interface for a Lookup value.
    * @deprecated Use {@link Xrm.LookupValue} instead.
    */
  type LookupValue = typings.xrm.XrmNs.LookupValue
  /**
    * Interface for Xrm.Page.ui.navigation.
    * @deprecated Use {@link Xrm.Controls.Navigation} instead.
    */
  type Navigation = typings.xrm.XrmNs.ControlsNs.Navigation
  /**
    * Interface for a navigation item.
    * @see {@link UiElement}
    * @see {@link UiFocusable}
    * @deprecated Use {@link Xrm.Controls.NavigationItem} instead.
    */
  type NavigationItem = typings.xrm.XrmNs.ControlsNs.NavigationItem
  /**
    * Constants to use with the addNotification method of form controls
    * @deprecated Use {@link Xrm.Controls.NotificationLevel} instead.
    */
  type NotificationLevel = typings.xrm.XrmNs.ControlsNs.NotificationLevel
  /**
    * Interface for a Number attribute.
    * @see {@link Attribute}
    * @deprecated Use {@link Xrm.Attributes.NumberAttribute} instead.
    */
  type NumberAttribute = typings.xrm.XrmNs.AttributesNs.NumberAttribute
  /**
    * Interface for a Number control.
    * @see {@link StandardControl}
    * @deprecated Use {@link Xrm.Controls.NumberControl} instead.
    */
  type NumberControl = AutoLookupControl
  /**
    * Interface an OptionSet attribute.
    * @see {@link EnumAttribute}
    * @deprecated Use {@link Xrm.Attributes.OptionSetAttribute} instead.
    */
  type OptionSetAttribute = typings.xrm.XrmNs.AttributesNs.OptionSetAttribute
  /**
    * OptionSet attribute formats for Xrm.Page.Attribute.getFormat(), used by OptionSetAttribute.
    * @deprecated Use {@link Xrm.Attributes.OptiopnSetAttributeFormat} instead.
    */
  type OptionSetAttributeFormat = typings.xrm.XrmNs.AttributesNs.OptionSetAttributeFormat
  /**
    * Interface for an OptionSet control.
    * @see {@link StandardControl}
    * @deprecated Use {@link Xrm.Controls.OptionSetControl} instead.
    */
  type OptionSetControl = typings.xrm.XrmNs.ControlsNs.OptionSetControl
  /**
    * Interface for an OptionSet value.
    * @deprecated Use {@link Xrm.OptionSetValue} instead.
    */
  type OptionSetValue = typings.xrm.XrmNs.OptionSetValue
  /**
    * Interface for a privilege.
    * @deprecated Use {@link Xrm.Privilege} instead.
    */
  type Privilege = typings.xrm.XrmNs.Privilege
  /**
    * Interface for a CRM Business Process Flow instance.
    * @deprecated Use {@link Xrm.ProcessFlow.Process} instead.
    */
  type Process = typings.xrm.XrmNs.ProcessFlowNs.Process
  /**
    * Status for Xrm.Page.Process.getStatus().
    * @deprecated Use {@link Xrm.ProcessFlow.ProcessStatus} instead
    */
  type ProcessStatus = typings.xrm.XrmNs.ProcessFlowNs.ProcessStatus
  /**
    * Type for a process status change handler.
    * @param status The process status.
    * @deprecated Use {@link Xrm.Events.ProcessStatusChangeHandler} instead.
    */
  type ProcessStatusChangeHandler = typings.xrm.XrmNs.EventsNs.ProcessStatusChangeHandler
  /**
    * Requirement Level for Xrm.Page.Attribute.getRequiredLevel() and Xrm.Page.Attribute.setRequiredLevel().
    * @deprecated Use {@link Xrm.Attributes.RequirementLevel} instead.
    */
  type RequirementLevel = typings.xrm.XrmNs.AttributesNs.RequirementLevel
  /**
    * Interface for save event arguments.
    * @deprecated Use {@link Xrm.Events.SaveEventContext} instead.
    */
  type SaveEventArguments = typings.xrm.XrmNs.EventsNs.SaveEventContext
  /**
    * Interface for a save event context
    * @deprecated Use {@link Xrm.Events.SaveEventContext} instead.
    */
  type SaveEventContext = typings.xrm.XrmNs.EventsNs.SaveEventContext
  /**
    * Save Modes for Xrm.Page.Entity.save().
    * @deprecated Use {@link Xrm.EntitySaveMode} instead.
    */
  type SaveMode = EntitySaveMode
  /**
    * Interface for a form section.
    * @see {@link UiElement}
    * @deprecated Use {@link Xrm.Controls.Section} instead.
    */
  type Section = typings.xrm.XrmNs.ControlsNs.Section
  /**
    * Interface for a Silverlight control.
    * @see {@link Control}
    * @deprecated Use {@link Xrm.Controls.SilverlightControl} instead.
    */
  type SilverlightControl = typings.xrm.XrmNs.ControlsNs.SilverlightControl
  /**
    * Interface for CRM Business Process Flow stages.
    * @deprecated Use {@link Xrm.ProcessFlow.Stage} instead.
    */
  type Stage = typings.xrm.XrmNs.ProcessFlowNs.Stage
  /**
    * Direction types for a process stage change event
    * @deprecated Use {@link Xrm.ProcessFlow.StageChangeDirection} instead.
    */
  type StageChangeDirection = typings.xrm.XrmNs.ProcessFlowNs.StageChangeDirection
  /**
    * Interface for process stage change event arguments.
    * @deprecated Use {@link Xrm.Events.StageChangeEventArguments} instead.
    */
  type StageChangeEventArguments = typings.xrm.XrmNs.EventsNs.StageChangeEventArguments
  /**
    * Interface for a process stage change event context
    * @deprecated Use {@link Xrm.Events.StageChangeEventContext} instead.
    */
  type StageChangeEventContext = typings.xrm.XrmNs.EventsNs.StageChangeEventContext
  /**
    * Interface for process stage selected event arguments.
    * @deprecated Use {@link Xrm.Events.StageSelectedEventArguments} instead.
    */
  type StageSelectedEventArguments = typings.xrm.XrmNs.EventsNs.StageSelectedEventArguments
  /**
    * Interface for a process stage select event context
    * @deprecated  Use {@link Xrm.Events.StageSelectedEventContext} instead.
    */ type StageSelectedEventContext = typings.xrm.XrmNs.EventsNs.StageSelectedEventContext
  /**
    * Status for Xrm.Page.Stage.getStatus().
    * @deprecated Use {@link Xrm.ProcessFlow.StageStatus} instead.
    */
  type StageStatus = typings.xrm.XrmNs.ProcessFlowNs.StageStatus
  /**
    * Interface for a standard control.
    * @see {@link Control}
    * @deprecated Use {@link Xrm.Controls.StandardControl} instead.
    */
  type StandardControl = typings.xrm.XrmNs.ControlsNs.StandardControl
  /**
    * Interface for CRM Business Process Flow steps.
    * @deprecated Use {@link Xrm.ProcessFlow.Step} instead.
    */
  type Step = typings.xrm.XrmNs.ProcessFlowNs.Step
  /**
    * Interface for a String attribute.
    * @see {@link Attribute}
    * @deprecated Use {@link Xrm.Attributes.StringAttribute} instead.
    */
  type StringAttribute = typings.xrm.XrmNs.AttributesNs.StringAttribute
  /**
    * String attribute formats for Xrm.Page.Attribute.getFormat(), used by StringAttribute.
    * @deprecated Use {@link Xrm.Attributes.StringAttributeFormat} instead.
    */
  type StringAttributeFormat = typings.xrm.XrmNs.AttributesNs.StringAttributeFormat
  /**
    * Interface for a String control.
    * @see {@link StandardControl}
    * @deprecated Use {@link Xrm.Controls.StringControl} instead.
    */
  type StringControl = typings.xrm.XrmNs.ControlsNs.StringControl
  /**
    * Submit Mode for Xrm.Page.Attribute.getSubmitMode() and Xrm.Page.Attribute.setSubmitMode().
    * @deprecated Use {@link Xrm.SubmitMode} instead.
    */
  type SubmitMode = typings.xrm.XrmNs.SubmitMode
  /**
    * Interface for a form tab.
    * @see {@link UiElement}
    * @see {@link UiFocusable}
    * @deprecated Use {@link Xrm.Controls.Tab} instead.
    */
  type Tab = typings.xrm.XrmNs.ControlsNs.Tab
  /**
    * Interface for a Timeline control.
    * @see {@link Control}
    * @deprecated Use {@link Xrm.Controls.TimelineWall} instead.
    */
  type TimelineWall = typings.xrm.XrmNs.ControlsNs.TimelineWall
  /**
    * Interface for UI elements which can have the visibility value read.
    * @deprecated Use {@link Xrm.Controls.UiCanGetVisibleElement} instead.
    */
  type UiCanGetVisibleElement = typings.xrm.XrmNs.ControlsNs.UiCanGetVisibleElement
  /**
    * Interface for UI elements which can have the visibility value updated.
    * @deprecated Use {@link Xrm.Controls.UiCanSetVisibleElement} instead.
    */
  type UiCanSetVisibleElement = typings.xrm.XrmNs.ControlsNs.UiCanSetVisibleElement
  /**
    * Interface for focusable UI elements.
    * @deprecated Use {@link Xrm.Controls.UiFocusable} instead.
    */
  type UiFocusable = typings.xrm.XrmNs.ControlsNs.UiFocusable
  /**
    * Interface for controls which methods provide immediate feedback or take actions as user types in a control.
    * Contains methods which can be used to perform data validations in a control even before the user commits (saves) the value in a form.
    * @deprecated Use {@link Xrm.Controls.UiKeyPressable} instead.
    */
  type UiKeyPressable = typings.xrm.XrmNs.ControlsNs.UiKeyPressable
  /**
    * Interface for UI elements with labels.
    * @deprecated Use {@link Xrm.Controls.UiLabelElement} instead.
    */
  type UiLabelElement = typings.xrm.XrmNs.ControlsNs.UiLabelElement
  /**
    * Base interface for standard UI elements.
    * @deprecated Use {@link Xrm.Controls.UiStandardElement} instead.
    */
  type UiStandardElement = typings.xrm.XrmNs.ControlsNs.UiStandardElement
}
