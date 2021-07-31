package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tabris", "ChangeListeners")
@js.native
class ChangeListeners[Target /* <: js.Object */, Property /* <: /* keyof Target */ String */] protected ()
  extends Listeners[
      PropertyChangedEvent[
        Target, 
        /* import warning: importer.ImportType#apply Failed type conversion: Target[Property] */ js.Any
      ]
    ] {
  def this(target: Target, property: Property) = this()
}
