package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SemanticClassificationFormat extends js.Object
@JSImport("typescript", "SemanticClassificationFormat")
@js.native
object SemanticClassificationFormat extends js.Object {
  
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[SemanticClassificationFormat with java.lang.String] = js.native
  
  @js.native
  sealed trait Original extends SemanticClassificationFormat
  /* "original" */ @js.native
  object Original
    extends TopLevel[Original with java.lang.String]
  
  @js.native
  sealed trait TwentyTwenty extends SemanticClassificationFormat
  /* "2020" */ @js.native
  object TwentyTwenty
    extends TopLevel[TwentyTwenty with java.lang.String]
}
