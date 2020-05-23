package typings.winrtUwp.Windows.Foundation.Metadata

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
  
}

