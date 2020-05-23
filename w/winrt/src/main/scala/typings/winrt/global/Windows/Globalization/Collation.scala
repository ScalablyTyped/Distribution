package typings.winrt.global.Windows.Globalization

import typings.winrt.Windows.Foundation.Collections.IIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Globalization.Collation")
@js.native
object Collation extends js.Object {
  @js.native
  class CharacterGrouping ()
    extends typings.winrt.Windows.Globalization.Collation.CharacterGrouping {
    /* CompleteClass */
    override var first: String = js.native
    /* CompleteClass */
    override var label: String = js.native
  }
  
  @js.native
  class CharacterGroupings ()
    extends typings.winrt.Windows.Globalization.Collation.CharacterGroupings {
    /* CompleteClass */
    override def first(): IIterator[typings.winrt.Windows.Globalization.Collation.CharacterGrouping] = js.native
  }
  
}

