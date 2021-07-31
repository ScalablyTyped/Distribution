package typings.winrtUwp.Windows.Foundation.Metadata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CompositionType extends StObject
/** Specifies the visibility of a programming element for which the composable attribute is applied. */
@JSGlobal("Windows.Foundation.Metadata.CompositionType")
@js.native
object CompositionType extends StObject {
  
  /** Indicates that access to the programming element is limited to other elements in the containing class or types derived from the containing class. */
  @js.native
  sealed trait `protected`
    extends StObject
       with CompositionType
  
  /** Indicates that access to the programming element is not restricted. */
  @js.native
  sealed trait public
    extends StObject
       with CompositionType
}
