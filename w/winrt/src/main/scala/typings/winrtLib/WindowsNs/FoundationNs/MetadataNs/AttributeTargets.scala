package typings
package winrtLib.WindowsNs.FoundationNs.MetadataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AttributeTargets extends js.Object

@JSGlobal("Windows.Foundation.Metadata.AttributeTargets")
@js.native
object AttributeTargets extends js.Object {
  @js.native
  sealed trait all
    extends winrtLib.WindowsNs.FoundationNs.MetadataNs.AttributeTargets
  
  @js.native
  sealed trait delegate
    extends winrtLib.WindowsNs.FoundationNs.MetadataNs.AttributeTargets
  
  @js.native
  sealed trait enum
    extends winrtLib.WindowsNs.FoundationNs.MetadataNs.AttributeTargets
  
  @js.native
  sealed trait event
    extends winrtLib.WindowsNs.FoundationNs.MetadataNs.AttributeTargets
  
  @js.native
  sealed trait field
    extends winrtLib.WindowsNs.FoundationNs.MetadataNs.AttributeTargets
  
  @js.native
  sealed trait interface
    extends winrtLib.WindowsNs.FoundationNs.MetadataNs.AttributeTargets
  
  @js.native
  sealed trait interfaceImpl
    extends winrtLib.WindowsNs.FoundationNs.MetadataNs.AttributeTargets
  
  @js.native
  sealed trait method
    extends winrtLib.WindowsNs.FoundationNs.MetadataNs.AttributeTargets
  
  @js.native
  sealed trait parameter
    extends winrtLib.WindowsNs.FoundationNs.MetadataNs.AttributeTargets
  
  @js.native
  sealed trait property
    extends winrtLib.WindowsNs.FoundationNs.MetadataNs.AttributeTargets
  
  @js.native
  sealed trait runtimeClass
    extends winrtLib.WindowsNs.FoundationNs.MetadataNs.AttributeTargets
  
  @js.native
  sealed trait struct
    extends winrtLib.WindowsNs.FoundationNs.MetadataNs.AttributeTargets
  
  /* 0 */ val all: all with scala.Double = js.native
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
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.FoundationNs.MetadataNs.AttributeTargets with scala.Double] = js.native
}

