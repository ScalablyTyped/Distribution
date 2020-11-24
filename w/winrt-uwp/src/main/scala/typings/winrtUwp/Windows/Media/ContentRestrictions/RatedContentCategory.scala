package typings.winrtUwp.Windows.Media.ContentRestrictions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RatedContentCategory extends js.Object
/** Specifies the type of a piece of content. */
@JSGlobal("Windows.Media.ContentRestrictions.RatedContentCategory")
@js.native
object RatedContentCategory extends js.Object {
  
  /** Apps on Windows 8.1 and Xbox. */
  @js.native
  sealed trait application extends RatedContentCategory
  
  /** Apps on Windows 8.1 and Xbox. */
  @js.native
  sealed trait game extends RatedContentCategory
  
  /** In-app content for Windows 8.1 and Xbox apps. */
  @js.native
  sealed trait general extends RatedContentCategory
  
  /** In-app content for Windows 8.1 and Xbox apps. */
  @js.native
  sealed trait movie extends RatedContentCategory
  
  /** In-app content for Windows 8.1 and Xbox apps. */
  @js.native
  sealed trait music extends RatedContentCategory
  
  /** In-app content for Windows 8.1 and Xbox apps. */
  @js.native
  sealed trait television extends RatedContentCategory
}
