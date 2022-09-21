package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "ChangeListeners")
@js.native
open class ChangeListeners[Target /* <: js.Object */, Property /* <: /* keyof Target */ String */] protected ()
  extends Listeners[
      PropertyChangedEvent[
        Target, 
        /* import warning: importer.ImportType#apply Failed type conversion: Target[Property] */ js.Any
      ]
    ] {
  /**
    * Represents a collection of listeners for a property change event. Differs from its superclass in the
    * constructor signature and the additional [`values`](#values) property.
    */
  def this(target: Target, property: Property) = this()
  
  /**
    * An observable instance that directly provides the changed values instead of the event object. Also,
    * the current value will be emitted immediately upon subscription. Completes when the target is
    * disposed.
    * @constant
    */
  val values: Observable[
    /* import warning: importer.ImportType#apply Failed type conversion: Target[Property] */ js.Any
  ] = js.native
}
