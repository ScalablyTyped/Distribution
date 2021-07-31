package typings.winrtUwp.Windows.Foundation.Metadata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AttributeTargets extends StObject
/** Specifies the programming construct to which an attribute applies. */
@JSGlobal("Windows.Foundation.Metadata.AttributeTargets")
@js.native
object AttributeTargets extends StObject {
  
  /** The attribute applies to all programming constructs. */
  @js.native
  sealed trait all
    extends StObject
       with AttributeTargets
  
  /** The attribute applies to an API contract. */
  @js.native
  sealed trait apiContract
    extends StObject
       with AttributeTargets
  
  /** The attribute applies to a delegate. */
  @js.native
  sealed trait delegate
    extends StObject
       with AttributeTargets
  
  /** The attribute applies to an enumeration. */
  @js.native
  sealed trait `enum`
    extends StObject
       with AttributeTargets
  
  /** The attribute applies to an event. */
  @js.native
  sealed trait event
    extends StObject
       with AttributeTargets
  
  /** The attribute applies to a field. */
  @js.native
  sealed trait field
    extends StObject
       with AttributeTargets
  
  /** The attribute applies to an interface. */
  @js.native
  sealed trait interface
    extends StObject
       with AttributeTargets
  
  /** The attribute applies to an implementation of an interface. */
  @js.native
  sealed trait interfaceImpl
    extends StObject
       with AttributeTargets
  
  /** The attribute applies to a method. */
  @js.native
  sealed trait method
    extends StObject
       with AttributeTargets
  
  /** The attribute applies to a parameter. */
  @js.native
  sealed trait parameter
    extends StObject
       with AttributeTargets
  
  /** The attribute applies to a property. */
  @js.native
  sealed trait property
    extends StObject
       with AttributeTargets
  
  /** The attribute applies to a runtime class. */
  @js.native
  sealed trait runtimeClass
    extends StObject
       with AttributeTargets
  
  /** The attribute applies to a struct. */
  @js.native
  sealed trait struct
    extends StObject
       with AttributeTargets
}
