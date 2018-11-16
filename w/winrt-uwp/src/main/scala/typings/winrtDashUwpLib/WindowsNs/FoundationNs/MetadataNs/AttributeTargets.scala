package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AttributeTargets extends js.Object

/** Specifies the programming construct to which an attribute applies. */
@JSGlobal("Windows.Foundation.Metadata.AttributeTargets")
@js.native
object AttributeTargets extends js.Object {
  /** The attribute applies to all programming constructs. */
  @js.native
  sealed trait all
    extends winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs.AttributeTargets
  
  /** The attribute applies to an API contract. */
  @js.native
  sealed trait apiContract
    extends winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs.AttributeTargets
  
  /** The attribute applies to a delegate. */
  @js.native
  sealed trait delegate
    extends winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs.AttributeTargets
  
  /** The attribute applies to an enumeration. */
  @js.native
  sealed trait enum
    extends winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs.AttributeTargets
  
  /** The attribute applies to an event. */
  @js.native
  sealed trait event
    extends winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs.AttributeTargets
  
  /** The attribute applies to a field. */
  @js.native
  sealed trait field
    extends winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs.AttributeTargets
  
  /** The attribute applies to an interface. */
  @js.native
  sealed trait interface
    extends winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs.AttributeTargets
  
  /** The attribute applies to an implementation of an interface. */
  @js.native
  sealed trait interfaceImpl
    extends winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs.AttributeTargets
  
  /** The attribute applies to a method. */
  @js.native
  sealed trait method
    extends winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs.AttributeTargets
  
  /** The attribute applies to a parameter. */
  @js.native
  sealed trait parameter
    extends winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs.AttributeTargets
  
  /** The attribute applies to a property. */
  @js.native
  sealed trait property
    extends winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs.AttributeTargets
  
  /** The attribute applies to a runtime class. */
  @js.native
  sealed trait runtimeClass
    extends winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs.AttributeTargets
  
  /** The attribute applies to a struct. */
  @js.native
  sealed trait struct
    extends winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs.AttributeTargets
  
  val all: all with java.lang.String = js.native
  val apiContract: apiContract with java.lang.String = js.native
  val delegate: delegate with java.lang.String = js.native
  val enum: enum with java.lang.String = js.native
  val event: event with java.lang.String = js.native
  val field: field with java.lang.String = js.native
  val interface: interface with java.lang.String = js.native
  val interfaceImpl: interfaceImpl with java.lang.String = js.native
  val method: method with java.lang.String = js.native
  val parameter: parameter with java.lang.String = js.native
  val property: property with java.lang.String = js.native
  val runtimeClass: runtimeClass with java.lang.String = js.native
  val struct: struct with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs.AttributeTargets with java.lang.String
  ] = js.native
}

