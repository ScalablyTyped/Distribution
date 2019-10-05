package typings.winrt.Windows.Globalization.Collation

import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICharacterGroupings extends IVectorView[CharacterGrouping] {
  def lookup(text: String): String = js.native
}

