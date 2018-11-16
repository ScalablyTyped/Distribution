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
  
  val all: all with java.lang.String = js.native
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
    winrtLib.WindowsNs.FoundationNs.MetadataNs.AttributeTargets with java.lang.String
  ] = js.native
}

