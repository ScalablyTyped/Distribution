package typings.winrtUwp.Windows.Foundation.Metadata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeprecationType extends StObject
/** Indicates a deprecation as Deprecate or Remove. */
@JSGlobal("Windows.Foundation.Metadata.DeprecationType")
@js.native
object DeprecationType extends StObject {
  
  /** Compilers and other tools should treat the entity as deprecated. This is the default. */
  @js.native
  sealed trait deprecate
    extends StObject
       with DeprecationType
  
  /** Compilers and other tools should treat the entity as removed. */
  @js.native
  sealed trait remove
    extends StObject
       with DeprecationType
}
