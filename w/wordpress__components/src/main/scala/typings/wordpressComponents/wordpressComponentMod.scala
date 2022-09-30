package typings.wordpressComponents

import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.ElementType
import typings.std.Omit
import typings.wordpressComponents.anon.`3`
import typings.wordpressComponents.anon.`4`
import typings.wordpressComponents.wordpressComponentsStrings.as
import typings.wordpressComponents.wordpressComponentsStrings.children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wordpressComponentMod {
  
  type WordPressComponentProps[P, T /* <: ElementType[Any] */, IsPolymorphic /* <: Boolean */] = P & (Omit[ComponentPropsWithRef[T], as | (/* keyof P */ String) | children]) & (`4` | `3`[T])
}
