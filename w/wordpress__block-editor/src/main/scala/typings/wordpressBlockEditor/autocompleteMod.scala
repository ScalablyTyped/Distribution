package typings.wordpressBlockEditor

import typings.react.mod.global.JSX.Element
import typings.wordpressComponents.autocompleteMod.Autocomplete.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autocompleteMod {
  
  object default {
    
    // tslint:disable-next-line:no-unnecessary-generics
    @scala.inline
    def apply[T](props: Props[T]): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@wordpress/block-editor/components/autocomplete", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
}
