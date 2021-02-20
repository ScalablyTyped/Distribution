package typings.wordpressComponents.mod

import typings.react.mod.ComponentType
import typings.std.Omit
import typings.wordpressComponents.wordpressComponentsStrings.noticeList
import typings.wordpressComponents.wordpressComponentsStrings.noticeOperations
import typings.wordpressComponents.wordpressComponentsStrings.noticeUI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withNotices {
  
  // prettier-ignore
  @JSImport("@wordpress/components", "withNotices")
  @js.native
  def apply[T /* <: ComponentType[_] */](wrapped: T): ComponentType[Omit[_, noticeList | noticeOperations | noticeUI]] = js.native
}
