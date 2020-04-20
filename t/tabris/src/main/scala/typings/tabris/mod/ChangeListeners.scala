package typings.tabris.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

