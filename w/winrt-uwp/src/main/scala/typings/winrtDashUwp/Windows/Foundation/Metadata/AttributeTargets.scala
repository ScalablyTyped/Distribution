package typings.winrtDashUwp.Windows.Foundation.Metadata

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AttributeTargets with Double] = js.native
  /* 0 */ @js.native
  object all extends TopLevel[all with Double]
  
  /* 12 */ @js.native
  object apiContract extends TopLevel[apiContract with Double]
  
  /* 1 */ @js.native
  object delegate extends TopLevel[delegate with Double]
  
  /* 2 */ @js.native
  object enum extends TopLevel[enum with Double]
  
  /* 3 */ @js.native
  object event extends TopLevel[event with Double]
  
  /* 4 */ @js.native
  object field extends TopLevel[field with Double]
  
  /* 5 */ @js.native
  object interface extends TopLevel[interface with Double]
  
  /* 11 */ @js.native
  object interfaceImpl extends TopLevel[interfaceImpl with Double]
  
  /* 6 */ @js.native
  object method extends TopLevel[method with Double]
  
  /* 7 */ @js.native
  object parameter extends TopLevel[parameter with Double]
  
  /* 8 */ @js.native
  object property extends TopLevel[property with Double]
  
  /* 9 */ @js.native
  object runtimeClass extends TopLevel[runtimeClass with Double]
  
  /* 10 */ @js.native
  object struct extends TopLevel[struct with Double]
  
}

