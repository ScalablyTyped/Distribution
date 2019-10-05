package typings.winrtDashUwp.Windows.Foundation.Metadata

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
  sealed trait all extends AttributeTargets
  
  /** The attribute applies to an API contract. */
  @js.native
  sealed trait apiContract extends AttributeTargets
  
  /** The attribute applies to a delegate. */
  @js.native
  sealed trait delegate extends AttributeTargets
  
  /** The attribute applies to an enumeration. */
  @js.native
  sealed trait enum extends AttributeTargets
  
  /** The attribute applies to an event. */
  @js.native
  sealed trait event extends AttributeTargets
  
  /** The attribute applies to a field. */
  @js.native
  sealed trait field extends AttributeTargets
  
  /** The attribute applies to an interface. */
  @js.native
  sealed trait interface extends AttributeTargets
  
  /** The attribute applies to an implementation of an interface. */
  @js.native
  sealed trait interfaceImpl extends AttributeTargets
  
  /** The attribute applies to a method. */
  @js.native
  sealed trait method extends AttributeTargets
  
  /** The attribute applies to a parameter. */
  @js.native
  sealed trait parameter extends AttributeTargets
  
  /** The attribute applies to a property. */
  @js.native
  sealed trait property extends AttributeTargets
  
  /** The attribute applies to a runtime class. */
  @js.native
  sealed trait runtimeClass extends AttributeTargets
  
  /** The attribute applies to a struct. */
  @js.native
  sealed trait struct extends AttributeTargets
  
  /* 0 */ val all: typings.winrtDashUwp.Windows.Foundation.Metadata.AttributeTargets.all with Double = js.native
  /* 12 */ val apiContract: typings.winrtDashUwp.Windows.Foundation.Metadata.AttributeTargets.apiContract with Double = js.native
  /* 1 */ val delegate: typings.winrtDashUwp.Windows.Foundation.Metadata.AttributeTargets.delegate with Double = js.native
  /* 2 */ val enum: typings.winrtDashUwp.Windows.Foundation.Metadata.AttributeTargets.enum with Double = js.native
  /* 3 */ val event: typings.winrtDashUwp.Windows.Foundation.Metadata.AttributeTargets.event with Double = js.native
  /* 4 */ val field: typings.winrtDashUwp.Windows.Foundation.Metadata.AttributeTargets.field with Double = js.native
  /* 5 */ val interface: typings.winrtDashUwp.Windows.Foundation.Metadata.AttributeTargets.interface with Double = js.native
  /* 11 */ val interfaceImpl: typings.winrtDashUwp.Windows.Foundation.Metadata.AttributeTargets.interfaceImpl with Double = js.native
  /* 6 */ val method: typings.winrtDashUwp.Windows.Foundation.Metadata.AttributeTargets.method with Double = js.native
  /* 7 */ val parameter: typings.winrtDashUwp.Windows.Foundation.Metadata.AttributeTargets.parameter with Double = js.native
  /* 8 */ val property: typings.winrtDashUwp.Windows.Foundation.Metadata.AttributeTargets.property with Double = js.native
  /* 9 */ val runtimeClass: typings.winrtDashUwp.Windows.Foundation.Metadata.AttributeTargets.runtimeClass with Double = js.native
  /* 10 */ val struct: typings.winrtDashUwp.Windows.Foundation.Metadata.AttributeTargets.struct with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AttributeTargets with Double] = js.native
}

