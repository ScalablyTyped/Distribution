package typings
package xrmLib.XrmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Interface for formContext
     * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/executioncontext/getformcontext External Link: getFormContext (Client API reference)}
     */
@js.native
trait FormContext extends js.Object {
  /**
           * Provides methods to work with the form.
           * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/formcontext-data External Link: formContext.data (Client API reference)}
           */
  var data: Data = js.native
  /**
           * Contains properties and methods to retrieve information about the user interface as well as collections for several subcomponents of the form.
           * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/formcontext-ui External Link: formContext.ui (Client API reference)}
           */
  var ui: Ui = js.native
  /**
           * Gets all attributes.
           * @returns An array of attributes.
           */
  def getAttribute(): js.Array[xrmLib.XrmNs.AttributesNs.Attribute] = js.native
  /**
           * Gets an attribute matching attributeName.
           * @param attributeName Name of the attribute.
           * @returns The attribute.
           */
  def getAttribute(attributeName: java.lang.String): xrmLib.XrmNs.AttributesNs.Attribute = js.native
  /**
           * Gets an attribute.
           * @param delegateFunction A matching delegate function
           * @returns An array of attribute.
           * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
           */
  def getAttribute(delegateFunction: xrmLib.XrmNs.CollectionNs.MatchingDelegate[xrmLib.XrmNs.AttributesNs.Attribute]): js.Array[xrmLib.XrmNs.AttributesNs.Attribute] = js.native
  /**
           * Gets an attribute by index.
           * @param index The attribute index.
           * @returns The attribute.
           */
  def getAttribute(index: scala.Double): xrmLib.XrmNs.AttributesNs.Attribute = js.native
  /**
           * Gets an attribute matching attributeName.
           * @param T An Attribute type.
           * @param attributeName Name of the attribute.
           * @returns The attribute.
           */
  @JSName("getAttribute")
  def getAttribute_TAttributeT[T /* <: xrmLib.XrmNs.AttributesNs.Attribute */](attributeName: java.lang.String): T = js.native
  /**
           * Gets all controls.
           * @returns An array of controls.
           */
  def getControl(): js.Array[xrmLib.XrmNs.ControlsNs.Control] = js.native
  /**
           * Gets a control matching controlName.
           * @param controlName   Name of the control.
           * @returns The control.
           */
  def getControl(controlName: java.lang.String): xrmLib.XrmNs.ControlsNs.Control = js.native
  /**
           * Gets a control.
           * @param delegateFunction A matching delegate function.
           * @returns An array of control.
           * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
           */
  def getControl(delegateFunction: xrmLib.XrmNs.CollectionNs.MatchingDelegate[xrmLib.XrmNs.ControlsNs.Control]): js.Array[xrmLib.XrmNs.ControlsNs.Control] = js.native
  /**
           * Gets a control by index.
           * @param index The control index.
           * @returns The control.
           */
  def getControl(index: scala.Double): xrmLib.XrmNs.ControlsNs.Control = js.native
  /**
           * Gets a control matching controlName.
           * @param T A Control type
           * @param controlName Name of the control.
           * @returns The control.
           */
  @JSName("getControl")
  def getControl_TControlT[T /* <: xrmLib.XrmNs.ControlsNs.Control */](controlName: java.lang.String): T = js.native
  /**
           * Gets a control by index.
           * @param T A Control type
           * @param index The control index.
           * @returns The control.
           */
  @JSName("getControl")
  def getControl_TControlT[T /* <: xrmLib.XrmNs.ControlsNs.Control */](index: scala.Double): T = js.native
}

