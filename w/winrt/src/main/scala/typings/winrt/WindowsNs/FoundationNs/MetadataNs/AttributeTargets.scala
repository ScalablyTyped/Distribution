package typings.winrt.WindowsNs.FoundationNs.MetadataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AttributeTargets extends js.Object

@JSGlobal("Windows.Foundation.Metadata.AttributeTargets")
@js.native
object AttributeTargets extends js.Object {
  @js.native
  sealed trait all extends AttributeTargets
  
  @js.native
  sealed trait delegate extends AttributeTargets
  
  @js.native
  sealed trait enum extends AttributeTargets
  
  @js.native
  sealed trait event extends AttributeTargets
  
  @js.native
  sealed trait field extends AttributeTargets
  
  @js.native
  sealed trait interface extends AttributeTargets
  
  @js.native
  sealed trait interfaceImpl extends AttributeTargets
  
  @js.native
  sealed trait method extends AttributeTargets
  
  @js.native
  sealed trait parameter extends AttributeTargets
  
  @js.native
  sealed trait property extends AttributeTargets
  
  @js.native
  sealed trait runtimeClass extends AttributeTargets
  
  @js.native
  sealed trait struct extends AttributeTargets
  
  /* 0 */ val all: typings.winrt.WindowsNs.FoundationNs.MetadataNs.AttributeTargets.all with Double = js.native
  /* 1 */ val delegate: typings.winrt.WindowsNs.FoundationNs.MetadataNs.AttributeTargets.delegate with Double = js.native
  /* 2 */ val enum: typings.winrt.WindowsNs.FoundationNs.MetadataNs.AttributeTargets.enum with Double = js.native
  /* 3 */ val event: typings.winrt.WindowsNs.FoundationNs.MetadataNs.AttributeTargets.event with Double = js.native
  /* 4 */ val field: typings.winrt.WindowsNs.FoundationNs.MetadataNs.AttributeTargets.field with Double = js.native
  /* 5 */ val interface: typings.winrt.WindowsNs.FoundationNs.MetadataNs.AttributeTargets.interface with Double = js.native
  /* 11 */ val interfaceImpl: typings.winrt.WindowsNs.FoundationNs.MetadataNs.AttributeTargets.interfaceImpl with Double = js.native
  /* 6 */ val method: typings.winrt.WindowsNs.FoundationNs.MetadataNs.AttributeTargets.method with Double = js.native
  /* 7 */ val parameter: typings.winrt.WindowsNs.FoundationNs.MetadataNs.AttributeTargets.parameter with Double = js.native
  /* 8 */ val property: typings.winrt.WindowsNs.FoundationNs.MetadataNs.AttributeTargets.property with Double = js.native
  /* 9 */ val runtimeClass: typings.winrt.WindowsNs.FoundationNs.MetadataNs.AttributeTargets.runtimeClass with Double = js.native
  /* 10 */ val struct: typings.winrt.WindowsNs.FoundationNs.MetadataNs.AttributeTargets.struct with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AttributeTargets with Double] = js.native
}

