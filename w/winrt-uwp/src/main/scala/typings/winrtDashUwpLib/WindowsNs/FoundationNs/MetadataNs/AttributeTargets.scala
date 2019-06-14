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
  
  /* 0 */ val all: all with scala.Double = js.native
  /* 12 */ val apiContract: apiContract with scala.Double = js.native
  /* 1 */ val delegate: delegate with scala.Double = js.native
  /* 2 */ val enum: enum with scala.Double = js.native
  /* 3 */ val event: event with scala.Double = js.native
  /* 4 */ val field: field with scala.Double = js.native
  /* 5 */ val interface: interface with scala.Double = js.native
  /* 11 */ val interfaceImpl: interfaceImpl with scala.Double = js.native
  /* 6 */ val method: method with scala.Double = js.native
  /* 7 */ val parameter: parameter with scala.Double = js.native
  /* 8 */ val property: property with scala.Double = js.native
  /* 9 */ val runtimeClass: runtimeClass with scala.Double = js.native
  /* 10 */ val struct: struct with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs.AttributeTargets with scala.Double
  ] = js.native
}

