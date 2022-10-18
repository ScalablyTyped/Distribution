package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.wordpressComponents.anon.`1`
import typings.wordpressComponents.uiContextWordpressComponentMod.WordPressComponentProps
import typings.wordpressComponents.visuallyHiddenMod.VisuallyHidden.Props
import typings.wordpressComponents.wordpressComponentsBooleans.`true`
import typings.wordpressComponents.wordpressComponentsStrings.div
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object visuallyHiddenMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/visually-hidden", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object VisuallyHidden {
    
    type Props = WordPressComponentProps[`1`, div, `true`]
  }
}
