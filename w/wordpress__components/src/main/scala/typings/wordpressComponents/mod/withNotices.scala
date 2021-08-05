package typings.wordpressComponents.mod

import typings.react.mod.ComponentType
import typings.std.Omit
import typings.wordpressComponents.wordpressComponentsStrings.noticeList
import typings.wordpressComponents.wordpressComponentsStrings.noticeOperations
import typings.wordpressComponents.wordpressComponentsStrings.noticeUI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withNotices {
  
  // prettier-ignore
  inline def apply[T /* <: ComponentType[js.Any] */](wrapped: T): ComponentType[Omit[js.Any, noticeList | noticeOperations | noticeUI]] = ^.asInstanceOf[js.Dynamic].apply(wrapped.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Omit[js.Any, noticeList | noticeOperations | noticeUI]]]
  
  @JSImport("@wordpress/components", "withNotices")
  @js.native
  val ^ : js.Any = js.native
}
