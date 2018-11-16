package typings
package xrmLib.XrmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PageNs {
  /**
           * Attribute formats for Xrm.Page.Attribute.getFormat().
           * @deprecated Use {@link Xrm.Attributes.AttributeFormat} instead.
           */
  type AttributeFormat = xrmLib.XrmNs.AttributesNs.AttributeFormat
  /**
           * Attribute types for Xrm.ui.ProcessMonitor Xrm.Page.Attribute.setDisplayState().
           * @deprecated Use {@link Xrm.Attributes.AttributeType} instead.
           */
  type AttributeType = xrmLib.XrmNs.AttributesNs.AttributeType
  /**
           * Type for a context-sensitive handler.
           * @param context The context.
           * @deprecated Use {@link Xrm.Events.ContextSensitiveHandler} instead.
           */
  type ContextSensitiveHandler = xrmLib.XrmNs.EventsNs.ContextSensitiveHandler
  /**
           * Control type for Xrm.Page.ui.QuickForm.getControlType().
           * @deprecated Use {@link Xrm.Controls.ControlQuickFormType} instead.
           *
           */
  type ControlQuickFormType = xrmLib.XrmNs.ControlsNs.ControlQuickFormType
  /**
           * Control types for Xrm.Page.Control.getControlType().
           * @deprecated Use {@link Xrm.Controls.ControlType} instead.
           */
  type ControlType = xrmLib.XrmNs.ControlsNs.ControlType
  /**
           * Date attribute formats for Xrm.Page.Attribute.getFormat(), used by DateAttribute.
           * @deprecated Use {@link Xrm.Attributes.DateAttributeFormat} instead.
           */
  type DateAttributeFormat = xrmLib.XrmNs.AttributesNs.DateAttributeFormat
  /**
           * Interface for a Date control.
           * @see {@link StandardControl}
           * @deprecated Use {@link Xrm.Controls.DateControl} instead.
           */
  type DateControl = StandardControl
  /**
           * Integer attribute formats for Xrm.Page.Attribute.getFormat(), used by NumberAttribute.
           * @deprecated Use {@link Xrm.Attributes.IntegerAttributeFormat} instead.
           */
  type IntegerAttributeFormat = xrmLib.XrmNs.AttributesNs.IntegerAttributeFormat
  /**
           * Constants to use with the addNotification method of form controls
           * @deprecated Use {@link Xrm.Controls.NotificationLevel} instead.
           */
  type NotificationLevel = xrmLib.XrmNs.ControlsNs.NotificationLevel
  /**
           * Interface for a Number control.
           * @see {@link StandardControl}
           * @deprecated Use {@link Xrm.Controls.NumberControl} instead.
           */
  type NumberControl = AutoLookupControl
  /**
           * OptionSet attribute formats for Xrm.Page.Attribute.getFormat(), used by OptionSetAttribute.
           * @deprecated Use {@link Xrm.Attributes.OptiopnSetAttributeFormat} instead.
           */
  type OptionSetAttributeFormat = xrmLib.XrmNs.AttributesNs.OptionSetAttributeFormat
  /**
           * Status for Xrm.Page.Process.getStatus().
           * @deprecated Use {@link Xrm.ProcessFlow.ProcessStatus} instead
           */
  type ProcessStatus = xrmLib.XrmNs.ProcessFlowNs.ProcessStatus
  /**
           * Type for a process status change handler.
           * @param status The process status.
           * @deprecated Use {@link Xrm.Events.ProcessStatusChangeHandler} instead.
           */
  type ProcessStatusChangeHandler = xrmLib.XrmNs.EventsNs.ProcessStatusChangeHandler
  /**
           * Requirement Level for Xrm.Page.Attribute.getRequiredLevel() and Xrm.Page.Attribute.setRequiredLevel().
           * @deprecated Use {@link Xrm.Attributes.RequirementLevel} instead.
           */
  type RequirementLevel = xrmLib.XrmNs.AttributesNs.RequirementLevel
  /**
           * Interface for save event arguments.
           * @deprecated Use {@link Xrm.Events.SaveEventContext} instead.
           */
  type SaveEventArguments = xrmLib.XrmNs.EventsNs.SaveEventContext
  /**
           * Save Modes for Xrm.Page.Entity.save().
           * @deprecated Use {@link Xrm.EntitySaveMode} instead.
           */
  type SaveMode = xrmLib.XrmNs.EntitySaveMode
  /**
           * Direction types for a process stage change event
           * @deprecated Use {@link Xrm.ProcessFlow.StageChangeDirection} instead.
           */
  type StageChangeDirection = xrmLib.XrmNs.ProcessFlowNs.StageChangeDirection
  /**
           * Status for Xrm.Page.Stage.getStatus().
           * @deprecated Use {@link Xrm.ProcessFlow.StageStatus} instead.
           */
  type StageStatus = xrmLib.XrmNs.ProcessFlowNs.StageStatus
  /**
           * String attribute formats for Xrm.Page.Attribute.getFormat(), used by StringAttribute.
           * @deprecated Use {@link Xrm.Attributes.StringAttributeFormat} instead.
           */
  type StringAttributeFormat = xrmLib.XrmNs.AttributesNs.StringAttributeFormat
  /**
           * Submit Mode for Xrm.Page.Attribute.getSubmitMode() and Xrm.Page.Attribute.setSubmitMode().
           * @deprecated Use {@link Xrm.SubmitMode} instead.
           */
  type SubmitMode = xrmLib.XrmNs.SubmitMode
}
