package typings.winrtUwp.Windows.UI.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CaretType extends StObject
/** Specifies the caret type. */
@JSGlobal("Windows.UI.Text.CaretType")
@js.native
object CaretType extends StObject {
  
  /** The insertion point for a sequenced language; that is, characters that are typed with one key stroke. */
  @js.native
  sealed trait normal extends CaretType
  
  /** The insertion point is null. */
  @js.native
  sealed trait `null` extends CaretType
}
